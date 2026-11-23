package org.telegram.messenger;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class e00 implements nc, mc {
    public final /* synthetic */ y00 a;
    public final /* synthetic */ fj b;
    public final /* synthetic */ f3.s c;
    public final /* synthetic */ di.p9 d;

    public /* synthetic */ e00(y00 y00Var, fj fjVar, f3.s sVar, di.p9 p9Var) {
        this.a = y00Var;
        this.b = fjVar;
        this.c = sVar;
        this.d = p9Var;
    }

    @Override // org.telegram.messenger.nc
    public void a(String str) {
        g0.g3(new fn(this.a, this.b, str, this.c, this.d, 18));
    }

    @Override // org.telegram.messenger.mc
    public void s(Exception exc) {
        g0.g3(new tl(this.a, this.b, this.c, this.d, 27));
    }
}
