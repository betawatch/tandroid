package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                org.telegram.ui.Components.v61 v61Var = this.b.a;
                if (v61Var != null) {
                    v61Var.W2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.v61 v61Var2 = this.b.a;
                if (v61Var2 != null) {
                    v61Var2.W2.N(true);
                    break;
                }
                break;
        }
    }
}
