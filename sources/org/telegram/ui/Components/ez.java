package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ez implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ez(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.utils.twidget.w wVar;
        q81 q81Var;
        switch (this.a) {
            case 0:
                gz gzVar = (gz) this.e;
                boolean z10 = this.b;
                boolean z11 = this.c;
                boolean z12 = this.d;
                if (z10) {
                    jz jzVar = gzVar.J;
                    jzVar.a = true;
                    jzVar.b = true;
                }
                if (z11) {
                    gzVar.y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(gzVar.a0 - currentTimeMillis) > 30) {
                    gzVar.a0 = currentTimeMillis;
                    gzVar.d0.run();
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.hf0) this.e).E1(this.b, this.c, this.d);
                break;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.e;
                boolean z13 = this.b;
                boolean z14 = this.c;
                boolean z15 = this.d;
                if (!k0Var.u && (wVar = k0Var.J) != null && (q81Var = wVar.h) != null && q81Var.w && !q81Var.x) {
                    q81Var.l(z13, z14, z15);
                    break;
                }
                break;
        }
    }
}
