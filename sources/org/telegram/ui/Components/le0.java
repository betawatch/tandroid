package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class le0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oe0 b;

    public /* synthetic */ le0(oe0 oe0Var, int i7) {
        this.a = i7;
        this.b = oe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.a(false);
                break;
            default:
                oe0 oe0Var = this.b;
                Runnable runnable = oe0Var.I;
                oe0Var.I = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = oe0Var.J;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
