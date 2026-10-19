package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                org.telegram.ui.Components.c91 c91Var = e11Var.n;
                d11 d11Var = e11Var.s;
                int i10 = this.c;
                c91Var.d(i10, d11Var.i(i10));
                break;
            default:
                e11 e11Var2 = this.b;
                org.telegram.ui.Components.c91 c91Var2 = e11Var2.n;
                d11 d11Var2 = e11Var2.s;
                int i11 = this.c;
                c91Var2.d(i11, d11Var2.i(i11));
                break;
        }
    }
}
