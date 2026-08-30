package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv0 b;

    public /* synthetic */ wv0(yv0 yv0Var, int i10) {
        this.a = i10;
        this.b = yv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yv0 yv0Var = this.b;
                yv0Var.S0 = false;
                if (!yv0Var.V0 && yv0Var.T0) {
                    yv0Var.A(true);
                    break;
                }
                break;
            case 1:
                this.b.S0 = false;
                break;
            case 2:
                yv0 yv0Var2 = this.b;
                yv0Var2.V0 = false;
                if (!yv0Var2.S0 && yv0Var2.T0) {
                    yv0Var2.A(true);
                    break;
                }
                break;
            default:
                this.b.V0 = false;
                break;
        }
    }
}
