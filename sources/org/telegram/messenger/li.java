package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class li implements Runnable {
    public final /* synthetic */ si a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long h;
    public final /* synthetic */ int n;

    public /* synthetic */ li(si siVar, long j3, boolean z10, int i7, int i10, int i11, long j10, int i12) {
        this.a = siVar;
        this.b = j3;
        this.c = z10;
        this.d = i7;
        this.e = i10;
        this.f = i11;
        this.h = j10;
        this.n = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        int i7;
        long j10 = this.b;
        boolean C = m5.C(j10);
        boolean z10 = this.c;
        int i10 = this.d;
        int i11 = this.e;
        boolean z11 = z10 && (i10 == -1 || (i10 == 0 && i11 == 2)) && !C;
        si siVar = this.a;
        long j11 = j10;
        int i12 = i11;
        long j12 = this.h;
        if (z11 || (this.f == 1 && !C)) {
            siVar.d0(i12, this.n, j11, j12, false);
        }
        if (z11) {
            return;
        }
        if (z10) {
            j3 = j12;
            i7 = i10;
        } else {
            i7 = i10;
            siVar.H1(j11, j12, i12, i7);
            j3 = j12;
            j11 = j11;
            i12 = i12;
        }
        siVar.getNotificationCenter().k(ns.W, Long.valueOf(j11), Long.valueOf(j3), Integer.valueOf((z10 && i7 == -1) ? 0 : i7), Boolean.valueOf(z10), Integer.valueOf(i12));
    }
}
