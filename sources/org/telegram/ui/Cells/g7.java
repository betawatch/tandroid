package org.telegram.ui.Cells;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;

    public /* synthetic */ g7(i7 i7Var, int i10) {
        this.a = i10;
        this.b = i7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i7 i7Var = this.b;
                i7Var.post(new g7(i7Var, 1));
                break;
            default:
                i7 i7Var2 = this.b;
                i7Var2.U.isSpoilersRevealed = true;
                i7Var2.D.clear();
                i7Var2.E.clear();
                i7Var2.F.clear();
                i7Var2.invalidate();
                break;
        }
    }
}
