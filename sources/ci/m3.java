package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.hm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                    em0 em0Var = d3Var.T0;
                    if (em0Var == null) {
                        fm0 fm0Var = d3Var.U0;
                        if (fm0Var != null) {
                            fm0Var.c(0.0f, 0.0f, R, q3Var);
                            break;
                        }
                    } else {
                        em0Var.d(R, q3Var);
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
                    gm0 gm0Var = d3Var2.V0;
                    if (gm0Var == null) {
                        hm0 hm0Var = d3Var2.W0;
                        if (hm0Var != null) {
                            hm0Var.c(0.0f, 0.0f, R2, q3Var2);
                            break;
                        }
                    } else {
                        gm0Var.d(R2, q3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
