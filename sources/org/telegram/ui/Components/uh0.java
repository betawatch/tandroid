package org.telegram.ui.Components;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xh0 b;

    public /* synthetic */ uh0(xh0 xh0Var, int i10) {
        this.a = i10;
        this.b = xh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(true);
                break;
            default:
                this.b.d();
                break;
        }
    }
}
