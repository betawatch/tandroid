package org.telegram.ui.Cells;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r7 b;

    public /* synthetic */ p7(r7 r7Var, int i10) {
        this.a = i10;
        this.b = r7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r7 r7Var = this.b;
                r7Var.post(new p7(r7Var, 1));
                break;
            default:
                r7 r7Var2 = this.b;
                r7Var2.b0.isSpoilersRevealed = true;
                r7Var2.H.clear();
                r7Var2.I.clear();
                r7Var2.J.clear();
                r7Var2.invalidate();
                break;
        }
    }
}
