package nh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g3 b;
    public final /* synthetic */ j3 c;

    public /* synthetic */ f3(g3 g3Var, j3 j3Var, int i10) {
        this.a = i10;
        this.b = g3Var;
        this.c = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b.c.d;
                w2Var.getClass();
                j3 j3Var = this.c;
                int R = RecyclerView.R(j3Var);
                if (R != -1) {
                    zk0 zk0Var = w2Var.R0;
                    if (zk0Var == null) {
                        al0 al0Var = w2Var.S0;
                        if (al0Var != null) {
                            al0Var.b(0.0f, 0.0f, R, j3Var);
                            break;
                        }
                    } else {
                        zk0Var.c(R, j3Var);
                        break;
                    }
                }
                break;
            default:
                w2 w2Var2 = this.b.c.d;
                w2Var2.getClass();
                j3 j3Var2 = this.c;
                int R2 = RecyclerView.R(j3Var2);
                if (R2 != -1) {
                    bl0 bl0Var = w2Var2.T0;
                    if (bl0Var == null) {
                        cl0 cl0Var = w2Var2.U0;
                        if (cl0Var != null) {
                            cl0Var.b(0.0f, 0.0f, R2, j3Var2);
                            break;
                        }
                    } else {
                        bl0Var.c(R2, j3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
