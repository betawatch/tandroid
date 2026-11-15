package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aa0 b;

    public /* synthetic */ z90(aa0 aa0Var, int i7) {
        this.a = i7;
        this.b = aa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aa0 aa0Var = this.b;
                if (aa0Var.W != -1) {
                    org.telegram.messenger.ns.f(aa0Var.Y.d0.x).j(aa0Var.W);
                    aa0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.i();
                break;
            default:
                aa0 aa0Var2 = this.b;
                if (aa0Var2.W != -1) {
                    org.telegram.messenger.ns.f(aa0Var2.Y.d0.x).j(aa0Var2.W);
                    aa0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
