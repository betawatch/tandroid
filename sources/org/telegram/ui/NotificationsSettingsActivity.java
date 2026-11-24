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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.d implements jm7 {
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
    public r59 a;
    private int accountsAllRow;
    public boolean b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public s30 c;
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

    public final void A0() {
        getMessagesController().getClass();
        this.b = false;
        SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
        edit.clear();
        edit.commit();
        this.e.clear();
        this.d.clear();
        this.c.f();
        if (getParentActivity() != null) {
            Toast.makeText(getParentActivity(), jb6.M0(2131745827, "ResetNotificationsText"), 0).show();
        }
        cf7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new xd7(messagesStorage, (byte) 26));
    }

    public final /* synthetic */ void B0() {
        if (this.b) {
            return;
        }
        this.b = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new r15(this, (byte) 15));
    }

    public final void C0(int i, int i2) {
        oc7.r1(this.currentAccount).W3.edit().putInt("repeat_messages", i2 != 1 ? i2 == 2 ? 10 : i2 == 3 ? 30 : i2 == 4 ? 60 : i2 == 5 ? nm7.E1 : i2 == 6 ? nm7.O3 : 0 : 5).commit();
        this.Y = true;
        this.c.g(i);
    }

    public final /* synthetic */ void D0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, sv2 sv2Var) {
        oc7.r1(this.currentAccount).d4(arrayList, true);
        oc7.r1(this.currentAccount).X3(arrayList2, true);
        oc7.r1(this.currentAccount).a4(arrayList3);
        this.d = arrayList4;
        this.e = arrayList5;
        this.f = arrayList6;
        this.h = arrayList7;
        this.n = arrayList8;
        s30 s30Var = this.c;
        if (s30Var != null) {
            s30Var.g(this.privateRow);
            this.c.g(this.groupRow);
            this.c.g(this.channelsRow);
            this.c.g(this.storiesRow);
        }
        if (sv2Var != null) {
            sv2Var.run();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:95|(2:109|110)(2:97|(1:99)(2:108|105))|100|101|102|103|104|105) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02a4, code lost:
    
        if (r8.deleted != false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a1 A[LOOP:5: B:194:0x039f->B:195:0x03a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0(ArrayList arrayList, sv2 sv2Var) {
        ArrayList arrayList2;
        boolean z;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i;
        boolean z2;
        int size;
        int i2;
        ArrayList arrayList6;
        int size2;
        int i3;
        int size3;
        int i4;
        int size4;
        int i5;
        ArrayList arrayList7;
        int i6;
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
        long j = z8c.h(this.currentAccount).n;
        SharedPreferences sharedPreferences = oc7.r1(this.currentAccount).W3;
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
                    if (longValue2 == 0 || longValue2 == j) {
                        arrayList10 = arrayList25;
                    } else {
                        arrayList10 = arrayList25;
                        zo7 zo7Var = new zo7();
                        zo7Var.d = longValue2;
                        ArrayList arrayList26 = arrayList14;
                        zo7Var.b = kt6.w("custom_", longValue2, sharedPreferences, false);
                        int intValue = ((Integer) next.getValue()).intValue();
                        zo7Var.c = intValue;
                        if (intValue != 0 && (num = (Integer) all.get("notifyuntil_".concat(replace))) != null) {
                            zo7Var.a = num.intValue();
                        }
                        boolean B = pg3.B(longValue2);
                        int i7 = this.currentAccount;
                        if (B) {
                            int i8 = (int) (4294967295L & longValue2);
                            TLRPC.EncryptedChat Z0 = oc7.r1(i7).Z0(Integer.valueOf(i8));
                            if (Z0 == null) {
                                arrayList20.add(Integer.valueOf(i8));
                                longSparseArray.put(longValue2, zo7Var);
                            } else {
                                TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(Z0.user_id));
                                if (W1 == null) {
                                    arrayList18.add(Long.valueOf(Z0.user_id));
                                    longSparseArray.put(Z0.user_id, zo7Var);
                                } else if (W1.deleted) {
                                    arrayList22 = arrayList2;
                                    arrayList21 = arrayList24;
                                    arrayList23 = arrayList12;
                                    arrayList17 = arrayList11;
                                    arrayList16 = arrayList10;
                                    arrayList14 = arrayList26;
                                }
                            }
                            arrayList13.add(zo7Var);
                            arrayList14 = arrayList26;
                        } else if (pg3.D(longValue2)) {
                            TLRPC.User W12 = oc7.r1(i7).W1(A2);
                            if (W12 == null) {
                                arrayList18.add(A2);
                                longSparseArray.put(longValue2, zo7Var);
                            } else if (W12.deleted) {
                                arrayList22 = arrayList2;
                                arrayList21 = arrayList24;
                                arrayList23 = arrayList12;
                                arrayList17 = arrayList11;
                                arrayList16 = arrayList10;
                                arrayList14 = arrayList26;
                            }
                            arrayList13.add(zo7Var);
                            arrayList14 = arrayList26;
                        } else {
                            long j2 = -longValue2;
                            TLRPC.Chat L0 = oc7.r1(i7).L0(Long.valueOf(j2));
                            if (L0 == null) {
                                arrayList19.add(Long.valueOf(j2));
                                longSparseArray.put(longValue2, zo7Var);
                            } else if (!L0.left && !L0.kicked && L0.migrated_to == null) {
                                if (!sd2.T(L0) || L0.megagroup) {
                                    arrayList14 = arrayList26;
                                    arrayList14.add(zo7Var);
                                } else {
                                    arrayList15.add(zo7Var);
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
            z = true;
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
                if (longValue != 0 && longValue != j) {
                    zo7 zo7Var2 = new zo7();
                    zo7Var2.d = longValue;
                    zo7Var2.c = ((Boolean) next2.getValue()).booleanValue() ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    zo7Var2.e = true;
                    if (pg3.D(longValue)) {
                        TLRPC.User W13 = getMessagesController().W1(A);
                        if (W13 == null) {
                            arrayList18.add(A);
                            longSparseArray.put(longValue, zo7Var2);
                        } else if (!W13.deleted) {
                        }
                        arrayList9 = arrayList27;
                        arrayList9.add(zo7Var2);
                        hashSet.add(A);
                        arrayList27 = arrayList9;
                    }
                }
            }
            arrayList9 = arrayList27;
            arrayList27 = arrayList9;
        }
        ArrayList arrayList31 = arrayList27;
        Collections.sort(arrayList, Comparator$-CC.comparingDouble(new po7((byte) 2)));
        int max = Math.max(0, arrayList.size() - 5);
        while (max < arrayList.size()) {
            long n = pg3.n(((TLRPC.TL_topPeer) arrayList.get(max)).peer);
            if (hashSet.contains(Long.valueOf(n))) {
                i6 = max;
            } else {
                zo7 zo7Var3 = new zo7();
                zo7Var3.d = n;
                i6 = max;
                zo7Var3.c = 0;
                zo7Var3.f = z;
                zo7Var3.e = z;
                if (pg3.D(n)) {
                    TLRPC.User W14 = getMessagesController().W1(Long.valueOf(n));
                    if (W14 == null) {
                        arrayList18.add(Long.valueOf(n));
                        longSparseArray.put(n, zo7Var3);
                    }
                    arrayList8 = arrayList28;
                    arrayList8.add(0, zo7Var3);
                    hashSet.add(Long.valueOf(n));
                    arrayList28 = arrayList8;
                    max = i6 + 1;
                    z = true;
                }
            }
            arrayList8 = arrayList28;
            arrayList28 = arrayList8;
            max = i6 + 1;
            z = true;
        }
        ArrayList arrayList32 = arrayList28;
        if (longSparseArray.size() != 0) {
            try {
                if (arrayList20.isEmpty()) {
                    arrayList5 = arrayList30;
                } else {
                    try {
                        arrayList5 = arrayList30;
                        try {
                            cf7.Y(this.currentAccount).T(TextUtils.join(",", arrayList20), arrayList5, arrayList18);
                        } catch (Exception e) {
                            e = e;
                            arrayList3 = arrayList2;
                            arrayList4 = arrayList29;
                            z2 = true;
                            i = 0;
                            fc4.g(e, z2);
                            size = arrayList3.size();
                            i2 = i;
                            while (i2 < size) {
                            }
                            arrayList6 = arrayList31;
                            size2 = arrayList4.size();
                            while (i3 < size2) {
                            }
                            size3 = arrayList5.size();
                            while (i4 < size3) {
                            }
                            size4 = longSparseArray.size();
                            while (i5 < size4) {
                            }
                            gm.c3(new l77(this, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, sv2Var));
                        }
                    } catch (Exception e2) {
                        e = e2;
                        arrayList5 = arrayList30;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                arrayList3 = arrayList2;
                arrayList4 = arrayList29;
                arrayList5 = arrayList30;
            }
            try {
                if (arrayList18.isEmpty()) {
                    arrayList4 = arrayList29;
                    i = 0;
                } else {
                    try {
                        arrayList4 = arrayList29;
                        i = 0;
                    } catch (Exception e4) {
                        e = e4;
                        arrayList4 = arrayList29;
                        i = 0;
                        arrayList3 = arrayList2;
                        z2 = true;
                        fc4.g(e, z2);
                        size = arrayList3.size();
                        i2 = i;
                        while (i2 < size) {
                        }
                        arrayList6 = arrayList31;
                        size2 = arrayList4.size();
                        while (i3 < size2) {
                        }
                        size3 = arrayList5.size();
                        while (i4 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i5 < size4) {
                        }
                        gm.c3(new l77(this, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, sv2Var));
                    }
                    try {
                        cf7.Y(this.currentAccount).k0(arrayList18, arrayList4, false);
                    } catch (Exception e5) {
                        e = e5;
                        arrayList3 = arrayList2;
                        z2 = true;
                        fc4.g(e, z2);
                        size = arrayList3.size();
                        i2 = i;
                        while (i2 < size) {
                        }
                        arrayList6 = arrayList31;
                        size2 = arrayList4.size();
                        while (i3 < size2) {
                        }
                        size3 = arrayList5.size();
                        while (i4 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i5 < size4) {
                        }
                        gm.c3(new l77(this, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, sv2Var));
                    }
                }
                if (arrayList19.isEmpty()) {
                    arrayList3 = arrayList2;
                } else {
                    cf7 Y = cf7.Y(this.currentAccount);
                    String join = TextUtils.join(",", arrayList19);
                    arrayList3 = arrayList2;
                    try {
                        Y.P(join, arrayList3);
                    } catch (Exception e6) {
                        e = e6;
                        z2 = true;
                        fc4.g(e, z2);
                        size = arrayList3.size();
                        i2 = i;
                        while (i2 < size) {
                        }
                        arrayList6 = arrayList31;
                        size2 = arrayList4.size();
                        while (i3 < size2) {
                        }
                        size3 = arrayList5.size();
                        while (i4 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i5 < size4) {
                        }
                        gm.c3(new l77(this, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, sv2Var));
                    }
                }
            } catch (Exception e7) {
                e = e7;
                arrayList3 = arrayList2;
                arrayList4 = arrayList29;
                i = 0;
                z2 = true;
                fc4.g(e, z2);
                size = arrayList3.size();
                i2 = i;
                while (i2 < size) {
                }
                arrayList6 = arrayList31;
                size2 = arrayList4.size();
                while (i3 < size2) {
                }
                size3 = arrayList5.size();
                while (i4 < size3) {
                }
                size4 = longSparseArray.size();
                while (i5 < size4) {
                }
                gm.c3(new l77(this, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, sv2Var));
            }
            size = arrayList3.size();
            i2 = i;
            while (i2 < size) {
                TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i2);
                if (chat.left || chat.kicked || chat.migrated_to != null) {
                    arrayList7 = arrayList31;
                } else {
                    zo7 zo7Var4 = (zo7) longSparseArray.get(-chat.id);
                    arrayList7 = arrayList31;
                    longSparseArray.remove(-chat.id);
                    if (zo7Var4 != null) {
                        if (!sd2.T(chat) || chat.megagroup) {
                            arrayList14.add(zo7Var4);
                        } else {
                            arrayList15.add(zo7Var4);
                        }
                    }
                }
                i2++;
                arrayList31 = arrayList7;
            }
            arrayList6 = arrayList31;
            size2 = arrayList4.size();
            for (i3 = 0; i3 < size2; i3++) {
                TLRPC.User user = (TLRPC.User) arrayList4.get(i3);
                if (!user.deleted) {
                    longSparseArray.remove(user.id);
                }
            }
            size3 = arrayList5.size();
            for (i4 = 0; i4 < size3; i4++) {
                longSparseArray.remove(pg3.E(((TLRPC.EncryptedChat) arrayList5.get(i4)).id));
            }
            size4 = longSparseArray.size();
            for (i5 = 0; i5 < size4; i5++) {
                if (pg3.y(longSparseArray.keyAt(i5))) {
                    arrayList14.remove(longSparseArray.valueAt(i5));
                    arrayList15.remove(longSparseArray.valueAt(i5));
                } else {
                    arrayList13.remove(longSparseArray.valueAt(i5));
                }
            }
        } else {
            arrayList6 = arrayList31;
            arrayList3 = arrayList2;
            arrayList4 = arrayList29;
            arrayList5 = arrayList30;
        }
        gm.c3(new l77(this, arrayList4, arrayList3, arrayList5, arrayList13, arrayList14, arrayList15, arrayList6, arrayList32, sv2Var));
    }

    public final void F0(sv2 sv2Var) {
        hs6.d0(this.currentAccount).O0(true);
        cf7.Y(this.currentAccount).a.c(new ud7((Object) this, (Object) new ArrayList(hs6.d0(this.currentAccount).j1), (Object) sv2Var, (byte) 8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        int i = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(jb6.M0(2131747655, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 13));
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.a = r59Var;
        r59Var.r1();
        this.a.setItemAnimator(null);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutAnimation(null);
        this.a.setLayoutManager(new zs((byte) 9, i, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, qoe.c(-1.0f, -1));
        r59 r59Var2 = this.a;
        s30 s30Var = new s30(this, context, (byte) 8);
        this.c = s30Var;
        r59Var2.setAdapter(s30Var);
        this.a.setOnItemClickListener(new xo7(this));
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.f0) {
            this.c.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.a, 16, new Class[]{jf5.class, bjb.class, ijb.class, vkb.class, yn7.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        int i = cmb.L6;
        arrayList.add(new cnb(this.a, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        int i2 = cmb.M6;
        arrayList.add(new cnb(this.a, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.a, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.a, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                str = null;
            } else {
                str = i == this.J ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? jb6.M0(2131751536, "DefaultRingtone") : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? jb6.M0(2131745014, "SoundDefault") : ringtone.getTitle(getParentActivity());
                ringtone.stop();
            }
            SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
            if (i == this.J) {
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
            this.c.g(i);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        oc7 r1 = oc7.r1(this.currentAccount);
        if (!r1.l2) {
            r1.l2 = true;
            r1.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new y67(r1, (byte) 14));
        }
        F0(null);
        if (z8c.c() > 1) {
            int i = this.V;
            this.r = i;
            this.accountsAllRow = i + 1;
            this.V = i + 3;
            this.s = i + 2;
        } else {
            this.r = -1;
            this.accountsAllRow = -1;
            this.s = -1;
        }
        int i2 = this.V;
        this.y = i2;
        this.privateRow = i2 + 1;
        this.groupRow = i2 + 2;
        this.channelsRow = i2 + 3;
        this.storiesRow = i2 + 4;
        this.reactionsRow = i2 + 5;
        this.E = i2 + 6;
        this.H = i2 + 7;
        this.I = i2 + 8;
        this.J = i2 + 9;
        this.K = i2 + 10;
        this.O = i2 + 11;
        this.badgeNumberShowRow = i2 + 12;
        this.badgeNumberMutedRow = i2 + 13;
        this.badgeNumberMessagesRow = i2 + 14;
        this.P = i2 + 15;
        this.F = i2 + 16;
        this.inappSoundRow = i2 + 17;
        this.inappVibrateRow = i2 + 18;
        this.inappPreviewRow = i2 + 19;
        this.inchatSoundRow = i2 + 20;
        this.inappPriorityRow = i2 + 21;
        this.G = i2 + 22;
        this.L = i2 + 23;
        this.contactJoinedRow = i2 + 24;
        this.pinnedMessageRow = i2 + 25;
        this.M = i2 + 26;
        this.N = i2 + 27;
        this.w = i2 + 28;
        this.x = i2 + 29;
        this.Q = -1;
        this.R = i2 + 30;
        this.S = i2 + 31;
        this.T = i2 + 32;
        this.resetNotificationsRow = i2 + 33;
        this.V = i2 + 35;
        this.U = i2 + 34;
        nm7.f(this.currentAccount).b(this, nm7.f0);
        oc7 messagesController = getMessagesController();
        messagesController.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new y67(messagesController, (byte) 17));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.f0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        s30 s30Var = this.c;
        if (s30Var != null) {
            s30Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0(float f, int i, View view) {
        int i2;
        boolean v;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String G;
        ArrayList arrayList4;
        if (getParentActivity() == null) {
            return;
        }
        int i3 = this.privateRow;
        Parcelable parcelable = null;
        parcelable = null;
        byte b = 1;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (i != i3 && i != this.groupRow && i != this.channelsRow && i != this.storiesRow && i != this.reactionsRow) {
            if (i == this.J) {
                try {
                    SharedPreferences sharedPreferences = oc7.r1(this.currentAccount).W3;
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
                    startActivityForResult(intent, i);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            } else if (i == this.resetNotificationsRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.S = jb6.M0(2131745828, "ResetNotificationsAlertTitle");
                alertDialog$Builder.a.U = jb6.M0(2131745829, "ResetNotificationsAlert");
                alertDialog$Builder.j(jb6.M0(2131745851, "Reset"), new xo7(this));
                alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
                he heVar = alertDialog$Builder.a;
                showDialog(heVar);
                TextView textView = (TextView) heVar.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
                }
            } else if (i == this.inappSoundRow) {
                SharedPreferences sharedPreferences2 = oc7.r1(this.currentAccount).W3;
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                z = sharedPreferences2.getBoolean("EnableInAppSounds", true);
                edit.putBoolean("EnableInAppSounds", !z);
                edit.commit();
            } else if (i == this.inappVibrateRow) {
                SharedPreferences sharedPreferences3 = oc7.r1(this.currentAccount).W3;
                SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                z = sharedPreferences3.getBoolean("EnableInAppVibrate", true);
                edit2.putBoolean("EnableInAppVibrate", !z);
                edit2.commit();
            } else if (i == this.inappPreviewRow) {
                SharedPreferences sharedPreferences4 = oc7.r1(this.currentAccount).W3;
                SharedPreferences.Editor edit3 = sharedPreferences4.edit();
                z = sharedPreferences4.getBoolean("EnableInAppPreview", true);
                edit3.putBoolean("EnableInAppPreview", !z);
                edit3.commit();
            } else if (i == this.inchatSoundRow) {
                SharedPreferences sharedPreferences5 = oc7.r1(this.currentAccount).W3;
                SharedPreferences.Editor edit4 = sharedPreferences5.edit();
                z = sharedPreferences5.getBoolean("EnableInChatSound", true);
                boolean z2 = !z;
                edit4.putBoolean("EnableInChatSound", z2);
                edit4.commit();
                getNotificationsController().N = z2;
            } else if (i == this.inappPriorityRow) {
                SharedPreferences sharedPreferences6 = oc7.r1(this.currentAccount).W3;
                SharedPreferences.Editor edit5 = sharedPreferences6.edit();
                z = sharedPreferences6.getBoolean("EnableInAppPopup", true);
                edit5.putBoolean("EnableInAppPopup", !z);
                edit5.commit();
            } else if (i == this.contactJoinedRow) {
                SharedPreferences sharedPreferences7 = oc7.r1(this.currentAccount).W3;
                SharedPreferences.Editor edit6 = sharedPreferences7.edit();
                boolean z3 = sharedPreferences7.getBoolean("EnableContactJoined", true);
                oc7.r1(this.currentAccount);
                edit6.putBoolean("EnableContactJoined", !z3);
                edit6.commit();
                TL_account.setContactSignUpNotification setcontactsignupnotification = new TL_account.setContactSignUpNotification();
                setcontactsignupnotification.silent = z3;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setcontactsignupnotification, new nf2(z ? (byte) 1 : (byte) 0));
                z = z3;
            } else if (i == this.pinnedMessageRow) {
                SharedPreferences sharedPreferences8 = oc7.r1(this.currentAccount).W3;
                SharedPreferences.Editor edit7 = sharedPreferences8.edit();
                z = sharedPreferences8.getBoolean("PinnedMessages", true);
                edit7.putBoolean("PinnedMessages", !z);
                edit7.commit();
            } else if (i == this.Q) {
                SharedPreferences sharedPreferences9 = oc7.r1(this.currentAccount).W3;
                SharedPreferences.Editor edit8 = sharedPreferences9.edit();
                z = sharedPreferences9.getBoolean("EnableAutoNotifications", false);
                edit8.putBoolean("EnableAutoNotifications", !z);
                edit8.commit();
            } else {
                byte b2 = 6;
                if (i == this.badgeNumberShowRow) {
                    SharedPreferences.Editor edit9 = oc7.r1(this.currentAccount).W3.edit();
                    z = getNotificationsController().S;
                    getNotificationsController().S = !z;
                    edit9.putBoolean("badgeNumber", getNotificationsController().S);
                    edit9.commit();
                    lo7 notificationsController = getNotificationsController();
                    notificationsController.getClass();
                    lo7.l0.c(new zn7(notificationsController, b2));
                } else if (i == this.badgeNumberMutedRow) {
                    SharedPreferences.Editor edit10 = oc7.r1(this.currentAccount).W3.edit();
                    z = getNotificationsController().T;
                    getNotificationsController().T = !z;
                    edit10.putBoolean("badgeNumberMuted", getNotificationsController().T);
                    edit10.commit();
                    lo7 notificationsController2 = getNotificationsController();
                    notificationsController2.getClass();
                    lo7.l0.c(new zn7(notificationsController2, b2));
                    cf7 messagesStorage = getMessagesStorage();
                    messagesStorage.a.c(new xd7(messagesStorage, (byte) 26));
                } else if (i == this.badgeNumberMessagesRow) {
                    SharedPreferences.Editor edit11 = oc7.r1(this.currentAccount).W3.edit();
                    z = getNotificationsController().U;
                    getNotificationsController().U = !z;
                    edit11.putBoolean("badgeNumberMessages", getNotificationsController().U);
                    edit11.commit();
                    lo7 notificationsController3 = getNotificationsController();
                    notificationsController3.getClass();
                    lo7.l0.c(new zn7(notificationsController3, b2));
                } else if (i == this.x) {
                    SharedPreferences sharedPreferences10 = oc7.r1(this.currentAccount).W3;
                    boolean z4 = sharedPreferences10.getBoolean("pushConnection", getMessagesController().l4.z3.f);
                    SharedPreferences.Editor edit12 = sharedPreferences10.edit();
                    edit12.putBoolean("pushConnection", !z4);
                    edit12.commit();
                    int i4 = this.currentAccount;
                    if (z4) {
                        ConnectionsManager.getInstance(i4).setPushConnectionEnabled(false);
                    } else {
                        ConnectionsManager.getInstance(i4).setPushConnectionEnabled(true);
                    }
                    z = z4;
                } else {
                    byte b3 = 5;
                    if (i == this.accountsAllRow) {
                        SharedPreferences e1 = oc7.e1();
                        v = e1.getBoolean("AllAccounts", true);
                        SharedPreferences.Editor edit13 = e1.edit();
                        boolean z5 = !v;
                        edit13.putBoolean("AllAccounts", z5);
                        edit13.commit();
                        gda.M0 = z5;
                        for (int i5 = 0; i5 < 4; i5++) {
                            if (gda.M0) {
                                lo7.n(i5).Y();
                            } else if (i5 == this.currentAccount) {
                                lo7.n(i5).Y();
                            } else {
                                lo7.l0.c(new zn7(lo7.n(i5), b3));
                            }
                        }
                    } else if (i == this.w) {
                        SharedPreferences sharedPreferences11 = oc7.r1(this.currentAccount).W3;
                        z = sharedPreferences11.getBoolean("pushService", getMessagesController().l4.y3.f);
                        SharedPreferences.Editor edit14 = sharedPreferences11.edit();
                        edit14.putBoolean("pushService", !z);
                        edit14.commit();
                        org.telegram.messenger.a.w();
                    } else if (i == this.I) {
                        if (getParentActivity() == null) {
                            return;
                        } else {
                            showDialog(ik.V(getParentActivity(), 0L, 0L, i == this.I ? "vibrate_calls" : null, new ge7(this, i, b), null));
                        }
                    } else if (i == this.R) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder2.a.S = jb6.M0(2131746008, "RepeatNotifications");
                        alertDialog$Builder2.e(new CharSequence[]{jb6.M0(2131746010, "RepeatDisabled"), jb6.G(5, "Minutes", new Object[0]), jb6.G(10, "Minutes", new Object[0]), jb6.G(30, "Minutes", new Object[0]), jb6.G(1, "Hours", new Object[0]), jb6.G(2, "Hours", new Object[0]), jb6.G(4, "Hours", new Object[0])}, new fv3(this, i, b));
                        alertDialog$Builder2.g(jb6.M0(2131752542, "Cancel"), null);
                        showDialog(alertDialog$Builder2.a);
                    }
                }
            }
            if (view instanceof bjb) {
                return;
            }
            ((bjb) view).setChecked(!z);
            return;
        }
        if (i == i3) {
            ArrayList arrayList5 = this.d;
            v = getNotificationsController().v(1);
            arrayList = arrayList5;
            i2 = 1;
        } else if (i == this.groupRow) {
            ArrayList arrayList6 = this.e;
            v = getNotificationsController().v(0);
            arrayList = arrayList6;
            i2 = 0;
        } else if (i == this.storiesRow) {
            ArrayList arrayList7 = this.h;
            arrayList2 = this.n;
            arrayList = arrayList7;
            v = getNotificationsSettings().getBoolean("EnableAllStories", false);
            i2 = 3;
            if (arrayList != null && i2 != 4) {
                return;
            }
            yn7 yn7Var = (yn7) view;
            if ((jb6.a0 || f > gm.L(76.0f)) && (jb6.a0 || f < view.getMeasuredWidth() - gm.L(76.0f))) {
                presentFragment(new NotificationsCustomSettingsActivity(i2, arrayList, arrayList2, false));
            } else {
                yo7 yo7Var = new yo7(this, i2, v, yn7Var, i);
                if (i == this.storiesRow) {
                    arrayList3 = this.h;
                    arrayList4 = this.n;
                    G = (arrayList3 == null || arrayList3.isEmpty()) ? null : jb6.G(arrayList3.size(), "ChatsException", new Object[0]);
                } else if (i == this.privateRow) {
                    arrayList3 = this.d;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        G = jb6.G(arrayList3.size(), "ChatsException", new Object[0]);
                        arrayList4 = null;
                    }
                    G = null;
                    arrayList4 = null;
                } else if (i == this.groupRow) {
                    arrayList3 = this.e;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        G = jb6.G(arrayList3.size(), "Groups", new Object[0]);
                        arrayList4 = null;
                    }
                    G = null;
                    arrayList4 = null;
                } else if (i == this.reactionsRow) {
                    yo7Var.run();
                } else {
                    arrayList3 = this.f;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        G = jb6.G(arrayList3.size(), "Channels", new Object[0]);
                        arrayList4 = null;
                    }
                    G = null;
                    arrayList4 = null;
                }
                if (G == null) {
                    yo7Var.run();
                } else {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                    if (arrayList3.size() == 1) {
                        alertDialog$Builder3.a.U = gm.S2(jb6.a0(null, null, 2131747643, G));
                    } else {
                        alertDialog$Builder3.a.U = gm.S2(jb6.a0(null, null, 2131747644, G));
                    }
                    alertDialog$Builder3.a.S = jb6.M0(2131747645, "NotificationsExceptions");
                    alertDialog$Builder3.h(jb6.M0(2131743238, "ViewExceptions"), new wu2((Object) this, (Object) arrayList3, (Object) arrayList4, (byte) 20));
                    alertDialog$Builder3.g(jb6.M0(2131747564, "OK"), new cj6(yo7Var, (byte) 18));
                    showDialog(alertDialog$Builder3.a);
                }
            }
        } else if (i == this.reactionsRow) {
            v = getNotificationsSettings().getBoolean("EnableReactionsMessages", true) || getNotificationsSettings().getBoolean("EnableReactionsStories", true);
            i2 = 4;
            arrayList = null;
        } else {
            ArrayList arrayList8 = this.f;
            i2 = 2;
            v = getNotificationsController().v(2);
            arrayList = arrayList8;
        }
        arrayList2 = null;
        if (arrayList != null) {
        }
        yn7 yn7Var2 = (yn7) view;
        if (jb6.a0) {
        }
        presentFragment(new NotificationsCustomSettingsActivity(i2, arrayList, arrayList2, false));
        z = v;
        if (view instanceof bjb) {
        }
    }
}
