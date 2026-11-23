package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
