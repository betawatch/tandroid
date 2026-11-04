package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ky implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi.l3 b;

    public /* synthetic */ ky(gi.l3 l3Var, int i3) {
        this.a = i3;
        this.b = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.E2(this.b);
                break;
            default:
                this.b.f(true);
                break;
        }
    }
}
