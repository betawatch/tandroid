package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ zr0(bw0 bw0Var, int i10, int i11) {
        this.a = i11;
        this.b = bw0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m1(this.c);
                break;
            case 1:
                bw0 bw0Var = this.b;
                bw0Var.U0(bw0Var.x1, bw0Var.l1, this.c);
                break;
            case 2:
                this.b.l1(this.c, false);
                break;
            case 3:
                this.b.m1(this.c);
                break;
            default:
                bw0 bw0Var2 = this.b;
                bw0Var2.V0(bw0Var2.x1, bw0Var2.l1, this.c);
                break;
        }
    }
}
