package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ih(Object obj, long j10, long j11, Long l4, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = j10;
        this.c = j11;
        this.d = l4;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                un.A0((un) this.e, this.b, this.c, this.d, (Boolean) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.k2) ((nj) this.e).b).currentAccount;
                boolean z10 = false;
                rh.e6 y3 = rh.e6.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.g0(this.b, this.c, z10, true);
                break;
        }
    }
}
