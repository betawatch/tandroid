package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m11 b;
    public final /* synthetic */ int c;

    public /* synthetic */ h11(m11 m11Var, int i10, int i11) {
        this.a = i11;
        this.b = m11Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m11 m11Var = this.b;
                org.telegram.ui.Components.l81 l81Var = m11Var.n;
                l11 l11Var = m11Var.s;
                int i10 = this.c;
                l81Var.d(i10, l11Var.i(i10));
                break;
            default:
                m11 m11Var2 = this.b;
                org.telegram.ui.Components.l81 l81Var2 = m11Var2.n;
                l11 l11Var2 = m11Var2.s;
                int i11 = this.c;
                l81Var2.d(i11, l11Var2.i(i11));
                break;
        }
    }
}
