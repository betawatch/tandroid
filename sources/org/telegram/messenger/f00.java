package org.telegram.messenger;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class f00 implements nc, mc {
    public final /* synthetic */ z00 a;
    public final /* synthetic */ fj b;
    public final /* synthetic */ f3.s c;
    public final /* synthetic */ di.p9 d;

    public /* synthetic */ f00(z00 z00Var, fj fjVar, f3.s sVar, di.p9 p9Var) {
        this.a = z00Var;
        this.b = fjVar;
        this.c = sVar;
        this.d = p9Var;
    }

    @Override // org.telegram.messenger.nc
    public void a(String str) {
        g0.g3(new fn(this.a, this.b, str, this.c, this.d, 18));
    }

    @Override // org.telegram.messenger.mc
    public void q(Exception exc) {
        g0.g3(new tl(this.a, this.b, this.c, this.d, 27));
    }
}
