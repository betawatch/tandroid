package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ e0(t0 t0Var, int i10, int i11) {
        this.a = i11;
        this.b = t0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                if (t0Var.b.getSwipeBack() != null) {
                    t0Var.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
            default:
                t0 t0Var2 = this.b;
                if (t0Var2.b.getSwipeBack() != null) {
                    t0Var2.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
        }
    }
}
