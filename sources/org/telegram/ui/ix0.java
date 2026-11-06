package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ix0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kx0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ix0(kx0 kx0Var, int i7, int i10) {
        this.a = i10;
        this.b = kx0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kx0 kx0Var = this.b;
                org.telegram.ui.Components.u61 u61Var = kx0Var.b;
                jx0 jx0Var = kx0Var.d;
                int i7 = this.c;
                u61Var.d(i7, jx0Var.i(i7));
                break;
            default:
                kx0 kx0Var2 = this.b;
                org.telegram.ui.Components.u61 u61Var2 = kx0Var2.b;
                jx0 jx0Var2 = kx0Var2.d;
                int i10 = this.c;
                u61Var2.d(i10, jx0Var2.i(i10));
                break;
        }
    }
}
