package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.kk0 b;

    public /* synthetic */ ge(org.telegram.ui.Components.kk0 kk0Var, int i7) {
        this.a = i7;
        this.b = kk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.kk0 kk0Var = this.b;
                if (!kk0Var.M) {
                    kk0Var.M = true;
                    kk0Var.c(new org.telegram.ui.Components.ik0(kk0Var, 0), false);
                    kk0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
