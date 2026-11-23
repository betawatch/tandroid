package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class zm implements or {
    public final /* synthetic */ np a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ TLRPC.InputPeer e;
    public final /* synthetic */ long f;

    public /* synthetic */ zm(np npVar, long j3, int i7, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.a = npVar;
        this.b = j3;
        this.c = i7;
        this.d = z10;
        this.e = inputPeer;
        this.f = j10;
    }

    @Override // org.telegram.messenger.or
    public final void a(int i7) {
        np npVar = this.a;
        long e10 = npVar.getUserConfig().e();
        long j3 = this.b;
        if (j3 == e10) {
            npVar.I1().b();
        }
        npVar.Y(j3, 2, this.c, Math.max(0, i7), this.d, this.e, this.f);
        npVar.J(1);
    }
}
