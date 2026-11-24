// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jr1 extends bm0 {
    public final /* synthetic */ byte s;
    public final /* synthetic */ yv1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr1(yv1 yv1Var, ylb ylbVar, int i, byte b) {
        super(i, ylbVar);
        this.s = b;
        this.w = yv1Var;
    }

    @Override // bm0, am0
    public final int K1() {
        int i;
        int i2;
        byte b = this.s;
        yv1 yv1Var = this.w;
        switch (b) {
            case 0:
                i = ((d) yv1Var).currentAccount;
                if (!qqd.d(i, yv1Var.Ba)) {
                    return on2.p(yv1Var.getThemedColor(cmb.Ie), nm7.d4);
                }
                wv1 wv1Var = yv1Var.Ba;
                if (wv1Var == null || wv1Var.a()) {
                    a();
                    return this.d;
                }
                a();
                return on2.p(this.d, nm7.s3);
            case 1:
                return yv1Var.x.K1();
            default:
                i2 = ((d) yv1Var).currentAccount;
                if (!qqd.d(i2, yv1Var.Ba)) {
                    return on2.p(yv1Var.getThemedColor(cmb.c6), nm7.d4);
                }
                wv1 wv1Var2 = yv1Var.Ba;
                if (wv1Var2 == null || wv1Var2.a()) {
                    a();
                    return this.d;
                }
                a();
                return on2.p(this.d, nm7.s3);
        }
    }
}
