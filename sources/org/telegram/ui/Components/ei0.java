package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ei0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi0 b;

    public /* synthetic */ ei0(hi0 hi0Var, int i7) {
        this.a = i7;
        this.b = hi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (this.b.a.getImageReceiver().B() != null && !this.b.a.getImageReceiver().B().k0 && !this.b.a.getImageReceiver().B().y()) {
                    this.b.a.getImageReceiver().B().start();
                }
                this.b.E = false;
                break;
            default:
                hi0 hi0Var = this.b;
                ji0 ji0Var = hi0Var.P;
                try {
                    hi0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                ji0Var.m0 = ji0Var.T.indexOf(hi0Var.e);
                ji0Var.l0 = hi0Var.e;
                ji0Var.invalidate();
                break;
        }
    }
}
