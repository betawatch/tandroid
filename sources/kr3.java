// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class kr3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr3 b;
    public final /* synthetic */ nr3 c;

    public /* synthetic */ kr3(mr3 mr3Var, nr3 nr3Var, byte b) {
        this.a = b;
        this.b = mr3Var;
        this.c = nr3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nr3 nr3Var = this.c;
        mr3 mr3Var = this.b;
        switch (b) {
            case 0:
                nr3Var.I(mr3Var.a, mr3Var.b);
                break;
            default:
                nr3Var.y(mr3Var.a, mr3Var.b);
                break;
        }
    }
}
