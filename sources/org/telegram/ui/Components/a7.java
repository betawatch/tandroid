package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;
    public final /* synthetic */ x60 c;

    public /* synthetic */ a7(c8 c8Var, x60 x60Var, int i9) {
        this.a = i9;
        this.b = c8Var;
        this.c = x60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c8 c8Var = this.b;
                c8Var.getClass();
                this.c.u();
                c8Var.s0(1);
                break;
            case 1:
                c8 c8Var2 = this.b;
                c8Var2.getClass();
                this.c.u();
                c8Var2.s0(2);
                break;
            case 2:
                c8 c8Var3 = this.b;
                c8Var3.getClass();
                this.c.u();
                c8Var3.s0(4);
                break;
            case 3:
                c8 c8Var4 = this.b;
                c8Var4.getClass();
                this.c.u();
                c8Var4.s0(7);
                break;
            default:
                c8.q(this.b, this.c);
                break;
        }
    }
}
