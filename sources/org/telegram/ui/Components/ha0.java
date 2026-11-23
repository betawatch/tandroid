package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                    b1Var.x0(b1Var.computeVerticalScrollRange() - (b1Var.computeVerticalScrollExtent() + b1Var.computeVerticalScrollOffset()), org.telegram.messenger.ls.Z3, pi.k.V);
                    break;
                } else {
                    b1Var.x0(-b1Var.computeVerticalScrollOffset(), org.telegram.messenger.ls.Z3, pi.k.V);
                    break;
                }
            default:
                this.b.h(true, false);
                break;
        }
    }
}
