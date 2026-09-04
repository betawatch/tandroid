package di;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;

    public /* synthetic */ r7(w7 w7Var, int i10) {
        this.a = i10;
        this.b = w7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                v7 v7Var = (v7) obj;
                w7 w7Var = this.b;
                w7Var.H = null;
                w7Var.E = v7Var;
                w7Var.y = v7Var != null;
                w7Var.a();
                w7Var.invalidate();
                ka kaVar = w7Var.b;
                if (kaVar != null) {
                    kaVar.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                v7 v7Var2 = this.b.E;
                if (v7Var2 != null || n2Var == null) {
                    v7Var2.c(n2Var);
                    break;
                }
        }
    }
}
