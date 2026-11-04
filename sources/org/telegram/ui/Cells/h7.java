package org.telegram.ui.Cells;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j7 b;

    public /* synthetic */ h7(j7 j7Var, int i3) {
        this.a = i3;
        this.b = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j7 j7Var = this.b;
                j7Var.post(new h7(j7Var, 1));
                break;
            default:
                j7 j7Var2 = this.b;
                j7Var2.c0.L0 = true;
                j7Var2.I.clear();
                j7Var2.J.clear();
                j7Var2.K.clear();
                j7Var2.invalidate();
                break;
        }
    }
}
