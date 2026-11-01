package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class d10 implements rc, qc {
    public final /* synthetic */ u10 a;
    public final /* synthetic */ kj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ d10(u10 u10Var, kj kjVar, long j10, int i10) {
        this.a = u10Var;
        this.b = kjVar;
        this.c = j10;
        this.d = i10;
    }

    @Override // org.telegram.messenger.rc
    public void a(String str) {
        i0.g3(new a10(this.a, str, this.b, this.c, this.d, 1));
    }

    @Override // org.telegram.messenger.qc
    public void p(Exception exc) {
        i0.g3(new sk(this.d, 12, this.c, this.a, this.b));
    }
}
