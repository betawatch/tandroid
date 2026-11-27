// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ne7 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;
    public final /* synthetic */ long H;
    public final /* synthetic */ int I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ int K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ qsb N;
    public final /* synthetic */ kf7 a;
    public final /* synthetic */ TLRPC.TL_messages_messages b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    public /* synthetic */ ne7(kf7 kf7Var, TLRPC.TL_messages_messages tL_messages_messages, int i, long j, long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, int i11, long j3, int i12, boolean z2, int i13, boolean z3, boolean z4, qsb qsbVar) {
        this.a = kf7Var;
        this.b = tL_messages_messages;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = i2;
        this.h = i3;
        this.n = i4;
        this.r = i5;
        this.s = i6;
        this.w = i7;
        this.x = i8;
        this.y = i9;
        this.E = i10;
        this.F = z;
        this.G = i11;
        this.H = j3;
        this.I = i12;
        this.J = z2;
        this.K = i13;
        this.L = z3;
        this.M = z4;
        this.N = qsbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getMessagesController().U3(this.b, this.c, this.d, this.e, this.f, this.h, this.n, true, this.r, this.s, this.w, this.x, this.y, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N);
    }
}
