package org.telegram.messenger;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class pp implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ ur a;
    public final /* synthetic */ tz b;
    public final /* synthetic */ uz c;
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

    public /* synthetic */ pp(ur urVar, tz tzVar, uz uzVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z10, boolean z11) {
        this.a = urVar;
        this.b = tzVar;
        this.c = uzVar;
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
        ur urVar = this.a;
        tz tzVar = this.b;
        uz uzVar = this.c;
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
        uz.a(tzVar);
        tz d = uz.d(uzVar, "MessagesStorage.getMessages");
        yq f02 = urVar.f0(j3, j10, i7, i10, i11, i12, i13, i14, i15, j11, i16, z10, z11, uzVar);
        uz.a(d);
        Utilities.d.c(new sq(1, uz.d(uzVar, "MessagesStorage.getMessages: stageQueue.postRunnable"), f02));
    }
}
