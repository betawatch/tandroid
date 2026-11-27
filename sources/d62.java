// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
