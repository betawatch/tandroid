package gh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ka implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ka(long j10, int i9, int i10, boolean z10) {
        this.a = j10;
        this.b = i9;
        this.c = i10;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10 = this.a;
        int i9 = this.b;
        int i10 = this.c;
        if (j10 != 0) {
            c0.g(i9).p(i10, j10);
        } else {
            v7.y(i9, this.d).X(i10);
        }
    }
}
