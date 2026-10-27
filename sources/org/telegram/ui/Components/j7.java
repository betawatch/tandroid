package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;
    public final /* synthetic */ l80 c;

    public /* synthetic */ j7(m8 m8Var, l80 l80Var, int i10) {
        this.a = i10;
        this.b = m8Var;
        this.c = l80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m8 m8Var = this.b;
                m8Var.getClass();
                this.c.u();
                m8Var.A0(1);
                break;
            case 1:
                m8 m8Var2 = this.b;
                m8Var2.getClass();
                this.c.u();
                m8Var2.A0(2);
                break;
            case 2:
                m8 m8Var3 = this.b;
                m8Var3.getClass();
                this.c.u();
                m8Var3.A0(4);
                break;
            case 3:
                m8 m8Var4 = this.b;
                m8Var4.getClass();
                this.c.u();
                m8Var4.A0(7);
                break;
            default:
                m8.n(this.b, this.c);
                break;
        }
    }
}
