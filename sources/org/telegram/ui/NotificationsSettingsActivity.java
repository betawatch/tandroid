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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
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
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public org.telegram.ui.Components.tk0 a;
    private int accountsAllRow;
    public boolean b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public fg.j c;
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
        this.U = 0;
    }

    public static /* synthetic */ void Y(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).V3(arrayList, true);
        org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).P3(arrayList2, true);
        org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).S3(arrayList3);
        notificationsSettingsActivity.d = arrayList4;
        notificationsSettingsActivity.e = arrayList5;
        notificationsSettingsActivity.f = arrayList6;
        notificationsSettingsActivity.h = arrayList7;
        notificationsSettingsActivity.n = arrayList8;
        fg.j jVar = notificationsSettingsActivity.c;
        if (jVar != null) {
            jVar.g(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.c.g(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.c.g(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.c.g(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void Z(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().getClass();
        notificationsSettingsActivity.b = false;
        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7.edit();
        edit.clear();
        edit.commit();
        notificationsSettingsActivity.e.clear();
        notificationsSettingsActivity.d.clear();
        notificationsSettingsActivity.c.f();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131746111, "ResetNotificationsText"), 0).show();
        }
        org.telegram.messenger.hs messagesStorage = notificationsSettingsActivity.getMessagesStorage();
        messagesStorage.a.c(new org.telegram.messenger.br(messagesStorage, 25));
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
    public static void a0(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, Runnable runnable) {
        ArrayList arrayList2;
        boolean z10;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i10;
        boolean z11;
        int size;
        int i11;
        ArrayList arrayList6;
        int size2;
        int i12;
        int size3;
        int i13;
        int size4;
        int i14;
        ArrayList arrayList7;
        int i15;
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
        long j10 = org.telegram.messenger.d20.i(notificationsSettingsActivity.currentAccount).n;
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7;
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
                        ui0 ui0Var = new ui0();
                        ui0Var.d = longValue2;
                        ArrayList arrayList26 = arrayList14;
                        ui0Var.b = org.telegram.messenger.m5.w("custom_", longValue2, sharedPreferences, false);
                        int intValue = ((Integer) next.getValue()).intValue();
                        ui0Var.c = intValue;
                        if (intValue != 0 && (num = (Integer) all.get("notifyuntil_".concat(replace))) != null) {
                            ui0Var.a = num.intValue();
                        }
                        if (org.telegram.messenger.o5.C(longValue2)) {
                            int i16 = (int) (4294967295L & longValue2);
                            TLRPC.EncryptedChat Z0 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).Z0(Integer.valueOf(i16));
                            if (Z0 == null) {
                                arrayList20.add(Integer.valueOf(i16));
                                longSparseArray.put(longValue2, ui0Var);
                            } else {
                                TLRPC.User Z1 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).Z1(Long.valueOf(Z0.user_id));
                                if (Z1 == null) {
                                    arrayList18.add(Long.valueOf(Z0.user_id));
                                    longSparseArray.put(Z0.user_id, ui0Var);
                                } else if (Z1.deleted) {
                                    arrayList22 = arrayList2;
                                    arrayList21 = arrayList24;
                                    arrayList23 = arrayList12;
                                    arrayList17 = arrayList11;
                                    arrayList16 = arrayList10;
                                    arrayList14 = arrayList26;
                                }
                            }
                            arrayList13.add(ui0Var);
                            arrayList14 = arrayList26;
                        } else if (org.telegram.messenger.o5.E(longValue2)) {
                            TLRPC.User Z12 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).Z1(A2);
                            if (Z12 == null) {
                                arrayList18.add(A2);
                                longSparseArray.put(longValue2, ui0Var);
                            } else if (Z12.deleted) {
                                arrayList22 = arrayList2;
                                arrayList21 = arrayList24;
                                arrayList23 = arrayList12;
                                arrayList17 = arrayList11;
                                arrayList16 = arrayList10;
                                arrayList14 = arrayList26;
                            }
                            arrayList13.add(ui0Var);
                            arrayList14 = arrayList26;
                        } else {
                            long j11 = -longValue2;
                            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).L0(Long.valueOf(j11));
                            if (L0 == null) {
                                arrayList19.add(Long.valueOf(j11));
                                longSparseArray.put(longValue2, ui0Var);
                            } else if (!L0.left && !L0.kicked && L0.migrated_to == null) {
                                if (!org.telegram.messenger.w3.T(L0) || L0.megagroup) {
                                    arrayList14 = arrayList26;
                                    arrayList14.add(ui0Var);
                                } else {
                                    arrayList15.add(ui0Var);
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
                    ui0 ui0Var2 = new ui0();
                    ui0Var2.d = longValue;
                    ui0Var2.c = ((Boolean) next2.getValue()).booleanValue() ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    ui0Var2.e = true;
                    if (org.telegram.messenger.o5.E(longValue)) {
                        TLRPC.User Z13 = notificationsSettingsActivity.getMessagesController().Z1(A);
                        if (Z13 == null) {
                            arrayList18.add(A);
                            longSparseArray.put(longValue, ui0Var2);
                        } else if (Z13.deleted) {
                        }
                        arrayList9 = arrayList27;
                        arrayList9.add(ui0Var2);
                        hashSet.add(A);
                        arrayList27 = arrayList9;
                    }
                }
            }
            arrayList9 = arrayList27;
            arrayList27 = arrayList9;
        }
        ArrayList arrayList31 = arrayList27;
        Collections.sort(arrayList, Comparator$-CC.comparingDouble(new org.telegram.ui.Components.y61(3)));
        int max = Math.max(0, arrayList.size() - 5);
        while (max < arrayList.size()) {
            long o10 = org.telegram.messenger.o5.o(((TLRPC.TL_topPeer) arrayList.get(max)).peer);
            if (hashSet.contains(Long.valueOf(o10))) {
                i15 = max;
            } else {
                ui0 ui0Var3 = new ui0();
                ui0Var3.d = o10;
                i15 = max;
                ui0Var3.c = 0;
                ui0Var3.f = z10;
                ui0Var3.e = z10;
                if (org.telegram.messenger.o5.E(o10)) {
                    TLRPC.User Z14 = notificationsSettingsActivity.getMessagesController().Z1(Long.valueOf(o10));
                    if (Z14 == null) {
                        arrayList18.add(Long.valueOf(o10));
                        longSparseArray.put(o10, ui0Var3);
                    }
                    arrayList8 = arrayList28;
                    arrayList8.add(0, ui0Var3);
                    hashSet.add(Long.valueOf(o10));
                    arrayList28 = arrayList8;
                    max = i15 + 1;
                    z10 = true;
                }
            }
            arrayList8 = arrayList28;
            arrayList28 = arrayList8;
            max = i15 + 1;
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
                    } catch (Exception e) {
                        e = e;
                        arrayList5 = arrayList30;
                    }
                    try {
                        org.telegram.messenger.hs.a0(notificationsSettingsActivity.currentAccount).V(TextUtils.join(",", arrayList20), arrayList5, arrayList18);
                    } catch (Exception e7) {
                        e = e7;
                        arrayList3 = arrayList2;
                        arrayList4 = arrayList29;
                        z11 = true;
                        i10 = 0;
                        org.telegram.messenger.f8.g(e, z11);
                        size = arrayList3.size();
                        i11 = i10;
                        while (i11 < size) {
                        }
                        arrayList6 = arrayList31;
                        size2 = arrayList4.size();
                        while (i12 < size2) {
                        }
                        size3 = arrayList5.size();
                        while (i13 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i14 < size4) {
                        }
                        org.telegram.messenger.i0.g3(new org.telegram.messenger.nk(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, runnable));
                    }
                }
                try {
                    if (arrayList18.isEmpty()) {
                        arrayList4 = arrayList29;
                        i10 = 0;
                    } else {
                        try {
                            arrayList4 = arrayList29;
                            i10 = 0;
                        } catch (Exception e10) {
                            e = e10;
                            arrayList4 = arrayList29;
                            i10 = 0;
                            arrayList3 = arrayList2;
                            z11 = true;
                            org.telegram.messenger.f8.g(e, z11);
                            size = arrayList3.size();
                            i11 = i10;
                            while (i11 < size) {
                            }
                            arrayList6 = arrayList31;
                            size2 = arrayList4.size();
                            while (i12 < size2) {
                            }
                            size3 = arrayList5.size();
                            while (i13 < size3) {
                            }
                            size4 = longSparseArray.size();
                            while (i14 < size4) {
                            }
                            org.telegram.messenger.i0.g3(new org.telegram.messenger.nk(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, runnable));
                        }
                        try {
                            org.telegram.messenger.hs.a0(notificationsSettingsActivity.currentAccount).n0(arrayList18, arrayList4, false);
                        } catch (Exception e11) {
                            e = e11;
                            arrayList3 = arrayList2;
                            z11 = true;
                            org.telegram.messenger.f8.g(e, z11);
                            size = arrayList3.size();
                            i11 = i10;
                            while (i11 < size) {
                            }
                            arrayList6 = arrayList31;
                            size2 = arrayList4.size();
                            while (i12 < size2) {
                            }
                            size3 = arrayList5.size();
                            while (i13 < size3) {
                            }
                            size4 = longSparseArray.size();
                            while (i14 < size4) {
                            }
                            org.telegram.messenger.i0.g3(new org.telegram.messenger.nk(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, runnable));
                        }
                    }
                    if (arrayList19.isEmpty()) {
                        arrayList3 = arrayList2;
                    } else {
                        org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(notificationsSettingsActivity.currentAccount);
                        String join = TextUtils.join(",", arrayList19);
                        arrayList3 = arrayList2;
                        try {
                            a02.Q(join, arrayList3);
                        } catch (Exception e12) {
                            e = e12;
                            z11 = true;
                            org.telegram.messenger.f8.g(e, z11);
                            size = arrayList3.size();
                            i11 = i10;
                            while (i11 < size) {
                            }
                            arrayList6 = arrayList31;
                            size2 = arrayList4.size();
                            while (i12 < size2) {
                            }
                            size3 = arrayList5.size();
                            while (i13 < size3) {
                            }
                            size4 = longSparseArray.size();
                            while (i14 < size4) {
                            }
                            org.telegram.messenger.i0.g3(new org.telegram.messenger.nk(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, runnable));
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                    arrayList3 = arrayList2;
                    arrayList4 = arrayList29;
                    i10 = 0;
                    z11 = true;
                    org.telegram.messenger.f8.g(e, z11);
                    size = arrayList3.size();
                    i11 = i10;
                    while (i11 < size) {
                    }
                    arrayList6 = arrayList31;
                    size2 = arrayList4.size();
                    while (i12 < size2) {
                    }
                    size3 = arrayList5.size();
                    while (i13 < size3) {
                    }
                    size4 = longSparseArray.size();
                    while (i14 < size4) {
                    }
                    org.telegram.messenger.i0.g3(new org.telegram.messenger.nk(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, runnable));
                }
            } catch (Exception e14) {
                e = e14;
                arrayList3 = arrayList2;
                arrayList4 = arrayList29;
                arrayList5 = arrayList30;
            }
            size = arrayList3.size();
            i11 = i10;
            while (i11 < size) {
                TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i11);
                if (chat.left || chat.kicked || chat.migrated_to != null) {
                    arrayList7 = arrayList31;
                } else {
                    ui0 ui0Var4 = (ui0) longSparseArray.get(-chat.id);
                    arrayList7 = arrayList31;
                    longSparseArray.remove(-chat.id);
                    if (ui0Var4 != null) {
                        if (!org.telegram.messenger.w3.T(chat) || chat.megagroup) {
                            arrayList14.add(ui0Var4);
                        } else {
                            arrayList15.add(ui0Var4);
                        }
                    }
                }
                i11++;
                arrayList31 = arrayList7;
            }
            arrayList6 = arrayList31;
            size2 = arrayList4.size();
            for (i12 = 0; i12 < size2; i12++) {
                TLRPC.User user = (TLRPC.User) arrayList4.get(i12);
                if (!user.deleted) {
                    longSparseArray.remove(user.id);
                }
            }
            size3 = arrayList5.size();
            for (i13 = 0; i13 < size3; i13++) {
                longSparseArray.remove(org.telegram.messenger.o5.F(((TLRPC.EncryptedChat) arrayList5.get(i13)).id));
            }
            size4 = longSparseArray.size();
            for (i14 = 0; i14 < size4; i14++) {
                if (org.telegram.messenger.o5.z(longSparseArray.keyAt(i14))) {
                    arrayList14.remove(longSparseArray.valueAt(i14));
                    arrayList15.remove(longSparseArray.valueAt(i14));
                } else {
                    arrayList13.remove(longSparseArray.valueAt(i14));
                }
            }
        } else {
            arrayList6 = arrayList31;
            arrayList3 = arrayList2;
            arrayList4 = arrayList29;
            arrayList5 = arrayList30;
        }
        org.telegram.messenger.i0.g3(new org.telegram.messenger.nk(notificationsSettingsActivity, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, runnable));
    }

    public static void b0(NotificationsSettingsActivity notificationsSettingsActivity, int i10, int i11) {
        org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7.edit().putInt("repeat_messages", i11 != 1 ? i11 == 2 ? 10 : i11 == 3 ? 30 : i11 == 4 ? 60 : i11 == 5 ? 120 : i11 == 6 ? org.telegram.messenger.zs.P3 : 0 : 5).commit();
        notificationsSettingsActivity.X = true;
        notificationsSettingsActivity.c.g(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c0(NotificationsSettingsActivity notificationsSettingsActivity, View view, int i10, float f7) {
        int i11;
        boolean B;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String G;
        ArrayList arrayList4;
        if (notificationsSettingsActivity.getParentActivity() == null) {
            return;
        }
        int i12 = notificationsSettingsActivity.privateRow;
        int i13 = 4;
        Parcelable parcelable = null;
        parcelable = null;
        int i14 = 1;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 != i12 && i10 != notificationsSettingsActivity.groupRow && i10 != notificationsSettingsActivity.channelsRow && i10 != notificationsSettingsActivity.storiesRow && i10 != notificationsSettingsActivity.reactionsRow) {
            if (i10 == notificationsSettingsActivity.I) {
                try {
                    SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7;
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
                    notificationsSettingsActivity.startActivityForResult(intent, i10);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            } else if (i10 == notificationsSettingsActivity.resetNotificationsRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(notificationsSettingsActivity.getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131746112, "ResetNotificationsAlertTitle");
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131746113, "ResetNotificationsAlert");
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, "Reset"), new ti0(notificationsSettingsActivity));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                notificationsSettingsActivity.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                }
            } else if (i10 == notificationsSettingsActivity.inappSoundRow) {
                SharedPreferences sharedPreferences2 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7;
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                z10 = sharedPreferences2.getBoolean("EnableInAppSounds", true);
                edit.putBoolean("EnableInAppSounds", !z10);
                edit.commit();
            } else if (i10 == notificationsSettingsActivity.inappVibrateRow) {
                SharedPreferences sharedPreferences3 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7;
                SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                z10 = sharedPreferences3.getBoolean("EnableInAppVibrate", true);
                edit2.putBoolean("EnableInAppVibrate", !z10);
                edit2.commit();
            } else if (i10 == notificationsSettingsActivity.inappPreviewRow) {
                SharedPreferences sharedPreferences4 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7;
                SharedPreferences.Editor edit3 = sharedPreferences4.edit();
                z10 = sharedPreferences4.getBoolean("EnableInAppPreview", true);
                edit3.putBoolean("EnableInAppPreview", !z10);
                edit3.commit();
            } else if (i10 == notificationsSettingsActivity.inchatSoundRow) {
                SharedPreferences sharedPreferences5 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7;
                SharedPreferences.Editor edit4 = sharedPreferences5.edit();
                z10 = sharedPreferences5.getBoolean("EnableInChatSound", true);
                boolean z11 = !z10;
                edit4.putBoolean("EnableInChatSound", z11);
                edit4.commit();
                notificationsSettingsActivity.getNotificationsController().M = z11;
            } else if (i10 == notificationsSettingsActivity.inappPriorityRow) {
                SharedPreferences sharedPreferences6 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7;
                SharedPreferences.Editor edit5 = sharedPreferences6.edit();
                z10 = sharedPreferences6.getBoolean("EnableInAppPopup", true);
                edit5.putBoolean("EnableInAppPopup", !z10);
                edit5.commit();
            } else if (i10 == notificationsSettingsActivity.contactJoinedRow) {
                SharedPreferences sharedPreferences7 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7;
                SharedPreferences.Editor edit6 = sharedPreferences7.edit();
                z10 = sharedPreferences7.getBoolean("EnableContactJoined", true);
                org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount);
                edit6.putBoolean("EnableContactJoined", !z10);
                edit6.commit();
                TL_account.setContactSignUpNotification setcontactsignupnotification = new TL_account.setContactSignUpNotification();
                setcontactsignupnotification.silent = z10;
                ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(setcontactsignupnotification, new ag.c3(i13));
            } else if (i10 == notificationsSettingsActivity.pinnedMessageRow) {
                SharedPreferences sharedPreferences8 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7;
                SharedPreferences.Editor edit7 = sharedPreferences8.edit();
                z10 = sharedPreferences8.getBoolean("PinnedMessages", true);
                edit7.putBoolean("PinnedMessages", !z10);
                edit7.commit();
            } else if (i10 == notificationsSettingsActivity.P) {
                SharedPreferences sharedPreferences9 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7;
                SharedPreferences.Editor edit8 = sharedPreferences9.edit();
                z10 = sharedPreferences9.getBoolean("EnableAutoNotifications", false);
                edit8.putBoolean("EnableAutoNotifications", !z10);
                edit8.commit();
            } else {
                int i15 = 7;
                if (i10 == notificationsSettingsActivity.badgeNumberShowRow) {
                    SharedPreferences.Editor edit9 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7.edit();
                    z10 = notificationsSettingsActivity.getNotificationsController().R;
                    notificationsSettingsActivity.getNotificationsController().R = !z10;
                    edit9.putBoolean("badgeNumber", notificationsSettingsActivity.getNotificationsController().R);
                    edit9.commit();
                    org.telegram.messenger.ot notificationsController = notificationsSettingsActivity.getNotificationsController();
                    notificationsController.getClass();
                    org.telegram.messenger.ot.k0.c(new org.telegram.messenger.at(notificationsController, i15));
                } else if (i10 == notificationsSettingsActivity.badgeNumberMutedRow) {
                    SharedPreferences.Editor edit10 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7.edit();
                    z10 = notificationsSettingsActivity.getNotificationsController().S;
                    notificationsSettingsActivity.getNotificationsController().S = !z10;
                    edit10.putBoolean("badgeNumberMuted", notificationsSettingsActivity.getNotificationsController().S);
                    edit10.commit();
                    org.telegram.messenger.ot notificationsController2 = notificationsSettingsActivity.getNotificationsController();
                    notificationsController2.getClass();
                    org.telegram.messenger.ot.k0.c(new org.telegram.messenger.at(notificationsController2, i15));
                    org.telegram.messenger.hs messagesStorage = notificationsSettingsActivity.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.br(messagesStorage, 25));
                } else if (i10 == notificationsSettingsActivity.badgeNumberMessagesRow) {
                    SharedPreferences.Editor edit11 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7.edit();
                    z10 = notificationsSettingsActivity.getNotificationsController().T;
                    notificationsSettingsActivity.getNotificationsController().T = !z10;
                    edit11.putBoolean("badgeNumberMessages", notificationsSettingsActivity.getNotificationsController().T);
                    edit11.commit();
                    org.telegram.messenger.ot notificationsController3 = notificationsSettingsActivity.getNotificationsController();
                    notificationsController3.getClass();
                    org.telegram.messenger.ot.k0.c(new org.telegram.messenger.at(notificationsController3, i15));
                } else if (i10 == notificationsSettingsActivity.x) {
                    SharedPreferences sharedPreferences10 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7;
                    boolean z12 = sharedPreferences10.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().C3);
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
                    int i16 = 6;
                    if (i10 == notificationsSettingsActivity.accountsAllRow) {
                        SharedPreferences e12 = org.telegram.messenger.vp.e1();
                        B = e12.getBoolean("AllAccounts", true);
                        SharedPreferences.Editor edit13 = e12.edit();
                        boolean z13 = !B;
                        edit13.putBoolean("AllAccounts", z13);
                        edit13.commit();
                        org.telegram.messenger.tz.Q0 = z13;
                        for (int i17 = 0; i17 < 4; i17++) {
                            if (org.telegram.messenger.tz.Q0) {
                                org.telegram.messenger.ot.t(i17).Y();
                            } else if (i17 == notificationsSettingsActivity.currentAccount) {
                                org.telegram.messenger.ot.t(i17).Y();
                            } else {
                                org.telegram.messenger.ot.k0.c(new org.telegram.messenger.at(org.telegram.messenger.ot.t(i17), i16));
                            }
                        }
                    } else if (i10 == notificationsSettingsActivity.w) {
                        SharedPreferences sharedPreferences11 = org.telegram.messenger.vp.r1(notificationsSettingsActivity.currentAccount).e7;
                        z10 = sharedPreferences11.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().B3);
                        SharedPreferences.Editor edit14 = sharedPreferences11.edit();
                        edit14.putBoolean("pushService", !z10);
                        edit14.commit();
                        org.telegram.messenger.w0.x();
                    } else if (i10 == notificationsSettingsActivity.H) {
                        if (notificationsSettingsActivity.getParentActivity() == null) {
                            return;
                        } else {
                            notificationsSettingsActivity.showDialog(org.telegram.ui.Components.s4.X(notificationsSettingsActivity.getParentActivity(), 0L, 0L, i10 == notificationsSettingsActivity.H ? "vibrate_calls" : null, new org.telegram.ui.Components.qq(notificationsSettingsActivity, i10, 14), null));
                        }
                    } else if (i10 == notificationsSettingsActivity.Q) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(notificationsSettingsActivity.getParentActivity());
                        String L02 = org.telegram.messenger.cd.L0(2131746290, "RepeatNotifications");
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                        x1Var2.R = L02;
                        alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.cd.L0(2131746292, "RepeatDisabled"), org.telegram.messenger.cd.G(5, "Minutes", new Object[0]), org.telegram.messenger.cd.G(10, "Minutes", new Object[0]), org.telegram.messenger.cd.G(30, "Minutes", new Object[0]), org.telegram.messenger.cd.G(1, "Hours", new Object[0]), org.telegram.messenger.cd.G(2, "Hours", new Object[0]), org.telegram.messenger.cd.G(4, "Hours", new Object[0])}, new ey(notificationsSettingsActivity, i10, i14));
                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                        notificationsSettingsActivity.showDialog(x1Var2);
                    }
                }
            }
            if (view instanceof org.telegram.ui.Cells.t8) {
                return;
            }
            ((org.telegram.ui.Cells.t8) view).setChecked(!z10);
            return;
        }
        if (i10 == i12) {
            ArrayList arrayList5 = notificationsSettingsActivity.d;
            B = notificationsSettingsActivity.getNotificationsController().B(1);
            arrayList = arrayList5;
            i11 = 1;
        } else if (i10 == notificationsSettingsActivity.groupRow) {
            ArrayList arrayList6 = notificationsSettingsActivity.e;
            B = notificationsSettingsActivity.getNotificationsController().B(0);
            arrayList = arrayList6;
            i11 = 0;
        } else if (i10 == notificationsSettingsActivity.storiesRow) {
            ArrayList arrayList7 = notificationsSettingsActivity.h;
            arrayList2 = notificationsSettingsActivity.n;
            arrayList = arrayList7;
            B = notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableAllStories", false);
            i11 = 3;
            if (arrayList != null && i11 != 4) {
                return;
            }
            org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
            if ((org.telegram.messenger.cd.X || f7 > org.telegram.messenger.i0.L(76.0f)) && (org.telegram.messenger.cd.X || f7 < view.getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f))) {
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(i11, arrayList, arrayList2, false));
            } else {
                org.telegram.messenger.dx dxVar = new org.telegram.messenger.dx(notificationsSettingsActivity, i11, B, l5Var, i10);
                if (i10 == notificationsSettingsActivity.storiesRow) {
                    arrayList3 = notificationsSettingsActivity.h;
                    arrayList4 = notificationsSettingsActivity.n;
                    G = (arrayList3 == null || arrayList3.isEmpty()) ? null : org.telegram.messenger.cd.G(arrayList3.size(), "ChatsException", new Object[0]);
                } else if (i10 == notificationsSettingsActivity.privateRow) {
                    arrayList3 = notificationsSettingsActivity.d;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        G = org.telegram.messenger.cd.G(arrayList3.size(), "ChatsException", new Object[0]);
                        arrayList4 = null;
                    }
                    G = null;
                    arrayList4 = null;
                } else if (i10 == notificationsSettingsActivity.groupRow) {
                    arrayList3 = notificationsSettingsActivity.e;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        G = org.telegram.messenger.cd.G(arrayList3.size(), "Groups", new Object[0]);
                        arrayList4 = null;
                    }
                    G = null;
                    arrayList4 = null;
                } else if (i10 == notificationsSettingsActivity.reactionsRow) {
                    dxVar.run();
                } else {
                    arrayList3 = notificationsSettingsActivity.f;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        G = org.telegram.messenger.cd.G(arrayList3.size(), "Channels", new Object[0]);
                        arrayList4 = null;
                    }
                    G = null;
                    arrayList4 = null;
                }
                if (G == null) {
                    dxVar.run();
                } else {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(notificationsSettingsActivity.getParentActivity());
                    int size = arrayList3.size();
                    org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
                    if (size == 1) {
                        x1Var3.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131747926, G));
                    } else {
                        x1Var3.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131747927, G));
                    }
                    x1Var3.R = org.telegram.messenger.cd.L0(2131747928, "NotificationsExceptions");
                    alertDialog$Builder3.i(org.telegram.messenger.cd.L0(2131743580, "ViewExceptions"), new a7(notificationsSettingsActivity, arrayList3, arrayList4, 16));
                    alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131747847, "OK"), new tt(dxVar, 26));
                    notificationsSettingsActivity.showDialog(x1Var3);
                }
            }
        } else if (i10 == notificationsSettingsActivity.reactionsRow) {
            B = notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableReactionsMessages", true) || notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableReactionsStories", true);
            i11 = 4;
            arrayList = null;
        } else {
            ArrayList arrayList8 = notificationsSettingsActivity.f;
            i11 = 2;
            B = notificationsSettingsActivity.getNotificationsController().B(2);
            arrayList = arrayList8;
        }
        arrayList2 = null;
        if (arrayList != null) {
        }
        org.telegram.ui.Cells.l5 l5Var2 = (org.telegram.ui.Cells.l5) view;
        if (org.telegram.messenger.cd.X) {
        }
        notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(i11, arrayList, arrayList2, false));
        z10 = B;
        if (view instanceof org.telegram.ui.Cells.t8) {
        }
    }

    public static /* synthetic */ void d0(NotificationsSettingsActivity notificationsSettingsActivity) {
        if (notificationsSettingsActivity.b) {
            return;
        }
        notificationsSettingsActivity.b = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new k(notificationsSettingsActivity, 16));
    }

    public final void E0(org.telegram.ui.Components.c11 c11Var) {
        org.telegram.messenger.ui.b0(this.currentAccount).M0(true);
        org.telegram.messenger.hs.a0(this.currentAccount).a.c(new qd0(this, new ArrayList(org.telegram.messenger.ui.b0(this.currentAccount).i1), c11Var, 12));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747938, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 10));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.a = tk0Var;
        tk0Var.r1();
        this.a.setItemAnimator(null);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutAnimation(null);
        int i11 = 12;
        this.a.setLayoutManager(new dh.f(i10, false, i11));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.tk0 tk0Var2 = this.a;
        fg.j jVar = new fg.j(i11, this, context);
        this.c = jVar;
        tk0Var2.setAdapter(jVar);
        this.a.setOnItemClickListener(new ti0(this));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f0) {
            this.c.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 16, new Class[]{org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.a9.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.l5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        int i10 = org.telegram.ui.ActionBar.t6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i11 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                str = null;
            } else {
                str = i10 == this.I ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? org.telegram.messenger.cd.L0(2131751600, "DefaultRingtone") : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? org.telegram.messenger.cd.L0(2131745298, "SoundDefault") : ringtone.getTitle(getParentActivity());
                ringtone.stop();
            }
            SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(this.currentAccount).e7.edit();
            if (i10 == this.I) {
                if (str == null || uri == null) {
                    edit.putString("CallsRingtone", "NoSound");
                    edit.putString("CallsRingtonePath", "NoSound");
                } else {
                    edit.putString("CallsRingtone", str);
                    edit.putString("CallsRingtonePath", uri.toString());
                }
                this.W = true;
            }
            edit.commit();
            this.c.g(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.currentAccount);
        if (!r12.s2) {
            r12.s2 = true;
            r12.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new org.telegram.messenger.tj(r12, 11));
        }
        E0(null);
        if (org.telegram.messenger.d20.c() > 1) {
            int i10 = this.U;
            this.r = i10;
            this.accountsAllRow = i10 + 1;
            this.U = i10 + 3;
            this.s = i10 + 2;
        } else {
            this.r = -1;
            this.accountsAllRow = -1;
            this.s = -1;
        }
        int i11 = this.U;
        this.y = i11;
        this.privateRow = i11 + 1;
        this.groupRow = i11 + 2;
        this.channelsRow = i11 + 3;
        this.storiesRow = i11 + 4;
        this.reactionsRow = i11 + 5;
        this.D = i11 + 6;
        this.G = i11 + 7;
        this.H = i11 + 8;
        this.I = i11 + 9;
        this.J = i11 + 10;
        this.N = i11 + 11;
        this.badgeNumberShowRow = i11 + 12;
        this.badgeNumberMutedRow = i11 + 13;
        this.badgeNumberMessagesRow = i11 + 14;
        this.O = i11 + 15;
        this.E = i11 + 16;
        this.inappSoundRow = i11 + 17;
        this.inappVibrateRow = i11 + 18;
        this.inappPreviewRow = i11 + 19;
        this.inchatSoundRow = i11 + 20;
        this.inappPriorityRow = i11 + 21;
        this.F = i11 + 22;
        this.K = i11 + 23;
        this.contactJoinedRow = i11 + 24;
        this.pinnedMessageRow = i11 + 25;
        this.L = i11 + 26;
        this.M = i11 + 27;
        this.w = i11 + 28;
        this.x = i11 + 29;
        this.P = -1;
        this.Q = i11 + 30;
        this.R = i11 + 31;
        this.S = i11 + 32;
        this.resetNotificationsRow = i11 + 33;
        this.U = i11 + 35;
        this.T = i11 + 34;
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f0);
        org.telegram.messenger.vp messagesController = getMessagesController();
        messagesController.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new org.telegram.messenger.tj(messagesController, 17));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f0);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.c;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
