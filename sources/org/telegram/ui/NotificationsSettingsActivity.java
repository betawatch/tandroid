package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextDetailSettingsCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

/* loaded from: classes4.dex */
public class NotificationsSettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int accountsAllRow;
    private int accountsInfoRow;
    private int accountsSectionRow;
    private ListAdapter adapter;
    private int androidAutoAlertRow;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberSection;
    private int badgeNumberSection2Row;
    private int badgeNumberShowRow;
    private int callsRingtoneRow;
    private int callsSection2Row;
    private int callsSectionRow;
    private int callsVibrateRow;
    private int channelsRow;
    private int contactJoinedRow;
    private int eventsSection2Row;
    private int eventsSectionRow;
    private int groupRow;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSectionRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private int notificationsSection2Row;
    private int notificationsSectionRow;
    private int notificationsServiceConnectionRow;
    private int notificationsServiceRow;
    private int otherSection2Row;
    private int otherSectionRow;
    private int pinnedMessageRow;
    private int privateRow;
    private int reactionsRow;
    private int repeatRow;
    private int resetNotificationsRow;
    private int resetNotificationsSectionRow;
    private int resetSection2Row;
    private int resetSectionRow;
    private int storiesRow;
    private boolean updateRepeatNotifications;
    private boolean updateRingtone;
    private boolean updateVibrate;
    private boolean reseting = false;
    private ArrayList exceptionUsers = null;
    private ArrayList exceptionChats = null;
    private ArrayList exceptionChannels = null;
    private ArrayList exceptionStories = null;
    private ArrayList exceptionAutoStories = null;
    private int rowCount = 0;

    public static class NotificationException {
        public boolean auto;
        public long did;
        public boolean hasCustom;
        public int muteUntil;
        public int notify;
        public boolean story;
    }

    public static /* synthetic */ void $r8$lambda$z8728ZbQxis9p3M0Wak40C7BT78(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        MessagesController.getInstance(this.currentAccount).loadSignUpNotificationsSettings();
        loadExceptions(null);
        if (UserConfig.getActivatedAccountsCount() > 1) {
            int i = this.rowCount;
            this.accountsSectionRow = i;
            this.accountsAllRow = i + 1;
            this.rowCount = i + 3;
            this.accountsInfoRow = i + 2;
        } else {
            this.accountsSectionRow = -1;
            this.accountsAllRow = -1;
            this.accountsInfoRow = -1;
        }
        int i2 = this.rowCount;
        this.notificationsSectionRow = i2;
        this.privateRow = i2 + 1;
        this.groupRow = i2 + 2;
        this.channelsRow = i2 + 3;
        this.storiesRow = i2 + 4;
        this.reactionsRow = i2 + 5;
        this.notificationsSection2Row = i2 + 6;
        this.callsSectionRow = i2 + 7;
        this.callsVibrateRow = i2 + 8;
        this.callsRingtoneRow = i2 + 9;
        this.eventsSection2Row = i2 + 10;
        this.badgeNumberSection = i2 + 11;
        this.badgeNumberShowRow = i2 + 12;
        this.badgeNumberMutedRow = i2 + 13;
        this.badgeNumberMessagesRow = i2 + 14;
        this.badgeNumberSection2Row = i2 + 15;
        this.inappSectionRow = i2 + 16;
        this.inappSoundRow = i2 + 17;
        this.inappVibrateRow = i2 + 18;
        this.inappPreviewRow = i2 + 19;
        int i3 = i2 + 21;
        this.rowCount = i3;
        this.inchatSoundRow = i2 + 20;
        this.inappPriorityRow = i3;
        this.callsSection2Row = i2 + 22;
        this.eventsSectionRow = i2 + 23;
        this.contactJoinedRow = i2 + 24;
        this.pinnedMessageRow = i2 + 25;
        this.otherSection2Row = i2 + 26;
        this.otherSectionRow = i2 + 27;
        this.notificationsServiceRow = i2 + 28;
        this.notificationsServiceConnectionRow = i2 + 29;
        this.androidAutoAlertRow = -1;
        this.repeatRow = i2 + 30;
        this.resetSection2Row = i2 + 31;
        this.resetSectionRow = i2 + 32;
        this.resetNotificationsRow = i2 + 33;
        this.rowCount = i2 + 35;
        this.resetNotificationsSectionRow = i2 + 34;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getMessagesController().reloadReactionsNotifySettings();
        return super.onFragmentCreate();
    }

    public void loadExceptions(final Runnable runnable) {
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        final ArrayList arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsSettingsActivity.$r8$lambda$P_A6RQck9sbGCvk1lkbQc-4JRR4(NotificationsSettingsActivity.this, arrayList, runnable);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x02cf, code lost:
    
        if (r8.deleted != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0170, code lost:
    
        if (r0.deleted != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0141, code lost:
    
        if (r0.deleted != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03c3 A[LOOP:5: B:200:0x03c1->B:201:0x03c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$P_A6RQck9sbGCvk1lkbQc-4JRR4(final NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, final Runnable runnable) {
        ArrayList<TLRPC.Chat> arrayList2;
        boolean z;
        ArrayList<TLRPC.Chat> arrayList3;
        ArrayList<TLRPC.User> arrayList4;
        ArrayList<TLRPC.EncryptedChat> arrayList5;
        int size;
        int i;
        ArrayList arrayList6;
        int size2;
        int i2;
        int size3;
        int i3;
        int size4;
        int i4;
        ArrayList arrayList7;
        int i5;
        ArrayList arrayList8;
        ArrayList arrayList9;
        Long parseLong;
        long longValue;
        notificationsSettingsActivity.getClass();
        final ArrayList arrayList10 = new ArrayList();
        final ArrayList arrayList11 = new ArrayList();
        final ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList<Long> arrayList15 = new ArrayList<>();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList<TLRPC.User> arrayList18 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList19 = new ArrayList<>();
        ArrayList<TLRPC.EncryptedChat> arrayList20 = new ArrayList<>();
        long j = UserConfig.getInstance(notificationsSettingsActivity.currentAccount).clientUserId;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
        Map<String, ?> all = notificationsSettings.getAll();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            arrayList2 = arrayList19;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            ArrayList<TLRPC.User> arrayList21 = arrayList18;
            if (key.startsWith(NotificationsSettingsFacade.PROPERTY_NOTIFY)) {
                ArrayList<TLRPC.EncryptedChat> arrayList22 = arrayList20;
                String replace = key.replace(NotificationsSettingsFacade.PROPERTY_NOTIFY, "");
                if (replace.contains("_")) {
                    arrayList19 = arrayList2;
                    arrayList18 = arrayList21;
                    arrayList20 = arrayList22;
                } else {
                    Long parseLong2 = Utilities.parseLong(replace);
                    ArrayList arrayList23 = arrayList13;
                    ArrayList arrayList24 = arrayList14;
                    long longValue2 = parseLong2.longValue();
                    if (longValue2 == 0 || longValue2 == j) {
                        arrayList13 = arrayList23;
                        arrayList19 = arrayList2;
                        arrayList18 = arrayList21;
                        arrayList20 = arrayList22;
                        arrayList14 = arrayList24;
                    } else {
                        NotificationException notificationException = new NotificationException();
                        notificationException.did = longValue2;
                        StringBuilder sb = new StringBuilder();
                        ArrayList arrayList25 = arrayList11;
                        sb.append(NotificationsSettingsFacade.PROPERTY_CUSTOM);
                        sb.append(longValue2);
                        notificationException.hasCustom = notificationsSettings.getBoolean(sb.toString(), false);
                        int intValue = ((Integer) next.getValue()).intValue();
                        notificationException.notify = intValue;
                        if (intValue != 0) {
                            Integer num = (Integer) all.get(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + replace);
                            if (num != null) {
                                notificationException.muteUntil = num.intValue();
                            }
                        }
                        if (DialogObject.isEncryptedDialog(longValue2)) {
                            int encryptedChatId = DialogObject.getEncryptedChatId(longValue2);
                            TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getEncryptedChat(Integer.valueOf(encryptedChatId));
                            if (encryptedChat == null) {
                                arrayList17.add(Integer.valueOf(encryptedChatId));
                                longSparseArray.put(longValue2, notificationException);
                            } else {
                                TLRPC.User user = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getUser(Long.valueOf(encryptedChat.user_id));
                                if (user == null) {
                                    arrayList15.add(Long.valueOf(encryptedChat.user_id));
                                    longSparseArray.put(encryptedChat.user_id, notificationException);
                                }
                            }
                            arrayList10.add(notificationException);
                        } else if (DialogObject.isUserDialog(longValue2)) {
                            TLRPC.User user2 = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getUser(parseLong2);
                            if (user2 == null) {
                                arrayList15.add(parseLong2);
                                longSparseArray.put(longValue2, notificationException);
                            }
                            arrayList10.add(notificationException);
                        } else {
                            long j2 = -longValue2;
                            TLRPC.Chat chat = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getChat(Long.valueOf(j2));
                            if (chat == null) {
                                arrayList16.add(Long.valueOf(j2));
                                longSparseArray.put(longValue2, notificationException);
                            } else if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                                    arrayList12.add(notificationException);
                                } else {
                                    arrayList11 = arrayList25;
                                    arrayList11.add(notificationException);
                                    arrayList19 = arrayList2;
                                    arrayList18 = arrayList21;
                                    arrayList20 = arrayList22;
                                    arrayList14 = arrayList24;
                                    arrayList13 = arrayList23;
                                }
                            }
                        }
                        arrayList19 = arrayList2;
                        arrayList18 = arrayList21;
                        arrayList20 = arrayList22;
                        arrayList14 = arrayList24;
                        arrayList13 = arrayList23;
                        arrayList11 = arrayList25;
                    }
                }
            } else {
                arrayList19 = arrayList2;
                arrayList18 = arrayList21;
            }
        }
        ArrayList arrayList26 = arrayList13;
        ArrayList arrayList27 = arrayList14;
        ArrayList<TLRPC.User> arrayList28 = arrayList18;
        ArrayList<TLRPC.EncryptedChat> arrayList29 = arrayList20;
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next2 = it2.next();
            String key2 = next2.getKey();
            if (key2.startsWith(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY)) {
                try {
                    parseLong = Utilities.parseLong(key2.substring(8));
                    longValue = parseLong.longValue();
                } catch (Exception unused) {
                    arrayList9 = arrayList26;
                }
                if (longValue != 0 && longValue != j) {
                    NotificationException notificationException2 = new NotificationException();
                    notificationException2.did = longValue;
                    notificationException2.notify = ((Boolean) next2.getValue()).booleanValue() ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    notificationException2.story = true;
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user3 = notificationsSettingsActivity.getMessagesController().getUser(parseLong);
                        if (user3 == null) {
                            try {
                                arrayList15.add(parseLong);
                                longSparseArray.put(longValue, notificationException2);
                            } catch (Exception unused2) {
                                arrayList9 = arrayList26;
                            }
                        } else if (user3.deleted) {
                        }
                        arrayList9 = arrayList26;
                        try {
                            arrayList9.add(notificationException2);
                            hashSet.add(parseLong);
                        } catch (Exception unused3) {
                            arrayList26 = arrayList9;
                        }
                        arrayList26 = arrayList9;
                    }
                }
            }
        }
        final ArrayList arrayList30 = arrayList26;
        if (arrayList != null) {
            ArrayList arrayList31 = arrayList;
            Collections.sort(arrayList31, Comparator$-CC.comparingDouble(new ToDoubleFunction() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda2
                @Override // java.util.function.ToDoubleFunction
                public final double applyAsDouble(Object obj) {
                    double d;
                    d = ((TLRPC.TL_topPeer) obj).rating;
                    return d;
                }
            }));
            int max = Math.max(0, arrayList31.size() - 5);
            while (max < arrayList31.size()) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList31.get(max)).peer);
                if (hashSet.contains(Long.valueOf(peerDialogId))) {
                    i5 = max;
                } else {
                    NotificationException notificationException3 = new NotificationException();
                    notificationException3.did = peerDialogId;
                    i5 = max;
                    notificationException3.notify = 0;
                    notificationException3.auto = z;
                    notificationException3.story = z;
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user4 = notificationsSettingsActivity.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        if (user4 == null) {
                            arrayList15.add(Long.valueOf(peerDialogId));
                            longSparseArray.put(peerDialogId, notificationException3);
                        }
                        arrayList8 = arrayList27;
                        arrayList8.add(0, notificationException3);
                        hashSet.add(Long.valueOf(peerDialogId));
                        arrayList27 = arrayList8;
                        max = i5 + 1;
                        z = true;
                        arrayList31 = arrayList;
                    }
                }
                arrayList8 = arrayList27;
                arrayList27 = arrayList8;
                max = i5 + 1;
                z = true;
                arrayList31 = arrayList;
            }
        }
        ArrayList arrayList32 = arrayList27;
        if (longSparseArray.size() != 0) {
            try {
                if (arrayList17.isEmpty()) {
                    arrayList5 = arrayList29;
                } else {
                    try {
                        arrayList5 = arrayList29;
                        try {
                            MessagesStorage.getInstance(notificationsSettingsActivity.currentAccount).getEncryptedChatsInternal(TextUtils.join(",", arrayList17), arrayList5, arrayList15);
                        } catch (Exception e) {
                            e = e;
                            arrayList3 = arrayList2;
                            arrayList4 = arrayList28;
                            FileLog.e(e);
                            size = arrayList3.size();
                            i = 0;
                            while (i < size) {
                            }
                            arrayList6 = arrayList32;
                            size2 = arrayList4.size();
                            while (i2 < size2) {
                            }
                            size3 = arrayList5.size();
                            while (i3 < size3) {
                            }
                            size4 = longSparseArray.size();
                            while (i4 < size4) {
                            }
                            final ArrayList<TLRPC.Chat> arrayList33 = arrayList3;
                            final ArrayList<TLRPC.User> arrayList34 = arrayList4;
                            final ArrayList<TLRPC.EncryptedChat> arrayList35 = arrayList5;
                            final ArrayList arrayList36 = arrayList6;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    NotificationsSettingsActivity.$r8$lambda$7rLxoZRmplIdVqQ0_YxC3UNlODs(NotificationsSettingsActivity.this, arrayList34, arrayList33, arrayList35, arrayList10, arrayList11, arrayList12, arrayList30, arrayList36, runnable);
                                }
                            });
                        }
                    } catch (Exception e2) {
                        e = e2;
                        arrayList5 = arrayList29;
                        arrayList3 = arrayList2;
                        arrayList4 = arrayList28;
                        FileLog.e(e);
                        size = arrayList3.size();
                        i = 0;
                        while (i < size) {
                        }
                        arrayList6 = arrayList32;
                        size2 = arrayList4.size();
                        while (i2 < size2) {
                        }
                        size3 = arrayList5.size();
                        while (i3 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i4 < size4) {
                        }
                        final ArrayList arrayList332 = arrayList3;
                        final ArrayList arrayList342 = arrayList4;
                        final ArrayList arrayList352 = arrayList5;
                        final ArrayList arrayList362 = arrayList6;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                NotificationsSettingsActivity.$r8$lambda$7rLxoZRmplIdVqQ0_YxC3UNlODs(NotificationsSettingsActivity.this, arrayList342, arrayList332, arrayList352, arrayList10, arrayList11, arrayList12, arrayList30, arrayList362, runnable);
                            }
                        });
                    }
                }
                if (arrayList15.isEmpty()) {
                    arrayList4 = arrayList28;
                } else {
                    try {
                        arrayList4 = arrayList28;
                    } catch (Exception e3) {
                        e = e3;
                        arrayList4 = arrayList28;
                        arrayList3 = arrayList2;
                        FileLog.e(e);
                        size = arrayList3.size();
                        i = 0;
                        while (i < size) {
                        }
                        arrayList6 = arrayList32;
                        size2 = arrayList4.size();
                        while (i2 < size2) {
                        }
                        size3 = arrayList5.size();
                        while (i3 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i4 < size4) {
                        }
                        final ArrayList arrayList3322 = arrayList3;
                        final ArrayList arrayList3422 = arrayList4;
                        final ArrayList arrayList3522 = arrayList5;
                        final ArrayList arrayList3622 = arrayList6;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                NotificationsSettingsActivity.$r8$lambda$7rLxoZRmplIdVqQ0_YxC3UNlODs(NotificationsSettingsActivity.this, arrayList3422, arrayList3322, arrayList3522, arrayList10, arrayList11, arrayList12, arrayList30, arrayList3622, runnable);
                            }
                        });
                    }
                    try {
                        MessagesStorage.getInstance(notificationsSettingsActivity.currentAccount).getUsersInternal(arrayList15, arrayList4);
                    } catch (Exception e4) {
                        e = e4;
                        arrayList3 = arrayList2;
                        FileLog.e(e);
                        size = arrayList3.size();
                        i = 0;
                        while (i < size) {
                        }
                        arrayList6 = arrayList32;
                        size2 = arrayList4.size();
                        while (i2 < size2) {
                        }
                        size3 = arrayList5.size();
                        while (i3 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i4 < size4) {
                        }
                        final ArrayList arrayList33222 = arrayList3;
                        final ArrayList arrayList34222 = arrayList4;
                        final ArrayList arrayList35222 = arrayList5;
                        final ArrayList arrayList36222 = arrayList6;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                NotificationsSettingsActivity.$r8$lambda$7rLxoZRmplIdVqQ0_YxC3UNlODs(NotificationsSettingsActivity.this, arrayList34222, arrayList33222, arrayList35222, arrayList10, arrayList11, arrayList12, arrayList30, arrayList36222, runnable);
                            }
                        });
                    }
                }
                if (arrayList16.isEmpty()) {
                    arrayList3 = arrayList2;
                } else {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(notificationsSettingsActivity.currentAccount);
                    String join = TextUtils.join(",", arrayList16);
                    arrayList3 = arrayList2;
                    try {
                        messagesStorage.getChatsInternal(join, arrayList3);
                    } catch (Exception e5) {
                        e = e5;
                        FileLog.e(e);
                        size = arrayList3.size();
                        i = 0;
                        while (i < size) {
                        }
                        arrayList6 = arrayList32;
                        size2 = arrayList4.size();
                        while (i2 < size2) {
                        }
                        size3 = arrayList5.size();
                        while (i3 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i4 < size4) {
                        }
                        final ArrayList arrayList332222 = arrayList3;
                        final ArrayList arrayList342222 = arrayList4;
                        final ArrayList arrayList352222 = arrayList5;
                        final ArrayList arrayList362222 = arrayList6;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                NotificationsSettingsActivity.$r8$lambda$7rLxoZRmplIdVqQ0_YxC3UNlODs(NotificationsSettingsActivity.this, arrayList342222, arrayList332222, arrayList352222, arrayList10, arrayList11, arrayList12, arrayList30, arrayList362222, runnable);
                            }
                        });
                    }
                }
            } catch (Exception e6) {
                e = e6;
                arrayList3 = arrayList2;
                arrayList4 = arrayList28;
                arrayList5 = arrayList29;
            }
            size = arrayList3.size();
            i = 0;
            while (i < size) {
                TLRPC.Chat chat2 = arrayList3.get(i);
                if (chat2.left || chat2.kicked || chat2.migrated_to != null) {
                    arrayList7 = arrayList32;
                } else {
                    NotificationException notificationException4 = (NotificationException) longSparseArray.get(-chat2.id);
                    arrayList7 = arrayList32;
                    longSparseArray.remove(-chat2.id);
                    if (notificationException4 != null) {
                        if (ChatObject.isChannel(chat2) && !chat2.megagroup) {
                            arrayList12.add(notificationException4);
                        } else {
                            arrayList11.add(notificationException4);
                        }
                    }
                }
                i++;
                arrayList32 = arrayList7;
            }
            arrayList6 = arrayList32;
            size2 = arrayList4.size();
            for (i2 = 0; i2 < size2; i2++) {
                TLRPC.User user5 = arrayList4.get(i2);
                if (!user5.deleted) {
                    longSparseArray.remove(user5.id);
                }
            }
            size3 = arrayList5.size();
            for (i3 = 0; i3 < size3; i3++) {
                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList5.get(i3).id));
            }
            size4 = longSparseArray.size();
            for (i4 = 0; i4 < size4; i4++) {
                if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                    arrayList11.remove(longSparseArray.valueAt(i4));
                    arrayList12.remove(longSparseArray.valueAt(i4));
                } else {
                    arrayList10.remove(longSparseArray.valueAt(i4));
                }
            }
        } else {
            arrayList6 = arrayList32;
            arrayList3 = arrayList2;
            arrayList4 = arrayList28;
            arrayList5 = arrayList29;
        }
        final ArrayList arrayList3322222 = arrayList3;
        final ArrayList arrayList3422222 = arrayList4;
        final ArrayList arrayList3522222 = arrayList5;
        final ArrayList arrayList3622222 = arrayList6;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsSettingsActivity.$r8$lambda$7rLxoZRmplIdVqQ0_YxC3UNlODs(NotificationsSettingsActivity.this, arrayList3422222, arrayList3322222, arrayList3522222, arrayList10, arrayList11, arrayList12, arrayList30, arrayList3622222, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$7rLxoZRmplIdVqQ0_YxC3UNlODs(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putChats(arrayList2, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putEncryptedChats(arrayList3, true);
        notificationsSettingsActivity.exceptionUsers = arrayList4;
        notificationsSettingsActivity.exceptionChats = arrayList5;
        notificationsSettingsActivity.exceptionChannels = arrayList6;
        notificationsSettingsActivity.exceptionStories = arrayList7;
        notificationsSettingsActivity.exceptionAutoStories = arrayList8;
        ListAdapter listAdapter = notificationsSettingsActivity.adapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.adapter.notifyItemChanged(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.adapter.notifyItemChanged(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.adapter.notifyItemChanged(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public NotificationsCustomSettingsActivity makeNotificationsCustomSettingsActivity(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = null;
        if (i == 1) {
            arrayList = this.exceptionUsers;
        } else if (i == 0) {
            arrayList = this.exceptionChats;
        } else {
            if (i == 4) {
                arrayList2 = null;
            } else if (i == 3) {
                arrayList3 = this.exceptionStories;
                arrayList2 = this.exceptionAutoStories;
            } else {
                arrayList = this.exceptionChannels;
            }
            return new NotificationsCustomSettingsActivity(i, arrayList3, arrayList2);
        }
        arrayList3 = arrayList;
        arrayList2 = null;
        return new NotificationsCustomSettingsActivity(i, arrayList3, arrayList2);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsAndSounds));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.NotificationsSettingsActivity.1
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    NotificationsSettingsActivity.this.finishFragment();
                }
            }
        });
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && iNavigationLayout.isRightLayout()) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setItemAnimator(null);
        this.listView.setLayoutAnimation(null);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, i, false) { // from class: org.telegram.ui.NotificationsSettingsActivity.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda0
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public /* synthetic */ boolean hasDoubleTap(View view, int i2) {
                return RecyclerListView.OnItemClickListenerExtended.-CC.$default$hasDoubleTap(this, view, i2);
            }

            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public /* synthetic */ void onDoubleTap(View view, int i2, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.-CC.$default$onDoubleTap(this, view, i2, f, f2);
            }

            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public final void onItemClick(View view, int i2, float f, float f2) {
                NotificationsSettingsActivity.$r8$lambda$ZJEt7NazINK9z60O2ShN38ZYxKI(NotificationsSettingsActivity.this, view, i2, f, f2);
            }
        });
        return this.fragmentView;
    }

    public static /* synthetic */ void $r8$lambda$ZJEt7NazINK9z60O2ShN38ZYxKI(final NotificationsSettingsActivity notificationsSettingsActivity, View view, final int i, float f, float f2) {
        ArrayList arrayList;
        final int i2;
        boolean z;
        r3 = false;
        final boolean isGlobalNotificationsEnabled = false;
        if (notificationsSettingsActivity.getParentActivity() == null) {
            return;
        }
        int i3 = notificationsSettingsActivity.privateRow;
        ArrayList arrayList2 = null;
        r10 = null;
        Parcelable parcelable = null;
        if (i == i3 || i == notificationsSettingsActivity.groupRow || i == notificationsSettingsActivity.channelsRow || i == notificationsSettingsActivity.storiesRow || i == notificationsSettingsActivity.reactionsRow) {
            if (i == i3) {
                arrayList2 = notificationsSettingsActivity.exceptionUsers;
                arrayList = null;
                isGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(1);
                i2 = 1;
            } else if (i == notificationsSettingsActivity.groupRow) {
                arrayList2 = notificationsSettingsActivity.exceptionChats;
                arrayList = null;
                isGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(0);
                i2 = 0;
            } else if (i == notificationsSettingsActivity.storiesRow) {
                arrayList2 = notificationsSettingsActivity.exceptionStories;
                arrayList = notificationsSettingsActivity.exceptionAutoStories;
                isGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableAllStories", false);
                i2 = 3;
            } else if (i == notificationsSettingsActivity.reactionsRow) {
                isGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableReactionsMessages", true) || notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableReactionsStories", true);
                arrayList = null;
                i2 = 4;
            } else {
                arrayList2 = notificationsSettingsActivity.exceptionChannels;
                arrayList = null;
                isGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(2);
                i2 = 2;
            }
            if (arrayList2 == null && i2 != 4) {
                return;
            }
            final NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
            if ((LocaleController.isRTL && f <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                notificationsSettingsActivity.showExceptionsAlert(i, new Runnable() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationsSettingsActivity.$r8$lambda$DG1oNHlVHFZ6B7U2mKxgLf_uAXs(NotificationsSettingsActivity.this, i2, isGlobalNotificationsEnabled, notificationsCheckCell, i);
                    }
                });
            } else {
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(i2, arrayList2, arrayList));
            }
        } else if (i == notificationsSettingsActivity.callsRingtoneRow) {
            try {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
                String path = uri != null ? uri.getPath() : null;
                String string = notificationsSettings.getString("CallsRingtonePath", path);
                if (string != null && !string.equals("NoSound")) {
                    parcelable = string.equals(path) ? uri : Uri.parse(string);
                }
                intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                notificationsSettingsActivity.startActivityForResult(intent, i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i == notificationsSettingsActivity.resetNotificationsRow) {
            AlertDialog.Builder builder = new AlertDialog.Builder(notificationsSettingsActivity.getParentActivity());
            builder.setTitle(LocaleController.getString("ResetNotificationsAlertTitle", R.string.ResetNotificationsAlertTitle));
            builder.setMessage(LocaleController.getString("ResetNotificationsAlert", R.string.ResetNotificationsAlert));
            builder.setPositiveButton(LocaleController.getString("Reset", R.string.Reset), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda4
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i4) {
                    NotificationsSettingsActivity.$r8$lambda$dp-9jwDqimedbijyv0bOqsHHBSg(NotificationsSettingsActivity.this, alertDialog, i4);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            AlertDialog create = builder.create();
            notificationsSettingsActivity.showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        } else if (i == notificationsSettingsActivity.inappSoundRow) {
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
            SharedPreferences.Editor edit = notificationsSettings2.edit();
            isGlobalNotificationsEnabled = notificationsSettings2.getBoolean("EnableInAppSounds", true);
            edit.putBoolean("EnableInAppSounds", !isGlobalNotificationsEnabled);
            edit.commit();
        } else if (i == notificationsSettingsActivity.inappVibrateRow) {
            SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
            SharedPreferences.Editor edit2 = notificationsSettings3.edit();
            isGlobalNotificationsEnabled = notificationsSettings3.getBoolean("EnableInAppVibrate", true);
            edit2.putBoolean("EnableInAppVibrate", !isGlobalNotificationsEnabled);
            edit2.commit();
        } else if (i == notificationsSettingsActivity.inappPreviewRow) {
            SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
            SharedPreferences.Editor edit3 = notificationsSettings4.edit();
            isGlobalNotificationsEnabled = notificationsSettings4.getBoolean("EnableInAppPreview", true);
            edit3.putBoolean("EnableInAppPreview", !isGlobalNotificationsEnabled);
            edit3.commit();
        } else {
            if (i == notificationsSettingsActivity.inchatSoundRow) {
                SharedPreferences notificationsSettings5 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor edit4 = notificationsSettings5.edit();
                z = notificationsSettings5.getBoolean("EnableInChatSound", true);
                boolean z2 = !z;
                edit4.putBoolean("EnableInChatSound", z2);
                edit4.commit();
                notificationsSettingsActivity.getNotificationsController().setInChatSoundEnabled(z2);
            } else if (i == notificationsSettingsActivity.inappPriorityRow) {
                SharedPreferences notificationsSettings6 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor edit5 = notificationsSettings6.edit();
                isGlobalNotificationsEnabled = notificationsSettings6.getBoolean("EnableInAppPopup", true);
                edit5.putBoolean("EnableInAppPopup", !isGlobalNotificationsEnabled);
                edit5.commit();
            } else if (i == notificationsSettingsActivity.contactJoinedRow) {
                SharedPreferences notificationsSettings7 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor edit6 = notificationsSettings7.edit();
                z = notificationsSettings7.getBoolean("EnableContactJoined", true);
                boolean z3 = !z;
                MessagesController.getInstance(notificationsSettingsActivity.currentAccount).enableJoined = z3;
                edit6.putBoolean("EnableContactJoined", z3);
                edit6.commit();
                TL_account.setContactSignUpNotification setcontactsignupnotification = new TL_account.setContactSignUpNotification();
                setcontactsignupnotification.silent = z;
                ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(setcontactsignupnotification, new RequestDelegate() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda5
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        NotificationsSettingsActivity.$r8$lambda$z8728ZbQxis9p3M0Wak40C7BT78(tLObject, tL_error);
                    }
                });
            } else if (i == notificationsSettingsActivity.pinnedMessageRow) {
                SharedPreferences notificationsSettings8 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor edit7 = notificationsSettings8.edit();
                isGlobalNotificationsEnabled = notificationsSettings8.getBoolean("PinnedMessages", true);
                edit7.putBoolean("PinnedMessages", !isGlobalNotificationsEnabled);
                edit7.commit();
            } else if (i == notificationsSettingsActivity.androidAutoAlertRow) {
                SharedPreferences notificationsSettings9 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor edit8 = notificationsSettings9.edit();
                isGlobalNotificationsEnabled = notificationsSettings9.getBoolean("EnableAutoNotifications", false);
                edit8.putBoolean("EnableAutoNotifications", !isGlobalNotificationsEnabled);
                edit8.commit();
            } else if (i == notificationsSettingsActivity.badgeNumberShowRow) {
                SharedPreferences.Editor edit9 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
                isGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().showBadgeNumber;
                notificationsSettingsActivity.getNotificationsController().showBadgeNumber = !isGlobalNotificationsEnabled;
                edit9.putBoolean("badgeNumber", notificationsSettingsActivity.getNotificationsController().showBadgeNumber);
                edit9.commit();
                notificationsSettingsActivity.getNotificationsController().updateBadge();
            } else if (i == notificationsSettingsActivity.badgeNumberMutedRow) {
                SharedPreferences.Editor edit10 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
                isGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().showBadgeMuted;
                notificationsSettingsActivity.getNotificationsController().showBadgeMuted = !isGlobalNotificationsEnabled;
                edit10.putBoolean("badgeNumberMuted", notificationsSettingsActivity.getNotificationsController().showBadgeMuted);
                edit10.commit();
                notificationsSettingsActivity.getNotificationsController().updateBadge();
                notificationsSettingsActivity.getMessagesStorage().updateMutedDialogsFiltersCounters();
            } else if (i == notificationsSettingsActivity.badgeNumberMessagesRow) {
                SharedPreferences.Editor edit11 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
                isGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().showBadgeMessages;
                notificationsSettingsActivity.getNotificationsController().showBadgeMessages = !isGlobalNotificationsEnabled;
                edit11.putBoolean("badgeNumberMessages", notificationsSettingsActivity.getNotificationsController().showBadgeMessages);
                edit11.commit();
                notificationsSettingsActivity.getNotificationsController().updateBadge();
            } else if (i == notificationsSettingsActivity.notificationsServiceConnectionRow) {
                SharedPreferences notificationsSettings10 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                boolean z4 = notificationsSettings10.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().backgroundConnection);
                SharedPreferences.Editor edit12 = notificationsSettings10.edit();
                edit12.putBoolean("pushConnection", !z4);
                edit12.commit();
                if (!z4) {
                    ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).setPushConnectionEnabled(true);
                } else {
                    ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).setPushConnectionEnabled(false);
                }
                isGlobalNotificationsEnabled = z4;
            } else if (i == notificationsSettingsActivity.accountsAllRow) {
                SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
                boolean z5 = globalNotificationsSettings.getBoolean("AllAccounts", true);
                SharedPreferences.Editor edit13 = globalNotificationsSettings.edit();
                boolean z6 = !z5;
                edit13.putBoolean("AllAccounts", z6);
                edit13.commit();
                SharedConfig.showNotificationsForAllAccounts = z6;
                for (int i4 = 0; i4 < 4; i4++) {
                    if (SharedConfig.showNotificationsForAllAccounts) {
                        NotificationsController.getInstance(i4).showNotifications();
                    } else if (i4 == notificationsSettingsActivity.currentAccount) {
                        NotificationsController.getInstance(i4).showNotifications();
                    } else {
                        NotificationsController.getInstance(i4).hideNotifications();
                    }
                }
                isGlobalNotificationsEnabled = z5;
            } else if (i == notificationsSettingsActivity.notificationsServiceRow) {
                SharedPreferences notificationsSettings11 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                isGlobalNotificationsEnabled = notificationsSettings11.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().keepAliveService);
                SharedPreferences.Editor edit14 = notificationsSettings11.edit();
                edit14.putBoolean("pushService", !isGlobalNotificationsEnabled);
                edit14.commit();
                ApplicationLoader.startPushService();
            } else if (i == notificationsSettingsActivity.callsVibrateRow) {
                if (notificationsSettingsActivity.getParentActivity() == null) {
                    return;
                } else {
                    notificationsSettingsActivity.showDialog(AlertsCreator.createVibrationSelectDialog(notificationsSettingsActivity.getParentActivity(), 0L, 0L, i == notificationsSettingsActivity.callsVibrateRow ? "vibrate_calls" : null, new Runnable() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            NotificationsSettingsActivity.$r8$lambda$GBHksFBx7bWTK0gMkezTOmCQXHo(NotificationsSettingsActivity.this, i);
                        }
                    }));
                }
            } else if (i == notificationsSettingsActivity.repeatRow) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(notificationsSettingsActivity.getParentActivity());
                builder2.setTitle(LocaleController.getString("RepeatNotifications", R.string.RepeatNotifications));
                builder2.setItems(new CharSequence[]{LocaleController.getString("RepeatDisabled", R.string.RepeatDisabled), LocaleController.formatPluralString("Minutes", 5, new Object[0]), LocaleController.formatPluralString("Minutes", 10, new Object[0]), LocaleController.formatPluralString("Minutes", 30, new Object[0]), LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Hours", 2, new Object[0]), LocaleController.formatPluralString("Hours", 4, new Object[0])}, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda7
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        NotificationsSettingsActivity.$r8$lambda$SdVhuJSBr4KeDmUOA0xezqQXqWw(NotificationsSettingsActivity.this, i, dialogInterface, i5);
                    }
                });
                builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                notificationsSettingsActivity.showDialog(builder2.create());
            }
            isGlobalNotificationsEnabled = z;
        }
        if (view instanceof TextCheckCell) {
            ((TextCheckCell) view).setChecked(!isGlobalNotificationsEnabled);
        }
    }

    public static /* synthetic */ void $r8$lambda$DG1oNHlVHFZ6B7U2mKxgLf_uAXs(NotificationsSettingsActivity notificationsSettingsActivity, int i, boolean z, NotificationsCheckCell notificationsCheckCell, int i2) {
        notificationsSettingsActivity.getClass();
        if (i == 3) {
            SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
            if (z) {
                edit.remove("EnableAllStories");
            } else {
                edit.putBoolean("EnableAllStories", true);
            }
            edit.apply();
            notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i);
        } else if (i == 4 || i == 5) {
            SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
            if (z) {
                edit2.putBoolean("EnableReactionsMessages", false);
                edit2.putBoolean("EnableReactionsStories", false);
            } else {
                edit2.putBoolean("EnableReactionsMessages", true);
                edit2.putBoolean("EnableReactionsStories", true);
            }
            edit2.apply();
            notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i);
            notificationsSettingsActivity.getNotificationsController().deleteNotificationChannelGlobal(i);
        } else {
            notificationsSettingsActivity.getNotificationsController().setGlobalNotificationsEnabled(i, !z ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
        notificationsCheckCell.setChecked(!z, 0);
        notificationsSettingsActivity.adapter.notifyItemChanged(i2);
    }

    public static /* synthetic */ void $r8$lambda$dp-9jwDqimedbijyv0bOqsHHBSg(final NotificationsSettingsActivity notificationsSettingsActivity, AlertDialog alertDialog, int i) {
        if (notificationsSettingsActivity.reseting) {
            return;
        }
        notificationsSettingsActivity.reseting = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new RequestDelegate() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda11
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                NotificationsSettingsActivity.$r8$lambda$2SfBkj9y6dttpxVApl9kajCwoF8(NotificationsSettingsActivity.this, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$2SfBkj9y6dttpxVApl9kajCwoF8(final NotificationsSettingsActivity notificationsSettingsActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
        notificationsSettingsActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsSettingsActivity.$r8$lambda$Ke8WudTsJCvz8ot4WZceEENMavs(NotificationsSettingsActivity.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Ke8WudTsJCvz8ot4WZceEENMavs(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().enableJoined = true;
        notificationsSettingsActivity.reseting = false;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
        edit.clear();
        edit.commit();
        notificationsSettingsActivity.exceptionChats.clear();
        notificationsSettingsActivity.exceptionUsers.clear();
        notificationsSettingsActivity.adapter.notifyDataSetChanged();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), LocaleController.getString("ResetNotificationsText", R.string.ResetNotificationsText), 0).show();
        }
        notificationsSettingsActivity.getMessagesStorage().updateMutedDialogsFiltersCounters();
    }

    public static /* synthetic */ void $r8$lambda$GBHksFBx7bWTK0gMkezTOmCQXHo(NotificationsSettingsActivity notificationsSettingsActivity, int i) {
        notificationsSettingsActivity.updateVibrate = true;
        notificationsSettingsActivity.adapter.notifyItemChanged(i);
    }

    public static /* synthetic */ void $r8$lambda$SdVhuJSBr4KeDmUOA0xezqQXqWw(NotificationsSettingsActivity notificationsSettingsActivity, int i, DialogInterface dialogInterface, int i2) {
        notificationsSettingsActivity.getClass();
        MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit().putInt("repeat_messages", i2 != 1 ? i2 == 2 ? 10 : i2 == 3 ? 30 : i2 == 4 ? 60 : i2 == 5 ? 120 : i2 == 6 ? NotificationCenter.appConfigUpdated : 0 : 5).commit();
        notificationsSettingsActivity.updateRepeatNotifications = true;
        notificationsSettingsActivity.adapter.notifyItemChanged(i);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                str = null;
            } else {
                if (i == this.callsRingtoneRow) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = LocaleController.getString("DefaultRingtone", R.string.DefaultRingtone);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = LocaleController.getString("SoundDefault", R.string.SoundDefault);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            if (i == this.callsRingtoneRow) {
                if (str != null && uri != null) {
                    edit.putString("CallsRingtone", str);
                    edit.putString("CallsRingtonePath", uri.toString());
                } else {
                    edit.putString("CallsRingtone", "NoSound");
                    edit.putString("CallsRingtonePath", "NoSound");
                }
                this.updateRingtone = true;
            }
            edit.commit();
            this.adapter.notifyItemChanged(i);
        }
    }

    private void showExceptionsAlert(int i, final Runnable runnable) {
        final ArrayList arrayList;
        String formatPluralString;
        final ArrayList arrayList2;
        String str = null;
        if (i == this.storiesRow) {
            arrayList = this.exceptionStories;
            arrayList2 = this.exceptionAutoStories;
            if (arrayList != null && !arrayList.isEmpty()) {
                str = LocaleController.formatPluralString("ChatsException", arrayList.size(), new Object[0]);
            }
        } else if (i == this.privateRow) {
            arrayList = this.exceptionUsers;
            if (arrayList != null && !arrayList.isEmpty()) {
                formatPluralString = LocaleController.formatPluralString("ChatsException", arrayList.size(), new Object[0]);
                str = formatPluralString;
                arrayList2 = null;
            }
            arrayList2 = null;
        } else if (i == this.groupRow) {
            arrayList = this.exceptionChats;
            if (arrayList != null && !arrayList.isEmpty()) {
                formatPluralString = LocaleController.formatPluralString("Groups", arrayList.size(), new Object[0]);
                str = formatPluralString;
                arrayList2 = null;
            }
            arrayList2 = null;
        } else {
            if (i == this.reactionsRow) {
                runnable.run();
                return;
            }
            arrayList = this.exceptionChannels;
            if (arrayList != null && !arrayList.isEmpty()) {
                formatPluralString = LocaleController.formatPluralString("Channels", arrayList.size(), new Object[0]);
                str = formatPluralString;
                arrayList2 = null;
            }
            arrayList2 = null;
        }
        if (str == null) {
            runnable.run();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        if (arrayList.size() == 1) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NotificationsExceptionsSingleAlert, str)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NotificationsExceptionsAlert, str)));
        }
        builder.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        builder.setNeutralButton(LocaleController.getString("ViewExceptions", R.string.ViewExceptions), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda9
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i2) {
                NotificationsSettingsActivity.$r8$lambda$_24_Z2pEDipArxO4_3M8tQmYQHY(NotificationsSettingsActivity.this, arrayList, arrayList2, alertDialog, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString("OK", R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.NotificationsSettingsActivity$$ExternalSyntheticLambda10
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i2) {
                runnable.run();
            }
        });
        showDialog(builder.create());
    }

    public static /* synthetic */ void $r8$lambda$_24_Z2pEDipArxO4_3M8tQmYQHY(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, AlertDialog alertDialog, int i) {
        notificationsSettingsActivity.getClass();
        notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, arrayList, arrayList2));
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.notificationsSettingsUpdated) {
            this.adapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return (adapterPosition == NotificationsSettingsActivity.this.notificationsSectionRow || adapterPosition == NotificationsSettingsActivity.this.notificationsSection2Row || adapterPosition == NotificationsSettingsActivity.this.inappSectionRow || adapterPosition == NotificationsSettingsActivity.this.eventsSectionRow || adapterPosition == NotificationsSettingsActivity.this.otherSectionRow || adapterPosition == NotificationsSettingsActivity.this.resetSectionRow || adapterPosition == NotificationsSettingsActivity.this.badgeNumberSection || adapterPosition == NotificationsSettingsActivity.this.otherSection2Row || adapterPosition == NotificationsSettingsActivity.this.resetSection2Row || adapterPosition == NotificationsSettingsActivity.this.callsSection2Row || adapterPosition == NotificationsSettingsActivity.this.callsSectionRow || adapterPosition == NotificationsSettingsActivity.this.badgeNumberSection2Row || adapterPosition == NotificationsSettingsActivity.this.accountsSectionRow || adapterPosition == NotificationsSettingsActivity.this.accountsInfoRow || adapterPosition == NotificationsSettingsActivity.this.resetNotificationsSectionRow || adapterPosition == NotificationsSettingsActivity.this.eventsSection2Row) ? false : true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return NotificationsSettingsActivity.this.rowCount;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            if (i == 0) {
                headerCell = new HeaderCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
            } else if (i == 1) {
                headerCell = new TextCheckCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
            } else if (i == 2) {
                headerCell = new TextDetailSettingsCell(this.mContext);
            } else if (i == 3) {
                headerCell = new NotificationsCheckCell(this.mContext, 21, 64, true, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
            } else if (i == 4) {
                headerCell = new ShadowSectionCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
            } else if (i == 5) {
                headerCell = new TextSettingsCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
            } else {
                headerCell = new TextInfoPrivacyCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
            }
            return new RecyclerListView.Holder(headerCell);
        }

        /* JADX WARN: Removed duplicated region for block: B:123:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0226  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x034b  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x034d  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0289  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            String string;
            ArrayList arrayList;
            int i3;
            int i4;
            ArrayList arrayList2;
            boolean z;
            String formatPluralString;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i != NotificationsSettingsActivity.this.notificationsSectionRow) {
                    if (i != NotificationsSettingsActivity.this.inappSectionRow) {
                        if (i != NotificationsSettingsActivity.this.eventsSectionRow) {
                            if (i != NotificationsSettingsActivity.this.otherSectionRow) {
                                if (i != NotificationsSettingsActivity.this.resetSectionRow) {
                                    if (i != NotificationsSettingsActivity.this.callsSectionRow) {
                                        if (i != NotificationsSettingsActivity.this.badgeNumberSection) {
                                            if (i == NotificationsSettingsActivity.this.accountsSectionRow) {
                                                headerCell.setText(LocaleController.getString("ShowNotificationsFor", R.string.ShowNotificationsFor));
                                                return;
                                            }
                                            return;
                                        }
                                        headerCell.setText(LocaleController.getString("BadgeNumber", R.string.BadgeNumber));
                                        return;
                                    }
                                    headerCell.setText(LocaleController.getString("VoipNotificationSettings", R.string.VoipNotificationSettings));
                                    return;
                                }
                                headerCell.setText(LocaleController.getString("Reset", R.string.Reset));
                                return;
                            }
                            headerCell.setText(LocaleController.getString("NotificationsOther", R.string.NotificationsOther));
                            return;
                        }
                        headerCell.setText(LocaleController.getString("Events", R.string.Events));
                        return;
                    }
                    headerCell.setText(LocaleController.getString("InAppNotifications", R.string.InAppNotifications));
                    return;
                }
                headerCell.setText(LocaleController.getString("NotificationsForChats", R.string.NotificationsForChats));
                return;
            }
            if (itemViewType == 1) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) NotificationsSettingsActivity.this).currentAccount);
                if (i != NotificationsSettingsActivity.this.inappSoundRow) {
                    if (i != NotificationsSettingsActivity.this.inappVibrateRow) {
                        if (i != NotificationsSettingsActivity.this.inappPreviewRow) {
                            if (i != NotificationsSettingsActivity.this.inappPriorityRow) {
                                if (i != NotificationsSettingsActivity.this.contactJoinedRow) {
                                    if (i != NotificationsSettingsActivity.this.pinnedMessageRow) {
                                        if (i != NotificationsSettingsActivity.this.androidAutoAlertRow) {
                                            if (i != NotificationsSettingsActivity.this.notificationsServiceRow) {
                                                if (i != NotificationsSettingsActivity.this.notificationsServiceConnectionRow) {
                                                    if (i == NotificationsSettingsActivity.this.badgeNumberShowRow) {
                                                        textCheckCell.setTextAndCheck(LocaleController.getString("BadgeNumberShow", R.string.BadgeNumberShow), NotificationsSettingsActivity.this.getNotificationsController().showBadgeNumber, true);
                                                        return;
                                                    }
                                                    if (i == NotificationsSettingsActivity.this.badgeNumberMutedRow) {
                                                        textCheckCell.setTextAndCheck(LocaleController.getString("BadgeNumberMutedChats", R.string.BadgeNumberMutedChats), NotificationsSettingsActivity.this.getNotificationsController().showBadgeMuted, true);
                                                        return;
                                                    }
                                                    if (i == NotificationsSettingsActivity.this.badgeNumberMessagesRow) {
                                                        textCheckCell.setTextAndCheck(LocaleController.getString("BadgeNumberUnread", R.string.BadgeNumberUnread), NotificationsSettingsActivity.this.getNotificationsController().showBadgeMessages, false);
                                                        return;
                                                    }
                                                    if (i != NotificationsSettingsActivity.this.inchatSoundRow) {
                                                        if (i != NotificationsSettingsActivity.this.callsVibrateRow) {
                                                            if (i == NotificationsSettingsActivity.this.accountsAllRow) {
                                                                textCheckCell.setTextAndCheck(LocaleController.getString("AllAccounts", R.string.AllAccounts), MessagesController.getGlobalNotificationsSettings().getBoolean("AllAccounts", true), false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        textCheckCell.setTextAndCheck(LocaleController.getString("Vibrate", R.string.Vibrate), notificationsSettings.getBoolean("EnableCallVibrate", true), true);
                                                        return;
                                                    }
                                                    textCheckCell.setTextAndCheck(LocaleController.getString("InChatSound", R.string.InChatSound), notificationsSettings.getBoolean("EnableInChatSound", true), true);
                                                    return;
                                                }
                                                textCheckCell.setTextAndValueAndCheck(LocaleController.getString("NotificationsServiceConnection", R.string.NotificationsServiceConnection), LocaleController.getString("NotificationsServiceConnectionInfo", R.string.NotificationsServiceConnectionInfo), notificationsSettings.getBoolean("pushConnection", NotificationsSettingsActivity.this.getMessagesController().backgroundConnection), true, true);
                                                return;
                                            }
                                            textCheckCell.setTextAndValueAndCheck(LocaleController.getString("NotificationsService", R.string.NotificationsService), LocaleController.getString("NotificationsServiceInfo", R.string.NotificationsServiceInfo), notificationsSettings.getBoolean("pushService", NotificationsSettingsActivity.this.getMessagesController().keepAliveService), true, true);
                                            return;
                                        }
                                        textCheckCell.setTextAndCheck("Android Auto", notificationsSettings.getBoolean("EnableAutoNotifications", false), true);
                                        return;
                                    }
                                    textCheckCell.setTextAndCheck(LocaleController.getString("PinnedMessages", R.string.PinnedMessages), notificationsSettings.getBoolean("PinnedMessages", true), false);
                                    return;
                                }
                                textCheckCell.setTextAndCheck(LocaleController.getString("ContactJoined", R.string.ContactJoined), notificationsSettings.getBoolean("EnableContactJoined", true), true);
                                return;
                            }
                            textCheckCell.setTextAndValueAndCheck(LocaleController.getString(R.string.InAppPopup), LocaleController.getString(R.string.InAppPopupInfo), notificationsSettings.getBoolean("EnableInAppPopup", true), true, false);
                            return;
                        }
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.InAppPreview), notificationsSettings.getBoolean("EnableInAppPreview", true), true);
                        return;
                    }
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.InAppVibrate), notificationsSettings.getBoolean("EnableInAppVibrate", true), true);
                    return;
                }
                textCheckCell.setTextAndCheck(LocaleController.getString(R.string.InAppSounds), notificationsSettings.getBoolean("EnableInAppSounds", true), true);
                return;
            }
            if (itemViewType == 2) {
                TextDetailSettingsCell textDetailSettingsCell = (TextDetailSettingsCell) viewHolder.itemView;
                textDetailSettingsCell.setMultilineDetail(true);
                if (i == NotificationsSettingsActivity.this.resetNotificationsRow) {
                    textDetailSettingsCell.setTextAndValue(LocaleController.getString("ResetAllNotifications", R.string.ResetAllNotifications), LocaleController.getString("UndoAllCustom", R.string.UndoAllCustom), false);
                    return;
                }
                return;
            }
            if (itemViewType != 3) {
                if (itemViewType != 5) {
                    if (itemViewType != 6) {
                        return;
                    }
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i == NotificationsSettingsActivity.this.accountsInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString("ShowNotificationsForInfo", R.string.ShowNotificationsForInfo));
                        return;
                    }
                    return;
                }
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(((BaseFragment) NotificationsSettingsActivity.this).currentAccount);
                if (i != NotificationsSettingsActivity.this.callsRingtoneRow) {
                    if (i != NotificationsSettingsActivity.this.callsVibrateRow) {
                        if (i == NotificationsSettingsActivity.this.repeatRow) {
                            int i5 = notificationsSettings2.getInt("repeat_messages", 60);
                            if (i5 == 0) {
                                formatPluralString = LocaleController.getString("RepeatNotificationsNever", R.string.RepeatNotificationsNever);
                            } else if (i5 < 60) {
                                formatPluralString = LocaleController.formatPluralString("Minutes", i5, new Object[0]);
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i5 / 60, new Object[0]);
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString("RepeatNotifications", R.string.RepeatNotifications), formatPluralString, NotificationsSettingsActivity.this.updateRepeatNotifications, false);
                            NotificationsSettingsActivity.this.updateRepeatNotifications = false;
                            return;
                        }
                        return;
                    }
                    int i6 = notificationsSettings2.getInt("vibrate_calls", 0);
                    if (i6 == 0) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("VibrationDefault", R.string.VibrationDefault), NotificationsSettingsActivity.this.updateVibrate, true);
                    } else if (i6 == 1) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("Short", R.string.Short), NotificationsSettingsActivity.this.updateVibrate, true);
                    } else if (i6 == 2) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("VibrationDisabled", R.string.VibrationDisabled), NotificationsSettingsActivity.this.updateVibrate, true);
                    } else if (i6 == 3) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("Long", R.string.Long), NotificationsSettingsActivity.this.updateVibrate, true);
                    } else if (i6 == 4) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("OnlyIfSilent", R.string.OnlyIfSilent), NotificationsSettingsActivity.this.updateVibrate, true);
                    }
                    NotificationsSettingsActivity.this.updateVibrate = false;
                    return;
                }
                String string2 = notificationsSettings2.getString("CallsRingtone", LocaleController.getString("DefaultRingtone", R.string.DefaultRingtone));
                if (string2.equals("NoSound")) {
                    string2 = LocaleController.getString("NoSound", R.string.NoSound);
                }
                textSettingsCell.setTextAndValue(LocaleController.getString("VoipSettingsRingtone", R.string.VoipSettingsRingtone), string2, NotificationsSettingsActivity.this.updateRingtone, false);
                NotificationsSettingsActivity.this.updateRingtone = false;
                return;
            }
            NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) viewHolder.itemView;
            SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(((BaseFragment) NotificationsSettingsActivity.this).currentAccount);
            int currentTime = ConnectionsManager.getInstance(((BaseFragment) NotificationsSettingsActivity.this).currentAccount).getCurrentTime();
            ArrayList arrayList3 = null;
            if (i != NotificationsSettingsActivity.this.privateRow) {
                if (i != NotificationsSettingsActivity.this.groupRow) {
                    int i7 = NotificationsSettingsActivity.this.storiesRow;
                    i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (i != i7) {
                        if (i == NotificationsSettingsActivity.this.reactionsRow) {
                            string = LocaleController.getString(R.string.NotificationReactions);
                            int i8 = (notificationsSettings3.getBoolean("EnableReactionsMessages", true) || notificationsSettings3.getBoolean("EnableReactionsStories", true)) ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                            i4 = R.drawable.msg_reactions;
                            i2 = i8;
                            arrayList2 = null;
                        } else {
                            string = LocaleController.getString(R.string.NotificationsChannels);
                            arrayList = NotificationsSettingsActivity.this.exceptionChannels;
                            i3 = notificationsSettings3.getInt("EnableChannel2", 0);
                            i4 = R.drawable.msg_channel;
                        }
                    } else {
                        string = LocaleController.getString(R.string.NotificationStories);
                        arrayList3 = NotificationsSettingsActivity.this.exceptionStories;
                        arrayList2 = NotificationsSettingsActivity.this.exceptionAutoStories;
                        if (notificationsSettings3.getBoolean("EnableAllStories", false)) {
                            i2 = 0;
                        }
                        i4 = R.drawable.msg_menu_stories;
                    }
                    boolean z2 = i2 >= currentTime;
                    int i9 = (!z2 && i2 - 31536000 < currentTime) ? 2 : 0;
                    StringBuilder sb = new StringBuilder();
                    String str = string;
                    int i10 = i9;
                    if (i != NotificationsSettingsActivity.this.reactionsRow) {
                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                            z2 = i2 < currentTime;
                            if (z2) {
                                sb.append(LocaleController.getString("NotificationsOn", R.string.NotificationsOn));
                            } else if (i2 - 31536000 >= currentTime) {
                                sb.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                            } else {
                                sb.append(LocaleController.formatString("NotificationsOffUntil", R.string.NotificationsOffUntil, LocaleController.stringForMessageListDate(i2)));
                            }
                            if (sb.length() != 0) {
                                sb.append(", ");
                            }
                            int size = arrayList3.size();
                            if (i == NotificationsSettingsActivity.this.storiesRow && !notificationsSettings3.contains("EnableAllStories") && arrayList2 != null) {
                                size += arrayList2.size();
                            }
                            sb.append(LocaleController.formatPluralString("Exception", size, new Object[0]));
                        } else if (arrayList2 != null && !arrayList2.isEmpty()) {
                            if (i2 > 0) {
                                sb.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                            } else {
                                sb.append(LocaleController.getString("NotificationsOn", R.string.NotificationsOn));
                            }
                            if (!arrayList2.isEmpty() && !notificationsSettings3.contains("EnableAllStories")) {
                                sb.append(", ");
                                sb.append(LocaleController.formatPluralString("AutoException", arrayList2.size(), new Object[0]));
                            }
                        } else {
                            sb.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                        }
                        z = z2;
                    } else if (i2 > 0) {
                        sb.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                        z = false;
                    } else {
                        if (notificationsSettings3.getBoolean("EnableReactionsMessages", true)) {
                            sb.append(LocaleController.getString(R.string.NotificationReactionsMessages));
                        }
                        if (notificationsSettings3.getBoolean("EnableReactionsStories", true)) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(LocaleController.getString(R.string.NotificationReactionsStories));
                        }
                        z = true;
                    }
                    notificationsCheckCell.setTextAndValueAndIconAndCheck(str, sb, i4, z, i10, false, i != NotificationsSettingsActivity.this.reactionsRow);
                }
                string = LocaleController.getString(R.string.NotificationsGroups);
                arrayList = NotificationsSettingsActivity.this.exceptionChats;
                i3 = notificationsSettings3.getInt("EnableGroup2", 0);
                i4 = R.drawable.msg_groups;
            } else {
                string = LocaleController.getString(R.string.NotificationsPrivateChats);
                arrayList = NotificationsSettingsActivity.this.exceptionUsers;
                i3 = notificationsSettings3.getInt("EnableAll2", 0);
                i4 = R.drawable.msg_openprofile;
            }
            int i11 = i3;
            arrayList2 = null;
            arrayList3 = arrayList;
            i2 = i11;
            if (i2 >= currentTime) {
            }
            if (z2) {
                StringBuilder sb2 = new StringBuilder();
                String str2 = string;
                int i102 = i9;
                if (i != NotificationsSettingsActivity.this.reactionsRow) {
                }
                notificationsCheckCell.setTextAndValueAndIconAndCheck(str2, sb2, i4, z, i102, false, i != NotificationsSettingsActivity.this.reactionsRow);
            }
            StringBuilder sb22 = new StringBuilder();
            String str22 = string;
            int i1022 = i9;
            if (i != NotificationsSettingsActivity.this.reactionsRow) {
            }
            notificationsCheckCell.setTextAndValueAndIconAndCheck(str22, sb22, i4, z, i1022, false, i != NotificationsSettingsActivity.this.reactionsRow);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == NotificationsSettingsActivity.this.eventsSectionRow || i == NotificationsSettingsActivity.this.otherSectionRow || i == NotificationsSettingsActivity.this.resetSectionRow || i == NotificationsSettingsActivity.this.callsSectionRow || i == NotificationsSettingsActivity.this.badgeNumberSection || i == NotificationsSettingsActivity.this.inappSectionRow || i == NotificationsSettingsActivity.this.notificationsSectionRow || i == NotificationsSettingsActivity.this.accountsSectionRow) {
                return 0;
            }
            if (i == NotificationsSettingsActivity.this.inappSoundRow || i == NotificationsSettingsActivity.this.inappVibrateRow || i == NotificationsSettingsActivity.this.notificationsServiceConnectionRow || i == NotificationsSettingsActivity.this.inappPreviewRow || i == NotificationsSettingsActivity.this.contactJoinedRow || i == NotificationsSettingsActivity.this.pinnedMessageRow || i == NotificationsSettingsActivity.this.notificationsServiceRow || i == NotificationsSettingsActivity.this.badgeNumberMutedRow || i == NotificationsSettingsActivity.this.badgeNumberMessagesRow || i == NotificationsSettingsActivity.this.badgeNumberShowRow || i == NotificationsSettingsActivity.this.inappPriorityRow || i == NotificationsSettingsActivity.this.inchatSoundRow || i == NotificationsSettingsActivity.this.androidAutoAlertRow || i == NotificationsSettingsActivity.this.accountsAllRow) {
                return 1;
            }
            if (i == NotificationsSettingsActivity.this.resetNotificationsRow) {
                return 2;
            }
            if (i == NotificationsSettingsActivity.this.privateRow || i == NotificationsSettingsActivity.this.groupRow || i == NotificationsSettingsActivity.this.channelsRow || i == NotificationsSettingsActivity.this.storiesRow || i == NotificationsSettingsActivity.this.reactionsRow) {
                return 3;
            }
            if (i == NotificationsSettingsActivity.this.eventsSection2Row || i == NotificationsSettingsActivity.this.notificationsSection2Row || i == NotificationsSettingsActivity.this.otherSection2Row || i == NotificationsSettingsActivity.this.resetSection2Row || i == NotificationsSettingsActivity.this.callsSection2Row || i == NotificationsSettingsActivity.this.badgeNumberSection2Row || i == NotificationsSettingsActivity.this.resetNotificationsSectionRow) {
                return 4;
            }
            return i == NotificationsSettingsActivity.this.accountsInfoRow ? 6 : 5;
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, TextCheckCell.class, TextDetailSettingsCell.class, TextSettingsCell.class, NotificationsCheckCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        int i2 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        int i3 = Theme.key_switchTrack;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        int i4 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LINKCOLOR, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteLinkText));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
