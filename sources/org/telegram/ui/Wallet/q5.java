package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;

    public /* synthetic */ q5(s5 s5Var, int i10) {
        this.a = i10;
        this.b = s5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performClick();
                break;
            default:
                s5 s5Var = this.b;
                s5Var.h.invalidate();
                s5Var.n.invalidate();
                s5Var.e.invalidate();
                break;
        }
    }
}
