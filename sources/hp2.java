// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
