package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h7 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ n7 b;

    public /* synthetic */ h7(n7 n7Var, int i7) {
        this.a = i7;
        this.b = n7Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                n7 n7Var = this.b;
                n7Var.c.setScaleX(f10);
                n7Var.c.setScaleY(f10);
                break;
            default:
                this.b.Q = f11;
                break;
        }
    }
}
