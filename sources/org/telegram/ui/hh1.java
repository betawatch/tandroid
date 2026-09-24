package org.telegram.ui;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                org.telegram.ui.Components.l61 l61Var = this.b.a;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.l61 l61Var2 = this.b.a;
                if (l61Var2 != null) {
                    l61Var2.Y2.N(true);
                    break;
                }
                break;
        }
    }
}
