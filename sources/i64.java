// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
