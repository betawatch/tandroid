package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
