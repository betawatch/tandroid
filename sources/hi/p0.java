package hi;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ p0(v0 v0Var, int i7) {
        this.a = i7;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        v0 v0Var = this.b;
        switch (i7) {
            case 0:
                v0Var.b();
                break;
            case 1:
                v0Var.e = false;
                s0 s0Var = v0Var.s;
                if (s0Var != null) {
                    s0Var.a(true);
                    v0Var.s = null;
                }
                u0 u0Var = v0Var.n;
                if (u0Var != null) {
                    u0Var.a();
                }
                v0Var.c = false;
                v0Var.d();
                break;
            default:
                if (v0Var.c && v0Var.r != null) {
                    v0Var.n.b(R.raw.error, 3500, hd.O0("VideoConvertFail"));
                    v0Var.c = false;
                    v0Var.d();
                    break;
                }
                break;
        }
    }
}
