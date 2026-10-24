package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class p70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x70 b;

    public /* synthetic */ p70(x70 x70Var, int i10) {
        this.a = i10;
        this.b = x70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x70 x70Var = this.b;
                x70Var.h.postOnAnimation(new p70(x70Var, 1));
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
