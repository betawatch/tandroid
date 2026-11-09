package fi;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ n0(t0 t0Var, int i7) {
        this.a = i7;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        t0 t0Var = this.b;
        switch (i7) {
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
                    t0Var.n.b(R.raw.error, 3500, id.N0("VideoConvertFail"));
                    t0Var.c = false;
                    t0Var.d();
                    break;
                }
                break;
        }
    }
}
