package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ln0 b;

    public /* synthetic */ bn0(ln0 ln0Var, int i10) {
        this.a = i10;
        this.b = ln0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ln0 ln0Var = this.b;
        switch (i10) {
            case 0:
                if (ln0Var.G) {
                    ln0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                ln0Var.h();
                break;
            case 2:
                int i11 = ln0.q0;
                ln0Var.h();
                break;
            default:
                int i12 = ln0.q0;
                ln0Var.h();
                break;
        }
    }
}
