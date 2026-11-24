// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jxa implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ jxa(int i, int i2, long j, boolean z) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.a;
        int i = this.b;
        int i2 = this.c;
        if (j != 0) {
            ku0.g(i).p(i2, j);
        } else {
            jva.v(i, this.d).V(i2);
        }
    }
}
