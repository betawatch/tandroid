package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class my0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ py0 b;

    public /* synthetic */ my0(py0 py0Var, int i7) {
        this.a = i7;
        this.b = py0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                py0 py0Var = this.b;
                qy0 qy0Var = py0Var.w;
                if (py0Var.a != 0) {
                    qy0Var.onBackPressed();
                    break;
                } else {
                    qy0Var.dismiss();
                    break;
                }
            default:
                org.telegram.messenger.g0.I3(this.b.n.d);
                break;
        }
    }
}
