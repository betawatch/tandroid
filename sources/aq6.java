// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class aq6 implements Runnable {
    public final /* synthetic */ hq6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long h;
    public final /* synthetic */ int n;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ aq6(hq6 hq6Var, long j, boolean z, int i, int i2, int i3, long j2, int i4) {
        this.a = hq6Var;
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
        boolean B = cf3.B(j);
        boolean z = this.c;
        int i = this.d;
        byte b = this.e;
        boolean z2 = z && (i == -1 || (i == 0 && b == 2)) && !B;
        hq6 hq6Var = this.a;
        long j2 = this.h;
        if (z2 || (this.f == 1 && !B)) {
            hq6Var.f0(b, this.n, j, j2, false);
        }
        if (z2) {
            return;
        }
        if (!z) {
            hq6Var.K1(b, i, j, j2);
        }
        hq6Var.getNotificationCenter().k(kk7.V, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf((z && i == -1) ? 0 : i), Boolean.valueOf(z), Integer.valueOf(b));
    }
}
