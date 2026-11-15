package org.telegram.messenger;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class tp implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ vr a;
    public final /* synthetic */ wz b;
    public final /* synthetic */ xz c;
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

    public /* synthetic */ tp(vr vrVar, wz wzVar, xz xzVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z10, boolean z11) {
        this.a = vrVar;
        this.b = wzVar;
        this.c = xzVar;
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
        vr vrVar = this.a;
        wz wzVar = this.b;
        xz xzVar = this.c;
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
        xz.a(wzVar);
        wz d = xz.d(xzVar, "MessagesStorage.getMessages");
        zq f02 = vrVar.f0(j3, j10, i7, i10, i11, i12, i13, i14, i15, j11, i16, z10, z11, xzVar);
        xz.a(d);
        Utilities.d.c(new fi(28, xz.d(xzVar, "MessagesStorage.getMessages: stageQueue.postRunnable"), f02));
    }
}
