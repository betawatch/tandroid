// default package

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class l08 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m08 b;

    public /* synthetic */ l08(m08 m08Var, byte b) {
        this.a = b;
        this.b = m08Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        int i;
        y08 y08Var;
        t08 t08Var;
        byte b = this.a;
        m08 m08Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                t08 t08Var2 = m08Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) t08Var2.N.get(num);
                t08Var2.L = starGift;
                a18 a18Var = t08Var2.q0;
                q99 q99Var = t08Var2.K;
                if (starGift == null) {
                    if (q99Var != null) {
                        q99Var.i();
                        t08Var2.K = null;
                    }
                } else if (q99Var == null || q99Var.b != starGift.id) {
                    i = ((d) a18Var).currentAccount;
                    q99 q99Var2 = new q99(i, t08Var2.L.id, new l08(m08Var, (byte) 2));
                    q99Var2.w = true;
                    t08Var2.K = q99Var2;
                    q99Var2.l(false);
                }
                t08Var2.e();
                (a18Var.J.getCurrentPosition() == 1 ? a18Var.n : a18Var.h).d();
                break;
            case 1:
                t08 t08Var3 = m08Var.e;
                t08Var3.h = ((Integer) obj).intValue();
                t08Var3.r = null;
                t08Var3.s = null;
                t08Var3.J = null;
                t08Var3.j(true);
                t08Var3.i();
                t08Var3.f(true);
                s08 s08Var = t08Var3.E;
                if (s08Var != null) {
                    s08Var.invalidate();
                }
                a18 a18Var2 = t08Var3.q0;
                t08 t08Var4 = a18Var2.n;
                if (t08Var4 != null && (y08Var = t08Var4.a) != null && (t08Var = a18Var2.h) != null) {
                    y08Var.a(t08Var.h);
                    break;
                }
                break;
            default:
                m08Var.e.d();
                break;
        }
    }
}
