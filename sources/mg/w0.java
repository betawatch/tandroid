package mg;

import android.graphics.Canvas;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import rh.e6;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w0 extends ha implements us {
    public final ArrayList P1;
    public final List Q1;
    public final List R1;
    public final List S1;
    public final TLRPC.Chat T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public ng.b Y1;
    public int Z1;
    public int a2;
    public int b2;
    public boolean c2;
    public int d2;
    public long e2;
    public int f2;
    public int g2;
    public long h2;
    public final og.a i2;
    public m4.c j2;
    public int k2;
    public q l2;
    public final TL_stories.PrepaidGiveaway m2;
    public String n2;
    public boolean o2;
    public boolean p2;
    public final l0 q2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(k2 k2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(k2Var, false);
        int i10 = 5;
        this.P1 = new ArrayList();
        this.Q1 = k0.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.R1 = k0.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.S1 = Arrays.asList(750, 10000, 50000);
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        int i11 = og.e.w;
        this.Z1 = 2;
        this.a2 = 0;
        int i12 = og.w.w;
        this.b2 = 0;
        this.d2 = 12;
        long time = new Date().getTime() + 259200000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i13 = calendar.get(12);
        while (i13 % 5 != 0) {
            i13++;
        }
        calendar.set(12, i13);
        this.e2 = calendar.getTimeInMillis();
        this.f2 = 2;
        this.g2 = 2;
        this.n2 = "";
        this.p2 = true;
        this.q2 = new l0(this, 0);
        this.m2 = prepaidGiveaway;
        this.r1 = 0.15f;
        this.u0 = false;
        this.v0 = false;
        this.T0 = false;
        this.t0 = 0;
        b1();
        ((ViewGroup.MarginLayoutParams) this.l1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.l1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i14 = og.e.w;
            this.Z1 = 3;
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(gr.h);
        jVar.C = false;
        jVar.m = false;
        this.k1.setItemAnimator(jVar);
        tk0 tk0Var = this.k1;
        int i15 = this.t0;
        tk0Var.setPadding(i15, 0, i15, org.telegram.messenger.i0.L(68.0f));
        this.k1.setOnScrollListener(new v0());
        this.k1.setOnItemClickListener(new q0(0, this, k2Var));
        TLRPC.Chat L0 = vp.r1(this.a).L0(Long.valueOf(-j10));
        this.T1 = L0;
        ng.b bVar = this.Y1;
        ArrayList arrayList = this.P1;
        tk0 tk0Var2 = this.k1;
        m0 m0Var = new m0(this);
        m0 m0Var2 = new m0(this);
        m0 m0Var3 = new m0(this);
        bVar.e = arrayList;
        bVar.w = L0;
        bVar.f = tk0Var2;
        bVar.h = m0Var;
        bVar.n = m0Var2;
        bVar.s = m0Var3;
        k1(false, false);
        og.a aVar = new og.a(getContext(), this.I0);
        this.i2 = aVar;
        aVar.setOnClickListener(new u0(this, prepaidGiveaway, j10, k2Var));
        j1(false);
        this.b.addView(aVar, b6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        k0.j(this.a, L0, new o0(this, i10));
        zs.f(this.a).c(this, zs.x3);
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        ng.b bVar = new ng.b(this.I0);
        this.Y1 = bVar;
        return bVar;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        int i10 = this.a2;
        int i11 = og.e.w;
        return i10 == 1 ? cd.L0(2131749689, null) : cd.a0("BoostingStartGiveaway", null, 2131753193, new Object[0]);
    }

    @Override // org.telegram.ui.Components.ha
    public final void R0(Canvas canvas, int i10) {
        this.k2 = i10;
    }

    public final ArrayList d1(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption g12 = g1(j10);
        if (g12 != null) {
            for (int i10 = 0; i10 < g12.winners.size(); i10++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = g12.winners.get(i10);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        tk0 tk0Var;
        if (i10 == zs.x3 && (tk0Var = this.k1) != null && tk0Var.G) {
            k1(true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        q qVar = this.l2;
        if (qVar != null) {
            qVar.run();
        }
        zs.f(this.a).n(this, zs.x3);
    }

    public final int e1() {
        int i10 = this.Z1;
        int i11 = og.e.w;
        if (i10 == 2) {
            return ((Integer) this.Q1.get(this.f2)).intValue();
        }
        List h12 = h1();
        int i12 = this.g2;
        if (i12 < 0 || i12 >= h12.size()) {
            this.g2 = 0;
        }
        if (this.g2 >= h12.size()) {
            return 0;
        }
        return ((Integer) h12.get(this.g2)).intValue();
    }

    public final int f1() {
        int e12;
        int g10;
        int i10 = this.Z1;
        int i11 = og.e.w;
        if (i10 == 2) {
            e12 = ((Integer) this.Q1.get(this.f2)).intValue();
            g10 = k0.g();
        } else {
            TL_stars.TL_starsGiveawayOption g12 = g1(this.h2);
            if (g12 != null) {
                return g12.yearly_boosts;
            }
            e12 = e1();
            g10 = k0.g();
        }
        return g10 * e12;
    }

    public final TL_stars.TL_starsGiveawayOption g1(long j10) {
        ArrayList v = e6.y(this.a, false).v();
        if (v == null) {
            return null;
        }
        for (int i10 = 0; i10 < v.size(); i10++) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i10);
            if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j10) {
                return tL_starsGiveawayOption;
            }
        }
        return null;
    }

    public final List h1() {
        int i10 = this.Z1;
        int i11 = og.e.w;
        if (i10 == 2) {
            return this.Q1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption g12 = g1(this.h2);
        if (g12 != null) {
            for (int i12 = 0; i12 < g12.winners.size(); i12++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = g12.winners.get(i12);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean i1() {
        return this.m2 != null;
    }

    public final void j1(boolean z10) {
        boolean i12 = i1();
        og.a aVar = this.i2;
        if (i12) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.m2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            } else {
                aVar.a(k0.g() * prepaidGiveaway.quantity, z10);
                return;
            }
        }
        int i10 = this.a2;
        int i11 = og.e.w;
        if (i10 == 0) {
            aVar.a(f1(), z10);
            return;
        }
        ArrayList arrayList = this.V1;
        int g10 = k0.g() * arrayList.size();
        boolean z11 = arrayList.size() > 0;
        aVar.e = true;
        vh.d dVar = aVar.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.c(g10, z10);
        dVar.i(cd.L0(2131749689, null), z10, true);
        a7.i(t6.h5, aVar.b, aVar.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05d3  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k1(boolean z10, boolean z11) {
        int i10;
        ?? r10;
        int i11;
        boolean z12;
        String str;
        ?? r102;
        ng.b bVar;
        ?? r103;
        int i12;
        int i13;
        long longValue;
        ArrayList arrayList = this.P1;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i14 = this.Z1;
        int i15 = og.e.w;
        boolean z13 = i14 == 3;
        ng.a aVar = new ng.a(0, false);
        aVar.g = z13;
        arrayList.add(aVar);
        boolean i16 = i1();
        ArrayList arrayList3 = this.V1;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.m2;
        if (i16) {
            ng.a aVar2 = new ng.a(14, false);
            aVar2.f = prepaidGiveaway;
            arrayList.add(aVar2);
        } else {
            int size = arrayList3.size();
            ng.a aVar3 = new ng.a(2, this.Z1 == 2);
            aVar3.l = 2;
            aVar3.i = size;
            aVar3.f = null;
            arrayList.add(aVar3);
            int size2 = arrayList3.size();
            ng.a aVar4 = new ng.a(2, this.Z1 == 3);
            aVar4.l = 3;
            aVar4.i = size2;
            aVar4.f = null;
            arrayList.add(aVar4);
        }
        arrayList.add(new ng.a(4, false));
        TLRPC.Chat chat = this.T1;
        boolean V = w3.V(chat);
        int i17 = this.Z1;
        ArrayList arrayList4 = this.W1;
        ArrayList arrayList5 = this.U1;
        if (i17 == 3) {
            if (!i1()) {
                String L0 = cd.L0(2131753200, null);
                int f12 = f1();
                ng.a aVar5 = new ng.a(13, false);
                aVar5.c = L0;
                aVar5.i = f12;
                arrayList.add(aVar5);
                ArrayList v = e6.y(this.a, false).v();
                ArrayList arrayList6 = new ArrayList();
                if (v != null) {
                    for (int i18 = 0; i18 < v.size(); i18++) {
                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i18);
                        if (tL_starsGiveawayOption != null && !arrayList6.contains(Long.valueOf(tL_starsGiveawayOption.stars))) {
                            arrayList6.add(Long.valueOf(tL_starsGiveawayOption.stars));
                        }
                    }
                }
                int i19 = 0;
                for (int i20 = 0; i20 < arrayList6.size(); i20 = i12 + 1) {
                    TL_stars.TL_starsGiveawayOption g12 = g1(((Long) arrayList6.get(i20)).longValue());
                    if (!g12.missingStorePrice) {
                        if (this.h2 == 0 && g12.isDefault) {
                            this.h2 = g12.stars;
                        }
                        if (!g12.extended || this.c2) {
                            int i21 = i19 + 1;
                            int i22 = this.c2 ? i20 : i20 + 2;
                            long j10 = g12.stars;
                            ArrayList d12 = d1(j10);
                            if (d12.isEmpty()) {
                                float f7 = j10;
                                i12 = i20;
                                i13 = i21;
                                ArrayList d13 = d1(this.h2);
                                int i23 = this.g2;
                                if (i23 < 0 || i23 >= d13.size()) {
                                    this.g2 = 0;
                                }
                                longValue = Math.round(f7 / (this.g2 >= d13.size() ? 1L : ((Long) d13.get(this.g2)).longValue()));
                            } else {
                                i12 = i20;
                                i13 = i21;
                                longValue = ((Long) d12.get(Utilities.j(this.g2, d12.size() - 1, 0))).longValue();
                            }
                            arrayList.add(ng.a.d(g12, i22, longValue, this.h2 == g12.stars, true));
                            i19 = i13;
                        }
                    }
                    i12 = i20;
                }
                if (!this.c2 && i19 < arrayList6.size()) {
                    arrayList.add(new ng.a(18, false));
                }
                if (i19 <= 0) {
                    arrayList.add(ng.a.d(null, 0, 1L, false, true));
                    arrayList.add(ng.a.d(null, 1, 1L, false, true));
                    arrayList.add(ng.a.d(null, 2, 1L, false, false));
                }
                aVar5.i = f1();
                arrayList.add(ng.a.c(cd.L0(2131753199, null), false));
                List h12 = h1();
                int i24 = this.g2;
                if (i24 < 0 || i24 >= h12.size()) {
                    this.g2 = 0;
                }
                if (h12.size() > 1) {
                    arrayList.add(ng.a.f(cd.L0(2131753195, null)));
                    List h13 = h1();
                    int i25 = this.g2;
                    ng.a aVar6 = new ng.a(5, false);
                    aVar6.k = h13;
                    aVar6.i = i25;
                    arrayList.add(aVar6);
                    arrayList.add(ng.a.c(cd.L0(2131753194, null), false));
                }
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                this.h2 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
            }
            arrayList.add(ng.a.f(cd.L0(2131753558, null)));
            if (!i1()) {
                arrayList.add(ng.a.b(f1(), chat, false));
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                arrayList.add(ng.a.b(prepaidGiveaway.quantity, chat, false));
            } else {
                arrayList.add(ng.a.b(k0.g() * prepaidGiveaway.quantity, chat, false));
            }
            int size3 = arrayList5.size();
            int i26 = 0;
            while (i26 < size3) {
                Object obj = arrayList5.get(i26);
                i26++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.Chat) {
                    arrayList.add(ng.a.b(f1(), (TLRPC.Chat) tLObject, true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int f13 = f1();
                    ng.a aVar7 = new ng.a(9, false);
                    aVar7.d = (TLRPC.InputPeer) tLObject;
                    aVar7.e = null;
                    aVar7.g = true;
                    aVar7.i = f13;
                    arrayList.add(aVar7);
                }
            }
            if (arrayList5.size() < k0.f()) {
                r103 = 0;
                arrayList.add(new ng.a(8, false));
            } else {
                r103 = 0;
            }
            arrayList.add(ng.a.c(cd.L0(2131753553, null), r103));
            arrayList.add(ng.a.f(cd.L0(2131753536, null)));
            int i27 = og.w.w;
            arrayList.add(ng.a.e(r103, this.b2, true, arrayList4));
            arrayList.add(ng.a.e(1, this.b2, r103, arrayList4));
            arrayList.add(ng.a.c(cd.L0(V ? 2131753551 : 2131753550, null), r103));
        } else {
            String str2 = null;
            if (this.a2 == 0) {
                if (!i1()) {
                    String L02 = cd.L0(2131753323, null);
                    int f14 = f1();
                    ng.a aVar8 = new ng.a(13, false);
                    aVar8.c = L02;
                    aVar8.i = f14;
                    arrayList.add(aVar8);
                    int i28 = this.f2;
                    ng.a aVar9 = new ng.a(5, false);
                    aVar9.k = this.Q1;
                    aVar9.i = i28;
                    arrayList.add(aVar9);
                    str2 = null;
                    arrayList.add(ng.a.c(cd.L0(2131753552, null), false));
                }
                arrayList.add(ng.a.f(cd.L0(2131753558, str2)));
                if (!i1()) {
                    arrayList.add(ng.a.b(f1(), chat, false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(ng.a.b(prepaidGiveaway.quantity, chat, false));
                } else {
                    arrayList.add(ng.a.b(k0.g() * prepaidGiveaway.quantity, chat, false));
                }
                int size4 = arrayList5.size();
                int i29 = 0;
                while (i29 < size4) {
                    Object obj2 = arrayList5.get(i29);
                    i29++;
                    TLObject tLObject2 = (TLObject) obj2;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        arrayList.add(ng.a.b(f1(), (TLRPC.Chat) tLObject2, true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int f15 = f1();
                        ng.a aVar10 = new ng.a(9, false);
                        aVar10.d = (TLRPC.InputPeer) tLObject2;
                        aVar10.e = null;
                        aVar10.g = true;
                        aVar10.i = f15;
                        arrayList.add(aVar10);
                    }
                }
                if (arrayList5.size() < k0.f()) {
                    r10 = 0;
                    arrayList.add(new ng.a(8, false));
                } else {
                    r10 = 0;
                }
                arrayList.add(ng.a.c(cd.L0(2131753553, null), r10));
                arrayList.add(ng.a.f(cd.L0(2131753536, null)));
                int i30 = og.w.w;
                arrayList.add(ng.a.e(r10, this.b2, true, arrayList4));
                arrayList.add(ng.a.e(1, this.b2, r10, arrayList4));
                str2 = null;
                arrayList.add(ng.a.c(cd.L0(V ? 2131753551 : 2131753550, null), r10));
            }
            if (!i1()) {
                arrayList.add(ng.a.f(cd.L0(2131753537, str2)));
                int i31 = this.a2;
                int i32 = og.e.w;
                ArrayList b10 = k0.b(i31 == 0 ? e1() : arrayList3.size(), this.X1);
                int i33 = 0;
                while (i33 < b10.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i33);
                    int i34 = tL_premiumGiftCodeOption.months;
                    int i35 = this.a2;
                    int i36 = og.e.w;
                    int e12 = i35 == 0 ? e1() : arrayList3.size();
                    long j11 = tL_premiumGiftCodeOption.amount;
                    int i37 = this.d2;
                    String str3 = tL_premiumGiftCodeOption.currency;
                    boolean z14 = i33 != b10.size() + (-1);
                    ArrayList arrayList7 = b10;
                    int i38 = i33;
                    ng.a aVar11 = new ng.a(12, i34 == i37);
                    aVar11.i = i34;
                    aVar11.j = e12;
                    aVar11.h = j11;
                    aVar11.g = z14;
                    aVar11.c = str3;
                    aVar11.m = tL_premiumGiftCodeOption;
                    arrayList.add(aVar11);
                    i33 = i38 + 1;
                    b10 = arrayList7;
                }
            }
            if (!i1()) {
                i10 = 3;
                arrayList.add(ng.a.c(org.telegram.messenger.i0.R2(cd.L0(2131753187, null), t6.Uc, 0, new l0(this, i10), this.I0), true));
                i11 = this.Z1;
                int i39 = og.e.w;
                if (i11 != i10 || this.a2 == 0) {
                    String L03 = cd.L0(2131753484, null);
                    boolean z15 = this.o2;
                    int i40 = og.a0.L;
                    ng.a aVar12 = new ng.a(15, z15);
                    aVar12.c = L03;
                    aVar12.g = z15;
                    aVar12.l = 1;
                    arrayList.add(aVar12);
                    if (this.o2) {
                        z12 = false;
                        str = null;
                        arrayList.add(ng.a.c(cd.L0(this.Z1 == 3 ? 2131753237 : 2131753485, null), false));
                    } else {
                        int e13 = i1() ? prepaidGiveaway.quantity : e1();
                        z12 = false;
                        ng.a aVar13 = new ng.a(16, false);
                        aVar13.i = e13;
                        arrayList.add(aVar13);
                        String G = cd.G(this.d2, "BoldMonths", new Object[0]);
                        if (this.Z1 == 3) {
                            if (this.n2.isEmpty()) {
                                arrayList.add(ng.a.c(org.telegram.messenger.i0.W2(cd.G((int) this.h2, "BoostingStarsGiveawayAdditionPrizeCountHint", new Object[0])), false));
                            } else {
                                arrayList.add(ng.a.c(org.telegram.messenger.i0.W2(cd.G((int) this.h2, "BoostingStarsGiveawayAdditionPrizeCountNameHint", Integer.valueOf(e13), this.n2)), false));
                            }
                        } else if (this.n2.isEmpty()) {
                            arrayList.add(ng.a.c(org.telegram.messenger.i0.W2(cd.G(e13, "BoostingGiveawayAdditionPrizeCountHint", G)), false));
                        } else {
                            arrayList.add(ng.a.c(org.telegram.messenger.i0.W2(cd.G(e13, "BoostingGiveawayAdditionPrizeCountNameHint", this.n2, G)), false));
                        }
                        str = null;
                    }
                    arrayList.add(ng.a.f(cd.L0(2131753538, str)));
                    long j12 = this.e2;
                    ng.a aVar14 = new ng.a(10, z12);
                    aVar14.h = j12;
                    arrayList.add(aVar14);
                    if (this.Z1 != 3) {
                        if (i1()) {
                            r102 = 0;
                            arrayList.add(ng.a.c(cd.G(prepaidGiveaway.quantity, V ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", cd.G((int) this.h2, "BoostingStarsChooseRandomStars", new Object[0])), false));
                        } else {
                            r102 = 0;
                            arrayList.add(ng.a.c(cd.G(e1(), V ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", cd.G((int) this.h2, "BoostingStarsChooseRandomStars", new Object[0])), false));
                        }
                    } else {
                        r102 = 0;
                        r102 = 0;
                        if (i1()) {
                            arrayList.add(ng.a.c(cd.G(prepaidGiveaway.quantity, V ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", new Object[0]), false));
                        } else {
                            arrayList.add(ng.a.c(cd.G(e1(), V ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", new Object[0]), false));
                        }
                    }
                    String L04 = cd.L0(2131753368, null);
                    ng.a aVar15 = new ng.a(15, this.p2);
                    aVar15.c = L04;
                    aVar15.g = r102;
                    aVar15.l = r102;
                    arrayList.add(aVar15);
                    if (i1()) {
                        arrayList.add(ng.a.c(cd.L0(2131753367, null), r102));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(cd.L0(2131753367, null));
                        sb2.append(this.Z1 != 3 ? a1.g.m(null, 2131753187, new StringBuilder("\n\n")) : "");
                        arrayList.add(ng.a.c(org.telegram.messenger.i0.R2(sb2.toString(), t6.Uc, 0, new l0(this, 4), this.I0), true));
                    }
                }
                bVar = this.Y1;
                if (bVar != null && z11) {
                    if (z10) {
                        bVar.f();
                        return;
                    } else {
                        bVar.E(arrayList2, arrayList);
                        return;
                    }
                }
                return;
            }
        }
        i10 = 3;
        i11 = this.Z1;
        int i392 = og.e.w;
        if (i11 != i10) {
        }
        String L032 = cd.L0(2131753484, null);
        boolean z152 = this.o2;
        int i402 = og.a0.L;
        ng.a aVar122 = new ng.a(15, z152);
        aVar122.c = L032;
        aVar122.g = z152;
        aVar122.l = 1;
        arrayList.add(aVar122);
        if (this.o2) {
        }
        arrayList.add(ng.a.f(cd.L0(2131753538, str)));
        long j122 = this.e2;
        ng.a aVar142 = new ng.a(10, z12);
        aVar142.h = j122;
        arrayList.add(aVar142);
        if (this.Z1 != 3) {
        }
        String L042 = cd.L0(2131753368, null);
        ng.a aVar152 = new ng.a(15, this.p2);
        aVar152.c = L042;
        aVar152.g = r102;
        aVar152.l = r102;
        arrayList.add(aVar152);
        if (i1()) {
        }
        bVar = this.Y1;
        if (bVar != null) {
            if (z10) {
            }
        }
    }
}
