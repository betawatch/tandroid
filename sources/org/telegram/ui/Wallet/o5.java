package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;

    public /* synthetic */ o5(r5 r5Var, int i10) {
        this.a = i10;
        this.b = r5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performClick();
                break;
            default:
                r5 r5Var = this.b;
                r5Var.h.invalidate();
                r5Var.n.invalidate();
                r5Var.e.invalidate();
                break;
        }
    }
}
