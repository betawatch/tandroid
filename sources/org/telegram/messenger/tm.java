package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class tm implements kr {
    public final /* synthetic */ hp a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ TLRPC.InputPeer e;
    public final /* synthetic */ long f;

    public /* synthetic */ tm(hp hpVar, long j10, int i3, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.a = hpVar;
        this.b = j10;
        this.c = i3;
        this.d = z10;
        this.e = inputPeer;
        this.f = j11;
    }

    @Override // org.telegram.messenger.kr
    public final void a(int i3) {
        hp hpVar = this.a;
        long e10 = hpVar.getUserConfig().e();
        long j10 = this.b;
        if (j10 == e10) {
            hpVar.G1().b();
        }
        hpVar.Y(j10, 2, this.c, Math.max(0, i3), this.d, this.e, this.f);
        hpVar.J(1);
    }
}
