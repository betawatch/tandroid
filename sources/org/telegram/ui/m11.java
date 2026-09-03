package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q11 b;
    public final /* synthetic */ int c;

    public /* synthetic */ m11(q11 q11Var, int i10, int i11) {
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
