package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z90 b;

    public /* synthetic */ y90(z90 z90Var, int i7) {
        this.a = i7;
        this.b = z90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z90 z90Var = this.b;
                if (z90Var.W != -1) {
                    org.telegram.messenger.qs.f(z90Var.Y.c0.x).j(z90Var.W);
                    z90Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.i();
                break;
            default:
                z90 z90Var2 = this.b;
                if (z90Var2.W != -1) {
                    org.telegram.messenger.qs.f(z90Var2.Y.c0.x).j(z90Var2.W);
                    z90Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
