// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class hp2 extends jp2 {
    public final /* synthetic */ byte f;
    public final /* synthetic */ lp2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp2(lp2 lp2Var, byte b) {
        super(lp2Var);
        this.f = b;
        this.h = lp2Var;
    }

    @Override // jp2
    public final Object a(int i) {
        byte b = this.f;
        lp2 lp2Var = this.h;
        switch (b) {
            case 0:
                return lp2Var.g(i);
            case 1:
                return new kp2(lp2Var, i);
            default:
                return lp2Var.l(i);
        }
    }
}
