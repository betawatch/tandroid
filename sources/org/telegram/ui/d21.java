package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class d21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h21 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d21(h21 h21Var, int i10, int i11) {
        this.a = i11;
        this.b = h21Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h21 h21Var = this.b;
                org.telegram.ui.Components.j91 j91Var = h21Var.n;
                g21 g21Var = h21Var.s;
                int i10 = this.c;
                j91Var.d(i10, g21Var.i(i10));
                break;
            default:
                h21 h21Var2 = this.b;
                org.telegram.ui.Components.j91 j91Var2 = h21Var2.n;
                g21 g21Var2 = h21Var2.s;
                int i11 = this.c;
                j91Var2.d(i11, g21Var2.i(i11));
                break;
        }
    }
}
