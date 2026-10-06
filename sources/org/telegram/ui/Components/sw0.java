package org.telegram.ui.Components;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw0 b;

    public /* synthetic */ sw0(uw0 uw0Var, int i10) {
        this.a = i10;
        this.b = uw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uw0 uw0Var = this.b;
                uw0Var.V0 = false;
                if (!uw0Var.Y0 && uw0Var.W0) {
                    uw0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                uw0 uw0Var2 = this.b;
                uw0Var2.Y0 = false;
                if (!uw0Var2.V0 && uw0Var2.W0) {
                    uw0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
