package org.telegram.ui.Components;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;
    public final /* synthetic */ i80 c;

    public /* synthetic */ h7(k8 k8Var, i80 i80Var, int i10) {
        this.a = i10;
        this.b = k8Var;
        this.c = i80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k8 k8Var = this.b;
                k8Var.getClass();
                this.c.u();
                k8Var.u0(1);
                break;
            case 1:
                k8 k8Var2 = this.b;
                k8Var2.getClass();
                this.c.u();
                k8Var2.u0(2);
                break;
            case 2:
                k8 k8Var3 = this.b;
                k8Var3.getClass();
                this.c.u();
                k8Var3.u0(4);
                break;
            case 3:
                k8 k8Var4 = this.b;
                k8Var4.getClass();
                this.c.u();
                k8Var4.u0(7);
                break;
            default:
                k8.r(this.b, this.c);
                break;
        }
    }
}
