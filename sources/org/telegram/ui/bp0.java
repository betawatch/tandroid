package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp0 b;

    public /* synthetic */ bp0(lp0 lp0Var, int i10) {
        this.a = i10;
        this.b = lp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        lp0 lp0Var = this.b;
        switch (i10) {
            case 0:
                if (lp0Var.G) {
                    lp0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                lp0Var.h();
                break;
            case 2:
                int i11 = lp0.q0;
                lp0Var.h();
                break;
            default:
                int i12 = lp0.q0;
                lp0Var.h();
                break;
        }
    }
}
