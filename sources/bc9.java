// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bc9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nd9 b;

    public /* synthetic */ bc9(nd9 nd9Var, byte b) {
        this.a = b;
        this.b = nd9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nd9 nd9Var = this.b;
        switch (b) {
            case 0:
                ed9 ed9Var = nd9Var.e;
                if (ed9Var != null) {
                    ed9Var.s(nd9Var.K);
                    break;
                }
                break;
            case 1:
                nd9Var.e.t(dd9.a);
                break;
            case 2:
                nd9Var.e.t(dd9.b);
                break;
            default:
                nd9Var.e.t(dd9.c);
                break;
        }
    }
}
