package kh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ p0(v0 v0Var, int i9) {
        this.a = i9;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                v0 v0Var = this.b;
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
                v0 v0Var2 = this.b;
                if (v0Var2.c && v0Var2.r != null) {
                    v0Var2.n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    v0Var2.c = false;
                    v0Var2.d();
                    break;
                }
                break;
        }
    }
}
