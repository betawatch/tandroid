package hh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class ka implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ka(long j10, int i10, int i11, boolean z10) {
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
            c0.g(i10).p(i11, j10);
        } else {
            u7.y(i10, this.d).X(i11);
        }
    }
}
