package org.telegram.ui;

import android.content.Context;
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
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
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
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public org.telegram.ui.Components.tj0 a;
    private int accountsAllRow;
    public boolean b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public n4 c;
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
        this.V = 0;
    }

    public static /* synthetic */ void Z(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).Y3(arrayList, true);
        org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).S3(arrayList2, true);
        org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).V3(arrayList3);
        notificationsSettingsActivity.d = arrayList4;
        notificationsSettingsActivity.e = arrayList5;
        notificationsSettingsActivity.f = arrayList6;
        notificationsSettingsActivity.h = arrayList7;
        notificationsSettingsActivity.n = arrayList8;
        n4 n4Var = notificationsSettingsActivity.c;
        if (n4Var != null) {
            n4Var.g(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.c.g(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.c.g(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.c.g(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void a0(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().getClass();
        notificationsSettingsActivity.b = false;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7.edit();
        edit.clear();
        edit.commit();
        notificationsSettingsActivity.e.clear();
        notificationsSettingsActivity.d.clear();
        notificationsSettingsActivity.c.f();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131746104, "ResetNotificationsText"), 0).show();
        }
        org.telegram.messenger.qr messagesStorage = notificationsSettingsActivity.getMessagesStorage();
        messagesStorage.a.c(new org.telegram.messenger.hq(messagesStorage, 25));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:95|(2:109|110)(2:97|(2:108|105)(1:99))|100|101|102|103|104|105) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ac, code lost:
    
        if (r8.deleted != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03aa A[LOOP:5: B:194:0x03a8->B:195:0x03aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b0(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, Runnable runnable) {
        ArrayList arrayList2;
        boolean z10;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i3;
        boolean z11;
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
        Long A;
        long longValue;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        Integer num;
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        ArrayList arrayList20 = new ArrayList();
        ArrayList arrayList21 = new ArrayList();
        ArrayList arrayList22 = new ArrayList();
        ArrayList arrayList23 = new ArrayList();
        long j10 = org.telegram.messenger.h10.i(notificationsSettingsActivity.currentAccount).n;
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7;
        Map<String, ?> all = sharedPreferences.getAll();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            arrayList2 = arrayList22;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            ArrayList arrayList24 = arrayList21;
            if (key.startsWith("notify2_")) {
                arrayList12 = arrayList23;
                String replace = key.replace("notify2_", "");
                if (replace.contains("_")) {
                    arrayList22 = arrayList2;
                    arrayList21 = arrayList24;
                    arrayList23 = arrayList12;
                } else {
                    Long A2 = Utilities.A(replace);
                    ArrayList arrayList25 = arrayList16;
                    arrayList11 = arrayList17;
                    long longValue2 = A2.longValue();
                    if (longValue2 == 0 || longValue2 == j10) {
                        arrayList10 = arrayList25;
                    } else {
                        arrayList10 = arrayList25;
                        lh0 lh0Var = new lh0();
                        lh0Var.d = longValue2;
                        ArrayList arrayList26 = arrayList14;
                        lh0Var.b = org.telegram.messenger.k5.w("custom_", longValue2, sharedPreferences, false);
                        int intValue = ((Integer) next.getValue()).intValue();
                        lh0Var.c = intValue;
                        if (intValue != 0 && (num = (Integer) all.get("notifyuntil_".concat(replace))) != null) {
                            lh0Var.a = num.intValue();
                        }
                        if (org.telegram.messenger.m5.C(longValue2)) {
                            int i15 = (int) (4294967295L & longValue2);
                            TLRPC.EncryptedChat a12 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).a1(Integer.valueOf(i15));
                            if (a12 == null) {
                                arrayList20.add(Integer.valueOf(i15));
                                longSparseArray.put(longValue2, lh0Var);
                            } else {
                                TLRPC.User a22 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).a2(Long.valueOf(a12.user_id));
                                if (a22 == null) {
                                    arrayList18.add(Long.valueOf(a12.user_id));
                                    longSparseArray.put(a12.user_id, lh0Var);
                                } else if (a22.deleted) {
                                    arrayList22 = arrayList2;
                                    arrayList21 = arrayList24;
                                    arrayList23 = arrayList12;
                                    arrayList17 = arrayList11;
                                    arrayList16 = arrayList10;
                                    arrayList14 = arrayList26;
                                }
                            }
                            arrayList13.add(lh0Var);
                            arrayList14 = arrayList26;
                        } else if (org.telegram.messenger.m5.E(longValue2)) {
                            TLRPC.User a23 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).a2(A2);
                            if (a23 == null) {
                                arrayList18.add(A2);
                                longSparseArray.put(longValue2, lh0Var);
                            } else if (a23.deleted) {
                                arrayList22 = arrayList2;
                                arrayList21 = arrayList24;
                                arrayList23 = arrayList12;
                                arrayList17 = arrayList11;
                                arrayList16 = arrayList10;
                                arrayList14 = arrayList26;
                            }
                            arrayList13.add(lh0Var);
                            arrayList14 = arrayList26;
                        } else {
                            long j11 = -longValue2;
                            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).M0(Long.valueOf(j11));
                            if (M0 == null) {
                                arrayList19.add(Long.valueOf(j11));
                                longSparseArray.put(longValue2, lh0Var);
                            } else if (!M0.left && !M0.kicked && M0.migrated_to == null) {
                                if (!org.telegram.messenger.t3.T(M0) || M0.megagroup) {
                                    arrayList14 = arrayList26;
                                    arrayList14.add(lh0Var);
                                } else {
                                    arrayList15.add(lh0Var);
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
        ArrayList arrayList29 = arrayList21;
        ArrayList arrayList30 = arrayList23;
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            z10 = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next2 = it2.next();
            String key2 = next2.getKey();
            if (key2.startsWith("stories_")) {
                try {
                    A = Utilities.A(key2.substring(8));
                    longValue = A.longValue();
                } catch (Exception unused) {
                }
                if (longValue != 0 && longValue != j10) {
                    lh0 lh0Var2 = new lh0();
                    lh0Var2.d = longValue;
                    lh0Var2.c = ((Boolean) next2.getValue()).booleanValue() ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    lh0Var2.e = true;
                    if (org.telegram.messenger.m5.E(longValue)) {
                        TLRPC.User a24 = notificationsSettingsActivity.getMessagesController().a2(A);
                        if (a24 == null) {
                            arrayList18.add(A);
                            longSparseArray.put(longValue, lh0Var2);
                        } else if (a24.deleted) {
                        }
                        arrayList9 = arrayList27;
                        arrayList9.add(lh0Var2);
                        hashSet.add(A);
                        arrayList27 = arrayList9;
                    }
                }
            }
            arrayList9 = arrayList27;
            arrayList27 = arrayList9;
        }
        ArrayList arrayList31 = arrayList27;
        Collections.sort(arrayList, Comparator$-CC.comparingDouble(new ci.c1(6)));
        int max = Math.max(0, arrayList.size() - 5);
        while (max < arrayList.size()) {
            long o10 = org.telegram.messenger.m5.o(((TLRPC.TL_topPeer) arrayList.get(max)).peer);
            if (hashSet.contains(Long.valueOf(o10))) {
                i14 = max;
            } else {
                lh0 lh0Var3 = new lh0();
                lh0Var3.d = o10;
                i14 = max;
                lh0Var3.c = 0;
                lh0Var3.f = z10;
                lh0Var3.e = z10;
                if (org.telegram.messenger.m5.E(o10)) {
                    TLRPC.User a25 = notificationsSettingsActivity.getMessagesController().a2(Long.valueOf(o10));
                    if (a25 == null) {
                        arrayList18.add(Long.valueOf(o10));
                        longSparseArray.put(o10, lh0Var3);
                    }
                    arrayList8 = arrayList28;
                    arrayList8.add(0, lh0Var3);
                    hashSet.add(Long.valueOf(o10));
                    arrayList28 = arrayList8;
                    max = i14 + 1;
                    z10 = true;
                }
            }
            arrayList8 = arrayList28;
            arrayList28 = arrayList8;
            max = i14 + 1;
            z10 = true;
        }
        ArrayList arrayList32 = arrayList28;
        if (longSparseArray.size() != 0) {
            try {
                if (arrayList20.isEmpty()) {
                    arrayList5 = arrayList30;
                } else {
                    try {
                        arrayList5 = arrayList30;
                    } catch (Exception e10) {
                        e = e10;
                        arrayList5 = arrayList30;
                    }
                    try {
                        org.telegram.messenger.qr.a0(notificationsSettingsActivity.currentAccount).V(TextUtils.join(",", arrayList20), arrayList5, arrayList18);
                    } catch (Exception e11) {
                        e = e11;
                        arrayList3 = arrayList2;
                        arrayList4 = arrayList29;
                        z11 = true;
                        i3 = 0;
                        org.telegram.messenger.a8.g(e, z11);
                        size = arrayList3.size();
                        i10 = i3;
                        while (i10 < size) {
                        }
                        arrayList6 = arrayList31;
                        size2 = arrayList4.size();
                        while (i11 < size2) {
                        }
                        size3 = arrayList5.size();
                        while (i12 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i13 < size4) {
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.messenger.vj(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, runnable));
                    }
                }
                try {
                    if (arrayList18.isEmpty()) {
                        arrayList4 = arrayList29;
                        i3 = 0;
                    } else {
                        try {
                            arrayList4 = arrayList29;
                            i3 = 0;
                        } catch (Exception e12) {
                            e = e12;
                            arrayList4 = arrayList29;
                            i3 = 0;
                            arrayList3 = arrayList2;
                            z11 = true;
                            org.telegram.messenger.a8.g(e, z11);
                            size = arrayList3.size();
                            i10 = i3;
                            while (i10 < size) {
                            }
                            arrayList6 = arrayList31;
                            size2 = arrayList4.size();
                            while (i11 < size2) {
                            }
                            size3 = arrayList5.size();
                            while (i12 < size3) {
                            }
                            size4 = longSparseArray.size();
                            while (i13 < size4) {
                            }
                            org.telegram.messenger.g0.h3(new org.telegram.messenger.vj(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, runnable));
                        }
                        try {
                            org.telegram.messenger.qr.a0(notificationsSettingsActivity.currentAccount).n0(arrayList18, arrayList4, false);
                        } catch (Exception e13) {
                            e = e13;
                            arrayList3 = arrayList2;
                            z11 = true;
                            org.telegram.messenger.a8.g(e, z11);
                            size = arrayList3.size();
                            i10 = i3;
                            while (i10 < size) {
                            }
                            arrayList6 = arrayList31;
                            size2 = arrayList4.size();
                            while (i11 < size2) {
                            }
                            size3 = arrayList5.size();
                            while (i12 < size3) {
                            }
                            size4 = longSparseArray.size();
                            while (i13 < size4) {
                            }
                            org.telegram.messenger.g0.h3(new org.telegram.messenger.vj(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, runnable));
                        }
                    }
                    if (arrayList19.isEmpty()) {
                        arrayList3 = arrayList2;
                    } else {
                        org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(notificationsSettingsActivity.currentAccount);
                        String join = TextUtils.join(",", arrayList19);
                        arrayList3 = arrayList2;
                        try {
                            a02.Q(join, arrayList3);
                        } catch (Exception e14) {
                            e = e14;
                            z11 = true;
                            org.telegram.messenger.a8.g(e, z11);
                            size = arrayList3.size();
                            i10 = i3;
                            while (i10 < size) {
                            }
                            arrayList6 = arrayList31;
                            size2 = arrayList4.size();
                            while (i11 < size2) {
                            }
                            size3 = arrayList5.size();
                            while (i12 < size3) {
                            }
                            size4 = longSparseArray.size();
                            while (i13 < size4) {
                            }
                            org.telegram.messenger.g0.h3(new org.telegram.messenger.vj(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, runnable));
                        }
                    }
                } catch (Exception e15) {
                    e = e15;
                    arrayList3 = arrayList2;
                    arrayList4 = arrayList29;
                    i3 = 0;
                    z11 = true;
                    org.telegram.messenger.a8.g(e, z11);
                    size = arrayList3.size();
                    i10 = i3;
                    while (i10 < size) {
                    }
                    arrayList6 = arrayList31;
                    size2 = arrayList4.size();
                    while (i11 < size2) {
                    }
                    size3 = arrayList5.size();
                    while (i12 < size3) {
                    }
                    size4 = longSparseArray.size();
                    while (i13 < size4) {
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.vj(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, runnable));
                }
            } catch (Exception e16) {
                e = e16;
                arrayList3 = arrayList2;
                arrayList4 = arrayList29;
                arrayList5 = arrayList30;
            }
            size = arrayList3.size();
            i10 = i3;
            while (i10 < size) {
                TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i10);
                if (chat.left || chat.kicked || chat.migrated_to != null) {
                    arrayList7 = arrayList31;
                } else {
                    lh0 lh0Var4 = (lh0) longSparseArray.get(-chat.id);
                    arrayList7 = arrayList31;
                    longSparseArray.remove(-chat.id);
                    if (lh0Var4 != null) {
                        if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                            arrayList14.add(lh0Var4);
                        } else {
                            arrayList15.add(lh0Var4);
                        }
                    }
                }
                i10++;
                arrayList31 = arrayList7;
            }
            arrayList6 = arrayList31;
            size2 = arrayList4.size();
            for (i11 = 0; i11 < size2; i11++) {
                TLRPC.User user = (TLRPC.User) arrayList4.get(i11);
                if (!user.deleted) {
                    longSparseArray.remove(user.id);
                }
            }
            size3 = arrayList5.size();
            for (i12 = 0; i12 < size3; i12++) {
                longSparseArray.remove(org.telegram.messenger.m5.F(((TLRPC.EncryptedChat) arrayList5.get(i12)).id));
            }
            size4 = longSparseArray.size();
            for (i13 = 0; i13 < size4; i13++) {
                if (org.telegram.messenger.m5.z(longSparseArray.keyAt(i13))) {
                    arrayList14.remove(longSparseArray.valueAt(i13));
                    arrayList15.remove(longSparseArray.valueAt(i13));
                } else {
                    arrayList13.remove(longSparseArray.valueAt(i13));
                }
            }
        } else {
            arrayList6 = arrayList31;
            arrayList3 = arrayList2;
            arrayList4 = arrayList29;
            arrayList5 = arrayList30;
        }
        org.telegram.messenger.g0.h3(new org.telegram.messenger.vj(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, runnable));
    }

    public static void c0(NotificationsSettingsActivity notificationsSettingsActivity, int i3, int i10) {
        org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7.edit().putInt("repeat_messages", i10 != 1 ? i10 == 2 ? 10 : i10 == 3 ? 30 : i10 == 4 ? 60 : i10 == 5 ? 120 : i10 == 6 ? org.telegram.messenger.hs.P3 : 0 : 5).commit();
        notificationsSettingsActivity.Y = true;
        notificationsSettingsActivity.c.g(i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d0(NotificationsSettingsActivity notificationsSettingsActivity, View view, int i3, float f10) {
        int i10;
        boolean B;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String G;
        ArrayList arrayList4;
        if (notificationsSettingsActivity.getParentActivity() == null) {
            return;
        }
        int i11 = notificationsSettingsActivity.privateRow;
        Parcelable parcelable = null;
        parcelable = null;
        int i12 = 1;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i3 != i11 && i3 != notificationsSettingsActivity.groupRow && i3 != notificationsSettingsActivity.channelsRow && i3 != notificationsSettingsActivity.storiesRow && i3 != notificationsSettingsActivity.reactionsRow) {
            if (i3 == notificationsSettingsActivity.J) {
                try {
                    SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7;
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string = sharedPreferences.getString("CallsRingtonePath", path);
                    if (string != null && !string.equals("NoSound")) {
                        parcelable = string.equals(path) ? uri : Uri.parse(string);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    notificationsSettingsActivity.startActivityForResult(intent, i3);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i3 == notificationsSettingsActivity.resetNotificationsRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(notificationsSettingsActivity.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131746105, "ResetNotificationsAlertTitle");
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131746106, "ResetNotificationsAlert");
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, "Reset"), new kh0(notificationsSettingsActivity));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                notificationsSettingsActivity.showDialog(s1Var);
                TextView textView = (TextView) s1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                }
            } else if (i3 == notificationsSettingsActivity.inappSoundRow) {
                SharedPreferences sharedPreferences2 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7;
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                z10 = sharedPreferences2.getBoolean("EnableInAppSounds", true);
                edit.putBoolean("EnableInAppSounds", !z10);
                edit.commit();
            } else if (i3 == notificationsSettingsActivity.inappVibrateRow) {
                SharedPreferences sharedPreferences3 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7;
                SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                z10 = sharedPreferences3.getBoolean("EnableInAppVibrate", true);
                edit2.putBoolean("EnableInAppVibrate", !z10);
                edit2.commit();
            } else if (i3 == notificationsSettingsActivity.inappPreviewRow) {
                SharedPreferences sharedPreferences4 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7;
                SharedPreferences.Editor edit3 = sharedPreferences4.edit();
                z10 = sharedPreferences4.getBoolean("EnableInAppPreview", true);
                edit3.putBoolean("EnableInAppPreview", !z10);
                edit3.commit();
            } else if (i3 == notificationsSettingsActivity.inchatSoundRow) {
                SharedPreferences sharedPreferences5 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7;
                SharedPreferences.Editor edit4 = sharedPreferences5.edit();
                z10 = sharedPreferences5.getBoolean("EnableInChatSound", true);
                boolean z11 = !z10;
                edit4.putBoolean("EnableInChatSound", z11);
                edit4.commit();
                notificationsSettingsActivity.getNotificationsController().N = z11;
            } else if (i3 == notificationsSettingsActivity.inappPriorityRow) {
                SharedPreferences sharedPreferences6 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7;
                SharedPreferences.Editor edit5 = sharedPreferences6.edit();
                z10 = sharedPreferences6.getBoolean("EnableInAppPopup", true);
                edit5.putBoolean("EnableInAppPopup", !z10);
                edit5.commit();
            } else if (i3 == notificationsSettingsActivity.contactJoinedRow) {
                SharedPreferences sharedPreferences7 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7;
                SharedPreferences.Editor edit6 = sharedPreferences7.edit();
                z10 = sharedPreferences7.getBoolean("EnableContactJoined", true);
                org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount);
                edit6.putBoolean("EnableContactJoined", !z10);
                edit6.commit();
                TL_account.setContactSignUpNotification setcontactsignupnotification = new TL_account.setContactSignUpNotification();
                setcontactsignupnotification.silent = z10;
                ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(setcontactsignupnotification, new ei.u5(9));
            } else if (i3 == notificationsSettingsActivity.pinnedMessageRow) {
                SharedPreferences sharedPreferences8 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7;
                SharedPreferences.Editor edit7 = sharedPreferences8.edit();
                z10 = sharedPreferences8.getBoolean("PinnedMessages", true);
                edit7.putBoolean("PinnedMessages", !z10);
                edit7.commit();
            } else if (i3 == notificationsSettingsActivity.Q) {
                SharedPreferences sharedPreferences9 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7;
                SharedPreferences.Editor edit8 = sharedPreferences9.edit();
                z10 = sharedPreferences9.getBoolean("EnableAutoNotifications", false);
                edit8.putBoolean("EnableAutoNotifications", !z10);
                edit8.commit();
            } else {
                int i13 = 7;
                if (i3 == notificationsSettingsActivity.badgeNumberShowRow) {
                    SharedPreferences.Editor edit9 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7.edit();
                    z10 = notificationsSettingsActivity.getNotificationsController().S;
                    notificationsSettingsActivity.getNotificationsController().S = !z10;
                    edit9.putBoolean("badgeNumber", notificationsSettingsActivity.getNotificationsController().S);
                    edit9.commit();
                    org.telegram.messenger.us notificationsController = notificationsSettingsActivity.getNotificationsController();
                    notificationsController.getClass();
                    org.telegram.messenger.us.l0.c(new org.telegram.messenger.is(notificationsController, i13));
                } else if (i3 == notificationsSettingsActivity.badgeNumberMutedRow) {
                    SharedPreferences.Editor edit10 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7.edit();
                    z10 = notificationsSettingsActivity.getNotificationsController().T;
                    notificationsSettingsActivity.getNotificationsController().T = !z10;
                    edit10.putBoolean("badgeNumberMuted", notificationsSettingsActivity.getNotificationsController().T);
                    edit10.commit();
                    org.telegram.messenger.us notificationsController2 = notificationsSettingsActivity.getNotificationsController();
                    notificationsController2.getClass();
                    org.telegram.messenger.us.l0.c(new org.telegram.messenger.is(notificationsController2, i13));
                    org.telegram.messenger.qr messagesStorage = notificationsSettingsActivity.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.hq(messagesStorage, 25));
                } else if (i3 == notificationsSettingsActivity.badgeNumberMessagesRow) {
                    SharedPreferences.Editor edit11 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7.edit();
                    z10 = notificationsSettingsActivity.getNotificationsController().U;
                    notificationsSettingsActivity.getNotificationsController().U = !z10;
                    edit11.putBoolean("badgeNumberMessages", notificationsSettingsActivity.getNotificationsController().U);
                    edit11.commit();
                    org.telegram.messenger.us notificationsController3 = notificationsSettingsActivity.getNotificationsController();
                    notificationsController3.getClass();
                    org.telegram.messenger.us.l0.c(new org.telegram.messenger.is(notificationsController3, i13));
                } else if (i3 == notificationsSettingsActivity.x) {
                    SharedPreferences sharedPreferences10 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7;
                    boolean z12 = sharedPreferences10.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().D3);
                    SharedPreferences.Editor edit12 = sharedPreferences10.edit();
                    edit12.putBoolean("pushConnection", !z12);
                    edit12.commit();
                    if (z12) {
                        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).setPushConnectionEnabled(false);
                    } else {
                        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).setPushConnectionEnabled(true);
                    }
                    z10 = z12;
                } else {
                    int i14 = 5;
                    if (i3 == notificationsSettingsActivity.accountsAllRow) {
                        SharedPreferences f12 = org.telegram.messenger.hp.f1();
                        B = f12.getBoolean("AllAccounts", true);
                        SharedPreferences.Editor edit13 = f12.edit();
                        boolean z13 = !B;
                        edit13.putBoolean("AllAccounts", z13);
                        edit13.commit();
                        org.telegram.messenger.az.Q0 = z13;
                        for (int i15 = 0; i15 < 4; i15++) {
                            if (org.telegram.messenger.az.Q0) {
                                org.telegram.messenger.us.t(i15).Y();
                            } else if (i15 == notificationsSettingsActivity.currentAccount) {
                                org.telegram.messenger.us.t(i15).Y();
                            } else {
                                org.telegram.messenger.us.l0.c(new org.telegram.messenger.is(org.telegram.messenger.us.t(i15), i14));
                            }
                        }
                    } else if (i3 == notificationsSettingsActivity.w) {
                        SharedPreferences sharedPreferences11 = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).d7;
                        z10 = sharedPreferences11.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().C3);
                        SharedPreferences.Editor edit14 = sharedPreferences11.edit();
                        edit14.putBoolean("pushService", !z10);
                        edit14.commit();
                        org.telegram.messenger.t0.x();
                    } else if (i3 == notificationsSettingsActivity.I) {
                        if (notificationsSettingsActivity.getParentActivity() == null) {
                            return;
                        } else {
                            notificationsSettingsActivity.showDialog(org.telegram.ui.Components.t4.X(notificationsSettingsActivity.getParentActivity(), 0L, 0L, i3 == notificationsSettingsActivity.I ? "vibrate_calls" : null, new org.telegram.ui.Components.o2(notificationsSettingsActivity, i3, 19), null));
                        }
                    } else if (i3 == notificationsSettingsActivity.R) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(notificationsSettingsActivity.getParentActivity());
                        String M02 = org.telegram.messenger.bd.M0(2131746283, "RepeatNotifications");
                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                        s1Var2.S = M02;
                        alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.bd.M0(2131746285, "RepeatDisabled"), org.telegram.messenger.bd.G(5, "Minutes", new Object[0]), org.telegram.messenger.bd.G(10, "Minutes", new Object[0]), org.telegram.messenger.bd.G(30, "Minutes", new Object[0]), org.telegram.messenger.bd.G(1, "Hours", new Object[0]), org.telegram.messenger.bd.G(2, "Hours", new Object[0]), org.telegram.messenger.bd.G(4, "Hours", new Object[0])}, new xw(notificationsSettingsActivity, i3, i12));
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                        notificationsSettingsActivity.showDialog(s1Var2);
                    }
                }
            }
            if (view instanceof org.telegram.ui.Cells.q8) {
                return;
            }
            ((org.telegram.ui.Cells.q8) view).setChecked(!z10);
            return;
        }
        if (i3 == i11) {
            ArrayList arrayList5 = notificationsSettingsActivity.d;
            B = notificationsSettingsActivity.getNotificationsController().B(1);
            arrayList = arrayList5;
            i10 = 1;
        } else if (i3 == notificationsSettingsActivity.groupRow) {
            ArrayList arrayList6 = notificationsSettingsActivity.e;
            B = notificationsSettingsActivity.getNotificationsController().B(0);
            arrayList = arrayList6;
            i10 = 0;
        } else if (i3 == notificationsSettingsActivity.storiesRow) {
            ArrayList arrayList7 = notificationsSettingsActivity.h;
            arrayList2 = notificationsSettingsActivity.n;
            arrayList = arrayList7;
            B = notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableAllStories", false);
            i10 = 3;
            if (arrayList != null && i10 != 4) {
                return;
            }
            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
            if ((org.telegram.messenger.bd.a0 || f10 > org.telegram.messenger.g0.L(76.0f)) && (org.telegram.messenger.bd.a0 || f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(i10, arrayList, arrayList2, false));
            } else {
                org.telegram.messenger.kw kwVar = new org.telegram.messenger.kw(notificationsSettingsActivity, i10, B, h5Var, i3);
                if (i3 == notificationsSettingsActivity.storiesRow) {
                    arrayList3 = notificationsSettingsActivity.h;
                    arrayList4 = notificationsSettingsActivity.n;
                    G = (arrayList3 == null || arrayList3.isEmpty()) ? null : org.telegram.messenger.bd.G(arrayList3.size(), "ChatsException", new Object[0]);
                } else if (i3 == notificationsSettingsActivity.privateRow) {
                    arrayList3 = notificationsSettingsActivity.d;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        G = org.telegram.messenger.bd.G(arrayList3.size(), "ChatsException", new Object[0]);
                        arrayList4 = null;
                    }
                    G = null;
                    arrayList4 = null;
                } else if (i3 == notificationsSettingsActivity.groupRow) {
                    arrayList3 = notificationsSettingsActivity.e;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        G = org.telegram.messenger.bd.G(arrayList3.size(), "Groups", new Object[0]);
                        arrayList4 = null;
                    }
                    G = null;
                    arrayList4 = null;
                } else if (i3 == notificationsSettingsActivity.reactionsRow) {
                    kwVar.run();
                } else {
                    arrayList3 = notificationsSettingsActivity.f;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        G = org.telegram.messenger.bd.G(arrayList3.size(), "Channels", new Object[0]);
                        arrayList4 = null;
                    }
                    G = null;
                    arrayList4 = null;
                }
                if (G == null) {
                    kwVar.run();
                } else {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(notificationsSettingsActivity.getParentActivity());
                    int size = arrayList3.size();
                    org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.a;
                    if (size == 1) {
                        s1Var3.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131747918, G));
                    } else {
                        s1Var3.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131747919, G));
                    }
                    s1Var3.S = org.telegram.messenger.bd.M0(2131747920, "NotificationsExceptions");
                    alertDialog$Builder3.i(org.telegram.messenger.bd.M0(2131743564, "ViewExceptions"), new b7(notificationsSettingsActivity, arrayList3, arrayList4, 16));
                    alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131747839, "OK"), new ur(kwVar, 27));
                    notificationsSettingsActivity.showDialog(s1Var3);
                }
            }
        } else if (i3 == notificationsSettingsActivity.reactionsRow) {
            B = notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableReactionsMessages", true) || notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableReactionsStories", true);
            i10 = 4;
            arrayList = null;
        } else {
            ArrayList arrayList8 = notificationsSettingsActivity.f;
            i10 = 2;
            B = notificationsSettingsActivity.getNotificationsController().B(2);
            arrayList = arrayList8;
        }
        arrayList2 = null;
        if (arrayList != null) {
        }
        org.telegram.ui.Cells.h5 h5Var2 = (org.telegram.ui.Cells.h5) view;
        if (org.telegram.messenger.bd.a0) {
        }
        notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(i10, arrayList, arrayList2, false));
        z10 = B;
        if (view instanceof org.telegram.ui.Cells.q8) {
        }
    }

    public static /* synthetic */ void e0(NotificationsSettingsActivity notificationsSettingsActivity) {
        if (notificationsSettingsActivity.b) {
            return;
        }
        notificationsSettingsActivity.b = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new l(notificationsSettingsActivity, 16));
    }

    public final void F0(org.telegram.ui.Components.zo0 zo0Var) {
        org.telegram.messenger.li.b0(this.currentAccount).M0(true);
        org.telegram.messenger.qr.a0(this.currentAccount).a.c(new hc0(this, new ArrayList(org.telegram.messenger.li.b0(this.currentAccount).j1), zo0Var, 12));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747930, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 20));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.a = tj0Var;
        tj0Var.r1();
        this.a.setItemAnimator(null);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutAnimation(null);
        this.a.setLayoutManager(new kg.y(i3, false, 13));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, b8.mf.c(-1.0f, -1));
        org.telegram.ui.Components.tj0 tj0Var2 = this.a;
        n4 n4Var = new n4(11, this, context);
        this.c = n4Var;
        tj0Var2.setAdapter(n4Var);
        this.a.setOnItemClickListener(new kh0(this));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f0) {
            this.c.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.h5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        int i3 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i10 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                str = null;
            } else {
                str = i3 == this.J ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? org.telegram.messenger.bd.M0(2131751600, "DefaultRingtone") : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? org.telegram.messenger.bd.M0(2131745290, "SoundDefault") : ringtone.getTitle(getParentActivity());
                ringtone.stop();
            }
            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(this.currentAccount).d7.edit();
            if (i3 == this.J) {
                if (str == null || uri == null) {
                    edit.putString("CallsRingtone", "NoSound");
                    edit.putString("CallsRingtonePath", "NoSound");
                } else {
                    edit.putString("CallsRingtone", str);
                    edit.putString("CallsRingtonePath", uri.toString());
                }
                this.X = true;
            }
            edit.commit();
            this.c.g(i3);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.currentAccount);
        if (!s12.t2) {
            s12.t2 = true;
            s12.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new org.telegram.messenger.ij(s12, 11));
        }
        F0(null);
        if (org.telegram.messenger.h10.c() > 1) {
            int i3 = this.V;
            this.r = i3;
            this.accountsAllRow = i3 + 1;
            this.V = i3 + 3;
            this.s = i3 + 2;
        } else {
            this.r = -1;
            this.accountsAllRow = -1;
            this.s = -1;
        }
        int i10 = this.V;
        this.y = i10;
        this.privateRow = i10 + 1;
        this.groupRow = i10 + 2;
        this.channelsRow = i10 + 3;
        this.storiesRow = i10 + 4;
        this.reactionsRow = i10 + 5;
        this.E = i10 + 6;
        this.H = i10 + 7;
        this.I = i10 + 8;
        this.J = i10 + 9;
        this.K = i10 + 10;
        this.O = i10 + 11;
        this.badgeNumberShowRow = i10 + 12;
        this.badgeNumberMutedRow = i10 + 13;
        this.badgeNumberMessagesRow = i10 + 14;
        this.P = i10 + 15;
        this.F = i10 + 16;
        this.inappSoundRow = i10 + 17;
        this.inappVibrateRow = i10 + 18;
        this.inappPreviewRow = i10 + 19;
        this.inchatSoundRow = i10 + 20;
        this.inappPriorityRow = i10 + 21;
        this.G = i10 + 22;
        this.L = i10 + 23;
        this.contactJoinedRow = i10 + 24;
        this.pinnedMessageRow = i10 + 25;
        this.M = i10 + 26;
        this.N = i10 + 27;
        this.w = i10 + 28;
        this.x = i10 + 29;
        this.Q = -1;
        this.R = i10 + 30;
        this.S = i10 + 31;
        this.T = i10 + 32;
        this.resetNotificationsRow = i10 + 33;
        this.V = i10 + 35;
        this.U = i10 + 34;
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f0);
        org.telegram.messenger.hp messagesController = getMessagesController();
        messagesController.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new org.telegram.messenger.ij(messagesController, 17));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f0);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        n4 n4Var = this.c;
        if (n4Var != null) {
            n4Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
