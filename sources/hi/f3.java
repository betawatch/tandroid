package hi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g3 b;
    public final /* synthetic */ i3 c;

    public /* synthetic */ f3(g3 g3Var, i3 i3Var, int i7) {
        this.a = i7;
        this.b = g3Var;
        this.c = i3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                di.b1 b1Var = this.b.c.d;
                b1Var.getClass();
                i3 i3Var = this.c;
                int R = RecyclerView.R(i3Var);
                if (R != -1) {
                    qj0 qj0Var = b1Var.U0;
                    if (qj0Var == null) {
                        rj0 rj0Var = b1Var.V0;
                        if (rj0Var != null) {
                            rj0Var.g(0.0f, 0.0f, R, i3Var);
                            break;
                        }
                    } else {
                        qj0Var.b(R, i3Var);
                        break;
                    }
                }
                break;
            default:
                di.b1 b1Var2 = this.b.c.d;
                b1Var2.getClass();
                i3 i3Var2 = this.c;
                int R2 = RecyclerView.R(i3Var2);
                if (R2 != -1) {
                    sj0 sj0Var = b1Var2.W0;
                    if (sj0Var == null) {
                        tj0 tj0Var = b1Var2.X0;
                        if (tj0Var != null) {
                            tj0Var.g(0.0f, 0.0f, R2, i3Var2);
                            break;
                        }
                    } else {
                        sj0Var.b(R2, i3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
