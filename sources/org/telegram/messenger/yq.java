package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class yq implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;
    public final /* synthetic */ long H;
    public final /* synthetic */ int I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ int K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ uz N;
    public final /* synthetic */ ur a;
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

    public /* synthetic */ yq(ur urVar, TLRPC.TL_messages_messages tL_messages_messages, int i7, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10, int i19, long j11, int i20, boolean z11, int i21, boolean z12, boolean z13, uz uzVar) {
        this.a = urVar;
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
        this.E = i18;
        this.F = z10;
        this.G = i19;
        this.H = j11;
        this.I = i20;
        this.J = z11;
        this.K = i21;
        this.L = z12;
        this.M = z13;
        this.N = uzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getMessagesController().R3(this.b, this.c, this.d, this.e, this.f, this.h, this.n, true, this.r, this.s, this.w, this.x, this.y, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N);
    }
}
