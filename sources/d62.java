// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
