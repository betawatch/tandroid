package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class ym implements nr {
    public final /* synthetic */ mp a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ TLRPC.InputPeer e;
    public final /* synthetic */ long f;

    public /* synthetic */ ym(mp mpVar, long j3, int i7, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.a = mpVar;
        this.b = j3;
        this.c = i7;
        this.d = z10;
        this.e = inputPeer;
        this.f = j10;
    }

    @Override // org.telegram.messenger.nr
    public final void a(int i7) {
        mp mpVar = this.a;
        long e10 = mpVar.getUserConfig().e();
        long j3 = this.b;
        if (j3 == e10) {
            mpVar.I1().b();
        }
        mpVar.Y(j3, 2, this.c, Math.max(0, i7), this.d, this.e, this.f);
        mpVar.J(1);
    }
}
