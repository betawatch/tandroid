package bi;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class zc implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ zc(long j10, int i10, int i11, boolean z10) {
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
            m0.g(i10).p(i11, j10);
        } else {
            ca.y(i10, this.d).X(i11);
        }
    }
}
