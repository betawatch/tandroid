// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class eb6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ob6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ eb6(ob6 ob6Var, int i, byte b) {
        this.a = b;
        this.b = ob6Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ob6 ob6Var = this.b;
        switch (b) {
            case 0:
                ob6Var.P = false;
                ob6Var.j(i);
                break;
            case 1:
                ob6Var.P = false;
                ob6Var.j(i);
                break;
            case 2:
                ob6Var.Z0(i, null, true, null);
                break;
            default:
                ob6Var.Z0(i, null, true, null);
                break;
        }
    }
}
