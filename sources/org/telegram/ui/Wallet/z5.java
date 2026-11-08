package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ z5(b6 b6Var, int i7) {
        this.a = i7;
        this.b = b6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performClick();
                break;
            default:
                b6 b6Var = this.b;
                b6Var.h.invalidate();
                b6Var.n.invalidate();
                b6Var.e.invalidate();
                break;
        }
    }
}
