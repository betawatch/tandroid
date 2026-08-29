package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;
    public final /* synthetic */ j70 c;

    public /* synthetic */ f7(g8 g8Var, j70 j70Var, int i10) {
        this.a = i10;
        this.b = g8Var;
        this.c = j70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g8 g8Var = this.b;
                g8Var.getClass();
                this.c.u();
                g8Var.t0(1);
                break;
            case 1:
                g8 g8Var2 = this.b;
                g8Var2.getClass();
                this.c.u();
                g8Var2.t0(2);
                break;
            case 2:
                g8 g8Var3 = this.b;
                g8Var3.getClass();
                this.c.u();
                g8Var3.t0(4);
                break;
            case 3:
                g8 g8Var4 = this.b;
                g8Var4.getClass();
                this.c.u();
                g8Var4.t0(7);
                break;
            default:
                g8.q(this.b, this.c);
                break;
        }
    }
}
