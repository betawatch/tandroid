package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class q11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u11 b;
    public final /* synthetic */ int c;

    public /* synthetic */ q11(u11 u11Var, int i10, int i11) {
        this.a = i11;
        this.b = u11Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u11 u11Var = this.b;
                org.telegram.ui.Components.g81 g81Var = u11Var.n;
                t11 t11Var = u11Var.s;
                int i10 = this.c;
                g81Var.d(i10, t11Var.i(i10));
                break;
            default:
                u11 u11Var2 = this.b;
                org.telegram.ui.Components.g81 g81Var2 = u11Var2.n;
                t11 t11Var2 = u11Var2.s;
                int i11 = this.c;
                g81Var2.d(i11, t11Var2.i(i11));
                break;
        }
    }
}
