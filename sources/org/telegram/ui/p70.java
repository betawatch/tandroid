package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
