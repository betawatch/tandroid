package hi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.jj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
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
                di.c1 c1Var = this.b.c.d;
                c1Var.getClass();
                z2 z2Var = this.c;
                int R = RecyclerView.R(z2Var);
                if (R != -1) {
                    gj0 gj0Var = c1Var.U0;
                    if (gj0Var == null) {
                        hj0 hj0Var = c1Var.V0;
                        if (hj0Var != null) {
                            hj0Var.f(0.0f, 0.0f, R, z2Var);
                            break;
                        }
                    } else {
                        gj0Var.b(R, z2Var);
                        break;
                    }
                }
                break;
            default:
                di.c1 c1Var2 = this.b.c.d;
                c1Var2.getClass();
                z2 z2Var2 = this.c;
                int R2 = RecyclerView.R(z2Var2);
                if (R2 != -1) {
                    ij0 ij0Var = c1Var2.W0;
                    if (ij0Var == null) {
                        jj0 jj0Var = c1Var2.X0;
                        if (jj0Var != null) {
                            jj0Var.f(0.0f, 0.0f, R2, z2Var2);
                            break;
                        }
                    } else {
                        ij0Var.b(R2, z2Var2);
                        break;
                    }
                }
                break;
        }
    }
}
