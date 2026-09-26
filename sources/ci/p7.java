package ci;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ t7 b;

    public /* synthetic */ p7(t7 t7Var, int i10) {
        this.a = i10;
        this.b = t7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                s7 s7Var = (s7) obj;
                t7 t7Var = this.b;
                t7Var.H = null;
                t7Var.E = s7Var;
                t7Var.y = s7Var != null;
                t7Var.a();
                t7Var.invalidate();
                ha haVar = t7Var.b;
                if (haVar != null) {
                    haVar.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                s7 s7Var2 = this.b.E;
                if (s7Var2 != null || m2Var == null) {
                    s7Var2.c(m2Var);
                    break;
                }
        }
    }
}
