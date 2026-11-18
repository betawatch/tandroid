package hi;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                    v0Var.n.b(R.raw.error, 3500, gd.N0("VideoConvertFail"));
                    v0Var.c = false;
                    v0Var.d();
                    break;
                }
                break;
        }
    }
}
