package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e11 b;
    public final /* synthetic */ int c;

    public /* synthetic */ a11(e11 e11Var, int i10, int i11) {
        this.a = i11;
        this.b = e11Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e11 e11Var = this.b;
                org.telegram.ui.Components.d91 d91Var = e11Var.n;
                d11 d11Var = e11Var.s;
                int i10 = this.c;
                d91Var.d(i10, d11Var.i(i10));
                break;
            default:
                e11 e11Var2 = this.b;
                org.telegram.ui.Components.d91 d91Var2 = e11Var2.n;
                d11 d11Var2 = e11Var2.s;
                int i11 = this.c;
                d91Var2.d(i11, d11Var2.i(i11));
                break;
        }
    }
}
