package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tj0 b;

    public /* synthetic */ mj0(tj0 tj0Var, int i10) {
        this.a = i10;
        this.b = tj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.U(true, false);
                break;
            default:
                this.b.U(true, false);
                break;
        }
    }
}
