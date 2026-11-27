// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class np6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls6 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int[] e;

    public /* synthetic */ np6(ls6 ls6Var, long j, long j2, int[] iArr, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = j;
        this.d = j2;
        this.e = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int[] iArr = this.e;
        long j = this.d;
        long j2 = this.c;
        ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                ls6Var.getNotificationCenter().k(35, Long.valueOf(j2), Long.valueOf(j), iArr);
                break;
            case 1:
                ls6Var.getNotificationCenter().k(35, Long.valueOf(j2), Long.valueOf(j), iArr);
                break;
            default:
                ls6Var.getNotificationCenter().k(35, Long.valueOf(j2), Long.valueOf(j), iArr);
                break;
        }
    }
}
