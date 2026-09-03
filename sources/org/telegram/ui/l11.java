package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q11 b;
    public final /* synthetic */ int c;

    public /* synthetic */ l11(q11 q11Var, int i10, int i11) {
        this.a = i11;
        this.b = q11Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q11 q11Var = this.b;
                org.telegram.ui.Components.k81 k81Var = q11Var.n;
                p11 p11Var = q11Var.s;
                int i10 = this.c;
                k81Var.d(i10, p11Var.i(i10));
                break;
            default:
                q11 q11Var2 = this.b;
                org.telegram.ui.Components.k81 k81Var2 = q11Var2.n;
                p11 p11Var2 = q11Var2.s;
                int i11 = this.c;
                k81Var2.d(i11, p11Var2.i(i11));
                break;
        }
    }
}
