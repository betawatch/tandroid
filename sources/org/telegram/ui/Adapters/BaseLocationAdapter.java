package org.telegram.ui.Adapters;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;

/* loaded from: classes4.dex */
public abstract class BaseLocationAdapter extends AdapterWithDiffUtils {
    public final boolean biz;
    private int currentRequestNum;
    private BaseLocationAdapterDelegate delegate;
    private long dialogId;
    private String lastFoundQuery;
    private Location lastSearchLocation;
    private String lastSearchQuery;
    protected boolean searchInProgress;
    private Runnable searchRunnable;
    protected boolean searching;
    protected boolean searchingLocations;
    private boolean searchingUser;
    public final boolean stories;
    protected boolean searched = false;
    protected ArrayList locations = new ArrayList();
    protected ArrayList places = new ArrayList();
    private int currentAccount = UserConfig.selectedAccount;

    public interface BaseLocationAdapterDelegate {
        void didLoadSearchResult(ArrayList arrayList);
    }

    public BaseLocationAdapter(boolean z, boolean z2) {
        this.stories = z;
        this.biz = z2;
    }

    public void destroy() {
        if (this.currentRequestNum != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentRequestNum, true);
            this.currentRequestNum = 0;
        }
    }

    public void setDelegate(long j, BaseLocationAdapterDelegate baseLocationAdapterDelegate) {
        this.dialogId = j;
        this.delegate = baseLocationAdapterDelegate;
    }

    public void searchDelayed(final String str, final Location location) {
        if (str == null || str.length() == 0) {
            this.places.clear();
            this.locations.clear();
            this.searchInProgress = false;
            update(true);
            return;
        }
        if (this.searchRunnable != null) {
            Utilities.searchQueue.cancelRunnable(this.searchRunnable);
            this.searchRunnable = null;
        }
        this.searchInProgress = true;
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Adapters.BaseLocationAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BaseLocationAdapter.$r8$lambda$UzOocwjEU5x3EeNBE12gwv-Gt9I(BaseLocationAdapter.this, str, location);
            }
        };
        this.searchRunnable = runnable;
        dispatchQueue.postRunnable(runnable, 400L);
    }

    public static /* synthetic */ void $r8$lambda$UzOocwjEU5x3EeNBE12gwv-Gt9I(final BaseLocationAdapter baseLocationAdapter, final String str, final Location location) {
        baseLocationAdapter.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.BaseLocationAdapter$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                BaseLocationAdapter.$r8$lambda$y90nmaRIn-FalsuFNKur0trYb3U(BaseLocationAdapter.this, str, location);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$y90nmaRIn-FalsuFNKur0trYb3U(BaseLocationAdapter baseLocationAdapter, String str, Location location) {
        baseLocationAdapter.searchRunnable = null;
        baseLocationAdapter.lastSearchLocation = null;
        baseLocationAdapter.searchPlacesWithQuery(str, location, true);
    }

    private void searchBotUser() {
        String str;
        if (this.searchingUser) {
            return;
        }
        this.searchingUser = true;
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        if (this.stories) {
            str = MessagesController.getInstance(this.currentAccount).storyVenueSearchBot;
        } else {
            str = MessagesController.getInstance(this.currentAccount).venueSearchBot;
        }
        tL_contacts_resolveUsername.username = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new RequestDelegate() { // from class: org.telegram.ui.Adapters.BaseLocationAdapter$$ExternalSyntheticLambda3
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                BaseLocationAdapter.$r8$lambda$4Nt7Zy6Elg7WbJ6IxBLzGtKqjZs(BaseLocationAdapter.this, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$4Nt7Zy6Elg7WbJ6IxBLzGtKqjZs(final BaseLocationAdapter baseLocationAdapter, final TLObject tLObject, TLRPC.TL_error tL_error) {
        baseLocationAdapter.getClass();
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.BaseLocationAdapter$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    BaseLocationAdapter.$r8$lambda$A9lpV6QD6dmFP1uGkItVajDxhWE(BaseLocationAdapter.this, tLObject);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$A9lpV6QD6dmFP1uGkItVajDxhWE(BaseLocationAdapter baseLocationAdapter, TLObject tLObject) {
        baseLocationAdapter.getClass();
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(baseLocationAdapter.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(baseLocationAdapter.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(baseLocationAdapter.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        Location location = baseLocationAdapter.lastSearchLocation;
        baseLocationAdapter.lastSearchLocation = null;
        baseLocationAdapter.searchPlacesWithQuery(baseLocationAdapter.lastSearchQuery, location, false);
    }

    public boolean isSearching() {
        return this.searchInProgress;
    }

    public String getLastSearchString() {
        return this.lastFoundQuery;
    }

    public void searchPlacesWithQuery(String str, Location location, boolean z) {
        searchPlacesWithQuery(str, location, z, false);
    }

    public void searchPlacesWithQuery(final String str, Location location, boolean z, boolean z2) {
        Location location2;
        String str2;
        final BaseLocationAdapter baseLocationAdapter;
        final String str3;
        final Location location3;
        final Locale locale;
        if ((location != null || this.stories) && ((location2 = this.lastSearchLocation) == null || location == null || location.distanceTo(location2) >= 200.0f)) {
            Locale locale2 = null;
            this.lastSearchLocation = location == null ? null : new Location(location);
            this.lastSearchQuery = str;
            if (this.searching) {
                this.searching = false;
                if (this.currentRequestNum != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentRequestNum, true);
                    this.currentRequestNum = 0;
                }
            }
            getItemCount();
            this.searching = true;
            this.searched = true;
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            if (this.stories) {
                str2 = MessagesController.getInstance(this.currentAccount).storyVenueSearchBot;
            } else {
                str2 = MessagesController.getInstance(this.currentAccount).venueSearchBot;
            }
            TLObject userOrChat = messagesController.getUserOrChat(str2);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.query = str == null ? "" : str;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
                tL_messages_getInlineBotResults.offset = "";
                if (location != null) {
                    TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                    tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                    tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(location.getLatitude());
                    tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(location.getLongitude());
                    tL_messages_getInlineBotResults.flags |= 1;
                }
                if (DialogObject.isEncryptedDialog(this.dialogId)) {
                    tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                }
                if (!TextUtils.isEmpty(str) && (this.stories || this.biz)) {
                    this.searchingLocations = true;
                    final Locale currentLocale = LocaleController.getInstance().getCurrentLocale();
                    if (this.stories) {
                        if (currentLocale.getLanguage().contains("en")) {
                            locale = currentLocale;
                            baseLocationAdapter = this;
                            str3 = str;
                            location3 = location;
                            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Adapters.BaseLocationAdapter$$ExternalSyntheticLambda1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    BaseLocationAdapter.$r8$lambda$X38L9THsqmGcopAt-ll3U7NJl_0(BaseLocationAdapter.this, currentLocale, str3, locale, location3, str);
                                }
                            });
                        } else {
                            locale2 = Locale.US;
                        }
                    }
                    locale = locale2;
                    baseLocationAdapter = this;
                    str3 = str;
                    location3 = location;
                    Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Adapters.BaseLocationAdapter$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseLocationAdapter.$r8$lambda$X38L9THsqmGcopAt-ll3U7NJl_0(BaseLocationAdapter.this, currentLocale, str3, locale, location3, str);
                        }
                    });
                } else {
                    baseLocationAdapter = this;
                    str3 = str;
                    location3 = location;
                    baseLocationAdapter.searchingLocations = false;
                }
                if (location3 == null) {
                    return;
                }
                baseLocationAdapter.currentRequestNum = ConnectionsManager.getInstance(baseLocationAdapter.currentAccount).sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() { // from class: org.telegram.ui.Adapters.BaseLocationAdapter$$ExternalSyntheticLambda2
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        BaseLocationAdapter.$r8$lambda$ZC2XbztLqEWm164HtZHxnT-S-S8(BaseLocationAdapter.this, str3, tLObject, tL_error);
                    }
                });
                update(true);
                return;
            }
            if (z) {
                searchBotUser();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x037d A[Catch: Exception -> 0x049d, TryCatch #0 {Exception -> 0x049d, blocks: (B:3:0x000c, B:6:0x0015, B:8:0x0026, B:9:0x0035, B:10:0x0040, B:12:0x0046, B:14:0x004e, B:16:0x0054, B:17:0x005c, B:19:0x0062, B:21:0x0073, B:23:0x009b, B:26:0x00a3, B:28:0x00ad, B:29:0x00b0, B:33:0x00c4, B:35:0x00ce, B:37:0x00d4, B:38:0x00d7, B:40:0x0115, B:42:0x011b, B:44:0x0121, B:45:0x0124, B:47:0x0129, B:49:0x012f, B:50:0x0132, B:53:0x013b, B:55:0x0145, B:57:0x0155, B:59:0x0161, B:61:0x016d, B:65:0x01bb, B:67:0x01c1, B:68:0x01c4, B:70:0x01cd, B:71:0x01d0, B:72:0x01da, B:75:0x01e3, B:81:0x01f6, B:83:0x01fc, B:91:0x022a, B:93:0x0230, B:95:0x024c, B:96:0x0251, B:98:0x0259, B:100:0x026c, B:101:0x0273, B:103:0x0279, B:104:0x027d, B:106:0x0283, B:107:0x0287, B:109:0x0296, B:110:0x02a5, B:112:0x02ab, B:114:0x02b7, B:116:0x02bd, B:118:0x02c7, B:120:0x02d5, B:121:0x02dc, B:123:0x02e2, B:125:0x02ec, B:127:0x02fa, B:128:0x02fe, B:130:0x0304, B:132:0x030e, B:134:0x031c, B:135:0x0320, B:137:0x0326, B:139:0x032c, B:141:0x0336, B:143:0x033c, B:144:0x033f, B:145:0x0345, B:148:0x034c, B:150:0x0351, B:155:0x0363, B:157:0x0369, B:159:0x037d, B:167:0x038c, B:169:0x0398, B:171:0x03cf, B:173:0x03e2, B:174:0x03e9, B:176:0x03ef, B:177:0x03f3, B:179:0x03f9, B:180:0x03fd, B:182:0x0407, B:183:0x0411, B:185:0x0417, B:187:0x0421, B:191:0x042e, B:193:0x0434, B:195:0x0440, B:197:0x0477, B:198:0x0484, B:152:0x035f, B:214:0x024f, B:216:0x017e, B:218:0x0192, B:220:0x019c, B:222:0x01b6, B:228:0x00dd, B:230:0x00e7, B:232:0x00ed, B:233:0x00f0, B:234:0x00f4, B:236:0x00fe, B:238:0x0104, B:240:0x010a, B:241:0x010d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011b A[Catch: Exception -> 0x049d, TryCatch #0 {Exception -> 0x049d, blocks: (B:3:0x000c, B:6:0x0015, B:8:0x0026, B:9:0x0035, B:10:0x0040, B:12:0x0046, B:14:0x004e, B:16:0x0054, B:17:0x005c, B:19:0x0062, B:21:0x0073, B:23:0x009b, B:26:0x00a3, B:28:0x00ad, B:29:0x00b0, B:33:0x00c4, B:35:0x00ce, B:37:0x00d4, B:38:0x00d7, B:40:0x0115, B:42:0x011b, B:44:0x0121, B:45:0x0124, B:47:0x0129, B:49:0x012f, B:50:0x0132, B:53:0x013b, B:55:0x0145, B:57:0x0155, B:59:0x0161, B:61:0x016d, B:65:0x01bb, B:67:0x01c1, B:68:0x01c4, B:70:0x01cd, B:71:0x01d0, B:72:0x01da, B:75:0x01e3, B:81:0x01f6, B:83:0x01fc, B:91:0x022a, B:93:0x0230, B:95:0x024c, B:96:0x0251, B:98:0x0259, B:100:0x026c, B:101:0x0273, B:103:0x0279, B:104:0x027d, B:106:0x0283, B:107:0x0287, B:109:0x0296, B:110:0x02a5, B:112:0x02ab, B:114:0x02b7, B:116:0x02bd, B:118:0x02c7, B:120:0x02d5, B:121:0x02dc, B:123:0x02e2, B:125:0x02ec, B:127:0x02fa, B:128:0x02fe, B:130:0x0304, B:132:0x030e, B:134:0x031c, B:135:0x0320, B:137:0x0326, B:139:0x032c, B:141:0x0336, B:143:0x033c, B:144:0x033f, B:145:0x0345, B:148:0x034c, B:150:0x0351, B:155:0x0363, B:157:0x0369, B:159:0x037d, B:167:0x038c, B:169:0x0398, B:171:0x03cf, B:173:0x03e2, B:174:0x03e9, B:176:0x03ef, B:177:0x03f3, B:179:0x03f9, B:180:0x03fd, B:182:0x0407, B:183:0x0411, B:185:0x0417, B:187:0x0421, B:191:0x042e, B:193:0x0434, B:195:0x0440, B:197:0x0477, B:198:0x0484, B:152:0x035f, B:214:0x024f, B:216:0x017e, B:218:0x0192, B:220:0x019c, B:222:0x01b6, B:228:0x00dd, B:230:0x00e7, B:232:0x00ed, B:233:0x00f0, B:234:0x00f4, B:236:0x00fe, B:238:0x0104, B:240:0x010a, B:241:0x010d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0145 A[Catch: Exception -> 0x049d, TryCatch #0 {Exception -> 0x049d, blocks: (B:3:0x000c, B:6:0x0015, B:8:0x0026, B:9:0x0035, B:10:0x0040, B:12:0x0046, B:14:0x004e, B:16:0x0054, B:17:0x005c, B:19:0x0062, B:21:0x0073, B:23:0x009b, B:26:0x00a3, B:28:0x00ad, B:29:0x00b0, B:33:0x00c4, B:35:0x00ce, B:37:0x00d4, B:38:0x00d7, B:40:0x0115, B:42:0x011b, B:44:0x0121, B:45:0x0124, B:47:0x0129, B:49:0x012f, B:50:0x0132, B:53:0x013b, B:55:0x0145, B:57:0x0155, B:59:0x0161, B:61:0x016d, B:65:0x01bb, B:67:0x01c1, B:68:0x01c4, B:70:0x01cd, B:71:0x01d0, B:72:0x01da, B:75:0x01e3, B:81:0x01f6, B:83:0x01fc, B:91:0x022a, B:93:0x0230, B:95:0x024c, B:96:0x0251, B:98:0x0259, B:100:0x026c, B:101:0x0273, B:103:0x0279, B:104:0x027d, B:106:0x0283, B:107:0x0287, B:109:0x0296, B:110:0x02a5, B:112:0x02ab, B:114:0x02b7, B:116:0x02bd, B:118:0x02c7, B:120:0x02d5, B:121:0x02dc, B:123:0x02e2, B:125:0x02ec, B:127:0x02fa, B:128:0x02fe, B:130:0x0304, B:132:0x030e, B:134:0x031c, B:135:0x0320, B:137:0x0326, B:139:0x032c, B:141:0x0336, B:143:0x033c, B:144:0x033f, B:145:0x0345, B:148:0x034c, B:150:0x0351, B:155:0x0363, B:157:0x0369, B:159:0x037d, B:167:0x038c, B:169:0x0398, B:171:0x03cf, B:173:0x03e2, B:174:0x03e9, B:176:0x03ef, B:177:0x03f3, B:179:0x03f9, B:180:0x03fd, B:182:0x0407, B:183:0x0411, B:185:0x0417, B:187:0x0421, B:191:0x042e, B:193:0x0434, B:195:0x0440, B:197:0x0477, B:198:0x0484, B:152:0x035f, B:214:0x024f, B:216:0x017e, B:218:0x0192, B:220:0x019c, B:222:0x01b6, B:228:0x00dd, B:230:0x00e7, B:232:0x00ed, B:233:0x00f0, B:234:0x00f4, B:236:0x00fe, B:238:0x0104, B:240:0x010a, B:241:0x010d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c1 A[Catch: Exception -> 0x049d, TryCatch #0 {Exception -> 0x049d, blocks: (B:3:0x000c, B:6:0x0015, B:8:0x0026, B:9:0x0035, B:10:0x0040, B:12:0x0046, B:14:0x004e, B:16:0x0054, B:17:0x005c, B:19:0x0062, B:21:0x0073, B:23:0x009b, B:26:0x00a3, B:28:0x00ad, B:29:0x00b0, B:33:0x00c4, B:35:0x00ce, B:37:0x00d4, B:38:0x00d7, B:40:0x0115, B:42:0x011b, B:44:0x0121, B:45:0x0124, B:47:0x0129, B:49:0x012f, B:50:0x0132, B:53:0x013b, B:55:0x0145, B:57:0x0155, B:59:0x0161, B:61:0x016d, B:65:0x01bb, B:67:0x01c1, B:68:0x01c4, B:70:0x01cd, B:71:0x01d0, B:72:0x01da, B:75:0x01e3, B:81:0x01f6, B:83:0x01fc, B:91:0x022a, B:93:0x0230, B:95:0x024c, B:96:0x0251, B:98:0x0259, B:100:0x026c, B:101:0x0273, B:103:0x0279, B:104:0x027d, B:106:0x0283, B:107:0x0287, B:109:0x0296, B:110:0x02a5, B:112:0x02ab, B:114:0x02b7, B:116:0x02bd, B:118:0x02c7, B:120:0x02d5, B:121:0x02dc, B:123:0x02e2, B:125:0x02ec, B:127:0x02fa, B:128:0x02fe, B:130:0x0304, B:132:0x030e, B:134:0x031c, B:135:0x0320, B:137:0x0326, B:139:0x032c, B:141:0x0336, B:143:0x033c, B:144:0x033f, B:145:0x0345, B:148:0x034c, B:150:0x0351, B:155:0x0363, B:157:0x0369, B:159:0x037d, B:167:0x038c, B:169:0x0398, B:171:0x03cf, B:173:0x03e2, B:174:0x03e9, B:176:0x03ef, B:177:0x03f3, B:179:0x03f9, B:180:0x03fd, B:182:0x0407, B:183:0x0411, B:185:0x0417, B:187:0x0421, B:191:0x042e, B:193:0x0434, B:195:0x0440, B:197:0x0477, B:198:0x0484, B:152:0x035f, B:214:0x024f, B:216:0x017e, B:218:0x0192, B:220:0x019c, B:222:0x01b6, B:228:0x00dd, B:230:0x00e7, B:232:0x00ed, B:233:0x00f0, B:234:0x00f4, B:236:0x00fe, B:238:0x0104, B:240:0x010a, B:241:0x010d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cd A[Catch: Exception -> 0x049d, TryCatch #0 {Exception -> 0x049d, blocks: (B:3:0x000c, B:6:0x0015, B:8:0x0026, B:9:0x0035, B:10:0x0040, B:12:0x0046, B:14:0x004e, B:16:0x0054, B:17:0x005c, B:19:0x0062, B:21:0x0073, B:23:0x009b, B:26:0x00a3, B:28:0x00ad, B:29:0x00b0, B:33:0x00c4, B:35:0x00ce, B:37:0x00d4, B:38:0x00d7, B:40:0x0115, B:42:0x011b, B:44:0x0121, B:45:0x0124, B:47:0x0129, B:49:0x012f, B:50:0x0132, B:53:0x013b, B:55:0x0145, B:57:0x0155, B:59:0x0161, B:61:0x016d, B:65:0x01bb, B:67:0x01c1, B:68:0x01c4, B:70:0x01cd, B:71:0x01d0, B:72:0x01da, B:75:0x01e3, B:81:0x01f6, B:83:0x01fc, B:91:0x022a, B:93:0x0230, B:95:0x024c, B:96:0x0251, B:98:0x0259, B:100:0x026c, B:101:0x0273, B:103:0x0279, B:104:0x027d, B:106:0x0283, B:107:0x0287, B:109:0x0296, B:110:0x02a5, B:112:0x02ab, B:114:0x02b7, B:116:0x02bd, B:118:0x02c7, B:120:0x02d5, B:121:0x02dc, B:123:0x02e2, B:125:0x02ec, B:127:0x02fa, B:128:0x02fe, B:130:0x0304, B:132:0x030e, B:134:0x031c, B:135:0x0320, B:137:0x0326, B:139:0x032c, B:141:0x0336, B:143:0x033c, B:144:0x033f, B:145:0x0345, B:148:0x034c, B:150:0x0351, B:155:0x0363, B:157:0x0369, B:159:0x037d, B:167:0x038c, B:169:0x0398, B:171:0x03cf, B:173:0x03e2, B:174:0x03e9, B:176:0x03ef, B:177:0x03f3, B:179:0x03f9, B:180:0x03fd, B:182:0x0407, B:183:0x0411, B:185:0x0417, B:187:0x0421, B:191:0x042e, B:193:0x0434, B:195:0x0440, B:197:0x0477, B:198:0x0484, B:152:0x035f, B:214:0x024f, B:216:0x017e, B:218:0x0192, B:220:0x019c, B:222:0x01b6, B:228:0x00dd, B:230:0x00e7, B:232:0x00ed, B:233:0x00f0, B:234:0x00f4, B:236:0x00fe, B:238:0x0104, B:240:0x010a, B:241:0x010d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e3 A[Catch: Exception -> 0x049d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x049d, blocks: (B:3:0x000c, B:6:0x0015, B:8:0x0026, B:9:0x0035, B:10:0x0040, B:12:0x0046, B:14:0x004e, B:16:0x0054, B:17:0x005c, B:19:0x0062, B:21:0x0073, B:23:0x009b, B:26:0x00a3, B:28:0x00ad, B:29:0x00b0, B:33:0x00c4, B:35:0x00ce, B:37:0x00d4, B:38:0x00d7, B:40:0x0115, B:42:0x011b, B:44:0x0121, B:45:0x0124, B:47:0x0129, B:49:0x012f, B:50:0x0132, B:53:0x013b, B:55:0x0145, B:57:0x0155, B:59:0x0161, B:61:0x016d, B:65:0x01bb, B:67:0x01c1, B:68:0x01c4, B:70:0x01cd, B:71:0x01d0, B:72:0x01da, B:75:0x01e3, B:81:0x01f6, B:83:0x01fc, B:91:0x022a, B:93:0x0230, B:95:0x024c, B:96:0x0251, B:98:0x0259, B:100:0x026c, B:101:0x0273, B:103:0x0279, B:104:0x027d, B:106:0x0283, B:107:0x0287, B:109:0x0296, B:110:0x02a5, B:112:0x02ab, B:114:0x02b7, B:116:0x02bd, B:118:0x02c7, B:120:0x02d5, B:121:0x02dc, B:123:0x02e2, B:125:0x02ec, B:127:0x02fa, B:128:0x02fe, B:130:0x0304, B:132:0x030e, B:134:0x031c, B:135:0x0320, B:137:0x0326, B:139:0x032c, B:141:0x0336, B:143:0x033c, B:144:0x033f, B:145:0x0345, B:148:0x034c, B:150:0x0351, B:155:0x0363, B:157:0x0369, B:159:0x037d, B:167:0x038c, B:169:0x0398, B:171:0x03cf, B:173:0x03e2, B:174:0x03e9, B:176:0x03ef, B:177:0x03f3, B:179:0x03f9, B:180:0x03fd, B:182:0x0407, B:183:0x0411, B:185:0x0417, B:187:0x0421, B:191:0x042e, B:193:0x0434, B:195:0x0440, B:197:0x0477, B:198:0x0484, B:152:0x035f, B:214:0x024f, B:216:0x017e, B:218:0x0192, B:220:0x019c, B:222:0x01b6, B:228:0x00dd, B:230:0x00e7, B:232:0x00ed, B:233:0x00f0, B:234:0x00f4, B:236:0x00fe, B:238:0x0104, B:240:0x010a, B:241:0x010d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$X38L9THsqmGcopAt-ll3U7NJl_0(final BaseLocationAdapter baseLocationAdapter, Locale locale, String str, Locale locale2, final Location location, final String str2) {
        List<Address> list;
        List<Address> list2;
        HashSet hashSet;
        int i;
        HashSet hashSet2;
        boolean z;
        boolean z2;
        String countryName;
        StringBuilder sb;
        HashSet hashSet3;
        boolean z3;
        StringBuilder sb2;
        boolean z4;
        String str3;
        int i2;
        BaseLocationAdapter baseLocationAdapter2 = baseLocationAdapter;
        baseLocationAdapter2.getClass();
        final ArrayList arrayList = new ArrayList();
        try {
            int i3 = baseLocationAdapter2.biz ? 10 : 5;
            List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, locale).getFromLocationName(str, 5);
            List<Address> fromLocationName2 = baseLocationAdapter2.stories ? new Geocoder(ApplicationLoader.applicationContext, locale2).getFromLocationName(str, 5) : null;
            HashSet hashSet4 = new HashSet();
            HashSet hashSet5 = new HashSet();
            int i4 = 0;
            while (i4 < fromLocationName.size()) {
                Address address = fromLocationName.get(i4);
                Address address2 = (fromLocationName2 == null || i4 >= fromLocationName2.size()) ? null : fromLocationName2.get(i4);
                if (address.hasLatitude() && address.hasLongitude()) {
                    double latitude = address.getLatitude();
                    double longitude = address.getLongitude();
                    StringBuilder sb3 = new StringBuilder();
                    list = fromLocationName2;
                    StringBuilder sb4 = new StringBuilder();
                    list2 = fromLocationName;
                    StringBuilder sb5 = new StringBuilder();
                    String locality = address.getLocality();
                    if (TextUtils.isEmpty(locality)) {
                        locality = address.getAdminArea();
                    }
                    String str4 = locality;
                    if (address2 != null && TextUtils.isEmpty(address2.getLocality())) {
                        address2.getAdminArea();
                    }
                    i = i4;
                    String thoroughfare = address.getThoroughfare();
                    Address address3 = address2;
                    if (TextUtils.isEmpty(thoroughfare)) {
                        hashSet2 = hashSet4;
                    } else {
                        hashSet2 = hashSet4;
                        if (!TextUtils.equals(thoroughfare, address.getAdminArea())) {
                            if (sb5.length() > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(thoroughfare);
                            z = false;
                            if (TextUtils.isEmpty(str4)) {
                                z2 = true;
                            } else {
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(str4);
                                if (sb5 != null) {
                                    if (sb5.length() > 0) {
                                        sb5.append(", ");
                                    }
                                    sb5.append(str4);
                                }
                                z2 = false;
                            }
                            boolean z5 = z;
                            countryName = address.getCountryName();
                            if (TextUtils.isEmpty(countryName)) {
                                sb = sb5;
                                hashSet3 = hashSet5;
                                z3 = z2;
                            } else {
                                sb = sb5;
                                z3 = z2;
                                if (!"US".equals(address.getCountryCode()) && !"AE".equals(address.getCountryCode()) && (!"GB".equals(address.getCountryCode()) || !"en".equals(locale.getLanguage()))) {
                                    str3 = countryName;
                                    hashSet3 = hashSet5;
                                    if (sb4.length() > 0) {
                                        sb4.append(", ");
                                    }
                                    sb4.append(str3);
                                    if (sb3.length() > 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(countryName);
                                }
                                String[] split = countryName.split(" ");
                                int length = split.length;
                                str3 = "";
                                hashSet3 = hashSet5;
                                int i5 = 0;
                                while (i5 < length) {
                                    int i6 = length;
                                    String str5 = split[i5];
                                    if (str5.length() > 0) {
                                        i2 = i5;
                                        str3 = str3 + str5.charAt(0);
                                    } else {
                                        i2 = i5;
                                    }
                                    i5 = i2 + 1;
                                    length = i6;
                                }
                                if (sb4.length() > 0) {
                                }
                                sb4.append(str3);
                                if (sb3.length() > 0) {
                                }
                                sb3.append(countryName);
                            }
                            if (baseLocationAdapter2.biz) {
                                StringBuilder sb6 = new StringBuilder();
                                try {
                                    String addressLine = address.getAddressLine(0);
                                    if (!TextUtils.isEmpty(addressLine)) {
                                        sb6.append(addressLine);
                                    }
                                } catch (Exception unused) {
                                }
                                if (sb6.length() > 0) {
                                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint;
                                    tL_geoPoint.lat = latitude;
                                    tL_geoPoint._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb6.toString();
                                    tL_messageMediaVenue.icon = "pin";
                                    tL_messageMediaVenue.address = LocaleController.getString(R.string.PassportAddress);
                                    arrayList.add(tL_messageMediaVenue);
                                }
                                hashSet4 = hashSet2;
                                hashSet = hashSet3;
                            } else {
                                if (sb == null || sb.length() <= 0) {
                                    sb2 = sb4;
                                } else {
                                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue2.geo = tL_geoPoint2;
                                    tL_geoPoint2.lat = latitude;
                                    tL_geoPoint2._long = longitude;
                                    tL_messageMediaVenue2.query_id = -1L;
                                    tL_messageMediaVenue2.title = sb.toString();
                                    tL_messageMediaVenue2.icon = "pin";
                                    tL_messageMediaVenue2.address = LocaleController.getString(z5 ? R.string.PassportCity : R.string.PassportStreet1);
                                    if (address3 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue2.geoAddress = tL_geoPointAddress;
                                        tL_geoPointAddress.country_iso2 = address3.getCountryCode();
                                        String locality2 = TextUtils.isEmpty(null) ? address3.getLocality() : null;
                                        if (TextUtils.isEmpty(locality2)) {
                                            locality2 = address3.getAdminArea();
                                        }
                                        if (TextUtils.isEmpty(locality2)) {
                                            locality2 = address3.getSubAdminArea();
                                        }
                                        String adminArea = address3.getAdminArea();
                                        StringBuilder sb7 = new StringBuilder();
                                        if (TextUtils.isEmpty(adminArea)) {
                                            sb2 = sb4;
                                        } else {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress2.state = adminArea;
                                            sb2 = sb4;
                                            tL_geoPointAddress2.flags |= 1;
                                        }
                                        if (!TextUtils.isEmpty(locality2)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress3.city = locality2;
                                            tL_geoPointAddress3.flags |= 2;
                                        }
                                        if (!z5) {
                                            String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address3.getThoroughfare(), str4) || TextUtils.equals(address3.getThoroughfare(), address3.getCountryName())) ? null : address3.getThoroughfare();
                                            if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address3.getSubLocality(), str4) && !TextUtils.equals(address3.getSubLocality(), address3.getCountryName())) {
                                                thoroughfare2 = address3.getSubLocality();
                                            }
                                            if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address3.getLocality(), str4) && !TextUtils.equals(address3.getLocality(), address3.getCountryName())) {
                                                thoroughfare2 = address3.getLocality();
                                            }
                                            if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, adminArea) || TextUtils.equals(thoroughfare2, address3.getCountryName())) {
                                                sb7 = null;
                                            } else {
                                                if (sb7.length() > 0) {
                                                    sb7.append(", ");
                                                }
                                                sb7.append(thoroughfare2);
                                            }
                                            if (!TextUtils.isEmpty(sb7)) {
                                                int i7 = 0;
                                                while (true) {
                                                    String[] strArr = LocationController.unnamedRoads;
                                                    if (i7 >= strArr.length) {
                                                        break;
                                                    }
                                                    if (strArr[i7].equalsIgnoreCase(sb7.toString())) {
                                                        z4 = true;
                                                        break;
                                                    }
                                                    i7++;
                                                }
                                            }
                                            z4 = false;
                                            if (!TextUtils.isEmpty(sb7)) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue2.geoAddress;
                                                tL_geoPointAddress4.flags |= 4;
                                                tL_geoPointAddress4.street = sb7.toString();
                                            }
                                            if (!z4) {
                                                arrayList.add(tL_messageMediaVenue2);
                                                if (arrayList.size() >= i3) {
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        sb2 = sb4;
                                    }
                                    z4 = false;
                                    if (!z4) {
                                    }
                                }
                                if (!z3) {
                                    hashSet = hashSet3;
                                    if (!hashSet.contains(sb2.toString())) {
                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                        TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue3.geo = tL_geoPoint3;
                                        tL_geoPoint3.lat = latitude;
                                        tL_geoPoint3._long = longitude;
                                        tL_messageMediaVenue3.query_id = -1L;
                                        tL_messageMediaVenue3.title = sb2.toString();
                                        tL_messageMediaVenue3.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                        tL_messageMediaVenue3.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                        hashSet.add(tL_messageMediaVenue3.title);
                                        tL_messageMediaVenue3.address = LocaleController.getString(R.string.PassportCity);
                                        if (address3 != null) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress5 = new TL_stories.TL_geoPointAddress();
                                            tL_messageMediaVenue3.geoAddress = tL_geoPointAddress5;
                                            tL_geoPointAddress5.country_iso2 = address3.getCountryCode();
                                            String locality3 = TextUtils.isEmpty(null) ? address3.getLocality() : null;
                                            if (TextUtils.isEmpty(locality3)) {
                                                locality3 = address3.getAdminArea();
                                            }
                                            if (TextUtils.isEmpty(locality3)) {
                                                locality3 = address3.getSubAdminArea();
                                            }
                                            String adminArea2 = address3.getAdminArea();
                                            if (!TextUtils.isEmpty(adminArea2)) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress6 = tL_messageMediaVenue3.geoAddress;
                                                tL_geoPointAddress6.state = adminArea2;
                                                tL_geoPointAddress6.flags |= 1;
                                            }
                                            if (!TextUtils.isEmpty(locality3)) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress7 = tL_messageMediaVenue3.geoAddress;
                                                tL_geoPointAddress7.city = locality3;
                                                tL_geoPointAddress7.flags |= 2;
                                            }
                                        }
                                        arrayList.add(tL_messageMediaVenue3);
                                        if (arrayList.size() >= i3) {
                                            break;
                                        }
                                    }
                                } else {
                                    hashSet = hashSet3;
                                }
                                if (sb3.length() > 0) {
                                    hashSet4 = hashSet2;
                                    if (hashSet4.contains(sb3.toString())) {
                                        continue;
                                    } else {
                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                        TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue4.geo = tL_geoPoint4;
                                        tL_geoPoint4.lat = latitude;
                                        tL_geoPoint4._long = longitude;
                                        tL_messageMediaVenue4.query_id = -1L;
                                        tL_messageMediaVenue4.title = sb3.toString();
                                        tL_messageMediaVenue4.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                        tL_messageMediaVenue4.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                        hashSet4.add(tL_messageMediaVenue4.title);
                                        tL_messageMediaVenue4.address = LocaleController.getString(R.string.Country);
                                        if (address3 != null) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                            tL_messageMediaVenue4.geoAddress = tL_geoPointAddress8;
                                            tL_geoPointAddress8.country_iso2 = address3.getCountryCode();
                                        }
                                        arrayList.add(tL_messageMediaVenue4);
                                        if (arrayList.size() >= i3) {
                                            break;
                                        }
                                    }
                                } else {
                                    hashSet4 = hashSet2;
                                }
                            }
                        }
                    }
                    String subLocality = address.getSubLocality();
                    if (!TextUtils.isEmpty(subLocality)) {
                        if (sb5.length() > 0) {
                            sb5.append(", ");
                        }
                        sb5.append(subLocality);
                    } else {
                        String locality4 = address.getLocality();
                        if (!TextUtils.isEmpty(locality4) && !TextUtils.equals(locality4, str4)) {
                            if (sb5.length() > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(locality4);
                        } else {
                            sb5 = null;
                            z = true;
                            if (TextUtils.isEmpty(str4)) {
                            }
                            boolean z52 = z;
                            countryName = address.getCountryName();
                            if (TextUtils.isEmpty(countryName)) {
                            }
                            if (baseLocationAdapter2.biz) {
                            }
                        }
                    }
                    z = false;
                    if (TextUtils.isEmpty(str4)) {
                    }
                    boolean z522 = z;
                    countryName = address.getCountryName();
                    if (TextUtils.isEmpty(countryName)) {
                    }
                    if (baseLocationAdapter2.biz) {
                    }
                } else {
                    list = fromLocationName2;
                    list2 = fromLocationName;
                    hashSet = hashSet5;
                    i = i4;
                }
                i4 = i + 1;
                baseLocationAdapter2 = baseLocationAdapter;
                hashSet5 = hashSet;
                fromLocationName2 = list;
                fromLocationName = list2;
            }
        } catch (Exception unused2) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.BaseLocationAdapter$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                BaseLocationAdapter.$r8$lambda$gr5_sHZ3bA1F39V-YaMSAd-JTd0(BaseLocationAdapter.this, location, str2, arrayList);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$gr5_sHZ3bA1F39V-YaMSAd-JTd0(BaseLocationAdapter baseLocationAdapter, Location location, String str, ArrayList arrayList) {
        baseLocationAdapter.searchingLocations = false;
        if (location == null) {
            baseLocationAdapter.currentRequestNum = 0;
            baseLocationAdapter.searching = false;
            baseLocationAdapter.places.clear();
            baseLocationAdapter.searchInProgress = false;
            baseLocationAdapter.lastFoundQuery = str;
        }
        baseLocationAdapter.locations.clear();
        baseLocationAdapter.locations.addAll(arrayList);
        baseLocationAdapter.update(true);
    }

    public static /* synthetic */ void $r8$lambda$ZC2XbztLqEWm164HtZHxnT-S-S8(final BaseLocationAdapter baseLocationAdapter, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        baseLocationAdapter.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.BaseLocationAdapter$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                BaseLocationAdapter.$r8$lambda$9fAnmZcQFtCjpcrhZURpZa-sDmY(BaseLocationAdapter.this, tL_error, str, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$9fAnmZcQFtCjpcrhZURpZa-sDmY(BaseLocationAdapter baseLocationAdapter, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        if (tL_error == null) {
            baseLocationAdapter.currentRequestNum = 0;
            baseLocationAdapter.searching = false;
            baseLocationAdapter.places.clear();
            baseLocationAdapter.searchInProgress = false;
            baseLocationAdapter.lastFoundQuery = str;
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            int size = messages_botresults.results.size();
            for (int i = 0; i < size; i++) {
                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i);
                if ("venue".equals(botInlineResult.type)) {
                    TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                    if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                        TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                        tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                        tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                        tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                        tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/" + tL_botInlineMessageMediaVenue.venue_type + "_64.png";
                        tL_messageMediaVenue.venue_type = tL_botInlineMessageMediaVenue.venue_type;
                        tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                        tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.provider;
                        tL_messageMediaVenue.query_id = messages_botresults.query_id;
                        tL_messageMediaVenue.result_id = botInlineResult.id;
                        baseLocationAdapter.places.add(tL_messageMediaVenue);
                    }
                }
            }
        }
        BaseLocationAdapterDelegate baseLocationAdapterDelegate = baseLocationAdapter.delegate;
        if (baseLocationAdapterDelegate != null) {
            baseLocationAdapterDelegate.didLoadSearchResult(baseLocationAdapter.places);
        }
        baseLocationAdapter.update(true);
    }

    protected void update(boolean z) {
        notifyDataSetChanged();
    }
}
