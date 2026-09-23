package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp0 b;

    public /* synthetic */ gp0(hp0 hp0Var, int i10) {
        this.a = i10;
        this.b = hp0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        sp0 sp0Var;
        op0 op0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                hp0 hp0Var = this.b;
                op0 op0Var2 = hp0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) op0Var2.M.get(num);
                op0Var2.K = starGift;
                up0 up0Var = op0Var2.p0;
                if (starGift == null) {
                    xh.v3 v3Var = op0Var2.J;
                    if (v3Var != null) {
                        v3Var.f();
                        op0Var2.J = null;
                    }
                } else {
                    xh.v3 v3Var2 = op0Var2.J;
                    if (v3Var2 == null || v3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
                        xh.v3 v3Var3 = new xh.v3(op0Var2.K.id, i10, new gp0(hp0Var, 2));
                        op0Var2.J = v3Var3;
                        v3Var3.g(false);
                    }
                }
                op0.a(op0Var2);
                (up0Var.I.getCurrentPosition() == 1 ? up0Var.n : up0Var.h).e();
                break;
            case 1:
                op0 op0Var3 = this.b.e;
                op0Var3.h = ((Integer) obj).intValue();
                op0Var3.r = null;
                op0Var3.s = null;
                op0Var3.I = null;
                op0Var3.j(true);
                op0Var3.i();
                op0Var3.f(true);
                np0 np0Var = op0Var3.y;
                if (np0Var != null) {
                    np0Var.invalidate();
                }
                up0 up0Var2 = op0Var3.p0;
                op0 op0Var4 = up0Var2.n;
                if (op0Var4 != null && (sp0Var = op0Var4.a) != null && (op0Var = up0Var2.h) != null) {
                    sp0Var.a(op0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
