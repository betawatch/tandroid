package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ex0 b;

    public /* synthetic */ cx0(ex0 ex0Var, int i10) {
        this.a = i10;
        this.b = ex0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ex0 ex0Var = this.b;
                ex0Var.V0 = false;
                if (!ex0Var.Y0 && ex0Var.W0) {
                    ex0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                ex0 ex0Var2 = this.b;
                ex0Var2.Y0 = false;
                if (!ex0Var2.V0 && ex0Var2.W0) {
                    ex0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
