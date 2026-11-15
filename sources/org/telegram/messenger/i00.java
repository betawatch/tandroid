package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class i00 implements oc, nc {
    public final /* synthetic */ c10 a;
    public final /* synthetic */ gj b;
    public final /* synthetic */ f3.s c;
    public final /* synthetic */ di.l9 d;

    public /* synthetic */ i00(c10 c10Var, gj gjVar, f3.s sVar, di.l9 l9Var) {
        this.a = c10Var;
        this.b = gjVar;
        this.c = sVar;
        this.d = l9Var;
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
