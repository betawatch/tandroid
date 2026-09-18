package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;
    public final /* synthetic */ n70 c;

    public /* synthetic */ e7(h8 h8Var, n70 n70Var, int i10) {
        this.a = i10;
        this.b = h8Var;
        this.c = n70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h8 h8Var = this.b;
                h8Var.getClass();
                this.c.u();
                h8Var.t0(1);
                break;
            case 1:
                h8 h8Var2 = this.b;
                h8Var2.getClass();
                this.c.u();
                h8Var2.t0(2);
                break;
            case 2:
                h8 h8Var3 = this.b;
                h8Var3.getClass();
                this.c.u();
                h8Var3.t0(4);
                break;
            case 3:
                h8 h8Var4 = this.b;
                h8Var4.getClass();
                this.c.u();
                h8Var4.t0(7);
                break;
            default:
                h8.q(this.b, this.c);
                break;
        }
    }
}
