// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
