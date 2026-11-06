package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q6 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ w6 b;

    public /* synthetic */ q6(w6 w6Var, int i7) {
        this.a = i7;
        this.b = w6Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                w6 w6Var = this.b;
                w6Var.c.setScaleX(f10);
                w6Var.c.setScaleY(f10);
                break;
            default:
                this.b.P = f11;
                break;
        }
    }
}
