package org.telegram.messenger;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class op implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ tr a;
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

    public /* synthetic */ op(tr trVar, rz rzVar, sz szVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z10, boolean z11) {
        this.a = trVar;
        this.b = rzVar;
        this.c = szVar;
        this.d = j3;
        this.e = j10;
        this.f = i7;
        this.h = i10;
        this.n = i11;
        this.r = i12;
        this.s = i13;
        this.w = i14;
        this.x = i15;
        this.y = j11;
        this.E = i16;
        this.F = z10;
        this.G = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tr trVar = this.a;
        rz rzVar = this.b;
        sz szVar = this.c;
        long j3 = this.d;
        long j10 = this.e;
        int i7 = this.f;
        int i10 = this.h;
        int i11 = this.n;
        int i12 = this.r;
        int i13 = this.s;
        int i14 = this.w;
        int i15 = this.x;
        long j11 = this.y;
        int i16 = this.E;
        boolean z10 = this.F;
        boolean z11 = this.G;
        sz.a(rzVar);
        rz d = sz.d(szVar, "MessagesStorage.getMessages");
        xq f02 = trVar.f0(j3, j10, i7, i10, i11, i12, i13, i14, i15, j11, i16, z10, z11, szVar);
        sz.a(d);
        Utilities.d.c(new rq(1, sz.d(szVar, "MessagesStorage.getMessages: stageQueue.postRunnable"), f02));
    }
}
