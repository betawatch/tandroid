package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;
    public final /* synthetic */ p70 c;

    public /* synthetic */ b7(c8 c8Var, p70 p70Var, int i10) {
        this.a = i10;
        this.b = c8Var;
        this.c = p70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c8 c8Var = this.b;
                c8Var.getClass();
                this.c.u();
                c8Var.t0(1);
                break;
            case 1:
                c8 c8Var2 = this.b;
                c8Var2.getClass();
                this.c.u();
                c8Var2.t0(2);
                break;
            case 2:
                c8 c8Var3 = this.b;
                c8Var3.getClass();
                this.c.u();
                c8Var3.t0(4);
                break;
            case 3:
                c8 c8Var4 = this.b;
                c8Var4.getClass();
                this.c.u();
                c8Var4.t0(7);
                break;
            default:
                c8.q(this.b, this.c);
                break;
        }
    }
}
