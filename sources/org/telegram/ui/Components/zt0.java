package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bu0 b;

    public /* synthetic */ zt0(bu0 bu0Var, int i7) {
        this.a = i7;
        this.b = bu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bu0 bu0Var = this.b;
                bu0Var.V0 = false;
                if (!bu0Var.Y0 && bu0Var.W0) {
                    bu0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                bu0 bu0Var2 = this.b;
                bu0Var2.Y0 = false;
                if (!bu0Var2.V0 && bu0Var2.W0) {
                    bu0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
