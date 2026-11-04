package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x90 b;

    public /* synthetic */ o90(x90 x90Var, int i3) {
        this.a = i3;
        this.b = x90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x90 x90Var = this.b;
                ci.j1 j1Var = x90Var.f;
                if (!x90Var.d0.d.r) {
                    j1Var.x0(j1Var.computeVerticalScrollRange() - (j1Var.computeVerticalScrollExtent() + j1Var.computeVerticalScrollOffset()), org.telegram.messenger.hs.Z3, ni.l.V);
                    break;
                } else {
                    j1Var.x0(-j1Var.computeVerticalScrollOffset(), org.telegram.messenger.hs.Z3, ni.l.V);
                    break;
                }
            default:
                this.b.h(true, false);
                break;
        }
    }
}
