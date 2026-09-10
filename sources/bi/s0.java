package bi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ s0(y0 y0Var, int i10) {
        this.a = i10;
        this.b = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                y0 y0Var = this.b;
                y0Var.e = false;
                v0 v0Var = y0Var.s;
                if (v0Var != null) {
                    v0Var.a(true);
                    y0Var.s = null;
                }
                x0 x0Var = y0Var.n;
                if (x0Var != null) {
                    x0Var.a();
                }
                y0Var.c = false;
                y0Var.d();
                break;
            default:
                y0 y0Var2 = this.b;
                if (y0Var2.c && y0Var2.r != null) {
                    y0Var2.n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    y0Var2.c = false;
                    y0Var2.d();
                    break;
                }
                break;
        }
    }
}
