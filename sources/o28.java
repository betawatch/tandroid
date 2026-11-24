// default package

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class o28 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p28 b;

    public /* synthetic */ o28(p28 p28Var, byte b) {
        this.a = b;
        this.b = p28Var;
    }

    @Override // qac
    public final void a(Object obj) {
        int i;
        b38 b38Var;
        w28 w28Var;
        byte b = this.a;
        p28 p28Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                w28 w28Var2 = p28Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) w28Var2.N.get(num);
                w28Var2.L = starGift;
                d38 d38Var = w28Var2.q0;
                qb9 qb9Var = w28Var2.K;
                if (starGift == null) {
                    if (qb9Var != null) {
                        qb9Var.i();
                        w28Var2.K = null;
                    }
                } else if (qb9Var == null || qb9Var.b != starGift.id) {
                    i = ((d) d38Var).currentAccount;
                    qb9 qb9Var2 = new qb9(i, w28Var2.L.id, new o28(p28Var, (byte) 2));
                    qb9Var2.w = true;
                    w28Var2.K = qb9Var2;
                    qb9Var2.l(false);
                }
                w28Var2.e();
                (d38Var.J.getCurrentPosition() == 1 ? d38Var.n : d38Var.h).d();
                break;
            case 1:
                w28 w28Var3 = p28Var.e;
                w28Var3.h = ((Integer) obj).intValue();
                w28Var3.r = null;
                w28Var3.s = null;
                w28Var3.J = null;
                w28Var3.j(true);
                w28Var3.i();
                w28Var3.f(true);
                v28 v28Var = w28Var3.E;
                if (v28Var != null) {
                    v28Var.invalidate();
                }
                d38 d38Var2 = w28Var3.q0;
                w28 w28Var4 = d38Var2.n;
                if (w28Var4 != null && (b38Var = w28Var4.a) != null && (w28Var = d38Var2.h) != null) {
                    b38Var.a(w28Var.h);
                    break;
                }
                break;
            default:
                p28Var.e.d();
                break;
        }
    }
}
