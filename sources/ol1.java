// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                mu1Var.i9(j2, j);
                break;
            default:
                mu1Var.K9(j2, j);
                break;
        }
    }
}
