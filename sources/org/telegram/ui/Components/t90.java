package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da0 b;

    public /* synthetic */ t90(da0 da0Var, int i7) {
        this.a = i7;
        this.b = da0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                da0 da0Var = this.b;
                bi.q1 q1Var = da0Var.f;
                if (!da0Var.c0.d.r) {
                    q1Var.x0(q1Var.computeVerticalScrollRange() - (q1Var.computeVerticalScrollExtent() + q1Var.computeVerticalScrollOffset()), org.telegram.messenger.qs.Z3, mi.l.V);
                    break;
                } else {
                    q1Var.x0(-q1Var.computeVerticalScrollOffset(), org.telegram.messenger.qs.Z3, mi.l.V);
                    break;
                }
            default:
                this.b.h(true, false);
                break;
        }
    }
}
