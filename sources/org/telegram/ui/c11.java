package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g11 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c11(g11 g11Var, int i10, int i11) {
        this.a = i11;
        this.b = g11Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g11 g11Var = this.b;
                org.telegram.ui.Components.b91 b91Var = g11Var.n;
                f11 f11Var = g11Var.s;
                int i10 = this.c;
                b91Var.d(i10, f11Var.i(i10));
                break;
            default:
                g11 g11Var2 = this.b;
                org.telegram.ui.Components.b91 b91Var2 = g11Var2.n;
                f11 f11Var2 = g11Var2.s;
                int i11 = this.c;
                b91Var2.d(i11, f11Var2.i(i11));
                break;
        }
    }
}
