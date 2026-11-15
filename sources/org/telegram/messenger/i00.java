package org.telegram.messenger;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class i00 implements oc, nc {
    public final /* synthetic */ c10 a;
    public final /* synthetic */ gj b;
    public final /* synthetic */ f3.s c;
    public final /* synthetic */ di.m9 d;

    public /* synthetic */ i00(c10 c10Var, gj gjVar, f3.s sVar, di.m9 m9Var) {
        this.a = c10Var;
        this.b = gjVar;
        this.c = sVar;
        this.d = m9Var;
    }

    @Override // org.telegram.messenger.oc
    public void a(String str) {
        g0.h3(new jn(this.a, this.b, str, this.c, this.d, 18));
    }

    @Override // org.telegram.messenger.nc
    public void r(Exception exc) {
        g0.h3(new bm(this.a, this.b, this.c, this.d, 27));
    }
}
