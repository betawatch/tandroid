package org.telegram.ui.Components;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;
    public final /* synthetic */ n70 c;

    public /* synthetic */ h7(k8 k8Var, n70 n70Var, int i10) {
        this.a = i10;
        this.b = k8Var;
        this.c = n70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k8 k8Var = this.b;
                k8Var.getClass();
                this.c.u();
                k8Var.t0(1);
                break;
            case 1:
                k8 k8Var2 = this.b;
                k8Var2.getClass();
                this.c.u();
                k8Var2.t0(2);
                break;
            case 2:
                k8 k8Var3 = this.b;
                k8Var3.getClass();
                this.c.u();
                k8Var3.t0(4);
                break;
            case 3:
                k8 k8Var4 = this.b;
                k8Var4.getClass();
                this.c.u();
                k8Var4.t0(7);
                break;
            default:
                k8.q(this.b, this.c);
                break;
        }
    }
}
