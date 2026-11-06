package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn implements org.telegram.messenger.c20 {
    public final /* synthetic */ k60 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 f;

    public /* synthetic */ qn(k60 k60Var, int i7, long j3, long j10, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = k60Var;
        this.b = i7;
        this.c = j3;
        this.d = j10;
        this.e = anVar;
        this.f = f6Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        this.a.u();
        int intValue = num.intValue();
        int i7 = this.b;
        long j3 = this.c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.f2 f2Var = this.e;
        org.telegram.ui.ActionBar.f6 f6Var = this.f;
        if (intValue != 0) {
            org.telegram.messenger.dt.t(i7).H(j3, num.intValue(), j10);
            if (hc.a(f2Var)) {
                hc.z(f2Var, 5, num.intValue(), f6Var).j();
                return;
            }
            return;
        }
        if (org.telegram.messenger.qp.s1(i7).r2(j3, j10, null)) {
            org.telegram.messenger.dt.t(i7).G(j3, j10, false);
        }
        if (hc.a(f2Var)) {
            hc.z(f2Var, 4, num.intValue(), f6Var).j();
        }
    }
}
