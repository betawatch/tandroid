package di;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class o7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ s7 b;

    public /* synthetic */ o7(s7 s7Var, int i10) {
        this.a = i10;
        this.b = s7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) obj;
                s7 s7Var = this.b;
                s7Var.H = null;
                s7Var.E = r7Var;
                s7Var.y = r7Var != null;
                s7Var.a();
                s7Var.invalidate();
                ga gaVar = s7Var.b;
                if (gaVar != null) {
                    gaVar.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                r7 r7Var2 = this.b.E;
                if (r7Var2 != null || m2Var == null) {
                    r7Var2.c(m2Var);
                    break;
                }
        }
    }
}
