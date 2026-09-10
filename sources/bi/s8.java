package bi;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class s8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8 b;

    public /* synthetic */ s8(x8 x8Var, int i10) {
        this.a = i10;
        this.b = x8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                w8 w8Var = (w8) obj;
                x8 x8Var = this.b;
                x8Var.H = null;
                x8Var.E = w8Var;
                x8Var.y = w8Var != null;
                x8Var.a();
                x8Var.invalidate();
                tb tbVar = x8Var.b;
                if (tbVar != null) {
                    tbVar.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                w8 w8Var2 = this.b.E;
                if (w8Var2 != null || p2Var == null) {
                    w8Var2.c(p2Var);
                    break;
                }
        }
    }
}
