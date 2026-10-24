package ei;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.dm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;
    public final /* synthetic */ m3 c;

    public /* synthetic */ i3(j3 j3Var, m3 m3Var, int i10) {
        this.a = i10;
        this.b = j3Var;
        this.c = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z2 z2Var = this.b.c.d;
                z2Var.getClass();
                m3 m3Var = this.c;
                int R = RecyclerView.R(m3Var);
                if (R != -1) {
                    am0 am0Var = z2Var.T0;
                    if (am0Var == null) {
                        bm0 bm0Var = z2Var.U0;
                        if (bm0Var != null) {
                            bm0Var.c(0.0f, 0.0f, R, m3Var);
                            break;
                        }
                    } else {
                        am0Var.d(R, m3Var);
                        break;
                    }
                }
                break;
            default:
                z2 z2Var2 = this.b.c.d;
                z2Var2.getClass();
                m3 m3Var2 = this.c;
                int R2 = RecyclerView.R(m3Var2);
                if (R2 != -1) {
                    cm0 cm0Var = z2Var2.V0;
                    if (cm0Var == null) {
                        dm0 dm0Var = z2Var2.W0;
                        if (dm0Var != null) {
                            dm0Var.c(0.0f, 0.0f, R2, m3Var2);
                            break;
                        }
                    } else {
                        cm0Var.d(R2, m3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
