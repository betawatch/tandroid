package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ny0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy0 b;

    public /* synthetic */ ny0(qy0 qy0Var, int i7) {
        this.a = i7;
        this.b = qy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qy0 qy0Var = this.b;
                ry0 ry0Var = qy0Var.w;
                if (qy0Var.a != 0) {
                    ry0Var.onBackPressed();
                    break;
                } else {
                    ry0Var.dismiss();
                    break;
                }
            default:
                org.telegram.messenger.g0.K3(this.b.n.d);
                break;
        }
    }
}
