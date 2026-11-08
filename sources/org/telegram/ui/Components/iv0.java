package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv0 b;

    public /* synthetic */ iv0(yv0 yv0Var, int i7) {
        this.a = i7;
        this.b = yv0Var;
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
                yv0 yv0Var = this.b;
                yv0Var.dismiss();
                org.telegram.messenger.ui.b0(yv0Var.a).f2(yv0Var.getContext(), yv0Var.J1, 1, yv0Var.C1, false, false);
                break;
            case 3:
                yv0 yv0Var2 = this.b;
                org.telegram.messenger.qp.s1(yv0Var2.a).y3("stickers", yv0Var2.C1, 1, null);
                break;
            default:
                yv0 yv0Var3 = this.b;
                yv0Var3.dismiss();
                org.telegram.messenger.ui.b0(yv0Var3.a).f2(yv0Var3.getContext(), yv0Var3.J1, 1, yv0Var3.C1, false, false);
                break;
        }
    }
}
