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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ao0 extends fy0 implements gk7 {
    public final ArrayList S1;
    public final List T1;
    public final List U1;
    public final List V1;
    public final TLRPC.Chat W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final ArrayList a2;
    public km0 b2;
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
    public lv6 m2;
    public int n2;
    public zm0 o2;
    public final TL_stories.PrepaidGiveaway p2;
    public String q2;
    public boolean r2;
    public boolean s2;
    public final rn0 t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao0(d dVar, long j, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(dVar, false);
        byte b = 5;
        this.S1 = new ArrayList();
        this.T1 = on0.j() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.U1 = on0.j() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.V1 = Arrays.asList(750, 10000, 50000);
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.a2 = new ArrayList();
        int i = pn0.w;
        this.c2 = 2;
        this.d2 = 0;
        int i2 = dv7.w;
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
        this.t2 = new rn0(this, (byte) 0);
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
            int i4 = pn0.w;
            this.c2 = 3;
        }
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.n1.setItemAnimator(gb3Var);
        o39 o39Var = this.n1;
        int i5 = this.u0;
        o39Var.setPadding(i5, 0, i5, gl.L(68.0f));
        this.n1.setOnScrollListener(new zn0());
        this.n1.setOnItemClickListener(new k0(this, dVar, (byte) 1));
        TLRPC.Chat K0 = na7.q1(this.a).K0(Long.valueOf(-j));
        this.W1 = K0;
        km0 km0Var = this.b2;
        ArrayList arrayList = this.S1;
        o39 o39Var2 = this.n1;
        sn0 sn0Var = new sn0(this);
        sn0 sn0Var2 = new sn0(this);
        sn0 sn0Var3 = new sn0(this);
        km0Var.e = arrayList;
        km0Var.w = K0;
        km0Var.f = o39Var2;
        km0Var.h = sn0Var;
        km0Var.n = sn0Var2;
        km0Var.s = sn0Var3;
        f1(false, false);
        n8 n8Var = new n8(getContext(), this.J0);
        this.l2 = n8Var;
        n8Var.setOnClickListener(new yn0(this, prepaidGiveaway, j, dVar));
        e1(false);
        this.b.addView(n8Var, nme.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        on0.l(this.a, K0, new tn0(this, b));
        kk7.f(this.a).b(this, kk7.y3);
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        km0 km0Var = new km0(this.J0);
        this.b2 = km0Var;
        return km0Var;
    }

    @Override // fy0
    public final CharSequence J0() {
        int i = this.d2;
        int i2 = pn0.w;
        return i == 1 ? k96.M0(2131749508, null) : k96.a0("BoostingStartGiveaway", null, 2131753190, new Object[0]);
    }

    @Override // fy0
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
        int i2 = pn0.w;
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
        int i2 = pn0.w;
        if (i == 2) {
            Z0 = ((Integer) this.T1.get(this.i2)).intValue();
            h = on0.h();
        } else {
            TL_stars.TL_starsGiveawayOption b1 = b1(this.k2);
            if (b1 != null) {
                return b1.yearly_boosts;
            }
            Z0 = Z0();
            h = on0.h();
        }
        return h * Z0;
    }

    public final TL_stars.TL_starsGiveawayOption b1(long j) {
        ArrayList s = gta.v(this.a, false).s();
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
        int i2 = pn0.w;
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

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        o39 o39Var;
        if (i == kk7.y3 && (o39Var = this.n1) != null && o39Var.H) {
            f1(true, true);
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        zm0 zm0Var = this.o2;
        if (zm0Var != null) {
            zm0Var.run();
        }
        kk7.f(this.a).n(this, kk7.y3);
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
                n8Var.a(on0.h() * prepaidGiveaway.quantity, z);
                return;
            }
        }
        int i = this.d2;
        int i2 = pn0.w;
        if (i == 0) {
            n8Var.a(a1(), z);
            return;
        }
        ArrayList arrayList = this.Y1;
        int h = on0.h() * arrayList.size();
        boolean z2 = arrayList.size() > 0;
        n8Var.e = true;
        u41 u41Var = n8Var.a;
        u41Var.k();
        u41Var.setShowZero(true);
        u41Var.setEnabled(z2);
        u41Var.c(h, z);
        u41Var.i(k96.M0(2131749508, null), z, true);
        zkb.h(bkb.g5, n8Var.c, n8Var.b);
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
        km0 km0Var;
        ?? r103;
        int i2;
        int i3;
        long longValue;
        ArrayList arrayList = this.S1;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i4 = this.c2;
        int i5 = pn0.w;
        boolean z4 = i4 == 3;
        jm0 jm0Var = new jm0(0, false);
        jm0Var.g = z4;
        arrayList.add(jm0Var);
        boolean d1 = d1();
        ArrayList arrayList3 = this.Y1;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.p2;
        if (d1) {
            jm0 jm0Var2 = new jm0(14, false);
            jm0Var2.f = prepaidGiveaway;
            arrayList.add(jm0Var2);
        } else {
            int size = arrayList3.size();
            jm0 jm0Var3 = new jm0(2, this.c2 == 2);
            jm0Var3.l = (byte) 2;
            jm0Var3.i = size;
            jm0Var3.f = null;
            arrayList.add(jm0Var3);
            int size2 = arrayList3.size();
            jm0 jm0Var4 = new jm0(2, this.c2 == 3);
            jm0Var4.l = (byte) 3;
            jm0Var4.i = size2;
            jm0Var4.f = null;
            arrayList.add(jm0Var4);
        }
        arrayList.add(new jm0(4, false));
        TLRPC.Chat chat = this.W1;
        boolean V = hc2.V(chat);
        int i6 = this.c2;
        ArrayList arrayList4 = this.Z1;
        ArrayList arrayList5 = this.X1;
        if (i6 == 3) {
            if (!d1()) {
                String M0 = k96.M0(2131753197, null);
                int a1 = a1();
                jm0 jm0Var5 = new jm0(13, false);
                jm0Var5.c = M0;
                jm0Var5.i = a1;
                arrayList.add(jm0Var5);
                ArrayList s = gta.v(this.a, false).s();
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
                            arrayList.add(jm0.d(b1, i11, longValue, this.k2 == b1.stars, true));
                            i8 = i3;
                        }
                    }
                    i2 = i9;
                }
                if (!this.f2 && i8 < arrayList6.size()) {
                    arrayList.add(new jm0(18, false));
                }
                if (i8 <= 0) {
                    arrayList.add(jm0.d(null, 0, 1L, false, true));
                    arrayList.add(jm0.d(null, 1, 1L, false, true));
                    arrayList.add(jm0.d(null, 2, 1L, false, false));
                }
                jm0Var5.i = a1();
                arrayList.add(jm0.c(k96.M0(2131753196, null), false));
                List c1 = c1();
                int i13 = this.j2;
                if (i13 < 0 || i13 >= c1.size()) {
                    this.j2 = 0;
                }
                if (c1.size() > 1) {
                    arrayList.add(jm0.f(k96.M0(2131753192, null)));
                    List c12 = c1();
                    int i14 = this.j2;
                    jm0 jm0Var6 = new jm0(5, false);
                    jm0Var6.k = c12;
                    jm0Var6.i = i14;
                    arrayList.add(jm0Var6);
                    arrayList.add(jm0.c(k96.M0(2131753191, null), false));
                }
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                this.k2 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
            }
            arrayList.add(jm0.f(k96.M0(2131753555, null)));
            if (!d1()) {
                arrayList.add(jm0.b(a1(), chat, false));
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                arrayList.add(jm0.b(prepaidGiveaway.quantity, chat, false));
            } else {
                arrayList.add(jm0.b(on0.h() * prepaidGiveaway.quantity, chat, false));
            }
            int size3 = arrayList5.size();
            int i15 = 0;
            while (i15 < size3) {
                Object obj = arrayList5.get(i15);
                i15++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.Chat) {
                    arrayList.add(jm0.b(a1(), (TLRPC.Chat) tLObject, true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int a12 = a1();
                    jm0 jm0Var7 = new jm0(9, false);
                    jm0Var7.d = (TLRPC.InputPeer) tLObject;
                    jm0Var7.e = null;
                    jm0Var7.g = true;
                    jm0Var7.i = a12;
                    arrayList.add(jm0Var7);
                }
            }
            if (arrayList5.size() < on0.g()) {
                r103 = 0;
                arrayList.add(new jm0(8, false));
            } else {
                r103 = 0;
            }
            arrayList.add(jm0.c(k96.M0(2131753550, null), r103));
            arrayList.add(jm0.f(k96.M0(2131753533, null)));
            int i16 = dv7.w;
            arrayList.add(jm0.e(r103, this.e2, arrayList4, true));
            arrayList.add(jm0.e(1, this.e2, arrayList4, r103));
            arrayList.add(jm0.c(k96.M0(V ? 2131753548 : 2131753547, null), r103));
        } else {
            String str2 = null;
            if (this.d2 == 0) {
                if (!d1()) {
                    String M02 = k96.M0(2131753320, null);
                    int a13 = a1();
                    jm0 jm0Var8 = new jm0(13, false);
                    jm0Var8.c = M02;
                    jm0Var8.i = a13;
                    arrayList.add(jm0Var8);
                    int i17 = this.i2;
                    jm0 jm0Var9 = new jm0(5, false);
                    jm0Var9.k = this.T1;
                    jm0Var9.i = i17;
                    arrayList.add(jm0Var9);
                    str2 = null;
                    arrayList.add(jm0.c(k96.M0(2131753549, null), false));
                }
                arrayList.add(jm0.f(k96.M0(2131753555, str2)));
                if (!d1()) {
                    arrayList.add(jm0.b(a1(), chat, false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(jm0.b(prepaidGiveaway.quantity, chat, false));
                } else {
                    arrayList.add(jm0.b(on0.h() * prepaidGiveaway.quantity, chat, false));
                }
                int size4 = arrayList5.size();
                int i18 = 0;
                while (i18 < size4) {
                    Object obj2 = arrayList5.get(i18);
                    i18++;
                    TLObject tLObject2 = (TLObject) obj2;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        arrayList.add(jm0.b(a1(), (TLRPC.Chat) tLObject2, true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int a14 = a1();
                        jm0 jm0Var10 = new jm0(9, false);
                        jm0Var10.d = (TLRPC.InputPeer) tLObject2;
                        jm0Var10.e = null;
                        jm0Var10.g = true;
                        jm0Var10.i = a14;
                        arrayList.add(jm0Var10);
                    }
                }
                if (arrayList5.size() < on0.g()) {
                    r10 = 0;
                    arrayList.add(new jm0(8, false));
                } else {
                    r10 = 0;
                }
                arrayList.add(jm0.c(k96.M0(2131753550, null), r10));
                arrayList.add(jm0.f(k96.M0(2131753533, null)));
                int i19 = dv7.w;
                arrayList.add(jm0.e(r10, this.e2, arrayList4, true));
                arrayList.add(jm0.e(1, this.e2, arrayList4, r10));
                str2 = null;
                arrayList.add(jm0.c(k96.M0(V ? 2131753548 : 2131753547, null), r10));
            }
            if (!d1()) {
                arrayList.add(jm0.f(k96.M0(2131753534, str2)));
                int i20 = this.d2;
                int i21 = pn0.w;
                ArrayList c = on0.c(i20 == 0 ? Z0() : arrayList3.size(), this.a2);
                int i22 = 0;
                while (i22 < c.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) c.get(i22);
                    int i23 = tL_premiumGiftCodeOption.months;
                    int i24 = this.d2;
                    int i25 = pn0.w;
                    int Z0 = i24 == 0 ? Z0() : arrayList3.size();
                    long j2 = tL_premiumGiftCodeOption.amount;
                    int i26 = this.g2;
                    String str3 = tL_premiumGiftCodeOption.currency;
                    boolean z5 = i22 != c.size() + (-1);
                    ArrayList arrayList7 = c;
                    int i27 = i22;
                    jm0 jm0Var11 = new jm0(12, i23 == i26);
                    jm0Var11.i = i23;
                    jm0Var11.j = Z0;
                    jm0Var11.h = j2;
                    jm0Var11.g = z5;
                    jm0Var11.c = str3;
                    jm0Var11.m = tL_premiumGiftCodeOption;
                    arrayList.add(jm0Var11);
                    i22 = i27 + 1;
                    c = arrayList7;
                }
            }
            if (!d1()) {
                b = 3;
                arrayList.add(jm0.c(gl.N2(k96.M0(2131753184, null), bkb.Wc, 0, new rn0(this, b), this.J0), true));
                i = this.c2;
                int i28 = pn0.w;
                if (i != b || this.d2 == 0) {
                    String M03 = k96.M0(2131753481, null);
                    boolean z6 = this.r2;
                    int i29 = scb.M;
                    jm0 jm0Var12 = new jm0(15, z6);
                    jm0Var12.c = M03;
                    jm0Var12.g = z6;
                    jm0Var12.l = (byte) 1;
                    arrayList.add(jm0Var12);
                    if (this.r2) {
                        z3 = false;
                        str = null;
                        arrayList.add(jm0.c(k96.M0(this.c2 == 3 ? 2131753234 : 2131753482, null), false));
                    } else {
                        int Z02 = d1() ? prepaidGiveaway.quantity : Z0();
                        z3 = false;
                        jm0 jm0Var13 = new jm0(16, false);
                        jm0Var13.i = Z02;
                        arrayList.add(jm0Var13);
                        String G = k96.G(this.g2, "BoldMonths", new Object[0]);
                        int i30 = this.c2;
                        String str4 = this.q2;
                        if (i30 == 3) {
                            boolean isEmpty = str4.isEmpty();
                            long j3 = this.k2;
                            if (isEmpty) {
                                arrayList.add(jm0.c(gl.S2(k96.G((int) j3, "BoostingStarsGiveawayAdditionPrizeCountHint", new Object[0])), false));
                            } else {
                                arrayList.add(jm0.c(gl.S2(k96.G((int) j3, "BoostingStarsGiveawayAdditionPrizeCountNameHint", Integer.valueOf(Z02), this.q2)), false));
                            }
                        } else if (str4.isEmpty()) {
                            arrayList.add(jm0.c(gl.S2(k96.G(Z02, "BoostingGiveawayAdditionPrizeCountHint", G)), false));
                        } else {
                            arrayList.add(jm0.c(gl.S2(k96.G(Z02, "BoostingGiveawayAdditionPrizeCountNameHint", this.q2, G)), false));
                        }
                        str = null;
                    }
                    arrayList.add(jm0.f(k96.M0(2131753535, str)));
                    long j4 = this.h2;
                    jm0 jm0Var14 = new jm0(10, z3);
                    jm0Var14.h = j4;
                    arrayList.add(jm0Var14);
                    if (this.c2 != 3) {
                        if (d1()) {
                            r102 = 0;
                            arrayList.add(jm0.c(k96.G(prepaidGiveaway.quantity, V ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", k96.G((int) this.k2, "BoostingStarsChooseRandomStars", new Object[0])), false));
                        } else {
                            r102 = 0;
                            arrayList.add(jm0.c(k96.G(Z0(), V ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", k96.G((int) this.k2, "BoostingStarsChooseRandomStars", new Object[0])), false));
                        }
                    } else {
                        r102 = 0;
                        r102 = 0;
                        if (d1()) {
                            arrayList.add(jm0.c(k96.G(prepaidGiveaway.quantity, V ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", new Object[0]), false));
                        } else {
                            arrayList.add(jm0.c(k96.G(Z0(), V ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", new Object[0]), false));
                        }
                    }
                    String M04 = k96.M0(2131753365, null);
                    jm0 jm0Var15 = new jm0(15, this.s2);
                    jm0Var15.c = M04;
                    jm0Var15.g = r102;
                    jm0Var15.l = r102;
                    arrayList.add(jm0Var15);
                    if (d1()) {
                        arrayList.add(jm0.c(k96.M0(2131753364, null), r102));
                    } else {
                        arrayList.add(jm0.c(gl.N2(k96.M0(2131753364, null).concat(this.c2 != 3 ? "\n\n".concat(k96.M0(2131753184, null)) : ""), bkb.Wc, 0, new rn0(this, (byte) 4), this.J0), true));
                    }
                }
                km0Var = this.b2;
                if (km0Var == null && z2) {
                    if (z) {
                        km0Var.E(arrayList2, arrayList);
                        return;
                    } else {
                        km0Var.f();
                        return;
                    }
                }
            }
        }
        b = 3;
        i = this.c2;
        int i282 = pn0.w;
        if (i != b) {
        }
        String M032 = k96.M0(2131753481, null);
        boolean z62 = this.r2;
        int i292 = scb.M;
        jm0 jm0Var122 = new jm0(15, z62);
        jm0Var122.c = M032;
        jm0Var122.g = z62;
        jm0Var122.l = (byte) 1;
        arrayList.add(jm0Var122);
        if (this.r2) {
        }
        arrayList.add(jm0.f(k96.M0(2131753535, str)));
        long j42 = this.h2;
        jm0 jm0Var142 = new jm0(10, z3);
        jm0Var142.h = j42;
        arrayList.add(jm0Var142);
        if (this.c2 != 3) {
        }
        String M042 = k96.M0(2131753365, null);
        jm0 jm0Var152 = new jm0(15, this.s2);
        jm0Var152.c = M042;
        jm0Var152.g = r102;
        jm0Var152.l = r102;
        arrayList.add(jm0Var152);
        if (d1()) {
        }
        km0Var = this.b2;
        if (km0Var == null) {
        }
    }
}
