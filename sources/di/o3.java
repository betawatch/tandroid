package di;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                            al0Var.d(0.0f, 0.0f, R, s3Var);
                            break;
                        }
                    } else {
                        zk0Var.a(R, s3Var);
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
                            cl0Var.d(0.0f, 0.0f, R2, s3Var2);
                            break;
                        }
                    } else {
                        bl0Var.a(R2, s3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
