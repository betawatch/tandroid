// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ol1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ol1(mu1 mu1Var, long j, long j2, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.g9(j2, j);
                break;
            default:
                mu1Var.I9(j2, j);
                break;
        }
    }
}
