package lh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3 b;
    public final /* synthetic */ l3 c;

    public /* synthetic */ h3(i3 i3Var, l3 l3Var, int i10) {
        this.a = i10;
        this.b = i3Var;
        this.c = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y2 y2Var = this.b.c.d;
                y2Var.getClass();
                l3 l3Var = this.c;
                int R = RecyclerView.R(l3Var);
                if (R != -1) {
                    pk0 pk0Var = y2Var.R0;
                    if (pk0Var == null) {
                        qk0 qk0Var = y2Var.S0;
                        if (qk0Var != null) {
                            qk0Var.c(0.0f, 0.0f, R, l3Var);
                            break;
                        }
                    } else {
                        pk0Var.a(R, l3Var);
                        break;
                    }
                }
                break;
            default:
                y2 y2Var2 = this.b.c.d;
                y2Var2.getClass();
                l3 l3Var2 = this.c;
                int R2 = RecyclerView.R(l3Var2);
                if (R2 != -1) {
                    rk0 rk0Var = y2Var2.T0;
                    if (rk0Var == null) {
                        sk0 sk0Var = y2Var2.U0;
                        if (sk0Var != null) {
                            sk0Var.c(0.0f, 0.0f, R2, l3Var2);
                            break;
                        }
                    } else {
                        rk0Var.a(R2, l3Var2);
                        break;
                    }
                }
                break;
        }
    }
}
