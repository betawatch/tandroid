package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg0 b;

    public /* synthetic */ yf0(dg0 dg0Var, int i10) {
        this.a = i10;
        this.b = dg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            default:
                this.b.g();
                break;
        }
    }
}
