package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class fn0 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn0 b;

    public /* synthetic */ fn0(gn0 gn0Var, int i10) {
        this.a = i10;
        this.b = gn0Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10;
        rn0 rn0Var;
        nn0 nn0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                gn0 gn0Var = this.b;
                nn0 nn0Var2 = gn0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) nn0Var2.M.get(num);
                nn0Var2.K = starGift;
                tn0 tn0Var = nn0Var2.p0;
                if (starGift == null) {
                    ph.h3 h3Var = nn0Var2.J;
                    if (h3Var != null) {
                        h3Var.f();
                        nn0Var2.J = null;
                    }
                } else {
                    ph.h3 h3Var2 = nn0Var2.J;
                    if (h3Var2 == null || h3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.k2) tn0Var).currentAccount;
                        ph.h3 h3Var3 = new ph.h3(i10, nn0Var2.K.id, new fn0(gn0Var, 2));
                        nn0Var2.J = h3Var3;
                        h3Var3.g(false);
                    }
                }
                nn0.a(nn0Var2);
                (tn0Var.I.getCurrentPosition() == 1 ? tn0Var.n : tn0Var.h).e();
                break;
            case 1:
                nn0 nn0Var3 = this.b.e;
                nn0Var3.h = ((Integer) obj).intValue();
                nn0Var3.r = null;
                nn0Var3.s = null;
                nn0Var3.I = null;
                nn0Var3.j(true);
                nn0Var3.i();
                nn0Var3.f(true);
                mn0 mn0Var = nn0Var3.D;
                if (mn0Var != null) {
                    mn0Var.invalidate();
                }
                tn0 tn0Var2 = nn0Var3.p0;
                nn0 nn0Var4 = tn0Var2.n;
                if (nn0Var4 != null && (rn0Var = nn0Var4.a) != null && (nn0Var = tn0Var2.h) != null) {
                    rn0Var.a(nn0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
