// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ld4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nd4 b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ ld4(nd4 nd4Var, int[] iArr, byte b) {
        this.a = b;
        this.b = nd4Var;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int[] iArr = this.c;
        nd4 nd4Var = this.b;
        switch (b) {
            case 0:
                nd4Var.q.add(Integer.valueOf(iArr[0]));
                break;
            default:
                nd4Var.q.remove(Integer.valueOf(iArr[0]));
                break;
        }
    }
}
