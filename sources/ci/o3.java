package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dl0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                int S = RecyclerView.S(s3Var);
                if (S != -1) {
                    al0 al0Var = f3Var.V0;
                    if (al0Var == null) {
                        bl0 bl0Var = f3Var.W0;
                        if (bl0Var != null) {
                            bl0Var.c(0.0f, 0.0f, S, s3Var);
                            break;
                        }
                    } else {
                        al0Var.d(S, s3Var);
                        break;
                    }
                }
                break;
            default:
                f3 f3Var2 = this.b.c.d;
                f3Var2.getClass();
                s3 s3Var2 = this.c;
                int S2 = RecyclerView.S(s3Var2);
                if (S2 != -1) {
                    cl0 cl0Var = f3Var2.X0;
                    if (cl0Var == null) {
                        dl0 dl0Var = f3Var2.Y0;
                        if (dl0Var != null) {
                            dl0Var.c(0.0f, 0.0f, S2, s3Var2);
                            break;
                        }
                    } else {
                        cl0Var.d(S2, s3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
