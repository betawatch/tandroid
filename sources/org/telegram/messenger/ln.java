package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ln implements cs {
    public final /* synthetic */ wp a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ TLRPC.InputPeer e;
    public final /* synthetic */ long f;

    public /* synthetic */ ln(wp wpVar, long j10, int i10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.a = wpVar;
        this.b = j10;
        this.c = i10;
        this.d = z10;
        this.e = inputPeer;
        this.f = j11;
    }

    @Override // org.telegram.messenger.cs
    public final void a(int i10) {
        wp wpVar = this.a;
        long e = wpVar.getUserConfig().e();
        long j10 = this.b;
        if (j10 == e) {
            wpVar.F1().b();
        }
        wpVar.Y(j10, 2, this.c, Math.max(0, i10), this.d, this.e, this.f);
        wpVar.J(1);
    }
}
