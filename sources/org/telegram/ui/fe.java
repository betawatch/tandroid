package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.yk0 b;

    public /* synthetic */ fe(org.telegram.ui.Components.yk0 yk0Var, int i7) {
        this.a = i7;
        this.b = yk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.yk0 yk0Var = this.b;
                if (!yk0Var.N) {
                    yk0Var.N = true;
                    yk0Var.c(new org.telegram.ui.Components.wk0(yk0Var, 0), false);
                    yk0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
