// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mt4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nt4 b;
    public final /* synthetic */ pt4 c;

    public /* synthetic */ mt4(nt4 nt4Var, pt4 pt4Var, byte b) {
        this.a = b;
        this.b = nt4Var;
        this.c = pt4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pt4 pt4Var = this.c;
        nt4 nt4Var = this.b;
        switch (b) {
            case 0:
                fv fvVar = nt4Var.c.d;
                fvVar.getClass();
                int R = RecyclerView.R(pt4Var);
                if (R != -1) {
                    f59 f59Var = fvVar.U0;
                    if (f59Var == null) {
                        g59 g59Var = fvVar.V0;
                        if (g59Var != null) {
                            g59Var.d(0.0f, 0.0f, R, pt4Var);
                            break;
                        }
                    } else {
                        f59Var.g(R, pt4Var);
                        break;
                    }
                }
                break;
            default:
                fv fvVar2 = nt4Var.c.d;
                fvVar2.getClass();
                int R2 = RecyclerView.R(pt4Var);
                if (R2 != -1) {
                    h59 h59Var = fvVar2.W0;
                    if (h59Var == null) {
                        i59 i59Var = fvVar2.X0;
                        if (i59Var != null) {
                            i59Var.d(0.0f, 0.0f, R2, pt4Var);
                            break;
                        }
                    } else {
                        h59Var.g(R2, pt4Var);
                        break;
                    }
                }
                break;
        }
    }
}
