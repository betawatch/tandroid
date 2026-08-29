package org.telegram.ui.Cells;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j7 b;

    public /* synthetic */ h7(j7 j7Var, int i10) {
        this.a = i10;
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
                j7Var2.U.isSpoilersRevealed = true;
                j7Var2.D.clear();
                j7Var2.E.clear();
                j7Var2.F.clear();
                j7Var2.invalidate();
                break;
        }
    }
}
