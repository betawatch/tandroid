package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zv0 b;

    public /* synthetic */ kv0(zv0 zv0Var, int i7) {
        this.a = i7;
        this.b = zv0Var;
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
                zv0 zv0Var = this.b;
                zv0Var.dismiss();
                org.telegram.messenger.ui.b0(zv0Var.a).f2(zv0Var.getContext(), zv0Var.J1, 1, zv0Var.C1, false, false);
                break;
            case 3:
                zv0 zv0Var2 = this.b;
                org.telegram.messenger.qp.s1(zv0Var2.a).y3("stickers", zv0Var2.C1, 1, null);
                break;
            default:
                zv0 zv0Var3 = this.b;
                zv0Var3.dismiss();
                org.telegram.messenger.ui.b0(zv0Var3.a).f2(zv0Var3.getContext(), zv0Var3.J1, 1, zv0Var3.C1, false, false);
                break;
        }
    }
}
