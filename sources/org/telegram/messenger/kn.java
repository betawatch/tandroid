package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class kn implements bs {
    public final /* synthetic */ vp a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ TLRPC.InputPeer e;
    public final /* synthetic */ long f;

    public /* synthetic */ kn(vp vpVar, long j10, int i10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.a = vpVar;
        this.b = j10;
        this.c = i10;
        this.d = z10;
        this.e = inputPeer;
        this.f = j11;
    }

    @Override // org.telegram.messenger.bs
    public final void a(int i10) {
        vp vpVar = this.a;
        long e = vpVar.getUserConfig().e();
        long j10 = this.b;
        if (j10 == e) {
            vpVar.F1().b();
        }
        vpVar.Y(j10, 2, this.c, Math.max(0, i10), this.d, this.e, this.f);
        vpVar.J(1);
    }
}
