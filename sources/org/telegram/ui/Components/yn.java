package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class yn implements org.telegram.messenger.z10 {
    public final /* synthetic */ m60 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 f;

    public /* synthetic */ yn(m60 m60Var, int i7, long j3, long j10, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = m60Var;
        this.b = i7;
        this.c = j3;
        this.d = j10;
        this.e = anVar;
        this.f = e6Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        this.a.u();
        int intValue = num.intValue();
        int i7 = this.b;
        long j3 = this.c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.e2 e2Var = this.e;
        org.telegram.ui.ActionBar.e6 e6Var = this.f;
        if (intValue != 0) {
            org.telegram.messenger.at.t(i7).H(j3, num.intValue(), j10);
            if (cc.a(e2Var)) {
                cc.z(e2Var, 5, num.intValue(), e6Var).j();
                return;
            }
            return;
        }
        if (org.telegram.messenger.np.s1(i7).r2(j3, j10, null)) {
            org.telegram.messenger.at.t(i7).G(j3, j10, false);
        }
        if (cc.a(e2Var)) {
            cc.z(e2Var, 4, num.intValue(), e6Var).j();
        }
    }
}
