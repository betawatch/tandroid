package org.telegram.ui.Components;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;
    public final /* synthetic */ j80 c;

    public /* synthetic */ h7(k8 k8Var, j80 j80Var, int i10) {
        this.a = i10;
        this.b = k8Var;
        this.c = j80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k8 k8Var = this.b;
                k8Var.getClass();
                this.c.u();
                k8Var.A0(1);
                break;
            case 1:
                k8 k8Var2 = this.b;
                k8Var2.getClass();
                this.c.u();
                k8Var2.A0(2);
                break;
            case 2:
                k8 k8Var3 = this.b;
                k8Var3.getClass();
                this.c.u();
                k8Var3.A0(4);
                break;
            case 3:
                k8 k8Var4 = this.b;
                k8Var4.getClass();
                this.c.u();
                k8Var4.A0(7);
                break;
            default:
                k8.n(this.b, this.c);
                break;
        }
    }
}
