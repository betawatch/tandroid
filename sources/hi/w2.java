package hi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;
    public final /* synthetic */ z2 c;

    public /* synthetic */ w2(x2 x2Var, z2 z2Var, int i7) {
        this.a = i7;
        this.b = x2Var;
        this.c = z2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                di.b1 b1Var = this.b.c.d;
                b1Var.getClass();
                z2 z2Var = this.c;
                int R = RecyclerView.R(z2Var);
                if (R != -1) {
                    qj0 qj0Var = b1Var.U0;
                    if (qj0Var == null) {
                        rj0 rj0Var = b1Var.V0;
                        if (rj0Var != null) {
                            rj0Var.f(0.0f, 0.0f, R, z2Var);
                            break;
                        }
                    } else {
                        qj0Var.c(R, z2Var);
                        break;
                    }
                }
                break;
            default:
                di.b1 b1Var2 = this.b.c.d;
                b1Var2.getClass();
                z2 z2Var2 = this.c;
                int R2 = RecyclerView.R(z2Var2);
                if (R2 != -1) {
                    sj0 sj0Var = b1Var2.W0;
                    if (sj0Var == null) {
                        tj0 tj0Var = b1Var2.X0;
                        if (tj0Var != null) {
                            tj0Var.f(0.0f, 0.0f, R2, z2Var2);
                            break;
                        }
                    } else {
                        sj0Var.c(R2, z2Var2);
                        break;
                    }
                }
                break;
        }
    }
}
