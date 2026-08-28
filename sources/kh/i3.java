package kh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;
    public final /* synthetic */ m3 c;

    public /* synthetic */ i3(j3 j3Var, m3 m3Var, int i9) {
        this.a = i9;
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
                    mk0 mk0Var = z2Var.R0;
                    if (mk0Var == null) {
                        nk0 nk0Var = z2Var.S0;
                        if (nk0Var != null) {
                            nk0Var.c(0.0f, 0.0f, R, m3Var);
                            break;
                        }
                    } else {
                        mk0Var.a(R, m3Var);
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
                    ok0 ok0Var = z2Var2.T0;
                    if (ok0Var == null) {
                        pk0 pk0Var = z2Var2.U0;
                        if (pk0Var != null) {
                            pk0Var.c(0.0f, 0.0f, R2, m3Var2);
                            break;
                        }
                    } else {
                        ok0Var.a(R2, m3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
