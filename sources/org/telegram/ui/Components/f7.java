package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;
    public final /* synthetic */ w70 c;

    public /* synthetic */ f7(j8 j8Var, w70 w70Var, int i10) {
        this.a = i10;
        this.b = j8Var;
        this.c = w70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j8 j8Var = this.b;
                j8Var.getClass();
                this.c.u();
                j8Var.t0(1);
                break;
            case 1:
                j8 j8Var2 = this.b;
                j8Var2.getClass();
                this.c.u();
                j8Var2.t0(2);
                break;
            case 2:
                j8 j8Var3 = this.b;
                j8Var3.getClass();
                this.c.u();
                j8Var3.t0(4);
                break;
            case 3:
                j8 j8Var4 = this.b;
                j8Var4.getClass();
                this.c.u();
                j8Var4.t0(7);
                break;
            default:
                j8.q(this.b, this.c);
                break;
        }
    }
}
