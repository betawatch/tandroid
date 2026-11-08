package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class cr implements Runnable {
    public final /* synthetic */ int D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ int F;
    public final /* synthetic */ long G;
    public final /* synthetic */ int H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ int J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ a00 M;
    public final /* synthetic */ yr a;
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

    public /* synthetic */ cr(yr yrVar, TLRPC.TL_messages_messages tL_messages_messages, int i7, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z9, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, a00 a00Var) {
        this.a = yrVar;
        this.b = tL_messages_messages;
        this.c = i7;
        this.d = j3;
        this.e = j10;
        this.f = i10;
        this.h = i11;
        this.n = i12;
        this.r = i13;
        this.s = i14;
        this.w = i15;
        this.x = i16;
        this.y = i17;
        this.D = i18;
        this.E = z9;
        this.F = i19;
        this.G = j11;
        this.H = i20;
        this.I = z10;
        this.J = i21;
        this.K = z11;
        this.L = z12;
        this.M = a00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getMessagesController().K3(this.b, this.c, this.d, this.e, this.f, this.h, this.n, true, this.r, this.s, this.w, this.x, this.y, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M);
    }
}
