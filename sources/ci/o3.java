package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                    jl0 jl0Var = f3Var.V0;
                    if (jl0Var == null) {
                        kl0 kl0Var = f3Var.W0;
                        if (kl0Var != null) {
                            kl0Var.c(0.0f, 0.0f, S, s3Var);
                            break;
                        }
                    } else {
                        jl0Var.d(S, s3Var);
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
                    ll0 ll0Var = f3Var2.X0;
                    if (ll0Var == null) {
                        ml0 ml0Var = f3Var2.Y0;
                        if (ml0Var != null) {
                            ml0Var.c(0.0f, 0.0f, S2, s3Var2);
                            break;
                        }
                    } else {
                        ll0Var.d(S2, s3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
