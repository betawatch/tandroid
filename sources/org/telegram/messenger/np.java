package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class np implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ qr a;
    public final /* synthetic */ rz b;
    public final /* synthetic */ sz c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ long y;

    public /* synthetic */ np(qr qrVar, rz rzVar, sz szVar, long j10, long j11, int i3, int i10, int i11, int i12, int i13, int i14, int i15, long j12, int i16, boolean z10, boolean z11) {
        this.a = qrVar;
        this.b = rzVar;
        this.c = szVar;
        this.d = j10;
        this.e = j11;
        this.f = i3;
        this.h = i10;
        this.n = i11;
        this.r = i12;
        this.s = i13;
        this.w = i14;
        this.x = i15;
        this.y = j12;
        this.E = i16;
        this.F = z10;
        this.G = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qr qrVar = this.a;
        rz rzVar = this.b;
        sz szVar = this.c;
        long j10 = this.d;
        long j11 = this.e;
        int i3 = this.f;
        int i10 = this.h;
        int i11 = this.n;
        int i12 = this.r;
        int i13 = this.s;
        int i14 = this.w;
        int i15 = this.x;
        long j12 = this.y;
        int i16 = this.E;
        boolean z10 = this.F;
        boolean z11 = this.G;
        sz.a(rzVar);
        rz d = sz.d(szVar, "MessagesStorage.getMessages");
        uq f02 = qrVar.f0(j10, j11, i3, i10, i11, i12, i13, i14, i15, j12, i16, z10, z11, szVar);
        sz.a(d);
        Utilities.d.c(new yh(28, sz.d(szVar, "MessagesStorage.getMessages: stageQueue.postRunnable"), f02));
    }
}
