// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
