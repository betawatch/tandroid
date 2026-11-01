package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ni implements Runnable {
    public final /* synthetic */ vi a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long h;
    public final /* synthetic */ int n;

    public /* synthetic */ ni(vi viVar, long j10, boolean z10, int i10, int i11, int i12, long j11, int i13) {
        this.a = viVar;
        this.b = j10;
        this.c = z10;
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.h = j11;
        this.n = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        int i10;
        long j11 = this.b;
        boolean C = o5.C(j11);
        boolean z10 = this.c;
        int i11 = this.d;
        int i12 = this.e;
        boolean z11 = z10 && (i11 == -1 || (i11 == 0 && i12 == 2)) && !C;
        vi viVar = this.a;
        long j12 = j11;
        int i13 = i12;
        long j13 = this.h;
        if (z11 || (this.f == 1 && !C)) {
            viVar.d0(i13, this.n, j12, j13, false);
        }
        if (z11) {
            return;
        }
        if (z10) {
            j10 = j13;
            i10 = i11;
        } else {
            i10 = i11;
            viVar.H1(j12, j13, i13, i10);
            j10 = j13;
            j12 = j12;
            i13 = i13;
        }
        viVar.getNotificationCenter().k(at.W, Long.valueOf(j12), Long.valueOf(j10), Integer.valueOf((z10 && i10 == -1) ? 0 : i10), Boolean.valueOf(z10), Integer.valueOf(i13));
    }
}
