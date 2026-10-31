package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa0 b;

    public /* synthetic */ pa0(qa0 qa0Var, int i10) {
        this.a = i10;
        this.b = qa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qa0 qa0Var = this.b;
                if (qa0Var.W != -1) {
                    org.telegram.messenger.zs.f(qa0Var.Y.c0.x).j(qa0Var.W);
                    qa0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.i();
                break;
            default:
                qa0 qa0Var2 = this.b;
                if (qa0Var2.W != -1) {
                    org.telegram.messenger.zs.f(qa0Var2.Y.c0.x).j(qa0Var2.W);
                    qa0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
