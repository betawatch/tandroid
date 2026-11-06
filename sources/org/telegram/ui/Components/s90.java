package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca0 b;

    public /* synthetic */ s90(ca0 ca0Var, int i7) {
        this.a = i7;
        this.b = ca0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ca0 ca0Var = this.b;
                bi.q1 q1Var = ca0Var.f;
                if (!ca0Var.c0.d.r) {
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
