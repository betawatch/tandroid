package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg1 b;

    public /* synthetic */ eg1(fg1 fg1Var, int i10) {
        this.a = i10;
        this.b = fg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.u61 u61Var = this.b.a;
                if (u61Var != null) {
                    u61Var.W2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.u61 u61Var2 = this.b.a;
                if (u61Var2 != null) {
                    u61Var2.W2.N(true);
                    break;
                }
                break;
        }
    }
}
