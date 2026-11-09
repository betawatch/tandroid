package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ xo0(zs0 zs0Var, int i7, int i10) {
        this.a = i10;
        this.b = zs0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s1(this.c);
                break;
            case 1:
                zs0 zs0Var = this.b;
                zs0Var.a1(zs0Var.x1, zs0Var.l1, this.c);
                break;
            case 2:
                this.b.r1(this.c, false);
                break;
            case 3:
                this.b.s1(this.c);
                break;
            default:
                zs0 zs0Var2 = this.b;
                zs0Var2.b1(zs0Var2.x1, zs0Var2.l1, this.c);
                break;
        }
    }
}
