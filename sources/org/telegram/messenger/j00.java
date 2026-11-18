package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class j00 implements nc, mc {
    public final /* synthetic */ z00 a;
    public final /* synthetic */ fj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ j00(z00 z00Var, fj fjVar, long j3, int i7) {
        this.a = z00Var;
        this.b = fjVar;
        this.c = j3;
        this.d = i7;
    }

    @Override // org.telegram.messenger.nc
    public void a(String str) {
        g0.g3(new g00(this.a, str, this.b, this.c, this.d, 1));
    }

    @Override // org.telegram.messenger.mc
    public void q(Exception exc) {
        g0.g3(new ek(this.d, 12, this.c, this.a, this.b));
    }
}
