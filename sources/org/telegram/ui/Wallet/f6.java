package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f6 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;

    public /* synthetic */ f6(l6 l6Var, int i10) {
        this.a = i10;
        this.b = l6Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                l6 l6Var = this.b;
                l6Var.c.setScaleX(f7);
                l6Var.c.setScaleY(f7);
                break;
            default:
                this.b.P = f10;
                break;
        }
    }
}
