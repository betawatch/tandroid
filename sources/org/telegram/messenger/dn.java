package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class dn implements sr {
    public final /* synthetic */ qp a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ TLRPC.InputPeer e;
    public final /* synthetic */ long f;

    public /* synthetic */ dn(qp qpVar, long j3, int i7, boolean z9, TLRPC.InputPeer inputPeer, long j10) {
        this.a = qpVar;
        this.b = j3;
        this.c = i7;
        this.d = z9;
        this.e = inputPeer;
        this.f = j10;
    }

    @Override // org.telegram.messenger.sr
    public final void a(int i7) {
        qp qpVar = this.a;
        long e10 = qpVar.getUserConfig().e();
        long j3 = this.b;
        if (j3 == e10) {
            qpVar.G1().b();
        }
        qpVar.Y(j3, 2, this.c, Math.max(0, i7), this.d, this.e, this.f);
        qpVar.J(1);
    }
}
