package di;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.dm0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class m3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;
    public final /* synthetic */ q3 c;

    public /* synthetic */ m3(n3 n3Var, q3 q3Var, int i10) {
        this.a = i10;
        this.b = n3Var;
        this.c = q3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d3 d3Var = this.b.c.d;
                d3Var.getClass();
                q3 q3Var = this.c;
                int R = RecyclerView.R(q3Var);
                if (R != -1) {
                    am0 am0Var = d3Var.T0;
                    if (am0Var == null) {
                        bm0 bm0Var = d3Var.U0;
                        if (bm0Var != null) {
                            bm0Var.d(0.0f, 0.0f, R, q3Var);
                            break;
                        }
                    } else {
                        am0Var.a(R, q3Var);
                        break;
                    }
                }
                break;
            default:
                d3 d3Var2 = this.b.c.d;
                d3Var2.getClass();
                q3 q3Var2 = this.c;
                int R2 = RecyclerView.R(q3Var2);
                if (R2 != -1) {
                    cm0 cm0Var = d3Var2.V0;
                    if (cm0Var == null) {
                        dm0 dm0Var = d3Var2.W0;
                        if (dm0Var != null) {
                            dm0Var.d(0.0f, 0.0f, R2, q3Var2);
                            break;
                        }
                    } else {
                        cm0Var.a(R2, q3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
