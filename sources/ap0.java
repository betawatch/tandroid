// default package

import android.graphics.Canvas;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ap0 extends mz0 implements jm7 {
    public final ArrayList S1;
    public final List T1;
    public final List U1;
    public final List V1;
    public final TLRPC.Chat W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final ArrayList a2;
    public kn0 b2;
    public int c2;
    public int d2;
    public int e2;
    public boolean f2;
    public int g2;
    public long h2;
    public int i2;
    public int j2;
    public long k2;
    public final n8 l2;
    public hi2 m2;
    public int n2;
    public zn0 o2;
    public final TL_stories.PrepaidGiveaway p2;
    public String q2;
    public boolean r2;
    public boolean s2;
    public final ro0 t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap0(d dVar, long j, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(dVar, false);
        byte b = 5;
        this.S1 = new ArrayList();
        this.T1 = oo0.j() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.U1 = oo0.j() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.V1 = Arrays.asList(750, 10000, 50000);
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.a2 = new ArrayList();
        int i = po0.w;
        this.c2 = 2;
        this.d2 = 0;
        int i2 = ex7.w;
        this.e2 = 0;
        this.g2 = 12;
        long time = new Date().getTime() + 259200000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i3 = calendar.get(12);
        while (i3 % 5 != 0) {
            i3++;
        }
        calendar.set(12, i3);
        this.h2 = calendar.getTimeInMillis();
        this.i2 = 2;
        this.j2 = 2;
        this.q2 = "";
        this.s2 = true;
        this.t2 = new ro0(this, (byte) 0);
        this.p2 = prepaidGiveaway;
        this.u1 = 0.15f;
        this.v0 = false;
        this.w0 = false;
        this.T0 = false;
        this.u0 = 0;
        W0();
        ((ViewGroup.MarginLayoutParams) this.o1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.o1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i4 = po0.w;
            this.c2 = 3;
        }
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        this.n1.setItemAnimator(sc3Var);
        r59 r59Var = this.n1;
        int i5 = this.u0;
        r59Var.setPadding(i5, 0, i5, gm.L(68.0f));
        this.n1.setOnScrollListener(new zo0());
        this.n1.setOnItemClickListener(new k0(this, dVar, (byte) 1));
        TLRPC.Chat L0 = oc7.r1(this.a).L0(Long.valueOf(-j));
        this.W1 = L0;
        kn0 kn0Var = this.b2;
        ArrayList arrayList = this.S1;
        r59 r59Var2 = this.n1;
        so0 so0Var = new so0(this);
        so0 so0Var2 = new so0(this);
        so0 so0Var3 = new so0(this);
        kn0Var.e = arrayList;
        kn0Var.w = L0;
        kn0Var.f = r59Var2;
        kn0Var.h = so0Var;
        kn0Var.n = so0Var2;
        kn0Var.s = so0Var3;
        f1(false, false);
        n8 n8Var = new n8(getContext(), this.J0);
        this.l2 = n8Var;
        n8Var.setOnClickListener(new yo0(this, prepaidGiveaway, j, dVar));
        e1(false);
        this.b.addView(n8Var, qoe.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        oo0.l(this.a, L0, new to0(this, b));
        nm7.f(this.a).b(this, nm7.z3);
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        kn0 kn0Var = new kn0(this.J0);
        this.b2 = kn0Var;
        return kn0Var;
    }

    @Override // mz0
    public final CharSequence J0() {
        int i = this.d2;
        int i2 = po0.w;
        return i == 1 ? jb6.M0(2131749457, null) : jb6.a0("BoostingStartGiveaway", null, 2131753158, new Object[0]);
    }

    @Override // mz0
    public final void M0(Canvas canvas, int i) {
        this.n2 = i;
    }

    public final ArrayList Y0(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption b1 = b1(j);
        if (b1 != null) {
            for (int i = 0; i < b1.winners.size(); i++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = b1.winners.get(i);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int Z0() {
        int i = this.c2;
        int i2 = po0.w;
        if (i == 2) {
            return ((Integer) this.T1.get(this.i2)).intValue();
        }
        List c1 = c1();
        int i3 = this.j2;
        if (i3 < 0 || i3 >= c1.size()) {
            this.j2 = 0;
        }
        if (this.j2 >= c1.size()) {
            return 0;
        }
        return ((Integer) c1.get(this.j2)).intValue();
    }

    public final int a1() {
        int Z0;
        int h;
        int i = this.c2;
        int i2 = po0.w;
        if (i == 2) {
            Z0 = ((Integer) this.T1.get(this.i2)).intValue();
            h = oo0.h();
        } else {
            TL_stars.TL_starsGiveawayOption b1 = b1(this.k2);
            if (b1 != null) {
                return b1.yearly_boosts;
            }
            Z0 = Z0();
            h = oo0.h();
        }
        return h * Z0;
    }

    public final TL_stars.TL_starsGiveawayOption b1(long j) {
        ArrayList s = jva.v(this.a, false).s();
        if (s == null) {
            return null;
        }
        for (int i = 0; i < s.size(); i++) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) s.get(i);
            if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j) {
                return tL_starsGiveawayOption;
            }
        }
        return null;
    }

    public final List c1() {
        int i = this.c2;
        int i2 = po0.w;
        if (i == 2) {
            return this.T1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption b1 = b1(this.k2);
        if (b1 != null) {
            for (int i3 = 0; i3 < b1.winners.size(); i3++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = b1.winners.get(i3);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean d1() {
        return this.p2 != null;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        r59 r59Var;
        if (i == nm7.z3 && (r59Var = this.n1) != null && r59Var.H) {
            f1(true, true);
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        zn0 zn0Var = this.o2;
        if (zn0Var != null) {
            zn0Var.run();
        }
        nm7.f(this.a).n(this, nm7.z3);
    }

    public final void e1(boolean z) {
        boolean d1 = d1();
        n8 n8Var = this.l2;
        if (d1) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.p2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                n8Var.a(prepaidGiveaway.quantity, z);
                return;
            } else {
                n8Var.a(oo0.h() * prepaidGiveaway.quantity, z);
                return;
            }
        }
        int i = this.d2;
        int i2 = po0.w;
        if (i == 0) {
            n8Var.a(a1(), z);
            return;
        }
        ArrayList arrayList = this.Y1;
        int h = oo0.h() * arrayList.size();
        boolean z2 = arrayList.size() > 0;
        n8Var.e = true;
        b61 b61Var = n8Var.a;
        b61Var.k();
        b61Var.setShowZero(true);
        b61Var.setEnabled(z2);
        b61Var.c(h, z);
        b61Var.i(jb6.M0(2131749457, null), z, true);
        anb.h(cmb.g5, n8Var.c, n8Var.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05c6  */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z, boolean z2) {
        byte b;
        ?? r10;
        int i;
        boolean z3;
        String str;
        ?? r102;
        kn0 kn0Var;
        ?? r103;
        int i2;
        int i3;
        long longValue;
        ArrayList arrayList = this.S1;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i4 = this.c2;
        int i5 = po0.w;
        boolean z4 = i4 == 3;
        jn0 jn0Var = new jn0(0, false);
        jn0Var.g = z4;
        arrayList.add(jn0Var);
        boolean d1 = d1();
        ArrayList arrayList3 = this.Y1;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.p2;
        if (d1) {
            jn0 jn0Var2 = new jn0(14, false);
            jn0Var2.f = prepaidGiveaway;
            arrayList.add(jn0Var2);
        } else {
            int size = arrayList3.size();
            jn0 jn0Var3 = new jn0(2, this.c2 == 2);
            jn0Var3.l = (byte) 2;
            jn0Var3.i = size;
            jn0Var3.f = null;
            arrayList.add(jn0Var3);
            int size2 = arrayList3.size();
            jn0 jn0Var4 = new jn0(2, this.c2 == 3);
            jn0Var4.l = (byte) 3;
            jn0Var4.i = size2;
            jn0Var4.f = null;
            arrayList.add(jn0Var4);
        }
        arrayList.add(new jn0(4, false));
        TLRPC.Chat chat = this.W1;
        boolean V = sd2.V(chat);
        int i6 = this.c2;
        ArrayList arrayList4 = this.Z1;
        ArrayList arrayList5 = this.X1;
        if (i6 == 3) {
            if (!d1()) {
                String M0 = jb6.M0(2131753165, null);
                int a1 = a1();
                jn0 jn0Var5 = new jn0(13, false);
                jn0Var5.c = M0;
                jn0Var5.i = a1;
                arrayList.add(jn0Var5);
                ArrayList s = jva.v(this.a, false).s();
                ArrayList arrayList6 = new ArrayList();
                if (s != null) {
                    for (int i7 = 0; i7 < s.size(); i7++) {
                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) s.get(i7);
                        if (tL_starsGiveawayOption != null && !arrayList6.contains(Long.valueOf(tL_starsGiveawayOption.stars))) {
                            arrayList6.add(Long.valueOf(tL_starsGiveawayOption.stars));
                        }
                    }
                }
                int i8 = 0;
                for (int i9 = 0; i9 < arrayList6.size(); i9 = i2 + 1) {
                    TL_stars.TL_starsGiveawayOption b1 = b1(((Long) arrayList6.get(i9)).longValue());
                    if (!b1.missingStorePrice) {
                        if (this.k2 == 0 && b1.isDefault) {
                            this.k2 = b1.stars;
                        }
                        if (!b1.extended || this.f2) {
                            int i10 = i8 + 1;
                            int i11 = this.f2 ? i9 : i9 + 2;
                            long j = b1.stars;
                            ArrayList Y0 = Y0(j);
                            if (Y0.isEmpty()) {
                                float f = j;
                                i2 = i9;
                                i3 = i10;
                                ArrayList Y02 = Y0(this.k2);
                                int i12 = this.j2;
                                if (i12 < 0 || i12 >= Y02.size()) {
                                    this.j2 = 0;
                                }
                                longValue = Math.round(f / (this.j2 >= Y02.size() ? 1L : ((Long) Y02.get(this.j2)).longValue()));
                            } else {
                                i2 = i9;
                                i3 = i10;
                                longValue = ((Long) Y0.get(Utilities.j(this.j2, Y0.size() - 1, 0))).longValue();
                            }
                            arrayList.add(jn0.d(b1, i11, longValue, this.k2 == b1.stars, true));
                            i8 = i3;
                        }
                    }
                    i2 = i9;
                }
                if (!this.f2 && i8 < arrayList6.size()) {
                    arrayList.add(new jn0(18, false));
                }
                if (i8 <= 0) {
                    arrayList.add(jn0.d(null, 0, 1L, false, true));
                    arrayList.add(jn0.d(null, 1, 1L, false, true));
                    arrayList.add(jn0.d(null, 2, 1L, false, false));
                }
                jn0Var5.i = a1();
                arrayList.add(jn0.c(jb6.M0(2131753164, null), false));
                List c1 = c1();
                int i13 = this.j2;
                if (i13 < 0 || i13 >= c1.size()) {
                    this.j2 = 0;
                }
                if (c1.size() > 1) {
                    arrayList.add(jn0.f(jb6.M0(2131753160, null)));
                    List c12 = c1();
                    int i14 = this.j2;
                    jn0 jn0Var6 = new jn0(5, false);
                    jn0Var6.k = c12;
                    jn0Var6.i = i14;
                    arrayList.add(jn0Var6);
                    arrayList.add(jn0.c(jb6.M0(2131753159, null), false));
                }
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                this.k2 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
            }
            arrayList.add(jn0.f(jb6.M0(2131753523, null)));
            if (!d1()) {
                arrayList.add(jn0.b(a1(), chat, false));
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                arrayList.add(jn0.b(prepaidGiveaway.quantity, chat, false));
            } else {
                arrayList.add(jn0.b(oo0.h() * prepaidGiveaway.quantity, chat, false));
            }
            int size3 = arrayList5.size();
            int i15 = 0;
            while (i15 < size3) {
                Object obj = arrayList5.get(i15);
                i15++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.Chat) {
                    arrayList.add(jn0.b(a1(), (TLRPC.Chat) tLObject, true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int a12 = a1();
                    jn0 jn0Var7 = new jn0(9, false);
                    jn0Var7.d = (TLRPC.InputPeer) tLObject;
                    jn0Var7.e = null;
                    jn0Var7.g = true;
                    jn0Var7.i = a12;
                    arrayList.add(jn0Var7);
                }
            }
            if (arrayList5.size() < oo0.g()) {
                r103 = 0;
                arrayList.add(new jn0(8, false));
            } else {
                r103 = 0;
            }
            arrayList.add(jn0.c(jb6.M0(2131753518, null), r103));
            arrayList.add(jn0.f(jb6.M0(2131753501, null)));
            int i16 = ex7.w;
            arrayList.add(jn0.e(r103, this.e2, arrayList4, true));
            arrayList.add(jn0.e(1, this.e2, arrayList4, r103));
            arrayList.add(jn0.c(jb6.M0(V ? 2131753516 : 2131753515, null), r103));
        } else {
            String str2 = null;
            if (this.d2 == 0) {
                if (!d1()) {
                    String M02 = jb6.M0(2131753288, null);
                    int a13 = a1();
                    jn0 jn0Var8 = new jn0(13, false);
                    jn0Var8.c = M02;
                    jn0Var8.i = a13;
                    arrayList.add(jn0Var8);
                    int i17 = this.i2;
                    jn0 jn0Var9 = new jn0(5, false);
                    jn0Var9.k = this.T1;
                    jn0Var9.i = i17;
                    arrayList.add(jn0Var9);
                    str2 = null;
                    arrayList.add(jn0.c(jb6.M0(2131753517, null), false));
                }
                arrayList.add(jn0.f(jb6.M0(2131753523, str2)));
                if (!d1()) {
                    arrayList.add(jn0.b(a1(), chat, false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(jn0.b(prepaidGiveaway.quantity, chat, false));
                } else {
                    arrayList.add(jn0.b(oo0.h() * prepaidGiveaway.quantity, chat, false));
                }
                int size4 = arrayList5.size();
                int i18 = 0;
                while (i18 < size4) {
                    Object obj2 = arrayList5.get(i18);
                    i18++;
                    TLObject tLObject2 = (TLObject) obj2;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        arrayList.add(jn0.b(a1(), (TLRPC.Chat) tLObject2, true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int a14 = a1();
                        jn0 jn0Var10 = new jn0(9, false);
                        jn0Var10.d = (TLRPC.InputPeer) tLObject2;
                        jn0Var10.e = null;
                        jn0Var10.g = true;
                        jn0Var10.i = a14;
                        arrayList.add(jn0Var10);
                    }
                }
                if (arrayList5.size() < oo0.g()) {
                    r10 = 0;
                    arrayList.add(new jn0(8, false));
                } else {
                    r10 = 0;
                }
                arrayList.add(jn0.c(jb6.M0(2131753518, null), r10));
                arrayList.add(jn0.f(jb6.M0(2131753501, null)));
                int i19 = ex7.w;
                arrayList.add(jn0.e(r10, this.e2, arrayList4, true));
                arrayList.add(jn0.e(1, this.e2, arrayList4, r10));
                str2 = null;
                arrayList.add(jn0.c(jb6.M0(V ? 2131753516 : 2131753515, null), r10));
            }
            if (!d1()) {
                arrayList.add(jn0.f(jb6.M0(2131753502, str2)));
                int i20 = this.d2;
                int i21 = po0.w;
                ArrayList c = oo0.c(i20 == 0 ? Z0() : arrayList3.size(), this.a2);
                int i22 = 0;
                while (i22 < c.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) c.get(i22);
                    int i23 = tL_premiumGiftCodeOption.months;
                    int i24 = this.d2;
                    int i25 = po0.w;
                    int Z0 = i24 == 0 ? Z0() : arrayList3.size();
                    long j2 = tL_premiumGiftCodeOption.amount;
                    int i26 = this.g2;
                    String str3 = tL_premiumGiftCodeOption.currency;
                    boolean z5 = i22 != c.size() + (-1);
                    ArrayList arrayList7 = c;
                    int i27 = i22;
                    jn0 jn0Var11 = new jn0(12, i23 == i26);
                    jn0Var11.i = i23;
                    jn0Var11.j = Z0;
                    jn0Var11.h = j2;
                    jn0Var11.g = z5;
                    jn0Var11.c = str3;
                    jn0Var11.m = tL_premiumGiftCodeOption;
                    arrayList.add(jn0Var11);
                    i22 = i27 + 1;
                    c = arrayList7;
                }
            }
            if (!d1()) {
                b = 3;
                arrayList.add(jn0.c(gm.N2(jb6.M0(2131753152, null), cmb.Wc, 0, new ro0(this, b), this.J0), true));
                i = this.c2;
                int i28 = po0.w;
                if (i != b || this.d2 == 0) {
                    String M03 = jb6.M0(2131753449, null);
                    boolean z6 = this.r2;
                    int i29 = ueb.M;
                    jn0 jn0Var12 = new jn0(15, z6);
                    jn0Var12.c = M03;
                    jn0Var12.g = z6;
                    jn0Var12.l = (byte) 1;
                    arrayList.add(jn0Var12);
                    if (this.r2) {
                        z3 = false;
                        str = null;
                        arrayList.add(jn0.c(jb6.M0(this.c2 == 3 ? 2131753202 : 2131753450, null), false));
                    } else {
                        int Z02 = d1() ? prepaidGiveaway.quantity : Z0();
                        z3 = false;
                        jn0 jn0Var13 = new jn0(16, false);
                        jn0Var13.i = Z02;
                        arrayList.add(jn0Var13);
                        String G = jb6.G(this.g2, "BoldMonths", new Object[0]);
                        int i30 = this.c2;
                        String str4 = this.q2;
                        if (i30 == 3) {
                            boolean isEmpty = str4.isEmpty();
                            long j3 = this.k2;
                            if (isEmpty) {
                                arrayList.add(jn0.c(gm.S2(jb6.G((int) j3, "BoostingStarsGiveawayAdditionPrizeCountHint", new Object[0])), false));
                            } else {
                                arrayList.add(jn0.c(gm.S2(jb6.G((int) j3, "BoostingStarsGiveawayAdditionPrizeCountNameHint", Integer.valueOf(Z02), this.q2)), false));
                            }
                        } else if (str4.isEmpty()) {
                            arrayList.add(jn0.c(gm.S2(jb6.G(Z02, "BoostingGiveawayAdditionPrizeCountHint", G)), false));
                        } else {
                            arrayList.add(jn0.c(gm.S2(jb6.G(Z02, "BoostingGiveawayAdditionPrizeCountNameHint", this.q2, G)), false));
                        }
                        str = null;
                    }
                    arrayList.add(jn0.f(jb6.M0(2131753503, str)));
                    long j4 = this.h2;
                    jn0 jn0Var14 = new jn0(10, z3);
                    jn0Var14.h = j4;
                    arrayList.add(jn0Var14);
                    if (this.c2 != 3) {
                        if (d1()) {
                            r102 = 0;
                            arrayList.add(jn0.c(jb6.G(prepaidGiveaway.quantity, V ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", jb6.G((int) this.k2, "BoostingStarsChooseRandomStars", new Object[0])), false));
                        } else {
                            r102 = 0;
                            arrayList.add(jn0.c(jb6.G(Z0(), V ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", jb6.G((int) this.k2, "BoostingStarsChooseRandomStars", new Object[0])), false));
                        }
                    } else {
                        r102 = 0;
                        r102 = 0;
                        if (d1()) {
                            arrayList.add(jn0.c(jb6.G(prepaidGiveaway.quantity, V ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", new Object[0]), false));
                        } else {
                            arrayList.add(jn0.c(jb6.G(Z0(), V ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", new Object[0]), false));
                        }
                    }
                    String M04 = jb6.M0(2131753333, null);
                    jn0 jn0Var15 = new jn0(15, this.s2);
                    jn0Var15.c = M04;
                    jn0Var15.g = r102;
                    jn0Var15.l = r102;
                    arrayList.add(jn0Var15);
                    if (d1()) {
                        arrayList.add(jn0.c(jb6.M0(2131753332, null), r102));
                    } else {
                        arrayList.add(jn0.c(gm.N2(jb6.M0(2131753332, null).concat(this.c2 != 3 ? "\n\n".concat(jb6.M0(2131753152, null)) : ""), cmb.Wc, 0, new ro0(this, (byte) 4), this.J0), true));
                    }
                }
                kn0Var = this.b2;
                if (kn0Var == null && z2) {
                    if (z) {
                        kn0Var.E(arrayList2, arrayList);
                        return;
                    } else {
                        kn0Var.f();
                        return;
                    }
                }
            }
        }
        b = 3;
        i = this.c2;
        int i282 = po0.w;
        if (i != b) {
        }
        String M032 = jb6.M0(2131753449, null);
        boolean z62 = this.r2;
        int i292 = ueb.M;
        jn0 jn0Var122 = new jn0(15, z62);
        jn0Var122.c = M032;
        jn0Var122.g = z62;
        jn0Var122.l = (byte) 1;
        arrayList.add(jn0Var122);
        if (this.r2) {
        }
        arrayList.add(jn0.f(jb6.M0(2131753503, str)));
        long j42 = this.h2;
        jn0 jn0Var142 = new jn0(10, z3);
        jn0Var142.h = j42;
        arrayList.add(jn0Var142);
        if (this.c2 != 3) {
        }
        String M042 = jb6.M0(2131753333, null);
        jn0 jn0Var152 = new jn0(15, this.s2);
        jn0Var152.c = M042;
        jn0Var152.g = r102;
        jn0Var152.l = r102;
        arrayList.add(jn0Var152);
        if (d1()) {
        }
        kn0Var = this.b2;
        if (kn0Var == null) {
        }
    }
}
