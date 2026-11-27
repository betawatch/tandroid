// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class i64 implements b86, ot2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;

    public /* synthetic */ i64(float f, byte b) {
        this.a = b;
        this.b = f;
    }

    @Override // ot2
    public final void accept(Object obj) {
        byte b = this.a;
        float f = this.b;
        og8 og8Var = (og8) obj;
        switch (b) {
            case 1:
                og8Var.d(f);
                break;
            default:
                og8Var.R(f);
                break;
        }
    }

    @Override // b86
    public final void invoke(Object obj) {
        ((bg8) obj).q(this.b);
    }
}
