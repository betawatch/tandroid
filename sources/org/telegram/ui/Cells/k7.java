package org.telegram.ui.Cells;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n7 b;

    public /* synthetic */ k7(n7 n7Var, int i10) {
        this.a = i10;
        this.b = n7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n7 n7Var = this.b;
                n7Var.post(new k7(n7Var, 1));
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
