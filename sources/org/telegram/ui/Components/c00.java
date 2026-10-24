package org.telegram.ui.Components;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        switch (this.a) {
            case 0:
                e00 e00Var = (e00) this.e;
                if (this.b) {
                    i00 i00Var = e00Var.J;
                    i00Var.a = true;
                    i00Var.b = true;
                }
                if (this.c) {
                    e00Var.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(e00Var.a0 - currentTimeMillis) > 30) {
                    e00Var.a0 = currentTimeMillis;
                    e00Var.d0.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.ig0) this.e).A1(this.b, this.c, this.d);
                break;
        }
    }
}
