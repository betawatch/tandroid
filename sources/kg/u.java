package kg;

import org.telegram.ui.du;
import org.telegram.ui.nz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ u(e0 e0Var, int i3) {
        this.a = i3;
        this.b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                nz nzVar = e0Var.B0;
                if (nzVar != null) {
                    ((du) nzVar).j(false, null, e0Var.z0, e0Var.A0);
                    break;
                }
                break;
            default:
                b0 b0Var = b0.d;
                e0 e0Var2 = this.b;
                e0Var2.c = b0Var;
                e0Var2.J.clear();
                int i3 = e0Var2.G0;
                if (i3 >= 0 && i3 < e0Var2.b()) {
                    e0Var2.g(e0Var2.G0);
                }
                e0Var2.P();
                break;
        }
    }
}
