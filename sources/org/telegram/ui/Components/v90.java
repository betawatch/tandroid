package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ea0 b;

    public /* synthetic */ v90(ea0 ea0Var, int i7) {
        this.a = i7;
        this.b = ea0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ea0 ea0Var = this.b;
                di.c1 c1Var = ea0Var.f;
                if (!ea0Var.d0.d.r) {
                    c1Var.x0(c1Var.computeVerticalScrollRange() - (c1Var.computeVerticalScrollExtent() + c1Var.computeVerticalScrollOffset()), org.telegram.messenger.ns.Z3, pi.k.V);
                    break;
                } else {
                    c1Var.x0(-c1Var.computeVerticalScrollOffset(), org.telegram.messenger.ns.Z3, pi.k.V);
                    break;
                }
            default:
                this.b.h(true, false);
                break;
        }
    }
}
