// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
