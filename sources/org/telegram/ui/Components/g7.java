package org.telegram.ui.Components;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;
    public final /* synthetic */ y70 c;

    public /* synthetic */ g7(j8 j8Var, y70 y70Var, int i10) {
        this.a = i10;
        this.b = j8Var;
        this.c = y70Var;
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
