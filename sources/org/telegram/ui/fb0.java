package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ fb0(xb0 xb0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = xb0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                xb0 xb0Var = this.b;
                if (!z10) {
                    xb0Var.b.setVisibility(8);
                    break;
                } else {
                    xb0Var.getClass();
                    break;
                }
            default:
                if (!this.c) {
                    this.b.e.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
