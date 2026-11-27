// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jd9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ md9 b;

    public /* synthetic */ jd9(md9 md9Var, byte b) {
        this.a = b;
        this.b = md9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        md9 md9Var = this.b;
        switch (b) {
            case 0:
                md9Var.Z0();
                break;
            default:
                md9Var.d2.O(true);
                hl.d3(new jd9(md9Var, (byte) 0), 150L);
                break;
        }
    }
}
