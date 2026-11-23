package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class k00 implements oc, nc {
    public final /* synthetic */ a10 a;
    public final /* synthetic */ gj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ k00(a10 a10Var, gj gjVar, long j3, int i7) {
        this.a = a10Var;
        this.b = gjVar;
        this.c = j3;
        this.d = i7;
    }

    @Override // org.telegram.messenger.oc
    public void a(String str) {
        g0.g3(new h00(this.a, str, this.b, this.c, this.d, 1));
    }

    @Override // org.telegram.messenger.nc
    public void q(Exception exc) {
        g0.g3(new fk(this.d, 12, this.c, this.a, this.b));
    }
}
