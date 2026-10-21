package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg1 b;

    public /* synthetic */ cg1(dg1 dg1Var, int i10) {
        this.a = i10;
        this.b = dg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.w61 w61Var = this.b.a;
                if (w61Var != null) {
                    w61Var.W2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.w61 w61Var2 = this.b.a;
                if (w61Var2 != null) {
                    w61Var2.W2.N(true);
                    break;
                }
                break;
        }
    }
}
