package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nl0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                    kl0 kl0Var = f3Var.V0;
                    if (kl0Var == null) {
                        ll0 ll0Var = f3Var.W0;
                        if (ll0Var != null) {
                            ll0Var.c(0.0f, 0.0f, S, s3Var);
                            break;
                        }
                    } else {
                        kl0Var.d(S, s3Var);
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
                    ml0 ml0Var = f3Var2.X0;
                    if (ml0Var == null) {
                        nl0 nl0Var = f3Var2.Y0;
                        if (nl0Var != null) {
                            nl0Var.c(0.0f, 0.0f, S2, s3Var2);
                            break;
                        }
                    } else {
                        ml0Var.d(S2, s3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
