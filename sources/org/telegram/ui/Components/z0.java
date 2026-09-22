package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ z0(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
                b2Var.dismiss();
                break;
            case 5:
                Runnable runnable2 = this.b;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            default:
                b2Var.dismiss();
                Runnable runnable3 = this.b;
                if (runnable3 != null) {
                    runnable3.run();
                    break;
                }
                break;
        }
    }
}
