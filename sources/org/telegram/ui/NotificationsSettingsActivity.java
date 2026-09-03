package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public org.telegram.ui.Components.sl0 a;
    private int accountsAllRow;
    public boolean b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public kk0 c;
    private int channelsRow;
    private int contactJoinedRow;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f;
    private int groupRow;
    public ArrayList h;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    public ArrayList n;
    private int pinnedMessageRow;
    private int privateRow;
    public int r;
    private int reactionsRow;
    private int resetNotificationsRow;
    public int s;
    private int storiesRow;
    public int v;
    public int w;
    public int x;
    public int y;

    public NotificationsSettingsActivity() {
        super(null);
        this.b = false;
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = null;
        this.n = null;
        this.R = 0;
    }

    public static /* synthetic */ void U(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putChats(arrayList2, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putEncryptedChats(arrayList3, true);
        notificationsSettingsActivity.d = arrayList4;
        notificationsSettingsActivity.e = arrayList5;
        notificationsSettingsActivity.f = arrayList6;
        notificationsSettingsActivity.h = arrayList7;
        notificationsSettingsActivity.n = arrayList8;
        kk0 kk0Var = notificationsSettingsActivity.c;
        if (kk0Var != null) {
            kk0Var.m(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.c.m(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.c.m(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.c.m(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static /* synthetic */ void V(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().enableJoined = true;
        notificationsSettingsActivity.b = false;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
        edit.clear();
        edit.commit();
        notificationsSettingsActivity.e.clear();
        notificationsSettingsActivity.d.clear();
        notificationsSettingsActivity.c.l();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), LocaleController.getString("ResetNotificationsText", R.string.ResetNotificationsText), 0).show();
        }
        notificationsSettingsActivity.getMessagesStorage().updateMutedDialogsFiltersCounters();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:95|(2:110|111)(2:97|(2:109|105)(1:99))|100|101|102|103|104|105) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02ae, code lost:
    
        if (r8.deleted != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a2 A[LOOP:5: B:196:0x03a0->B:197:0x03a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, Runnable runnable) {
        ArrayList<TLRPC.Chat> arrayList2;
        boolean z4;
        ArrayList<TLRPC.Chat> arrayList3;
        ArrayList<TLRPC.User> arrayList4;
        ArrayList<TLRPC.EncryptedChat> arrayList5;
        int size;
        int i10;
        ArrayList arrayList6;
        int size2;
        int i11;
        int size3;
        int i12;
        int size4;
        int i13;
        ArrayList arrayList7;
        int i14;
        ArrayList arrayList8;
        ArrayList arrayList9;
        Long parseLong;
        long longValue;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList<TLRPC.EncryptedChat> arrayList12;
        Integer num;
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList<Long> arrayList18 = new ArrayList<>();
        ArrayList arrayList19 = new ArrayList();
        ArrayList arrayList20 = new ArrayList();
        ArrayList<TLRPC.User> arrayList21 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList22 = new ArrayList<>();
        ArrayList<TLRPC.EncryptedChat> arrayList23 = new ArrayList<>();
        long j10 = UserConfig.getInstance(notificationsSettingsActivity.currentAccount).clientUserId;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
        Map<String, ?> all = notificationsSettings.getAll();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            arrayList2 = arrayList22;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            ArrayList<TLRPC.User> arrayList24 = arrayList21;
            if (key.startsWith(NotificationsSettingsFacade.PROPERTY_NOTIFY)) {
                arrayList12 = arrayList23;
                String replace = key.replace(NotificationsSettingsFacade.PROPERTY_NOTIFY, "");
                if (replace.contains("_")) {
                    arrayList22 = arrayList2;
                    arrayList21 = arrayList24;
                    arrayList23 = arrayList12;
                } else {
                    Long parseLong2 = Utilities.parseLong(replace);
                    ArrayList arrayList25 = arrayList16;
                    arrayList11 = arrayList17;
                    long longValue2 = parseLong2.longValue();
                    if (longValue2 == 0 || longValue2 == j10) {
                        arrayList10 = arrayList25;
                    } else {
                        arrayList10 = arrayList25;
                        lk0 lk0Var = new lk0();
                        lk0Var.d = longValue2;
                        ArrayList arrayList26 = arrayList14;
                        lk0Var.b = org.telegram.messenger.y3.v(NotificationsSettingsFacade.PROPERTY_CUSTOM, longValue2, notificationsSettings, false);
                        int intValue = ((Integer) next.getValue()).intValue();
                        lk0Var.c = intValue;
                        if (intValue != 0 && (num = (Integer) all.get(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL.concat(replace))) != null) {
                            lk0Var.a = num.intValue();
                        }
                        if (DialogObject.isEncryptedDialog(longValue2)) {
                            int encryptedChatId = DialogObject.getEncryptedChatId(longValue2);
                            TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getEncryptedChat(Integer.valueOf(encryptedChatId));
                            if (encryptedChat == null) {
                                arrayList20.add(Integer.valueOf(encryptedChatId));
                                longSparseArray.put(longValue2, lk0Var);
                            } else {
                                TLRPC.User user = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getUser(Long.valueOf(encryptedChat.user_id));
                                if (user == null) {
                                    arrayList18.add(Long.valueOf(encryptedChat.user_id));
                                    longSparseArray.put(encryptedChat.user_id, lk0Var);
                                } else if (user.deleted) {
                                    arrayList22 = arrayList2;
                                    arrayList21 = arrayList24;
                                    arrayList23 = arrayList12;
                                    arrayList17 = arrayList11;
                                    arrayList16 = arrayList10;
                                    arrayList14 = arrayList26;
                                }
                            }
                            arrayList13.add(lk0Var);
                            arrayList14 = arrayList26;
                        } else if (DialogObject.isUserDialog(longValue2)) {
                            TLRPC.User user2 = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getUser(parseLong2);
                            if (user2 == null) {
                                arrayList18.add(parseLong2);
                                longSparseArray.put(longValue2, lk0Var);
                            } else if (user2.deleted) {
                                arrayList22 = arrayList2;
                                arrayList21 = arrayList24;
                                arrayList23 = arrayList12;
                                arrayList17 = arrayList11;
                                arrayList16 = arrayList10;
                                arrayList14 = arrayList26;
                            }
                            arrayList13.add(lk0Var);
                            arrayList14 = arrayList26;
                        } else {
                            long j11 = -longValue2;
                            TLRPC.Chat chat = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getChat(Long.valueOf(j11));
                            if (chat == null) {
                                arrayList19.add(Long.valueOf(j11));
                                longSparseArray.put(longValue2, lk0Var);
                            } else if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                                if (!ChatObject.isChannel(chat) || chat.megagroup) {
                                    arrayList14 = arrayList26;
                                    arrayList14.add(lk0Var);
                                } else {
                                    arrayList15.add(lk0Var);
                                    arrayList14 = arrayList26;
                                }
                            }
                            arrayList22 = arrayList2;
                            arrayList21 = arrayList24;
                            arrayList23 = arrayList12;
                            arrayList17 = arrayList11;
                            arrayList16 = arrayList10;
                            arrayList14 = arrayList26;
                        }
                    }
                }
            } else {
                arrayList10 = arrayList16;
                arrayList11 = arrayList17;
                arrayList12 = arrayList23;
            }
            arrayList22 = arrayList2;
            arrayList21 = arrayList24;
            arrayList23 = arrayList12;
            arrayList17 = arrayList11;
            arrayList16 = arrayList10;
        }
        ArrayList arrayList27 = arrayList16;
        ArrayList arrayList28 = arrayList17;
        ArrayList<TLRPC.User> arrayList29 = arrayList21;
        ArrayList<TLRPC.EncryptedChat> arrayList30 = arrayList23;
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            z4 = true;
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
                    arrayList9 = arrayList27;
                }
                if (longValue != 0 && longValue != j10) {
                    lk0 lk0Var2 = new lk0();
                    lk0Var2.d = longValue;
                    lk0Var2.c = ((Boolean) next2.getValue()).booleanValue() ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    lk0Var2.e = true;
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user3 = notificationsSettingsActivity.getMessagesController().getUser(parseLong);
                        if (user3 == null) {
                            try {
                                arrayList18.add(parseLong);
                                longSparseArray.put(longValue, lk0Var2);
                            } catch (Exception unused2) {
                            }
                        } else if (user3.deleted) {
                        }
                        arrayList9 = arrayList27;
                        arrayList9.add(lk0Var2);
                        hashSet.add(parseLong);
                        arrayList27 = arrayList9;
                    }
                }
            }
            arrayList9 = arrayList27;
            arrayList27 = arrayList9;
        }
        ArrayList arrayList31 = arrayList27;
        ArrayList arrayList32 = arrayList;
        Collections.sort(arrayList32, Comparator$-CC.comparingDouble(new mh.y0(6)));
        int max = Math.max(0, arrayList32.size() - 5);
        while (max < arrayList32.size()) {
            long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList32.get(max)).peer);
            if (hashSet.contains(Long.valueOf(peerDialogId))) {
                i14 = max;
            } else {
                lk0 lk0Var3 = new lk0();
                lk0Var3.d = peerDialogId;
                i14 = max;
                lk0Var3.c = 0;
                lk0Var3.f = z4;
                lk0Var3.e = z4;
                if (DialogObject.isUserDialog(peerDialogId)) {
                    TLRPC.User user4 = notificationsSettingsActivity.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    if (user4 == null) {
                        arrayList18.add(Long.valueOf(peerDialogId));
                        longSparseArray.put(peerDialogId, lk0Var3);
                    }
                    arrayList8 = arrayList28;
                    arrayList8.add(0, lk0Var3);
                    hashSet.add(Long.valueOf(peerDialogId));
                    arrayList28 = arrayList8;
                    max = i14 + 1;
                    z4 = true;
                    arrayList32 = arrayList;
                }
            }
            arrayList8 = arrayList28;
            arrayList28 = arrayList8;
            max = i14 + 1;
            z4 = true;
            arrayList32 = arrayList;
        }
        ArrayList arrayList33 = arrayList28;
        if (longSparseArray.size() != 0) {
            try {
                if (arrayList20.isEmpty()) {
                    arrayList5 = arrayList30;
                } else {
                    try {
                        arrayList5 = arrayList30;
                        try {
                            MessagesStorage.getInstance(notificationsSettingsActivity.currentAccount).getEncryptedChatsInternal(TextUtils.join(",", arrayList20), arrayList5, arrayList18);
                        } catch (Exception e6) {
                            e = e6;
                            arrayList3 = arrayList2;
                            arrayList4 = arrayList29;
                            FileLog.e(e);
                            size = arrayList3.size();
                            i10 = 0;
                            while (i10 < size) {
                            }
                            arrayList6 = arrayList33;
                            size2 = arrayList4.size();
                            while (i11 < size2) {
                            }
                            size3 = arrayList5.size();
                            while (i12 < size3) {
                            }
                            size4 = longSparseArray.size();
                            while (i13 < size4) {
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.ac(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList31, arrayList6, runnable));
                        }
                    } catch (Exception e10) {
                        e = e10;
                        arrayList5 = arrayList30;
                        arrayList3 = arrayList2;
                        arrayList4 = arrayList29;
                        FileLog.e(e);
                        size = arrayList3.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        arrayList6 = arrayList33;
                        size2 = arrayList4.size();
                        while (i11 < size2) {
                        }
                        size3 = arrayList5.size();
                        while (i12 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i13 < size4) {
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.ac(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList31, arrayList6, runnable));
                    }
                }
                if (arrayList18.isEmpty()) {
                    arrayList4 = arrayList29;
                } else {
                    try {
                        arrayList4 = arrayList29;
                    } catch (Exception e11) {
                        e = e11;
                        arrayList4 = arrayList29;
                        arrayList3 = arrayList2;
                        FileLog.e(e);
                        size = arrayList3.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        arrayList6 = arrayList33;
                        size2 = arrayList4.size();
                        while (i11 < size2) {
                        }
                        size3 = arrayList5.size();
                        while (i12 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i13 < size4) {
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.ac(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList31, arrayList6, runnable));
                    }
                    try {
                        MessagesStorage.getInstance(notificationsSettingsActivity.currentAccount).getUsersInternal(arrayList18, arrayList4);
                    } catch (Exception e12) {
                        e = e12;
                        arrayList3 = arrayList2;
                        FileLog.e(e);
                        size = arrayList3.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        arrayList6 = arrayList33;
                        size2 = arrayList4.size();
                        while (i11 < size2) {
                        }
                        size3 = arrayList5.size();
                        while (i12 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i13 < size4) {
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.ac(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList31, arrayList6, runnable));
                    }
                }
                if (arrayList19.isEmpty()) {
                    arrayList3 = arrayList2;
                } else {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(notificationsSettingsActivity.currentAccount);
                    String join = TextUtils.join(",", arrayList19);
                    arrayList3 = arrayList2;
                    try {
                        messagesStorage.getChatsInternal(join, arrayList3);
                    } catch (Exception e13) {
                        e = e13;
                        FileLog.e(e);
                        size = arrayList3.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        arrayList6 = arrayList33;
                        size2 = arrayList4.size();
                        while (i11 < size2) {
                        }
                        size3 = arrayList5.size();
                        while (i12 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i13 < size4) {
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.ac(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList31, arrayList6, runnable));
                    }
                }
            } catch (Exception e14) {
                e = e14;
                arrayList3 = arrayList2;
                arrayList4 = arrayList29;
                arrayList5 = arrayList30;
            }
            size = arrayList3.size();
            i10 = 0;
            while (i10 < size) {
                TLRPC.Chat chat2 = arrayList3.get(i10);
                if (chat2.left || chat2.kicked || chat2.migrated_to != null) {
                    arrayList7 = arrayList33;
                } else {
                    lk0 lk0Var4 = (lk0) longSparseArray.get(-chat2.id);
                    arrayList7 = arrayList33;
                    longSparseArray.remove(-chat2.id);
                    if (lk0Var4 != null) {
                        if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                            arrayList14.add(lk0Var4);
                        } else {
                            arrayList15.add(lk0Var4);
                        }
                    }
                }
                i10++;
                arrayList33 = arrayList7;
            }
            arrayList6 = arrayList33;
            size2 = arrayList4.size();
            for (i11 = 0; i11 < size2; i11++) {
                TLRPC.User user5 = arrayList4.get(i11);
                if (!user5.deleted) {
                    longSparseArray.remove(user5.id);
                }
            }
            size3 = arrayList5.size();
            for (i12 = 0; i12 < size3; i12++) {
                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList5.get(i12).id));
            }
            size4 = longSparseArray.size();
            for (i13 = 0; i13 < size4; i13++) {
                if (DialogObject.isChatDialog(longSparseArray.keyAt(i13))) {
                    arrayList14.remove(longSparseArray.valueAt(i13));
                    arrayList15.remove(longSparseArray.valueAt(i13));
                } else {
                    arrayList13.remove(longSparseArray.valueAt(i13));
                }
            }
        } else {
            arrayList6 = arrayList33;
            arrayList3 = arrayList2;
            arrayList4 = arrayList29;
            arrayList5 = arrayList30;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.ac(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList31, arrayList6, runnable));
    }

    public static /* synthetic */ void X(NotificationsSettingsActivity notificationsSettingsActivity, int i10, int i11) {
        MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit().putInt("repeat_messages", i11 != 1 ? i11 == 2 ? 10 : i11 == 3 ? 30 : i11 == 4 ? 60 : i11 == 5 ? 120 : i11 == 6 ? 240 : 0 : 5).commit();
        notificationsSettingsActivity.U = true;
        notificationsSettingsActivity.c.m(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Y(NotificationsSettingsActivity notificationsSettingsActivity, View view, int i10, float f10) {
        ArrayList arrayList;
        boolean isGlobalNotificationsEnabled;
        ArrayList arrayList2;
        int i11;
        boolean z4;
        ArrayList arrayList3;
        String formatPluralString;
        ArrayList arrayList4;
        if (notificationsSettingsActivity.getParentActivity() == null) {
            return;
        }
        int i12 = notificationsSettingsActivity.privateRow;
        int i13 = 4;
        String str = null;
        r7 = null;
        Parcelable parcelable = null;
        str = null;
        str = null;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 != i12 && i10 != notificationsSettingsActivity.groupRow && i10 != notificationsSettingsActivity.channelsRow && i10 != notificationsSettingsActivity.storiesRow && i10 != notificationsSettingsActivity.reactionsRow) {
            if (i10 == notificationsSettingsActivity.F) {
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
                    notificationsSettingsActivity.startActivityForResult(intent, i10);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            } else if (i10 == notificationsSettingsActivity.resetNotificationsRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(notificationsSettingsActivity.getParentActivity());
                String string2 = LocaleController.getString("ResetNotificationsAlertTitle", R.string.ResetNotificationsAlertTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string2;
                d2Var.Q = LocaleController.getString("ResetNotificationsAlert", R.string.ResetNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString("Reset", R.string.Reset), new jk0(notificationsSettingsActivity));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                notificationsSettingsActivity.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                }
            } else if (i10 == notificationsSettingsActivity.inappSoundRow) {
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor edit = notificationsSettings2.edit();
                z10 = notificationsSettings2.getBoolean("EnableInAppSounds", true);
                edit.putBoolean("EnableInAppSounds", !z10);
                edit.commit();
            } else if (i10 == notificationsSettingsActivity.inappVibrateRow) {
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor edit2 = notificationsSettings3.edit();
                z10 = notificationsSettings3.getBoolean("EnableInAppVibrate", true);
                edit2.putBoolean("EnableInAppVibrate", !z10);
                edit2.commit();
            } else if (i10 == notificationsSettingsActivity.inappPreviewRow) {
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor edit3 = notificationsSettings4.edit();
                z10 = notificationsSettings4.getBoolean("EnableInAppPreview", true);
                edit3.putBoolean("EnableInAppPreview", !z10);
                edit3.commit();
            } else if (i10 == notificationsSettingsActivity.inchatSoundRow) {
                SharedPreferences notificationsSettings5 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor edit4 = notificationsSettings5.edit();
                z10 = notificationsSettings5.getBoolean("EnableInChatSound", true);
                boolean z11 = !z10;
                edit4.putBoolean("EnableInChatSound", z11);
                edit4.commit();
                notificationsSettingsActivity.getNotificationsController().setInChatSoundEnabled(z11);
            } else if (i10 == notificationsSettingsActivity.inappPriorityRow) {
                SharedPreferences notificationsSettings6 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor edit5 = notificationsSettings6.edit();
                z10 = notificationsSettings6.getBoolean("EnableInAppPopup", true);
                edit5.putBoolean("EnableInAppPopup", !z10);
                edit5.commit();
            } else if (i10 == notificationsSettingsActivity.contactJoinedRow) {
                SharedPreferences notificationsSettings7 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor edit6 = notificationsSettings7.edit();
                z10 = notificationsSettings7.getBoolean("EnableContactJoined", true);
                boolean z12 = !z10;
                MessagesController.getInstance(notificationsSettingsActivity.currentAccount).enableJoined = z12;
                edit6.putBoolean("EnableContactJoined", z12);
                edit6.commit();
                TL_account.setContactSignUpNotification setcontactsignupnotification = new TL_account.setContactSignUpNotification();
                setcontactsignupnotification.silent = z10;
                ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(setcontactsignupnotification, new oh.p5(i13));
            } else if (i10 == notificationsSettingsActivity.pinnedMessageRow) {
                SharedPreferences notificationsSettings8 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor edit7 = notificationsSettings8.edit();
                z10 = notificationsSettings8.getBoolean("PinnedMessages", true);
                edit7.putBoolean("PinnedMessages", !z10);
                edit7.commit();
            } else if (i10 == notificationsSettingsActivity.M) {
                SharedPreferences notificationsSettings9 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor edit8 = notificationsSettings9.edit();
                z10 = notificationsSettings9.getBoolean("EnableAutoNotifications", false);
                edit8.putBoolean("EnableAutoNotifications", !z10);
                edit8.commit();
            } else if (i10 == notificationsSettingsActivity.badgeNumberShowRow) {
                SharedPreferences.Editor edit9 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
                z10 = notificationsSettingsActivity.getNotificationsController().showBadgeNumber;
                notificationsSettingsActivity.getNotificationsController().showBadgeNumber = !z10;
                edit9.putBoolean("badgeNumber", notificationsSettingsActivity.getNotificationsController().showBadgeNumber);
                edit9.commit();
                notificationsSettingsActivity.getNotificationsController().updateBadge();
            } else if (i10 == notificationsSettingsActivity.badgeNumberMutedRow) {
                SharedPreferences.Editor edit10 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
                z10 = notificationsSettingsActivity.getNotificationsController().showBadgeMuted;
                notificationsSettingsActivity.getNotificationsController().showBadgeMuted = !z10;
                edit10.putBoolean("badgeNumberMuted", notificationsSettingsActivity.getNotificationsController().showBadgeMuted);
                edit10.commit();
                notificationsSettingsActivity.getNotificationsController().updateBadge();
                notificationsSettingsActivity.getMessagesStorage().updateMutedDialogsFiltersCounters();
            } else if (i10 == notificationsSettingsActivity.badgeNumberMessagesRow) {
                SharedPreferences.Editor edit11 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
                z10 = notificationsSettingsActivity.getNotificationsController().showBadgeMessages;
                notificationsSettingsActivity.getNotificationsController().showBadgeMessages = !z10;
                edit11.putBoolean("badgeNumberMessages", notificationsSettingsActivity.getNotificationsController().showBadgeMessages);
                edit11.commit();
                notificationsSettingsActivity.getNotificationsController().updateBadge();
            } else if (i10 == notificationsSettingsActivity.w) {
                SharedPreferences notificationsSettings10 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                z4 = notificationsSettings10.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().backgroundConnection);
                SharedPreferences.Editor edit12 = notificationsSettings10.edit();
                edit12.putBoolean("pushConnection", !z4);
                edit12.commit();
                if (z4) {
                    ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).setPushConnectionEnabled(false);
                } else {
                    ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).setPushConnectionEnabled(true);
                }
            } else if (i10 == notificationsSettingsActivity.accountsAllRow) {
                SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
                boolean z13 = globalNotificationsSettings.getBoolean("AllAccounts", true);
                SharedPreferences.Editor edit13 = globalNotificationsSettings.edit();
                boolean z14 = !z13;
                edit13.putBoolean("AllAccounts", z14);
                edit13.commit();
                SharedConfig.showNotificationsForAllAccounts = z14;
                for (int i14 = 0; i14 < 4; i14++) {
                    if (SharedConfig.showNotificationsForAllAccounts) {
                        NotificationsController.getInstance(i14).showNotifications();
                    } else if (i14 == notificationsSettingsActivity.currentAccount) {
                        NotificationsController.getInstance(i14).showNotifications();
                    } else {
                        NotificationsController.getInstance(i14).hideNotifications();
                    }
                }
                z10 = z13;
            } else if (i10 == notificationsSettingsActivity.v) {
                SharedPreferences notificationsSettings11 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                z10 = notificationsSettings11.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().keepAliveService);
                SharedPreferences.Editor edit14 = notificationsSettings11.edit();
                edit14.putBoolean("pushService", !z10);
                edit14.commit();
                ApplicationLoader.startPushService();
            } else if (i10 == notificationsSettingsActivity.E) {
                if (notificationsSettingsActivity.getParentActivity() == null) {
                    return;
                } else {
                    notificationsSettingsActivity.showDialog(org.telegram.ui.Components.z4.Y(notificationsSettingsActivity.getParentActivity(), 0L, 0L, i10 == notificationsSettingsActivity.E ? "vibrate_calls" : null, new org.telegram.ui.Components.im(notificationsSettingsActivity, i10, 17), null));
                }
            } else if (i10 == notificationsSettingsActivity.N) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(notificationsSettingsActivity.getParentActivity());
                String string3 = LocaleController.getString("RepeatNotifications", R.string.RepeatNotifications);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                d2Var2.O = string3;
                alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString("RepeatDisabled", R.string.RepeatDisabled), LocaleController.formatPluralString("Minutes", 5, new Object[0]), LocaleController.formatPluralString("Minutes", 10, new Object[0]), LocaleController.formatPluralString("Minutes", 30, new Object[0]), LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Hours", 2, new Object[0]), LocaleController.formatPluralString("Hours", 4, new Object[0])}, new ty(notificationsSettingsActivity, i10, 1));
                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                notificationsSettingsActivity.showDialog(d2Var2);
            }
            if (view instanceof org.telegram.ui.Cells.s8) {
                return;
            }
            ((org.telegram.ui.Cells.s8) view).setChecked(!z10);
            return;
        }
        if (i10 == i12) {
            arrayList = notificationsSettingsActivity.d;
            isGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(1);
            arrayList2 = null;
            i11 = 1;
        } else if (i10 == notificationsSettingsActivity.groupRow) {
            arrayList = notificationsSettingsActivity.e;
            isGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(0);
            arrayList2 = null;
            i11 = 0;
        } else if (i10 == notificationsSettingsActivity.storiesRow) {
            arrayList = notificationsSettingsActivity.h;
            ArrayList arrayList5 = notificationsSettingsActivity.n;
            isGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableAllStories", false);
            arrayList2 = arrayList5;
            i11 = 3;
        } else if (i10 == notificationsSettingsActivity.reactionsRow) {
            isGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableReactionsMessages", true) || notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableReactionsStories", true);
            arrayList = null;
            arrayList2 = null;
            i11 = 4;
        } else {
            arrayList = notificationsSettingsActivity.f;
            isGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(2);
            arrayList2 = null;
            i11 = 2;
        }
        if (arrayList == null && i11 != 4) {
            return;
        }
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
        if ((!LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            int i15 = i11;
            z4 = isGlobalNotificationsEnabled;
            notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(i15, arrayList, arrayList2, false));
        } else {
            boolean z15 = isGlobalNotificationsEnabled;
            org.telegram.messenger.uj ujVar = new org.telegram.messenger.uj(notificationsSettingsActivity, i11, z15, j5Var, i10);
            z4 = z15;
            if (i10 == notificationsSettingsActivity.storiesRow) {
                arrayList3 = notificationsSettingsActivity.h;
                arrayList4 = notificationsSettingsActivity.n;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    str = LocaleController.formatPluralString("ChatsException", arrayList3.size(), new Object[0]);
                }
            } else if (i10 == notificationsSettingsActivity.privateRow) {
                arrayList3 = notificationsSettingsActivity.d;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    formatPluralString = LocaleController.formatPluralString("ChatsException", arrayList3.size(), new Object[0]);
                    arrayList4 = null;
                    str = formatPluralString;
                }
                arrayList4 = null;
            } else if (i10 == notificationsSettingsActivity.groupRow) {
                arrayList3 = notificationsSettingsActivity.e;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    formatPluralString = LocaleController.formatPluralString("Groups", arrayList3.size(), new Object[0]);
                    arrayList4 = null;
                    str = formatPluralString;
                }
                arrayList4 = null;
            } else if (i10 == notificationsSettingsActivity.reactionsRow) {
                ujVar.run();
            } else {
                arrayList3 = notificationsSettingsActivity.f;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    formatPluralString = LocaleController.formatPluralString("Channels", arrayList3.size(), new Object[0]);
                    arrayList4 = null;
                    str = formatPluralString;
                }
                arrayList4 = null;
            }
            if (str == null) {
                ujVar.run();
            } else {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(notificationsSettingsActivity.getParentActivity());
                int size = arrayList3.size();
                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
                if (size == 1) {
                    d2Var3.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NotificationsExceptionsSingleAlert, str));
                } else {
                    d2Var3.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NotificationsExceptionsAlert, str));
                }
                d2Var3.O = LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions);
                alertDialog$Builder3.i(LocaleController.getString("ViewExceptions", R.string.ViewExceptions), new d7(notificationsSettingsActivity, arrayList3, arrayList4, 16));
                alertDialog$Builder3.h(LocaleController.getString("OK", R.string.OK), new gu(ujVar, 26));
                notificationsSettingsActivity.showDialog(d2Var3);
            }
        }
        z10 = z4;
        if (view instanceof org.telegram.ui.Cells.s8) {
        }
    }

    public static /* synthetic */ void Z(NotificationsSettingsActivity notificationsSettingsActivity) {
        if (notificationsSettingsActivity.b) {
            return;
        }
        notificationsSettingsActivity.b = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new o(notificationsSettingsActivity, 15));
    }

    public final void A0(dt dtVar) {
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new if0(this, new ArrayList(MediaDataController.getInstance(this.currentAccount).hints), dtVar, 9));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsAndSounds));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 28));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.a = sl0Var;
        sl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setItemAnimator(null);
        this.a.setLayoutAnimation(null);
        this.a.setLayoutManager(new k(i10, false, 11));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, k7.c6.c(-1.0f, -1));
        org.telegram.ui.Components.sl0 sl0Var2 = this.a;
        kk0 kk0Var = new kk0(this, context);
        this.c = kk0Var;
        sl0Var2.setAdapter(kk0Var);
        this.a.setOnItemClickListener(new jk0(this));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            this.c.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.z8.class, org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 2, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.J6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i11 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                str = null;
            } else {
                str = i10 == this.F ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? LocaleController.getString("DefaultRingtone", R.string.DefaultRingtone) : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? LocaleController.getString("SoundDefault", R.string.SoundDefault) : ringtone.getTitle(getParentActivity());
                ringtone.stop();
            }
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            if (i10 == this.F) {
                if (str == null || uri == null) {
                    edit.putString("CallsRingtone", "NoSound");
                    edit.putString("CallsRingtonePath", "NoSound");
                } else {
                    edit.putString("CallsRingtone", str);
                    edit.putString("CallsRingtonePath", uri.toString());
                }
                this.T = true;
            }
            edit.commit();
            this.c.m(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        MessagesController.getInstance(this.currentAccount).loadSignUpNotificationsSettings();
        A0(null);
        if (UserConfig.getActivatedAccountsCount() > 1) {
            int i10 = this.R;
            this.r = i10;
            this.accountsAllRow = i10 + 1;
            this.R = i10 + 3;
            this.s = i10 + 2;
        } else {
            this.r = -1;
            this.accountsAllRow = -1;
            this.s = -1;
        }
        int i11 = this.R;
        this.x = i11;
        this.privateRow = i11 + 1;
        this.groupRow = i11 + 2;
        this.channelsRow = i11 + 3;
        this.storiesRow = i11 + 4;
        this.reactionsRow = i11 + 5;
        this.y = i11 + 6;
        this.D = i11 + 7;
        this.E = i11 + 8;
        this.F = i11 + 9;
        this.G = i11 + 10;
        this.K = i11 + 11;
        this.badgeNumberShowRow = i11 + 12;
        this.badgeNumberMutedRow = i11 + 13;
        this.badgeNumberMessagesRow = i11 + 14;
        this.L = i11 + 15;
        this.B = i11 + 16;
        this.inappSoundRow = i11 + 17;
        this.inappVibrateRow = i11 + 18;
        this.inappPreviewRow = i11 + 19;
        this.inchatSoundRow = i11 + 20;
        this.inappPriorityRow = i11 + 21;
        this.C = i11 + 22;
        this.H = i11 + 23;
        this.contactJoinedRow = i11 + 24;
        this.pinnedMessageRow = i11 + 25;
        this.I = i11 + 26;
        this.J = i11 + 27;
        this.v = i11 + 28;
        this.w = i11 + 29;
        this.M = -1;
        this.N = i11 + 30;
        this.O = i11 + 31;
        this.P = i11 + 32;
        this.resetNotificationsRow = i11 + 33;
        this.R = i11 + 35;
        this.Q = i11 + 34;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getMessagesController().reloadReactionsNotifySettings();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        kk0 kk0Var = this.c;
        if (kk0Var != null) {
            kk0Var.l();
        }
    }
}
