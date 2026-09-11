package hg;

import android.location.Location;
import android.text.TextUtils;
import bi.h8;
import bi.v7;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class c extends pg.b {
    public a E;
    public int F;
    public long H;
    public boolean I;
    public boolean J;
    public final boolean d;
    public final boolean e;
    public boolean h;
    public boolean n;
    public Location v;
    public String w;
    public String x;
    public b y;
    public boolean f = false;
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final int G = UserConfig.selectedAccount;

    public c(boolean z10, boolean z11) {
        this.d = z10;
        this.e = z11;
    }

    public final void F() {
        if (this.F != 0) {
            ConnectionsManager.getInstance(this.G).cancelRequest(this.F, true);
            this.F = 0;
        }
    }

    public final void G(String str, Location location) {
        if (str == null || str.length() == 0) {
            this.s.clear();
            this.r.clear();
            this.J = false;
            l();
            return;
        }
        if (this.E != null) {
            Utilities.searchQueue.cancelRunnable(this.E);
            this.E = null;
        }
        this.J = true;
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        a aVar = new a((u0) this, str, location, 0);
        this.E = aVar;
        dispatchQueue.postRunnable(aVar, 400L);
    }

    public final void H(String str, Location location, boolean z10) {
        Location location2;
        c cVar;
        String str2;
        Location location3;
        Locale locale;
        if ((location != null || this.d) && ((location2 = this.v) == null || location == null || location.distanceTo(location2) >= 200.0f)) {
            Locale locale2 = null;
            this.v = location == null ? null : new Location(location);
            this.w = str;
            if (this.h) {
                this.h = false;
                if (this.F != 0) {
                    ConnectionsManager.getInstance(this.G).cancelRequest(this.F, true);
                    this.F = 0;
                }
            }
            h();
            this.h = true;
            this.f = true;
            TLObject userOrChat = MessagesController.getInstance(this.G).getUserOrChat(this.d ? MessagesController.getInstance(this.G).storyVenueSearchBot : MessagesController.getInstance(this.G).venueSearchBot);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.query = str == null ? "" : str;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.G).getInputUser(user);
                tL_messages_getInlineBotResults.offset = "";
                if (location != null) {
                    TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                    tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                    tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(location.getLatitude());
                    tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(location.getLongitude());
                    tL_messages_getInlineBotResults.flags |= 1;
                }
                if (DialogObject.isEncryptedDialog(this.H)) {
                    tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.G).getInputPeer(this.H);
                }
                if (TextUtils.isEmpty(str) || !(this.d || this.e)) {
                    cVar = this;
                    str2 = str;
                    location3 = location;
                    cVar.n = false;
                } else {
                    this.n = true;
                    Locale currentLocale = LocaleController.getInstance().getCurrentLocale();
                    if (this.d) {
                        if (currentLocale.getLanguage().contains("en")) {
                            locale = currentLocale;
                            cVar = this;
                            str2 = str;
                            location3 = location;
                            Utilities.globalQueue.postRunnable(new h8(cVar, currentLocale, str2, locale, location3, str, 2));
                        } else {
                            locale2 = Locale.US;
                        }
                    }
                    locale = locale2;
                    cVar = this;
                    str2 = str;
                    location3 = location;
                    Utilities.globalQueue.postRunnable(new h8(cVar, currentLocale, str2, locale, location3, str, 2));
                }
                if (location3 == null) {
                    return;
                }
                cVar.F = ConnectionsManager.getInstance(cVar.G).sendRequest(tL_messages_getInlineBotResults, new bi.m1(10, this, str2));
                l();
                return;
            }
            if (z10) {
                int i10 = this.G;
                if (!this.I) {
                    this.I = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = this.d ? MessagesController.getInstance(i10).storyVenueSearchBot : MessagesController.getInstance(i10).venueSearchBot;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new v7(this, 8));
                }
            }
        }
    }
}
