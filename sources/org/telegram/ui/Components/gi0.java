package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ji0 b;

    public /* synthetic */ gi0(ji0 ji0Var, int i3) {
        this.a = i3;
        this.b = ji0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (this.b.a.getImageReceiver().B() != null && !this.b.a.getImageReceiver().B().l0 && !this.b.a.getImageReceiver().B().y()) {
                    this.b.a.getImageReceiver().B().start();
                }
                this.b.F = false;
                break;
            default:
                ji0 ji0Var = this.b;
                li0 li0Var = ji0Var.Q;
                try {
                    ji0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                li0Var.n0 = li0Var.U.indexOf(ji0Var.e);
                li0Var.m0 = ji0Var.e;
                li0Var.invalidate();
                break;
        }
    }
}
