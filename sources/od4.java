// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class od4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qd4 b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ od4(qd4 qd4Var, int[] iArr, byte b) {
        this.a = b;
        this.b = qd4Var;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int[] iArr = this.c;
        qd4 qd4Var = this.b;
        switch (b) {
            case 0:
                qd4Var.q.add(Integer.valueOf(iArr[0]));
                break;
            default:
                qd4Var.q.remove(Integer.valueOf(iArr[0]));
                break;
        }
    }
}
