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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ao0 extends ny0 implements fn7 {
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
    public final o8 l2;
    public qx6 m2;
    public int n2;
    public zm0 o2;
    public final TL_stories.PrepaidGiveaway p2;
    public String q2;
    public boolean r2;
    public boolean s2;
    public final rn0 t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao0(e eVar, long j, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(eVar, false);
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
        int i2 = ky7.w;
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
        X0();
        ((ViewGroup.MarginLayoutParams) this.o1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.o1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i4 = pn0.w;
            this.c2 = 3;
        }
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.n1.setItemAnimator(zb3Var);
        d79 d79Var = this.n1;
        int i5 = this.u0;
        d79Var.setPadding(i5, 0, i5, hl.L(68.0f));
        this.n1.setOnScrollListener(new zn0());
        this.n1.setOnItemClickListener(new l0(this, eVar, (byte) 1));
        TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(-j));
        this.W1 = M0;
        km0 km0Var = this.b2;
        ArrayList arrayList = this.S1;
        d79 d79Var2 = this.n1;
        sn0 sn0Var = new sn0(this);
        sn0 sn0Var2 = new sn0(this);
        sn0 sn0Var3 = new sn0(this);
        km0Var.e = arrayList;
        km0Var.w = M0;
        km0Var.f = d79Var2;
        km0Var.h = sn0Var;
        km0Var.n = sn0Var2;
        km0Var.s = sn0Var3;
        g1(false, false);
        o8 o8Var = new o8(getContext(), this.J0);
        this.l2 = o8Var;
        o8Var.setOnClickListener(new yn0(this, prepaidGiveaway, j, eVar));
        f1(false);
        this.b.addView(o8Var, tre.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        on0.l(this.a, M0, new tn0(this, b));
        jn7.f(this.a).b(this, jn7.z3);
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        km0 km0Var = new km0(this.J0);
        this.b2 = km0Var;
        return km0Var;
    }

    @Override // ny0
    public final CharSequence K0() {
        int i = this.d2;
        int i2 = pn0.w;
        return i == 1 ? ob6.M0(2131749469, null) : ob6.a0("BoostingStartGiveaway", null, 2131753186, new Object[0]);
    }

    @Override // ny0
    public final void N0(Canvas canvas, int i) {
        this.n2 = i;
    }

    public final ArrayList Z0(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption c1 = c1(j);
        if (c1 != null) {
            for (int i = 0; i < c1.winners.size(); i++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = c1.winners.get(i);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int a1() {
        int i = this.c2;
        int i2 = pn0.w;
        if (i == 2) {
            return ((Integer) this.T1.get(this.i2)).intValue();
        }
        List d1 = d1();
        int i3 = this.j2;
        if (i3 < 0 || i3 >= d1.size()) {
            this.j2 = 0;
        }
        if (this.j2 >= d1.size()) {
            return 0;
        }
        return ((Integer) d1.get(this.j2)).intValue();
    }

    public final int b1() {
        int a1;
        int h;
        int i = this.c2;
        int i2 = pn0.w;
        if (i == 2) {
            a1 = ((Integer) this.T1.get(this.i2)).intValue();
            h = on0.h();
        } else {
            TL_stars.TL_starsGiveawayOption c1 = c1(this.k2);
            if (c1 != null) {
                return c1.yearly_boosts;
            }
            a1 = a1();
            h = on0.h();
        }
        return h * a1;
    }

    public final TL_stars.TL_starsGiveawayOption c1(long j) {
        ArrayList s = jxa.v(this.a, false).s();
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

    public final List d1() {
        int i = this.c2;
        int i2 = pn0.w;
        if (i == 2) {
            return this.T1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption c1 = c1(this.k2);
        if (c1 != null) {
            for (int i3 = 0; i3 < c1.winners.size(); i3++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = c1.winners.get(i3);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        d79 d79Var;
        if (i == jn7.z3 && (d79Var = this.n1) != null && d79Var.H) {
            g1(true, true);
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        zm0 zm0Var = this.o2;
        if (zm0Var != null) {
            zm0Var.run();
        }
        jn7.f(this.a).n(this, jn7.z3);
    }

    public final boolean e1() {
        return this.p2 != null;
    }

    public final void f1(boolean z) {
        boolean e1 = e1();
        o8 o8Var = this.l2;
        if (e1) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.p2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                o8Var.a(prepaidGiveaway.quantity, z);
                return;
            } else {
                o8Var.a(on0.h() * prepaidGiveaway.quantity, z);
                return;
            }
        }
        int i = this.d2;
        int i2 = pn0.w;
        if (i == 0) {
            o8Var.a(b1(), z);
            return;
        }
        ArrayList arrayList = this.Y1;
        int h = on0.h() * arrayList.size();
        boolean z2 = arrayList.size() > 0;
        o8Var.e = true;
        c51 c51Var = o8Var.a;
        c51Var.k();
        c51Var.setShowZero(true);
        c51Var.setEnabled(z2);
        c51Var.c(h, z);
        c51Var.i(ob6.M0(2131749469, null), z, true);
        yob.h(aob.h5, o8Var.c, o8Var.b);
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
    public final void g1(boolean z, boolean z2) {
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
        boolean e1 = e1();
        ArrayList arrayList3 = this.Y1;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.p2;
        if (e1) {
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
        boolean V = xc2.V(chat);
        int i6 = this.c2;
        ArrayList arrayList4 = this.Z1;
        ArrayList arrayList5 = this.X1;
        if (i6 == 3) {
            if (!e1()) {
                String M0 = ob6.M0(2131753193, null);
                int b1 = b1();
                jm0 jm0Var5 = new jm0(13, false);
                jm0Var5.c = M0;
                jm0Var5.i = b1;
                arrayList.add(jm0Var5);
                ArrayList s = jxa.v(this.a, false).s();
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
                    TL_stars.TL_starsGiveawayOption c1 = c1(((Long) arrayList6.get(i9)).longValue());
                    if (!c1.missingStorePrice) {
                        if (this.k2 == 0 && c1.isDefault) {
                            this.k2 = c1.stars;
                        }
                        if (!c1.extended || this.f2) {
                            int i10 = i8 + 1;
                            int i11 = this.f2 ? i9 : i9 + 2;
                            long j = c1.stars;
                            ArrayList Z0 = Z0(j);
                            if (Z0.isEmpty()) {
                                float f = j;
                                i2 = i9;
                                i3 = i10;
                                ArrayList Z02 = Z0(this.k2);
                                int i12 = this.j2;
                                if (i12 < 0 || i12 >= Z02.size()) {
                                    this.j2 = 0;
                                }
                                longValue = Math.round(f / (this.j2 >= Z02.size() ? 1L : ((Long) Z02.get(this.j2)).longValue()));
                            } else {
                                i2 = i9;
                                i3 = i10;
                                longValue = ((Long) Z0.get(Utilities.j(this.j2, Z0.size() - 1, 0))).longValue();
                            }
                            arrayList.add(jm0.d(c1, i11, longValue, this.k2 == c1.stars, true));
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
                jm0Var5.i = b1();
                arrayList.add(jm0.c(ob6.M0(2131753192, null), false));
                List d1 = d1();
                int i13 = this.j2;
                if (i13 < 0 || i13 >= d1.size()) {
                    this.j2 = 0;
                }
                if (d1.size() > 1) {
                    arrayList.add(jm0.f(ob6.M0(2131753188, null)));
                    List d12 = d1();
                    int i14 = this.j2;
                    jm0 jm0Var6 = new jm0(5, false);
                    jm0Var6.k = d12;
                    jm0Var6.i = i14;
                    arrayList.add(jm0Var6);
                    arrayList.add(jm0.c(ob6.M0(2131753187, null), false));
                }
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                this.k2 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
            }
            arrayList.add(jm0.f(ob6.M0(2131753551, null)));
            if (!e1()) {
                arrayList.add(jm0.b(b1(), chat, false));
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
                    arrayList.add(jm0.b(b1(), (TLRPC.Chat) tLObject, true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int b12 = b1();
                    jm0 jm0Var7 = new jm0(9, false);
                    jm0Var7.d = (TLRPC.InputPeer) tLObject;
                    jm0Var7.e = null;
                    jm0Var7.g = true;
                    jm0Var7.i = b12;
                    arrayList.add(jm0Var7);
                }
            }
            if (arrayList5.size() < on0.g()) {
                r103 = 0;
                arrayList.add(new jm0(8, false));
            } else {
                r103 = 0;
            }
            arrayList.add(jm0.c(ob6.M0(2131753546, null), r103));
            arrayList.add(jm0.f(ob6.M0(2131753529, null)));
            int i16 = ky7.w;
            arrayList.add(jm0.e(r103, this.e2, arrayList4, true));
            arrayList.add(jm0.e(1, this.e2, arrayList4, r103));
            arrayList.add(jm0.c(ob6.M0(V ? 2131753544 : 2131753543, null), r103));
        } else {
            String str2 = null;
            if (this.d2 == 0) {
                if (!e1()) {
                    String M02 = ob6.M0(2131753316, null);
                    int b13 = b1();
                    jm0 jm0Var8 = new jm0(13, false);
                    jm0Var8.c = M02;
                    jm0Var8.i = b13;
                    arrayList.add(jm0Var8);
                    int i17 = this.i2;
                    jm0 jm0Var9 = new jm0(5, false);
                    jm0Var9.k = this.T1;
                    jm0Var9.i = i17;
                    arrayList.add(jm0Var9);
                    str2 = null;
                    arrayList.add(jm0.c(ob6.M0(2131753545, null), false));
                }
                arrayList.add(jm0.f(ob6.M0(2131753551, str2)));
                if (!e1()) {
                    arrayList.add(jm0.b(b1(), chat, false));
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
                        arrayList.add(jm0.b(b1(), (TLRPC.Chat) tLObject2, true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int b14 = b1();
                        jm0 jm0Var10 = new jm0(9, false);
                        jm0Var10.d = (TLRPC.InputPeer) tLObject2;
                        jm0Var10.e = null;
                        jm0Var10.g = true;
                        jm0Var10.i = b14;
                        arrayList.add(jm0Var10);
                    }
                }
                if (arrayList5.size() < on0.g()) {
                    r10 = 0;
                    arrayList.add(new jm0(8, false));
                } else {
                    r10 = 0;
                }
                arrayList.add(jm0.c(ob6.M0(2131753546, null), r10));
                arrayList.add(jm0.f(ob6.M0(2131753529, null)));
                int i19 = ky7.w;
                arrayList.add(jm0.e(r10, this.e2, arrayList4, true));
                arrayList.add(jm0.e(1, this.e2, arrayList4, r10));
                str2 = null;
                arrayList.add(jm0.c(ob6.M0(V ? 2131753544 : 2131753543, null), r10));
            }
            if (!e1()) {
                arrayList.add(jm0.f(ob6.M0(2131753530, str2)));
                int i20 = this.d2;
                int i21 = pn0.w;
                ArrayList c = on0.c(i20 == 0 ? a1() : arrayList3.size(), this.a2);
                int i22 = 0;
                while (i22 < c.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) c.get(i22);
                    int i23 = tL_premiumGiftCodeOption.months;
                    int i24 = this.d2;
                    int i25 = pn0.w;
                    int a1 = i24 == 0 ? a1() : arrayList3.size();
                    long j2 = tL_premiumGiftCodeOption.amount;
                    int i26 = this.g2;
                    String str3 = tL_premiumGiftCodeOption.currency;
                    boolean z5 = i22 != c.size() + (-1);
                    ArrayList arrayList7 = c;
                    int i27 = i22;
                    jm0 jm0Var11 = new jm0(12, i23 == i26);
                    jm0Var11.i = i23;
                    jm0Var11.j = a1;
                    jm0Var11.h = j2;
                    jm0Var11.g = z5;
                    jm0Var11.c = str3;
                    jm0Var11.m = tL_premiumGiftCodeOption;
                    arrayList.add(jm0Var11);
                    i22 = i27 + 1;
                    c = arrayList7;
                }
            }
            if (!e1()) {
                b = 3;
                arrayList.add(jm0.c(hl.N2(ob6.M0(2131753180, null), aob.Xc, 0, new rn0(this, b), this.J0), true));
                i = this.c2;
                int i28 = pn0.w;
                if (i != b || this.d2 == 0) {
                    String M03 = ob6.M0(2131753477, null);
                    boolean z6 = this.r2;
                    int i29 = ogb.M;
                    jm0 jm0Var12 = new jm0(15, z6);
                    jm0Var12.c = M03;
                    jm0Var12.g = z6;
                    jm0Var12.l = (byte) 1;
                    arrayList.add(jm0Var12);
                    if (this.r2) {
                        z3 = false;
                        str = null;
                        arrayList.add(jm0.c(ob6.M0(this.c2 == 3 ? 2131753230 : 2131753478, null), false));
                    } else {
                        int a12 = e1() ? prepaidGiveaway.quantity : a1();
                        z3 = false;
                        jm0 jm0Var13 = new jm0(16, false);
                        jm0Var13.i = a12;
                        arrayList.add(jm0Var13);
                        String G = ob6.G(this.g2, "BoldMonths", new Object[0]);
                        int i30 = this.c2;
                        String str4 = this.q2;
                        if (i30 == 3) {
                            boolean isEmpty = str4.isEmpty();
                            long j3 = this.k2;
                            if (isEmpty) {
                                arrayList.add(jm0.c(hl.S2(ob6.G((int) j3, "BoostingStarsGiveawayAdditionPrizeCountHint", new Object[0])), false));
                            } else {
                                arrayList.add(jm0.c(hl.S2(ob6.G((int) j3, "BoostingStarsGiveawayAdditionPrizeCountNameHint", Integer.valueOf(a12), this.q2)), false));
                            }
                        } else if (str4.isEmpty()) {
                            arrayList.add(jm0.c(hl.S2(ob6.G(a12, "BoostingGiveawayAdditionPrizeCountHint", G)), false));
                        } else {
                            arrayList.add(jm0.c(hl.S2(ob6.G(a12, "BoostingGiveawayAdditionPrizeCountNameHint", this.q2, G)), false));
                        }
                        str = null;
                    }
                    arrayList.add(jm0.f(ob6.M0(2131753531, str)));
                    long j4 = this.h2;
                    jm0 jm0Var14 = new jm0(10, z3);
                    jm0Var14.h = j4;
                    arrayList.add(jm0Var14);
                    if (this.c2 != 3) {
                        if (e1()) {
                            r102 = 0;
                            arrayList.add(jm0.c(ob6.G(prepaidGiveaway.quantity, V ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", ob6.G((int) this.k2, "BoostingStarsChooseRandomStars", new Object[0])), false));
                        } else {
                            r102 = 0;
                            arrayList.add(jm0.c(ob6.G(a1(), V ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", ob6.G((int) this.k2, "BoostingStarsChooseRandomStars", new Object[0])), false));
                        }
                    } else {
                        r102 = 0;
                        r102 = 0;
                        if (e1()) {
                            arrayList.add(jm0.c(ob6.G(prepaidGiveaway.quantity, V ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", new Object[0]), false));
                        } else {
                            arrayList.add(jm0.c(ob6.G(a1(), V ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", new Object[0]), false));
                        }
                    }
                    String M04 = ob6.M0(2131753361, null);
                    jm0 jm0Var15 = new jm0(15, this.s2);
                    jm0Var15.c = M04;
                    jm0Var15.g = r102;
                    jm0Var15.l = r102;
                    arrayList.add(jm0Var15);
                    if (e1()) {
                        arrayList.add(jm0.c(ob6.M0(2131753360, null), r102));
                    } else {
                        arrayList.add(jm0.c(hl.N2(ob6.M0(2131753360, null).concat(this.c2 != 3 ? "\n\n".concat(ob6.M0(2131753180, null)) : ""), aob.Xc, 0, new rn0(this, (byte) 4), this.J0), true));
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
        String M032 = ob6.M0(2131753477, null);
        boolean z62 = this.r2;
        int i292 = ogb.M;
        jm0 jm0Var122 = new jm0(15, z62);
        jm0Var122.c = M032;
        jm0Var122.g = z62;
        jm0Var122.l = (byte) 1;
        arrayList.add(jm0Var122);
        if (this.r2) {
        }
        arrayList.add(jm0.f(ob6.M0(2131753531, str)));
        long j42 = this.h2;
        jm0 jm0Var142 = new jm0(10, z3);
        jm0Var142.h = j42;
        arrayList.add(jm0Var142);
        if (this.c2 != 3) {
        }
        String M042 = ob6.M0(2131753361, null);
        jm0 jm0Var152 = new jm0(15, this.s2);
        jm0Var152.c = M042;
        jm0Var152.g = r102;
        jm0Var152.l = r102;
        arrayList.add(jm0Var152);
        if (e1()) {
        }
        km0Var = this.b2;
        if (km0Var == null) {
        }
    }
}
