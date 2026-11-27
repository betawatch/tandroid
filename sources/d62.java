// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class d62 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a72 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d62(a72 a72Var, int i, byte b) {
        this.a = b;
        this.b = a72Var;
        this.c = i;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        int i = this.c;
        a72 a72Var = this.b;
        switch (b) {
            case 0:
                a72Var.g0(i, (zg8) obj);
                break;
            default:
                a72Var.g0(i, new eh8((String) obj));
                break;
        }
    }
}
