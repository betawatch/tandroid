package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pn implements org.telegram.messenger.u10 {
    public final /* synthetic */ f60 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 f;

    public /* synthetic */ pn(f60 f60Var, int i3, long j10, long j11, org.telegram.ui.wm wmVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = f60Var;
        this.b = i3;
        this.c = j10;
        this.d = j11;
        this.e = wmVar;
        this.f = e6Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        this.a.u();
        int intValue = num.intValue();
        int i3 = this.b;
        long j10 = this.c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.d2 d2Var = this.e;
        org.telegram.ui.ActionBar.e6 e6Var = this.f;
        if (intValue != 0) {
            org.telegram.messenger.us.t(i3).H(j10, num.intValue(), j11);
            if (fc.a(d2Var)) {
                fc.z(d2Var, 5, num.intValue(), e6Var).j();
                return;
            }
            return;
        }
        if (org.telegram.messenger.hp.s1(i3).r2(j10, j11, null)) {
            org.telegram.messenger.us.t(i3).G(j10, j11, false);
        }
        if (fc.a(d2Var)) {
            fc.z(d2Var, 4, num.intValue(), e6Var).j();
        }
    }
}
