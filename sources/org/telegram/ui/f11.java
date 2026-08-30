package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j11 b;
    public final /* synthetic */ int c;

    public /* synthetic */ f11(j11 j11Var, int i10, int i11) {
        this.a = i11;
        this.b = j11Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j11 j11Var = this.b;
                org.telegram.ui.Components.k81 k81Var = j11Var.n;
                i11 i11Var = j11Var.s;
                int i10 = this.c;
                k81Var.d(i10, i11Var.i(i10));
                break;
            default:
                j11 j11Var2 = this.b;
                org.telegram.ui.Components.k81 k81Var2 = j11Var2.n;
                i11 i11Var2 = j11Var2.s;
                int i11 = this.c;
                k81Var2.d(i11, i11Var2.i(i11));
                break;
        }
    }
}
