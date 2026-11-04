package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl0 b;

    public /* synthetic */ ml0(wl0 wl0Var, int i3) {
        this.a = i3;
        this.b = wl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        wl0 wl0Var = this.b;
        switch (i3) {
            case 0:
                if (wl0Var.H) {
                    wl0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                wl0Var.h();
                break;
            case 2:
                int i10 = wl0.r0;
                wl0Var.h();
                break;
            default:
                int i11 = wl0.r0;
                wl0Var.h();
                break;
        }
    }
}
