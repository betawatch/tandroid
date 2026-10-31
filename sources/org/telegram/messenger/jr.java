package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class jr implements Runnable {
    public final /* synthetic */ int D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ int F;
    public final /* synthetic */ long G;
    public final /* synthetic */ int H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ int J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ l00 M;
    public final /* synthetic */ hs a;
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

    public /* synthetic */ jr(hs hsVar, TLRPC.TL_messages_messages tL_messages_messages, int i10, long j10, long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z10, int i20, long j12, int i21, boolean z11, int i22, boolean z12, boolean z13, l00 l00Var) {
        this.a = hsVar;
        this.b = tL_messages_messages;
        this.c = i10;
        this.d = j10;
        this.e = j11;
        this.f = i11;
        this.h = i12;
        this.n = i13;
        this.r = i14;
        this.s = i15;
        this.w = i16;
        this.x = i17;
        this.y = i18;
        this.D = i19;
        this.E = z10;
        this.F = i20;
        this.G = j12;
        this.H = i21;
        this.I = z11;
        this.J = i22;
        this.K = z12;
        this.L = z13;
        this.M = l00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getMessagesController().H3(this.b, this.c, this.d, this.e, this.f, this.h, this.n, true, this.r, this.s, this.w, this.x, this.y, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M);
    }
}
