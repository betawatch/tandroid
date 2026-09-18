package org.telegram.ui.Cells;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n7 b;

    public /* synthetic */ l7(n7 n7Var, int i10) {
        this.a = i10;
        this.b = n7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n7 n7Var = this.b;
                n7Var.post(new l7(n7Var, 1));
                break;
            default:
                n7 n7Var2 = this.b;
                n7Var2.b0.isSpoilersRevealed = true;
                n7Var2.H.clear();
                n7Var2.I.clear();
                n7Var2.J.clear();
                n7Var2.invalidate();
                break;
        }
    }
}
