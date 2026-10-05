package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ h0(i0 i0Var, int i10) {
        this.a = i10;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                break;
            default:
                i0 i0Var = this.b;
                i0Var.c.d(0.0f, true);
                i0Var.invalidateSelf();
                break;
        }
    }
}
