package lh;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class fa implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ fa(long j10, int i10, int i11, boolean z4) {
        this.a = j10;
        this.b = i10;
        this.c = i11;
        this.d = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        if (j10 != 0) {
            b0.g(i10).p(i11, j10);
        } else {
            t7.y(i10, this.d).X(i11);
        }
    }
}
