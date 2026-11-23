package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
