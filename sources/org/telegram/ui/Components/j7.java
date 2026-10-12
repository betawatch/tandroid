package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;
    public final /* synthetic */ m80 c;

    public /* synthetic */ j7(m8 m8Var, m80 m80Var, int i10) {
        this.a = i10;
        this.b = m8Var;
        this.c = m80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m8 m8Var = this.b;
                m8Var.getClass();
                this.c.u();
                m8Var.u0(1);
                break;
            case 1:
                m8 m8Var2 = this.b;
                m8Var2.getClass();
                this.c.u();
                m8Var2.u0(2);
                break;
            case 2:
                m8 m8Var3 = this.b;
                m8Var3.getClass();
                this.c.u();
                m8Var3.u0(4);
                break;
            case 3:
                m8 m8Var4 = this.b;
                m8Var4.getClass();
                this.c.u();
                m8Var4.u0(7);
                break;
            default:
                m8.s(this.b, this.c);
                break;
        }
    }
}
