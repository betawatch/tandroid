// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rv0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ju0(rv0 rv0Var, String str, byte b) {
        this.a = b;
        this.b = rv0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        rv0 rv0Var = this.b;
        switch (b) {
            case 0:
                nv0 nv0Var = rv0Var.a;
                if (nv0Var != null) {
                    nv0Var.c(str);
                    break;
                }
                break;
            default:
                rv0Var.O = false;
                rv0Var.Q = 0L;
                rv0Var.U = false;
                rv0Var.b = str;
                rv0Var.a();
                nv0 nv0Var2 = rv0Var.a;
                if (nv0Var2 != null) {
                    nv0Var2.onResume();
                    rv0Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
