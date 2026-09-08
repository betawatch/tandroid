package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class np0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ op0 b;

    public /* synthetic */ np0(op0 op0Var, int i10) {
        this.a = i10;
        this.b = op0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        zp0 zp0Var;
        vp0 vp0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                op0 op0Var = this.b;
                vp0 vp0Var2 = op0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) vp0Var2.M.get(num);
                vp0Var2.K = starGift;
                bq0 bq0Var = vp0Var2.p0;
                if (starGift == null) {
                    yh.t3 t3Var = vp0Var2.J;
                    if (t3Var != null) {
                        t3Var.f();
                        vp0Var2.J = null;
                    }
                } else {
                    yh.t3 t3Var2 = vp0Var2.J;
                    if (t3Var2 == null || t3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                        yh.t3 t3Var3 = new yh.t3(vp0Var2.K.id, i10, new np0(op0Var, 2));
                        vp0Var2.J = t3Var3;
                        t3Var3.g(false);
                    }
                }
                vp0.a(vp0Var2);
                (bq0Var.I.getCurrentPosition() == 1 ? bq0Var.n : bq0Var.h).e();
                break;
            case 1:
                vp0 vp0Var3 = this.b.e;
                vp0Var3.h = ((Integer) obj).intValue();
                vp0Var3.r = null;
                vp0Var3.s = null;
                vp0Var3.I = null;
                vp0Var3.j(true);
                vp0Var3.i();
                vp0Var3.f(true);
                up0 up0Var = vp0Var3.y;
                if (up0Var != null) {
                    up0Var.invalidate();
                }
                bq0 bq0Var2 = vp0Var3.p0;
                vp0 vp0Var4 = bq0Var2.n;
                if (vp0Var4 != null && (zp0Var = vp0Var4.a) != null && (vp0Var = bq0Var2.h) != null) {
                    zp0Var.a(vp0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
