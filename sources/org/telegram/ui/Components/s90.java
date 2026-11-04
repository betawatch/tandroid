package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t90 b;

    public /* synthetic */ s90(t90 t90Var, int i3) {
        this.a = i3;
        this.b = t90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t90 t90Var = this.b;
                if (t90Var.W != -1) {
                    org.telegram.messenger.hs.f(t90Var.Y.d0.x).j(t90Var.W);
                    t90Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.i();
                break;
            default:
                t90 t90Var2 = this.b;
                if (t90Var2.W != -1) {
                    org.telegram.messenger.hs.f(t90Var2.Y.d0.x).j(t90Var2.W);
                    t90Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
