package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ip0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ jp0 b;

    public /* synthetic */ ip0(jp0 jp0Var, int i10) {
        this.a = i10;
        this.b = jp0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        up0 up0Var;
        qp0 qp0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                jp0 jp0Var = this.b;
                qp0 qp0Var2 = jp0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) qp0Var2.M.get(num);
                qp0Var2.K = starGift;
                wp0 wp0Var = qp0Var2.p0;
                if (starGift == null) {
                    xh.v3 v3Var = qp0Var2.J;
                    if (v3Var != null) {
                        v3Var.f();
                        qp0Var2.J = null;
                    }
                } else {
                    xh.v3 v3Var2 = qp0Var2.J;
                    if (v3Var2 == null || v3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) wp0Var).currentAccount;
                        xh.v3 v3Var3 = new xh.v3(qp0Var2.K.id, i10, new ip0(jp0Var, 2));
                        qp0Var2.J = v3Var3;
                        v3Var3.g(false);
                    }
                }
                qp0.a(qp0Var2);
                (wp0Var.I.getCurrentPosition() == 1 ? wp0Var.n : wp0Var.h).e();
                break;
            case 1:
                qp0 qp0Var3 = this.b.e;
                qp0Var3.h = ((Integer) obj).intValue();
                qp0Var3.r = null;
                qp0Var3.s = null;
                qp0Var3.I = null;
                qp0Var3.j(true);
                qp0Var3.i();
                qp0Var3.f(true);
                pp0 pp0Var = qp0Var3.y;
                if (pp0Var != null) {
                    pp0Var.invalidate();
                }
                wp0 wp0Var2 = qp0Var3.p0;
                qp0 qp0Var4 = wp0Var2.n;
                if (qp0Var4 != null && (up0Var = qp0Var4.a) != null && (qp0Var = wp0Var2.h) != null) {
                    up0Var.a(qp0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
