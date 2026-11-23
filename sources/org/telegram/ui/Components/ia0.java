package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ja0 b;

    public /* synthetic */ ia0(ja0 ja0Var, int i7) {
        this.a = i7;
        this.b = ja0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ja0 ja0Var = this.b;
                if (ja0Var.W != -1) {
                    org.telegram.messenger.ks.f(ja0Var.Y.d0.x).j(ja0Var.W);
                    ja0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.i();
                break;
            default:
                ja0 ja0Var2 = this.b;
                if (ja0Var2.W != -1) {
                    org.telegram.messenger.ks.f(ja0Var2.Y.d0.x).j(ja0Var2.W);
                    ja0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
