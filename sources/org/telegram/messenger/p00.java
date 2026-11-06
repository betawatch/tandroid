package org.telegram.messenger;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class p00 implements pc, oc {
    public final /* synthetic */ f10 a;
    public final /* synthetic */ ij b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ p00(f10 f10Var, ij ijVar, long j3, int i7) {
        this.a = f10Var;
        this.b = ijVar;
        this.c = j3;
        this.d = i7;
    }

    @Override // org.telegram.messenger.pc
    public void a(String str) {
        g0.h3(new m00(this.a, str, this.b, this.c, this.d, 1));
    }

    @Override // org.telegram.messenger.oc
    public void r(Exception exc) {
        g0.h3(new ik(this.d, 12, this.c, this.a, this.b));
    }
}
