package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih1 b;

    public /* synthetic */ hh1(ih1 ih1Var, int i10) {
        this.a = i10;
        this.b = ih1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.n61 n61Var = this.b.a;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.n61 n61Var2 = this.b.a;
                if (n61Var2 != null) {
                    n61Var2.Y2.N(true);
                    break;
                }
                break;
        }
    }
}
