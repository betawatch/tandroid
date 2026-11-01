package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ au0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ zp0(au0 au0Var, int i10, int i11) {
        this.a = i11;
        this.b = au0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o1(this.c);
                break;
            case 1:
                au0 au0Var = this.b;
                au0Var.W0(au0Var.x1, au0Var.l1, this.c);
                break;
            case 2:
                this.b.n1(this.c, false);
                break;
            case 3:
                this.b.o1(this.c);
                break;
            default:
                au0 au0Var2 = this.b;
                au0Var2.X0(au0Var2.x1, au0Var2.l1, this.c);
                break;
        }
    }
}
