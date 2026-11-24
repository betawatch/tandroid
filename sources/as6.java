// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class as6 implements Runnable {
    public final /* synthetic */ hs6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long h;
    public final /* synthetic */ int n;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ as6(hs6 hs6Var, long j, boolean z, int i, int i2, int i3, long j2, int i4) {
        this.a = hs6Var;
        this.b = j;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.h = j2;
        this.n = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.b;
        boolean B = pg3.B(j);
        boolean z = this.c;
        int i = this.d;
        byte b = this.e;
        boolean z2 = z && (i == -1 || (i == 0 && b == 2)) && !B;
        hs6 hs6Var = this.a;
        long j2 = this.h;
        if (z2 || (this.f == 1 && !B)) {
            hs6Var.f0(b, this.n, j, j2, false);
        }
        if (z2) {
            return;
        }
        if (!z) {
            hs6Var.K1(b, i, j, j2);
        }
        hs6Var.getNotificationCenter().k(nm7.W, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf((z && i == -1) ? 0 : i), Boolean.valueOf(z), Integer.valueOf(b));
    }
}
