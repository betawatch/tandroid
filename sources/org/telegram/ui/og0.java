package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class og0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg0 b;

    public /* synthetic */ og0(vg0 vg0Var, int i3) {
        this.a = i3;
        this.b = vg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.v1(this.b.j1);
                break;
            default:
                org.telegram.messenger.g0.K3(this.b.k1.getEditText());
                break;
        }
    }
}
