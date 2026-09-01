package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zv0 b;

    public /* synthetic */ xv0(zv0 zv0Var, int i10) {
        this.a = i10;
        this.b = zv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zv0 zv0Var = this.b;
                zv0Var.S0 = false;
                if (!zv0Var.V0 && zv0Var.T0) {
                    zv0Var.A(true);
                    break;
                }
                break;
            case 1:
                this.b.S0 = false;
                break;
            case 2:
                zv0 zv0Var2 = this.b;
                zv0Var2.V0 = false;
                if (!zv0Var2.S0 && zv0Var2.T0) {
                    zv0Var2.A(true);
                    break;
                }
                break;
            default:
                this.b.V0 = false;
                break;
        }
    }
}
