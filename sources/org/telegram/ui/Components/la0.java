package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class la0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ua0 b;

    public /* synthetic */ la0(ua0 ua0Var, int i10) {
        this.a = i10;
        this.b = ua0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ua0 ua0Var = this.b;
                ag.b1 b1Var = ua0Var.f;
                if (!ua0Var.c0.d.r) {
                    b1Var.x0(b1Var.computeVerticalScrollRange() - (b1Var.computeVerticalScrollExtent() + b1Var.computeVerticalScrollOffset()), org.telegram.messenger.zs.Z3, ci.o.V);
                    break;
                } else {
                    b1Var.x0(-b1Var.computeVerticalScrollOffset(), org.telegram.messenger.zs.Z3, ci.o.V);
                    break;
                }
            default:
                this.b.h(true, false);
                break;
        }
    }
}
