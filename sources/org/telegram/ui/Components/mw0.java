package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx0 b;

    public /* synthetic */ mw0(cx0 cx0Var, int i10) {
        this.a = i10;
        this.b = cx0Var;
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
                cx0 cx0Var = this.b;
                cx0Var.dismiss();
                org.telegram.messenger.ui.b0(cx0Var.a).f2(cx0Var.getContext(), cx0Var.J1, 1, cx0Var.C1, false, false);
                break;
            case 3:
                cx0 cx0Var2 = this.b;
                org.telegram.messenger.vp.r1(cx0Var2.a).v3("stickers", cx0Var2.C1, 1, null);
                break;
            default:
                cx0 cx0Var3 = this.b;
                cx0Var3.dismiss();
                org.telegram.messenger.ui.b0(cx0Var3.a).f2(cx0Var3.getContext(), cx0Var3.J1, 1, cx0Var3.C1, false, false);
                break;
        }
    }
}
