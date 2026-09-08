package di;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ o0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                u0 u0Var = this.b;
                u0Var.e = false;
                r0 r0Var = u0Var.s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.s = null;
                }
                t0 t0Var = u0Var.n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.c = false;
                u0Var.d();
                break;
            default:
                u0 u0Var2 = this.b;
                if (u0Var2.c && u0Var2.r != null) {
                    u0Var2.n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.c = false;
                    u0Var2.d();
                    break;
                }
                break;
        }
    }
}
