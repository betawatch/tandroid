package org.telegram.messenger;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class i00 implements nc, mc {
    public final /* synthetic */ y00 a;
    public final /* synthetic */ fj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ i00(y00 y00Var, fj fjVar, long j3, int i7) {
        this.a = y00Var;
        this.b = fjVar;
        this.c = j3;
        this.d = i7;
    }

    @Override // org.telegram.messenger.nc
    public void a(String str) {
        g0.g3(new f00(this.a, str, this.b, this.c, this.d, 1));
    }

    @Override // org.telegram.messenger.mc
    public void s(Exception exc) {
        g0.g3(new ek(this.d, 12, this.c, this.a, this.b));
    }
}
