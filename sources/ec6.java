// default package

import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ec6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc6 b;
    public final /* synthetic */ xj5 c;

    public /* synthetic */ ec6(uc6 uc6Var, xj5 xj5Var, byte b) {
        this.a = b;
        this.b = uc6Var;
        this.c = xj5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uc6 uc6Var = this.b;
                xj5 xj5Var = this.c;
                if (uc6Var.H != null && uc6Var.getParentActivity() != null) {
                    try {
                        ((am2) xj5Var).F();
                        ((z3f) a.j()).initializeMaps(a.b);
                        ((am2) uc6Var.H).y(new hw(uc6Var, (byte) 9));
                        uc6Var.x0 = true;
                        if (uc6Var.y0) {
                            ((am2) uc6Var.H).I();
                            break;
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                break;
            default:
                uc6 uc6Var2 = this.b;
                xj5 xj5Var2 = this.c;
                try {
                    ((am2) xj5Var2).F();
                } catch (Exception unused) {
                }
                hl.c3(new ec6(uc6Var2, xj5Var2, (byte) 0));
                break;
        }
    }
}
