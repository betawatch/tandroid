package hi;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ o0(u0 u0Var, int i7) {
        this.a = i7;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        u0 u0Var = this.b;
        switch (i7) {
            case 0:
                u0Var.b();
                break;
            case 1:
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
                if (u0Var.c && u0Var.r != null) {
                    u0Var.n.b(R.raw.error, 3500, hd.N0("VideoConvertFail"));
                    u0Var.c = false;
                    u0Var.d();
                    break;
                }
                break;
        }
    }
}
