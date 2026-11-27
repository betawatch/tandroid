// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class gq6 implements Runnable {
    public final /* synthetic */ ls6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long h;
    public final /* synthetic */ int n;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gq6(ls6 ls6Var, long j, boolean z, int i, int i2, int i3, long j2, int i4) {
        this.a = ls6Var;
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
        boolean B = wf3.B(j);
        boolean z = this.c;
        int i = this.d;
        byte b = this.e;
        boolean z2 = z && (i == -1 || (i == 0 && b == 2)) && !B;
        ls6 ls6Var = this.a;
        long j2 = this.h;
        if (z2 || (this.f == 1 && !B)) {
            ls6Var.f0(b, this.n, j, j2, false);
        }
        if (z2) {
            return;
        }
        if (!z) {
            ls6Var.K1(b, i, j, j2);
        }
        ls6Var.getNotificationCenter().k(jn7.W, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf((z && i == -1) ? 0 : i), Boolean.valueOf(z), Integer.valueOf(b));
    }
}
