package ei;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                    xl0 xl0Var = z2Var.T0;
                    if (xl0Var == null) {
                        yl0 yl0Var = z2Var.U0;
                        if (yl0Var != null) {
                            yl0Var.d(0.0f, 0.0f, R, m3Var);
                            break;
                        }
                    } else {
                        xl0Var.a(R, m3Var);
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
                    zl0 zl0Var = z2Var2.V0;
                    if (zl0Var == null) {
                        am0 am0Var = z2Var2.W0;
                        if (am0Var != null) {
                            am0Var.d(0.0f, 0.0f, R2, m3Var2);
                            break;
                        }
                    } else {
                        zl0Var.a(R2, m3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
