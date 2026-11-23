package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class r6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t6 b;

    public /* synthetic */ r6(t6 t6Var, int i7) {
        this.a = i7;
        this.b = t6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performClick();
                break;
            default:
                t6 t6Var = this.b;
                t6Var.h.invalidate();
                t6Var.n.invalidate();
                t6Var.e.invalidate();
                break;
        }
    }
}
