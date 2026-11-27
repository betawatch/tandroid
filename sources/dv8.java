// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dv8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gv8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ dv8(gv8 gv8Var, int i, byte b) {
        this.a = b;
        this.b = gv8Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        gv8 gv8Var = this.b;
        switch (b) {
            case 0:
                gv8Var.b.e(i, gv8Var.d.i(i));
                break;
            default:
                gv8Var.b.e(i, gv8Var.d.i(i));
                break;
        }
    }
}
