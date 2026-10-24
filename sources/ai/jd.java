package ai;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ jd(long j10, int i10, int i11, boolean z10) {
        this.a = j10;
        this.b = i10;
        this.c = i11;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        if (j10 != 0) {
            k0.g(i10).p(i11, j10);
        } else {
            ha.y(i10, this.d).X(i11);
        }
    }
}
