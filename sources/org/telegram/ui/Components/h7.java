package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                k8.s(this.b, this.c);
                break;
        }
    }
}
