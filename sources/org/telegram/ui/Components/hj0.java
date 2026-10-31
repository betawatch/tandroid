package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kj0 b;

    public /* synthetic */ hj0(kj0 kj0Var, int i10) {
        this.a = i10;
        this.b = kj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (this.b.a.getImageReceiver().B() != null && !this.b.a.getImageReceiver().B().k0 && !this.b.a.getImageReceiver().B().y()) {
                    this.b.a.getImageReceiver().B().start();
                }
                this.b.E = false;
                break;
            default:
                kj0 kj0Var = this.b;
                mj0 mj0Var = kj0Var.P;
                try {
                    kj0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                mj0Var.m0 = mj0Var.T.indexOf(kj0Var.e);
                mj0Var.l0 = kj0Var.e;
                mj0Var.invalidate();
                break;
        }
    }
}
