package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lu0 b;

    public /* synthetic */ ju0(lu0 lu0Var, int i7) {
        this.a = i7;
        this.b = lu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lu0 lu0Var = this.b;
                lu0Var.W0 = false;
                if (!lu0Var.Z0 && lu0Var.X0) {
                    lu0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.W0 = false;
                break;
            case 2:
                lu0 lu0Var2 = this.b;
                lu0Var2.Z0 = false;
                if (!lu0Var2.W0 && lu0Var2.X0) {
                    lu0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Z0 = false;
                break;
        }
    }
}
