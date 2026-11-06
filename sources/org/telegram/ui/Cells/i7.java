package org.telegram.ui.Cells;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ i7(k7 k7Var, int i7) {
        this.a = i7;
        this.b = k7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k7 k7Var = this.b;
                k7Var.post(new i7(k7Var, 1));
                break;
            default:
                k7 k7Var2 = this.b;
                k7Var2.b0.L0 = true;
                k7Var2.H.clear();
                k7Var2.I.clear();
                k7Var2.J.clear();
                k7Var2.invalidate();
                break;
        }
    }
}
