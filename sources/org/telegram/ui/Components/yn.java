package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yn implements org.telegram.messenger.q20 {
    public final /* synthetic */ z60 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 f;

    public /* synthetic */ yn(z60 z60Var, int i10, long j10, long j11, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = z60Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.e = unVar;
        this.f = p6Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        this.a.u();
        int intValue = num.intValue();
        int i10 = this.b;
        long j10 = this.c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.k2 k2Var = this.e;
        org.telegram.ui.ActionBar.p6 p6Var = this.f;
        if (intValue != 0) {
            org.telegram.messenger.ot.t(i10).H(j10, num.intValue(), j11);
            if (cc.a(k2Var)) {
                cc.z(k2Var, 5, num.intValue(), p6Var).j();
                return;
            }
            return;
        }
        if (org.telegram.messenger.vp.r1(i10).q2(j10, j11, null)) {
            org.telegram.messenger.ot.t(i10).G(j10, j11, false);
        }
        if (cc.a(k2Var)) {
            cc.z(k2Var, 4, num.intValue(), p6Var).j();
        }
    }
}
