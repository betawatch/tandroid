// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class i45 implements pcc {
    public final /* synthetic */ w45 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ c51 c;
    public final /* synthetic */ c51 d;
    public final /* synthetic */ a55 e;
    public final /* synthetic */ sk7 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ vnb h;

    public /* synthetic */ i45(w45 w45Var, boolean[] zArr, c51 c51Var, c51 c51Var2, a55 a55Var, sk7 sk7Var, boolean[] zArr2, vnb vnbVar) {
        this.a = w45Var;
        this.b = zArr;
        this.c = c51Var;
        this.d = c51Var2;
        this.e = a55Var;
        this.f = sk7Var;
        this.g = zArr2;
        this.h = vnbVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        w45 w45Var = this.a;
        if (w45Var.m || w45Var.n) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        boolean[] zArr = this.b;
        if (booleanValue || zArr[0]) {
            c51 c51Var = this.c;
            c51Var.setEnabled(false);
            c51 c51Var2 = this.d;
            c51Var2.setEnabled(false);
            (bool.booleanValue() ? c51Var2 : c51Var).setLoading(true);
            this.e.e(w45Var, bool.booleanValue(), new m45(c51Var, c51Var2, this.f, this.g, this.h, w45Var, zArr));
        }
    }
}
