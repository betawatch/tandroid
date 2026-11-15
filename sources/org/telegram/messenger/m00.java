package org.telegram.messenger;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class m00 implements oc, nc {
    public final /* synthetic */ c10 a;
    public final /* synthetic */ gj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ m00(c10 c10Var, gj gjVar, long j3, int i7) {
        this.a = c10Var;
        this.b = gjVar;
        this.c = j3;
        this.d = i7;
    }

    @Override // org.telegram.messenger.oc
    public void a(String str) {
        g0.h3(new j00(this.a, str, this.b, this.c, this.d, 1));
    }

    @Override // org.telegram.messenger.nc
    public void r(Exception exc) {
        g0.h3(new fk(this.d, 12, this.c, this.a, this.b));
    }
}
