package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xb1 xb1Var;
        switch (this.a) {
            case 0:
                e00 e00Var = (e00) this.e;
                boolean z10 = this.b;
                boolean z11 = this.c;
                boolean z12 = this.d;
                if (z10) {
                    i00 i00Var = e00Var.J;
                    i00Var.a = true;
                    i00Var.b = true;
                }
                if (z11) {
                    e00Var.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(e00Var.a0 - currentTimeMillis) > 30) {
                    e00Var.a0 = currentTimeMillis;
                    e00Var.d0.run();
                    break;
                }
                break;
            case 1:
                yb1 yb1Var = (yb1) this.e;
                boolean z13 = this.b;
                boolean z14 = this.c;
                boolean z15 = this.d;
                if (!yb1Var.s && (xb1Var = yb1Var.H) != null) {
                    xb1Var.b(z13, z14, z15);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.gg0) this.e).B1(this.b, this.c, this.d);
                break;
        }
    }
}
