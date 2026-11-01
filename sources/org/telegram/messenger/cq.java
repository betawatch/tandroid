package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class cq implements Runnable {
    public final /* synthetic */ int D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ is a;
    public final /* synthetic */ l00 b;
    public final /* synthetic */ m00 c;
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

    public /* synthetic */ cq(is isVar, l00 l00Var, m00 m00Var, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j12, int i17, boolean z10, boolean z11) {
        this.a = isVar;
        this.b = l00Var;
        this.c = m00Var;
        this.d = j10;
        this.e = j11;
        this.f = i10;
        this.h = i11;
        this.n = i12;
        this.r = i13;
        this.s = i14;
        this.w = i15;
        this.x = i16;
        this.y = j12;
        this.D = i17;
        this.E = z10;
        this.F = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        is isVar = this.a;
        l00 l00Var = this.b;
        m00 m00Var = this.c;
        long j10 = this.d;
        long j11 = this.e;
        int i10 = this.f;
        int i11 = this.h;
        int i12 = this.n;
        int i13 = this.r;
        int i14 = this.s;
        int i15 = this.w;
        int i16 = this.x;
        long j12 = this.y;
        int i17 = this.D;
        boolean z10 = this.E;
        boolean z11 = this.F;
        m00.a(l00Var);
        l00 d = m00.d(m00Var, "MessagesStorage.getMessages");
        kr f02 = isVar.f0(j10, j11, i10, i11, i12, i13, i14, i15, i16, j12, i17, z10, z11, m00Var);
        m00.a(d);
        Utilities.d.c(new pi(27, m00.d(m00Var, "MessagesStorage.getMessages: stageQueue.postRunnable"), f02));
    }
}
