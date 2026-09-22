package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;
    public final /* synthetic */ y70 c;

    public /* synthetic */ f7(i8 i8Var, y70 y70Var, int i10) {
        this.a = i10;
        this.b = i8Var;
        this.c = y70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i8 i8Var = this.b;
                i8Var.getClass();
                this.c.u();
                i8Var.t0(1);
                break;
            case 1:
                i8 i8Var2 = this.b;
                i8Var2.getClass();
                this.c.u();
                i8Var2.t0(2);
                break;
            case 2:
                i8 i8Var3 = this.b;
                i8Var3.getClass();
                this.c.u();
                i8Var3.t0(4);
                break;
            case 3:
                i8 i8Var4 = this.b;
                i8Var4.getClass();
                this.c.u();
                i8Var4.t0(7);
                break;
            default:
                i8.q(this.b, this.c);
                break;
        }
    }
}
