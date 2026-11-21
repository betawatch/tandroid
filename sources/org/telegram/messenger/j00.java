package org.telegram.messenger;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
