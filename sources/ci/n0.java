package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ n0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                t0 t0Var = this.b;
                t0Var.e = false;
                q0 q0Var = t0Var.s;
                if (q0Var != null) {
                    q0Var.a(true);
                    t0Var.s = null;
                }
                s0 s0Var = t0Var.n;
                if (s0Var != null) {
                    s0Var.a();
                }
                t0Var.c = false;
                t0Var.d();
                break;
            default:
                t0 t0Var2 = this.b;
                if (t0Var2.c && t0Var2.r != null) {
                    t0Var2.n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    t0Var2.c = false;
                    t0Var2.d();
                    break;
                }
                break;
        }
    }
}
