package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;
    public final /* synthetic */ s3 c;

    public /* synthetic */ o3(p3 p3Var, s3 s3Var, int i10) {
        this.a = i10;
        this.b = p3Var;
        this.c = s3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f3 f3Var = this.b.c.d;
                f3Var.getClass();
                s3 s3Var = this.c;
                int R = RecyclerView.R(s3Var);
                if (R != -1) {
                    zk0 zk0Var = f3Var.V0;
                    if (zk0Var == null) {
                        al0 al0Var = f3Var.W0;
                        if (al0Var != null) {
                            al0Var.c(0.0f, 0.0f, R, s3Var);
                            break;
                        }
                    } else {
                        zk0Var.d(R, s3Var);
                        break;
                    }
                }
                break;
            default:
                f3 f3Var2 = this.b.c.d;
                f3Var2.getClass();
                s3 s3Var2 = this.c;
                int R2 = RecyclerView.R(s3Var2);
                if (R2 != -1) {
                    bl0 bl0Var = f3Var2.X0;
                    if (bl0Var == null) {
                        cl0 cl0Var = f3Var2.Y0;
                        if (cl0Var != null) {
                            cl0Var.c(0.0f, 0.0f, R2, s3Var2);
                            break;
                        }
                    } else {
                        bl0Var.d(R2, s3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
