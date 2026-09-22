package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp0 b;

    public /* synthetic */ mp0(wp0 wp0Var, int i10) {
        this.a = i10;
        this.b = wp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        wp0 wp0Var = this.b;
        switch (i10) {
            case 0:
                if (wp0Var.G) {
                    wp0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                wp0Var.h();
                break;
            case 2:
                int i11 = wp0.q0;
                wp0Var.h();
                break;
            default:
                int i12 = wp0.q0;
                wp0Var.h();
                break;
        }
    }
}
