package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;
    public final /* synthetic */ b70 c;

    public /* synthetic */ a7(b8 b8Var, b70 b70Var, int i10) {
        this.a = i10;
        this.b = b8Var;
        this.c = b70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b8 b8Var = this.b;
                b8Var.getClass();
                this.c.u();
                b8Var.t0(1);
                break;
            case 1:
                b8 b8Var2 = this.b;
                b8Var2.getClass();
                this.c.u();
                b8Var2.t0(2);
                break;
            case 2:
                b8 b8Var3 = this.b;
                b8Var3.getClass();
                this.c.u();
                b8Var3.t0(4);
                break;
            case 3:
                b8 b8Var4 = this.b;
                b8Var4.getClass();
                this.c.u();
                b8Var4.t0(7);
                break;
            default:
                b8.r(this.b, this.c);
                break;
        }
    }
}
