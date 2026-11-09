package fi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.fj0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;
    public final /* synthetic */ b3 c;

    public /* synthetic */ y2(z2 z2Var, b3 b3Var, int i7) {
        this.a = i7;
        this.b = z2Var;
        this.c = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bi.q1 q1Var = this.b.c.d;
                q1Var.getClass();
                b3 b3Var = this.c;
                int R = RecyclerView.R(b3Var);
                if (R != -1) {
                    cj0 cj0Var = q1Var.T0;
                    if (cj0Var == null) {
                        dj0 dj0Var = q1Var.U0;
                        if (dj0Var != null) {
                            dj0Var.f(0.0f, 0.0f, R, b3Var);
                            break;
                        }
                    } else {
                        cj0Var.c(R, b3Var);
                        break;
                    }
                }
                break;
            default:
                bi.q1 q1Var2 = this.b.c.d;
                q1Var2.getClass();
                b3 b3Var2 = this.c;
                int R2 = RecyclerView.R(b3Var2);
                if (R2 != -1) {
                    ej0 ej0Var = q1Var2.V0;
                    if (ej0Var == null) {
                        fj0 fj0Var = q1Var2.W0;
                        if (fj0Var != null) {
                            fj0Var.f(0.0f, 0.0f, R2, b3Var2);
                            break;
                        }
                    } else {
                        ej0Var.c(R2, b3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
