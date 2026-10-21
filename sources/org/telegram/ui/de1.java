package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class de1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee1 b;

    public /* synthetic */ de1(ee1 ee1Var, int i10) {
        this.a = i10;
        this.b = ee1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ee1 ee1Var = this.b;
                ee1Var.F = null;
                if (ee1Var.G != -1) {
                    ee1Var.H.getNotificationCenter().onAnimationFinish(ee1Var.G);
                    ee1Var.G = -1;
                    break;
                }
                break;
            default:
                ee1 ee1Var2 = this.b;
                ee1Var2.F = null;
                if (ee1Var2.G != -1) {
                    ee1Var2.H.getNotificationCenter().onAnimationFinish(ee1Var2.G);
                    ee1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
