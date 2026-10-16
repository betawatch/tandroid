package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                org.telegram.ui.Components.k91 k91Var = h21Var.n;
                g21 g21Var = h21Var.s;
                int i10 = this.c;
                k91Var.d(i10, g21Var.i(i10));
                break;
            default:
                h21 h21Var2 = this.b;
                org.telegram.ui.Components.k91 k91Var2 = h21Var2.n;
                g21 g21Var2 = h21Var2.s;
                int i11 = this.c;
                k91Var2.d(i11, g21Var2.i(i11));
                break;
        }
    }
}
