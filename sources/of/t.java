package of;

import org.telegram.ui.jv;
import org.telegram.ui.w00;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ t(f0 f0Var, int i9) {
        this.a = i9;
        this.b = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                w00 w00Var = f0Var.w0;
                if (w00Var != null) {
                    ((jv) w00Var).i(false, null, f0Var.u0, f0Var.v0);
                    break;
                }
                break;
            default:
                f0 f0Var2 = this.b;
                f0Var2.getClass();
                f0Var2.c = c0.d;
                f0Var2.E.clear();
                int i9 = f0Var2.B0;
                if (i9 >= 0 && i9 < f0Var2.h()) {
                    f0Var2.m(f0Var2.B0);
                }
                f0Var2.Q();
                break;
        }
    }
}
