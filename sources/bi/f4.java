package bi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class f4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;
    public final /* synthetic */ j4 c;

    public /* synthetic */ f4(g4 g4Var, j4 j4Var, int i10) {
        this.a = i10;
        this.b = g4Var;
        this.c = j4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w3 w3Var = this.b.c.d;
                w3Var.getClass();
                j4 j4Var = this.c;
                int R = RecyclerView.R(j4Var);
                if (R != -1) {
                    jl0 jl0Var = w3Var.V0;
                    if (jl0Var == null) {
                        kl0 kl0Var = w3Var.W0;
                        if (kl0Var != null) {
                            kl0Var.c(0.0f, 0.0f, R, j4Var);
                            break;
                        }
                    } else {
                        jl0Var.d(R, j4Var);
                        break;
                    }
                }
                break;
            default:
                w3 w3Var2 = this.b.c.d;
                w3Var2.getClass();
                j4 j4Var2 = this.c;
                int R2 = RecyclerView.R(j4Var2);
                if (R2 != -1) {
                    ll0 ll0Var = w3Var2.X0;
                    if (ll0Var == null) {
                        ml0 ml0Var = w3Var2.Y0;
                        if (ml0Var != null) {
                            ml0Var.c(0.0f, 0.0f, R2, j4Var2);
                            break;
                        }
                    } else {
                        ll0Var.d(R2, j4Var2);
                        break;
                    }
                }
                break;
        }
    }
}
