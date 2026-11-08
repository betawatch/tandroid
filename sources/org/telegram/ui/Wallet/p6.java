package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p6 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6 b;

    public /* synthetic */ p6(v6 v6Var, int i7) {
        this.a = i7;
        this.b = v6Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                v6 v6Var = this.b;
                v6Var.c.setScaleX(f10);
                v6Var.c.setScaleY(f10);
                break;
            default:
                this.b.P = f11;
                break;
        }
    }
}
