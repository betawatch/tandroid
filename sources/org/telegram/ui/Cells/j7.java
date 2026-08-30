package org.telegram.ui.Cells;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ j7(l7 l7Var, int i10) {
        this.a = i10;
        this.b = l7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l7 l7Var = this.b;
                l7Var.post(new j7(l7Var, 1));
                break;
            default:
                l7 l7Var2 = this.b;
                l7Var2.V.isSpoilersRevealed = true;
                l7Var2.E.clear();
                l7Var2.F.clear();
                l7Var2.G.clear();
                l7Var2.invalidate();
                break;
        }
    }
}
