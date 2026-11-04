package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ei implements Runnable {
    public final /* synthetic */ li a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long h;
    public final /* synthetic */ int n;

    public /* synthetic */ ei(li liVar, long j10, boolean z10, int i3, int i10, int i11, long j11, int i12) {
        this.a = liVar;
        this.b = j10;
        this.c = z10;
        this.d = i3;
        this.e = i10;
        this.f = i11;
        this.h = j11;
        this.n = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        int i3;
        long j11 = this.b;
        boolean C = m5.C(j11);
        boolean z10 = this.c;
        int i10 = this.d;
        int i11 = this.e;
        boolean z11 = z10 && (i10 == -1 || (i10 == 0 && i11 == 2)) && !C;
        li liVar = this.a;
        long j12 = j11;
        int i12 = i11;
        long j13 = this.h;
        if (z11 || (this.f == 1 && !C)) {
            liVar.d0(i12, this.n, j12, j13, false);
        }
        if (z11) {
            return;
        }
        if (z10) {
            j10 = j13;
            i3 = i10;
        } else {
            i3 = i10;
            liVar.H1(j12, j13, i12, i3);
            j10 = j13;
            j12 = j12;
            i12 = i12;
        }
        liVar.getNotificationCenter().k(hs.W, Long.valueOf(j12), Long.valueOf(j10), Integer.valueOf((z10 && i3 == -1) ? 0 : i3), Boolean.valueOf(z10), Integer.valueOf(i12));
    }
}
