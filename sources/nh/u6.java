package nh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;

    public /* synthetic */ u6(y6 y6Var, int i10) {
        this.a = i10;
        this.b = y6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                x6 x6Var = (x6) obj;
                y6 y6Var = this.b;
                y6Var.D = null;
                y6Var.A = x6Var;
                y6Var.y = x6Var != null;
                y6Var.a();
                y6Var.invalidate();
                g9 g9Var = y6Var.b;
                if (g9Var != null) {
                    g9Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                x6 x6Var2 = this.b.A;
                if (x6Var2 != null || o2Var == null) {
                    x6Var2.c(o2Var);
                    break;
                }
        }
    }
}
