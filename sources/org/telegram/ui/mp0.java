package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ np0 b;

    public /* synthetic */ mp0(np0 np0Var, int i10) {
        this.a = i10;
        this.b = np0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        yp0 yp0Var;
        up0 up0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                np0 np0Var = this.b;
                up0 up0Var2 = np0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) up0Var2.M.get(num);
                up0Var2.K = starGift;
                bq0 bq0Var = up0Var2.p0;
                if (starGift == null) {
                    wh.u3 u3Var = up0Var2.J;
                    if (u3Var != null) {
                        u3Var.f();
                        up0Var2.J = null;
                    }
                } else {
                    wh.u3 u3Var2 = up0Var2.J;
                    if (u3Var2 == null || u3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.p2) bq0Var).currentAccount;
                        wh.u3 u3Var3 = new wh.u3(up0Var2.K.id, i10, new mp0(np0Var, 2));
                        up0Var2.J = u3Var3;
                        u3Var3.g(false);
                    }
                }
                up0.a(up0Var2);
                (bq0Var.I.getCurrentPosition() == 1 ? bq0Var.n : bq0Var.h).e();
                break;
            case 1:
                up0 up0Var3 = this.b.e;
                up0Var3.h = ((Integer) obj).intValue();
                up0Var3.r = null;
                up0Var3.s = null;
                up0Var3.I = null;
                up0Var3.j(true);
                up0Var3.i();
                up0Var3.f(true);
                tp0 tp0Var = up0Var3.y;
                if (tp0Var != null) {
                    tp0Var.invalidate();
                }
                bq0 bq0Var2 = up0Var3.p0;
                up0 up0Var4 = bq0Var2.n;
                if (up0Var4 != null && (yp0Var = up0Var4.a) != null && (up0Var = bq0Var2.h) != null) {
                    yp0Var.a(up0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
