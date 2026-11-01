package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class z00 implements rc, qc {
    public final /* synthetic */ u10 a;
    public final /* synthetic */ kj b;
    public final /* synthetic */ c3.s c;
    public final /* synthetic */ bi.i6 d;

    public /* synthetic */ z00(u10 u10Var, kj kjVar, c3.s sVar, bi.i6 i6Var) {
        this.a = u10Var;
        this.b = kjVar;
        this.c = sVar;
        this.d = i6Var;
    }

    @Override // org.telegram.messenger.rc
    public void a(String str) {
        i0.g3(new dn(this.a, this.b, str, this.c, this.d, 18));
    }

    @Override // org.telegram.messenger.qc
    public void p(Exception exc) {
        i0.g3(new vl(this.a, this.b, this.c, this.d, 27));
    }
}
