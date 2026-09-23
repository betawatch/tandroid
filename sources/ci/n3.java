package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dl0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class n3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;
    public final /* synthetic */ r3 c;

    public /* synthetic */ n3(o3 o3Var, r3 r3Var, int i10) {
        this.a = i10;
        this.b = o3Var;
        this.c = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e3 e3Var = this.b.c.d;
                e3Var.getClass();
                r3 r3Var = this.c;
                int R = RecyclerView.R(r3Var);
                if (R != -1) {
                    al0 al0Var = e3Var.V0;
                    if (al0Var == null) {
                        bl0 bl0Var = e3Var.W0;
                        if (bl0Var != null) {
                            bl0Var.c(0.0f, 0.0f, R, r3Var);
                            break;
                        }
                    } else {
                        al0Var.d(R, r3Var);
                        break;
                    }
                }
                break;
            default:
                e3 e3Var2 = this.b.c.d;
                e3Var2.getClass();
                r3 r3Var2 = this.c;
                int R2 = RecyclerView.R(r3Var2);
                if (R2 != -1) {
                    cl0 cl0Var = e3Var2.X0;
                    if (cl0Var == null) {
                        dl0 dl0Var = e3Var2.Y0;
                        if (dl0Var != null) {
                            dl0Var.c(0.0f, 0.0f, R2, r3Var2);
                            break;
                        }
                    } else {
                        cl0Var.d(R2, r3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
