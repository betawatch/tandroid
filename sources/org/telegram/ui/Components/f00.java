package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class f00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h00 h00Var = (h00) this.e;
                if (this.b) {
                    l00 l00Var = h00Var.J;
                    l00Var.a = true;
                    l00Var.b = true;
                }
                if (this.c) {
                    h00Var.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(h00Var.a0 - currentTimeMillis) > 30) {
                    h00Var.a0 = currentTimeMillis;
                    h00Var.d0.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.bh0) this.e).w1(this.b, this.c, this.d);
                break;
        }
    }
}
