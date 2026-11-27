// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ja7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ja7(pt2 pt2Var, int i, byte b) {
        this.a = b;
        this.b = pt2Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        pt2 pt2Var = this.b;
        switch (b) {
            case 0:
                pt2Var.accept(Integer.valueOf(i));
                break;
            default:
                pt2Var.accept(Integer.valueOf(i));
                break;
        }
    }
}
