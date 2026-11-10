package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv0 b;

    public /* synthetic */ jv0(yv0 yv0Var, int i7) {
        this.a = i7;
        this.b = yv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n1.f();
                break;
            case 1:
                this.b.n1.f();
                break;
            case 2:
                yv0 yv0Var = this.b;
                yv0Var.dismiss();
                org.telegram.messenger.ui.b0(yv0Var.a).f2(yv0Var.getContext(), yv0Var.M1, 1, yv0Var.F1, false, false);
                break;
            case 3:
                yv0 yv0Var2 = this.b;
                org.telegram.messenger.qp.s1(yv0Var2.a).y3("stickers", yv0Var2.F1, 1, null);
                break;
            default:
                yv0 yv0Var3 = this.b;
                yv0Var3.dismiss();
                org.telegram.messenger.ui.b0(yv0Var3.a).f2(yv0Var3.getContext(), yv0Var3.M1, 1, yv0Var3.F1, false, false);
                break;
        }
    }
}
