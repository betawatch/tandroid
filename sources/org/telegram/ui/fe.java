package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.wk0 b;

    public /* synthetic */ fe(org.telegram.ui.Components.wk0 wk0Var, int i7) {
        this.a = i7;
        this.b = wk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.wk0 wk0Var = this.b;
                if (!wk0Var.N) {
                    wk0Var.N = true;
                    wk0Var.c(new org.telegram.ui.Components.uk0(wk0Var, 0), false);
                    wk0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
