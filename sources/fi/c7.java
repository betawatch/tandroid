package fi;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ g7 b;

    public /* synthetic */ c7(g7 g7Var, int i10) {
        this.a = i10;
        this.b = g7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                f7 f7Var = (f7) obj;
                g7 g7Var = this.b;
                g7Var.H = null;
                g7Var.E = f7Var;
                g7Var.y = f7Var != null;
                g7Var.a();
                g7Var.invalidate();
                p9 p9Var = g7Var.b;
                if (p9Var != null) {
                    p9Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                f7 f7Var2 = this.b.E;
                if (f7Var2 != null || r2Var == null) {
                    f7Var2.c(r2Var);
                    break;
                }
        }
    }
}
