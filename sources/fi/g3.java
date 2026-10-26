package fi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3 b;
    public final /* synthetic */ k3 c;

    public /* synthetic */ g3(h3 h3Var, k3 k3Var, int i10) {
        this.a = i10;
        this.b = h3Var;
        this.c = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x2 x2Var = this.b.c.d;
                x2Var.getClass();
                k3 k3Var = this.c;
                int R = RecyclerView.R(k3Var);
                if (R != -1) {
                    zl0 zl0Var = x2Var.T0;
                    if (zl0Var == null) {
                        am0 am0Var = x2Var.U0;
                        if (am0Var != null) {
                            am0Var.e(0.0f, 0.0f, R, k3Var);
                            break;
                        }
                    } else {
                        zl0Var.c(R, k3Var);
                        break;
                    }
                }
                break;
            default:
                x2 x2Var2 = this.b.c.d;
                x2Var2.getClass();
                k3 k3Var2 = this.c;
                int R2 = RecyclerView.R(k3Var2);
                if (R2 != -1) {
                    bm0 bm0Var = x2Var2.V0;
                    if (bm0Var == null) {
                        cm0 cm0Var = x2Var2.W0;
                        if (cm0Var != null) {
                            cm0Var.e(0.0f, 0.0f, R2, k3Var2);
                            break;
                        }
                    } else {
                        bm0Var.c(R2, k3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
