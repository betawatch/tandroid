package hi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.rj0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;
    public final /* synthetic */ a3 c;

    public /* synthetic */ x2(y2 y2Var, a3 a3Var, int i7) {
        this.a = i7;
        this.b = y2Var;
        this.c = a3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                di.b1 b1Var = this.b.c.d;
                b1Var.getClass();
                a3 a3Var = this.c;
                int R = RecyclerView.R(a3Var);
                if (R != -1) {
                    oj0 oj0Var = b1Var.U0;
                    if (oj0Var == null) {
                        pj0 pj0Var = b1Var.V0;
                        if (pj0Var != null) {
                            pj0Var.f(0.0f, 0.0f, R, a3Var);
                            break;
                        }
                    } else {
                        oj0Var.c(R, a3Var);
                        break;
                    }
                }
                break;
            default:
                di.b1 b1Var2 = this.b.c.d;
                b1Var2.getClass();
                a3 a3Var2 = this.c;
                int R2 = RecyclerView.R(a3Var2);
                if (R2 != -1) {
                    qj0 qj0Var = b1Var2.W0;
                    if (qj0Var == null) {
                        rj0 rj0Var = b1Var2.X0;
                        if (rj0Var != null) {
                            rj0Var.f(0.0f, 0.0f, R2, a3Var2);
                            break;
                        }
                    } else {
                        qj0Var.c(R2, a3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
