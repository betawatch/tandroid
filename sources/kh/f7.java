package kh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ f7(k7 k7Var, int i9) {
        this.a = i9;
        this.b = k7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                j7 j7Var = (j7) obj;
                k7 k7Var = this.b;
                k7Var.D = null;
                k7Var.A = j7Var;
                k7Var.y = j7Var != null;
                k7Var.a();
                k7Var.invalidate();
                v9 v9Var = k7Var.b;
                if (v9Var != null) {
                    v9Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                j7 j7Var2 = this.b.A;
                if (j7Var2 != null || o2Var == null) {
                    j7Var2.c(o2Var);
                    break;
                }
        }
    }
}
