package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n11 b;
    public final /* synthetic */ int c;

    public /* synthetic */ l11(n11 n11Var, int i10, int i11) {
        this.a = i11;
        this.b = n11Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n11 n11Var = this.b;
                org.telegram.ui.Components.u91 u91Var = n11Var.b;
                m11 m11Var = n11Var.d;
                int i10 = this.c;
                u91Var.d(i10, m11Var.i(i10));
                break;
            default:
                n11 n11Var2 = this.b;
                org.telegram.ui.Components.u91 u91Var2 = n11Var2.b;
                m11 m11Var2 = n11Var2.d;
                int i11 = this.c;
                u91Var2.d(i11, m11Var2.i(i11));
                break;
        }
    }
}
