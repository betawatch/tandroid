package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ b1(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                this.b.run();
                break;
            case 2:
                this.b.run();
                break;
            case 3:
                this.b.run();
                break;
            case 4:
                this.b.run();
                c2Var.dismiss();
                break;
            case 5:
                Runnable runnable2 = this.b;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            default:
                c2Var.dismiss();
                Runnable runnable3 = this.b;
                if (runnable3 != null) {
                    runnable3.run();
                    break;
                }
                break;
        }
    }
}
