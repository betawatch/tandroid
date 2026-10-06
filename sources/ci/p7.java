package ci;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
                ga gaVar = t7Var.b;
                if (gaVar != null) {
                    gaVar.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                s7 s7Var2 = this.b.E;
                if (s7Var2 != null || n2Var == null) {
                    s7Var2.c(n2Var);
                    break;
                }
        }
    }
}
