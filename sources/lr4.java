// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lr4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr4 b;
    public final /* synthetic */ or4 c;

    public /* synthetic */ lr4(mr4 mr4Var, or4 or4Var, byte b) {
        this.a = b;
        this.b = mr4Var;
        this.c = or4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        or4 or4Var = this.c;
        mr4 mr4Var = this.b;
        switch (b) {
            case 0:
                fu fuVar = mr4Var.c.d;
                fuVar.getClass();
                int R = RecyclerView.R(or4Var);
                if (R != -1) {
                    c39 c39Var = fuVar.U0;
                    if (c39Var == null) {
                        d39 d39Var = fuVar.V0;
                        if (d39Var != null) {
                            d39Var.e(0.0f, 0.0f, R, or4Var);
                            break;
                        }
                    } else {
                        c39Var.d(R, or4Var);
                        break;
                    }
                }
                break;
            default:
                fu fuVar2 = mr4Var.c.d;
                fuVar2.getClass();
                int R2 = RecyclerView.R(or4Var);
                if (R2 != -1) {
                    e39 e39Var = fuVar2.W0;
                    if (e39Var == null) {
                        f39 f39Var = fuVar2.X0;
                        if (f39Var != null) {
                            f39Var.e(0.0f, 0.0f, R2, or4Var);
                            break;
                        }
                    } else {
                        e39Var.d(R2, or4Var);
                        break;
                    }
                }
                break;
        }
    }
}
