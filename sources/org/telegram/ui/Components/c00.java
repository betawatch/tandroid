package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        cc1 cc1Var;
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
                dc1 dc1Var = (dc1) this.e;
                boolean z13 = this.b;
                boolean z14 = this.c;
                boolean z15 = this.d;
                if (!dc1Var.t && (cc1Var = dc1Var.I) != null) {
                    cc1Var.d(z13, z14, z15);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.ig0) this.e).B1(this.b, this.c, this.d);
                break;
        }
    }
}
