package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa0 b;

    public /* synthetic */ ha0(qa0 qa0Var, int i7) {
        this.a = i7;
        this.b = qa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qa0 qa0Var = this.b;
                di.b1 b1Var = qa0Var.f;
                if (!qa0Var.d0.d.r) {
                    b1Var.x0(b1Var.computeVerticalScrollRange() - (b1Var.computeVerticalScrollExtent() + b1Var.computeVerticalScrollOffset()), org.telegram.messenger.ks.Z3, pi.k.V);
                    break;
                } else {
                    b1Var.x0(-b1Var.computeVerticalScrollOffset(), org.telegram.messenger.ks.Z3, pi.k.V);
                    break;
                }
            default:
                this.b.h(true, false);
                break;
        }
    }
}
