package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ng(Object obj, long j10, long j11, Long l10, int i3) {
        this.a = i3;
        this.e = obj;
        this.b = j10;
        this.c = j11;
        this.d = l10;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3;
        switch (this.a) {
            case 0:
                wm.q1((wm) this.e, this.b, this.c, this.d, (Boolean) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                i3 = ((org.telegram.ui.ActionBar.d2) ((oi) this.e).b).currentAccount;
                boolean z10 = false;
                ci.e9 y9 = ci.e9.y(i3, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y9.g0(this.b, this.c, z10, true);
                break;
        }
    }
}
