package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv0 b;

    public /* synthetic */ hv0(xv0 xv0Var, int i3) {
        this.a = i3;
        this.b = xv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.l1.f();
                break;
            case 1:
                this.b.l1.f();
                break;
            case 2:
                xv0 xv0Var = this.b;
                xv0Var.dismiss();
                org.telegram.messenger.li.b0(xv0Var.a).f2(xv0Var.getContext(), xv0Var.K1, 1, xv0Var.D1, false, false);
                break;
            case 3:
                xv0 xv0Var2 = this.b;
                org.telegram.messenger.hp.s1(xv0Var2.a).y3("stickers", xv0Var2.D1, 1, null);
                break;
            default:
                xv0 xv0Var3 = this.b;
                xv0Var3.dismiss();
                org.telegram.messenger.li.b0(xv0Var3.a).f2(xv0Var3.getContext(), xv0Var3.K1, 1, xv0Var3.D1, false, false);
                break;
        }
    }
}
