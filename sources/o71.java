// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class o71 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ su c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ p71 e;

    public /* synthetic */ o71(boolean[] zArr, su suVar, long[] jArr, p71 p71Var, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = suVar;
        this.d = jArr;
        this.e = p71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gm.c3(new o71(this.b, this.c, this.d, this.e, (byte) 1));
                break;
            default:
                this.b[0] = true;
                this.c.e(1.0f);
                long[] jArr = this.d;
                long j = jArr[0];
                p71 p71Var = this.e;
                if (j <= 0) {
                    p71Var.dismiss();
                    break;
                } else {
                    gm.d3(new yt0(p71Var, (byte) 14), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
