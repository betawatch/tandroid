package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class e11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i11 b;
    public final /* synthetic */ int c;

    public /* synthetic */ e11(i11 i11Var, int i10, int i11) {
        this.a = i11;
        this.b = i11Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i11 i11Var = this.b;
                org.telegram.ui.Components.k91 k91Var = i11Var.n;
                h11 h11Var = i11Var.s;
                int i10 = this.c;
                k91Var.d(i10, h11Var.i(i10));
                break;
            default:
                i11 i11Var2 = this.b;
                org.telegram.ui.Components.k91 k91Var2 = i11Var2.n;
                h11 h11Var2 = i11Var2.s;
                int i11 = this.c;
                k91Var2.d(i11, h11Var2.i(i11));
                break;
        }
    }
}
