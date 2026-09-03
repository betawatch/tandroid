package org.telegram.ui.Cells;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ i7(k7 k7Var, int i10) {
        this.a = i10;
        this.b = k7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k7 k7Var = this.b;
                k7Var.post(new i7(k7Var, 1));
                break;
            default:
                k7 k7Var2 = this.b;
                k7Var2.V.isSpoilersRevealed = true;
                k7Var2.E.clear();
                k7Var2.F.clear();
                k7Var2.G.clear();
                k7Var2.invalidate();
                break;
        }
    }
}
