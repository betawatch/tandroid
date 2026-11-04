package gi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ij0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;
    public final /* synthetic */ z2 c;

    public /* synthetic */ w2(x2 x2Var, z2 z2Var, int i3) {
        this.a = i3;
        this.b = x2Var;
        this.c = z2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ci.j1 j1Var = this.b.c.d;
                j1Var.getClass();
                z2 z2Var = this.c;
                int R = RecyclerView.R(z2Var);
                if (R != -1) {
                    fj0 fj0Var = j1Var.U0;
                    if (fj0Var == null) {
                        gj0 gj0Var = j1Var.V0;
                        if (gj0Var != null) {
                            gj0Var.b(0.0f, 0.0f, R, z2Var);
                            break;
                        }
                    } else {
                        fj0Var.f(R, z2Var);
                        break;
                    }
                }
                break;
            default:
                ci.j1 j1Var2 = this.b.c.d;
                j1Var2.getClass();
                z2 z2Var2 = this.c;
                int R2 = RecyclerView.R(z2Var2);
                if (R2 != -1) {
                    hj0 hj0Var = j1Var2.W0;
                    if (hj0Var == null) {
                        ij0 ij0Var = j1Var2.X0;
                        if (ij0Var != null) {
                            ij0Var.b(0.0f, 0.0f, R2, z2Var2);
                            break;
                        }
                    } else {
                        hj0Var.f(R2, z2Var2);
                        break;
                    }
                }
                break;
        }
    }
}
