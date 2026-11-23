package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class g00 implements oc, nc {
    public final /* synthetic */ a10 a;
    public final /* synthetic */ gj b;
    public final /* synthetic */ f3.s c;
    public final /* synthetic */ di.p9 d;

    public /* synthetic */ g00(a10 a10Var, gj gjVar, f3.s sVar, di.p9 p9Var) {
        this.a = a10Var;
        this.b = gjVar;
        this.c = sVar;
        this.d = p9Var;
    }

    @Override // org.telegram.messenger.oc
    public void a(String str) {
        g0.g3(new gn(this.a, this.b, str, this.c, this.d, 18));
    }

    @Override // org.telegram.messenger.nc
    public void q(Exception exc) {
        g0.g3(new ul(this.a, this.b, this.c, this.d, 27));
    }
}
