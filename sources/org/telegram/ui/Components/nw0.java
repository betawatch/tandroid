package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dx0 b;

    public /* synthetic */ nw0(dx0 dx0Var, int i10) {
        this.a = i10;
        this.b = dx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k1.f();
                break;
            case 1:
                this.b.k1.f();
                break;
            case 2:
                dx0 dx0Var = this.b;
                dx0Var.dismiss();
                org.telegram.messenger.vi.b0(dx0Var.a).f2(dx0Var.getContext(), dx0Var.J1, 1, dx0Var.C1, false, false);
                break;
            case 3:
                dx0 dx0Var2 = this.b;
                org.telegram.messenger.wp.r1(dx0Var2.a).v3("stickers", dx0Var2.C1, 1, null);
                break;
            default:
                dx0 dx0Var3 = this.b;
                dx0Var3.dismiss();
                org.telegram.messenger.vi.b0(dx0Var3.a).f2(dx0Var3.getContext(), dx0Var3.J1, 1, dx0Var3.C1, false, false);
                break;
        }
    }
}
