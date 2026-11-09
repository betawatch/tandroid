package org.telegram.messenger;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class wp implements Runnable {
    public final /* synthetic */ int D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ yr a;
    public final /* synthetic */ zz b;
    public final /* synthetic */ a00 c;
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

    public /* synthetic */ wp(yr yrVar, zz zzVar, a00 a00Var, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z9, boolean z10) {
        this.a = yrVar;
        this.b = zzVar;
        this.c = a00Var;
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
        this.D = i16;
        this.E = z9;
        this.F = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yr yrVar = this.a;
        zz zzVar = this.b;
        a00 a00Var = this.c;
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
        int i16 = this.D;
        boolean z9 = this.E;
        boolean z10 = this.F;
        a00.a(zzVar);
        zz d = a00.d(a00Var, "MessagesStorage.getMessages");
        cr f02 = yrVar.f0(j3, j10, i7, i10, i11, i12, i13, i14, i15, j11, i16, z9, z10, a00Var);
        a00.a(d);
        Utilities.d.c(new hi(28, a00.d(a00Var, "MessagesStorage.getMessages: stageQueue.postRunnable"), f02));
    }
}
