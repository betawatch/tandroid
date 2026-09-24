package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nl0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;
    public final /* synthetic */ r3 c;

    public /* synthetic */ n3(o3 o3Var, r3 r3Var, int i10) {
        this.a = i10;
        this.b = o3Var;
        this.c = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e3 e3Var = this.b.c.d;
                e3Var.getClass();
                r3 r3Var = this.c;
                int R = RecyclerView.R(r3Var);
                if (R != -1) {
                    kl0 kl0Var = e3Var.V0;
                    if (kl0Var == null) {
                        ll0 ll0Var = e3Var.W0;
                        if (ll0Var != null) {
                            ll0Var.c(0.0f, 0.0f, R, r3Var);
                            break;
                        }
                    } else {
                        kl0Var.d(R, r3Var);
                        break;
                    }
                }
                break;
            default:
                e3 e3Var2 = this.b.c.d;
                e3Var2.getClass();
                r3 r3Var2 = this.c;
                int R2 = RecyclerView.R(r3Var2);
                if (R2 != -1) {
                    ml0 ml0Var = e3Var2.X0;
                    if (ml0Var == null) {
                        nl0 nl0Var = e3Var2.Y0;
                        if (nl0Var != null) {
                            nl0Var.c(0.0f, 0.0f, R2, r3Var2);
                            break;
                        }
                    } else {
                        ml0Var.d(R2, r3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
