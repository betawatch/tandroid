package gi;

import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ n0(t0 t0Var, int i3) {
        this.a = i3;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        t0 t0Var = this.b;
        switch (i3) {
            case 0:
                t0Var.b();
                break;
            case 1:
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
                if (t0Var.c && t0Var.r != null) {
                    t0Var.n.b(R.raw.error, 3500, bd.N0("VideoConvertFail"));
                    t0Var.c = false;
                    t0Var.d();
                    break;
                }
                break;
        }
    }
}
