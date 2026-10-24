package ei;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ j7 b;

    public /* synthetic */ f7(j7 j7Var, int i10) {
        this.a = i10;
        this.b = j7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                i7 i7Var = (i7) obj;
                j7 j7Var = this.b;
                j7Var.H = null;
                j7Var.E = i7Var;
                j7Var.y = i7Var != null;
                j7Var.a();
                j7Var.invalidate();
                t9 t9Var = j7Var.b;
                if (t9Var != null) {
                    t9Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                i7 i7Var2 = this.b.E;
                if (i7Var2 != null || o2Var == null) {
                    i7Var2.c(o2Var);
                    break;
                }
        }
    }
}
