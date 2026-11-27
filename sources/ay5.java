// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ay5 implements pt2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hc8 b;

    public /* synthetic */ ay5(hc8 hc8Var, byte b) {
        this.a = b;
        this.b = hc8Var;
    }

    @Override // pt2
    public final void accept(Object obj) {
        byte b = this.a;
        hc8 hc8Var = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                hc8Var.m0(num);
                break;
            default:
                hc8Var.l0(num);
                break;
        }
    }
}
