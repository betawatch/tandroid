package ci;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ sb(int i3, int i10, long j10, boolean z10) {
        this.a = j10;
        this.b = i3;
        this.c = i10;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10 = this.a;
        int i3 = this.b;
        int i10 = this.c;
        if (j10 != 0) {
            i0.g(i3).p(i10, j10);
        } else {
            e9.y(i3, this.d).W(i10);
        }
    }
}
