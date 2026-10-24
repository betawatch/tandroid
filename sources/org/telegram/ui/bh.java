package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bh(Object obj, long j10, long j11, Long l4, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = j10;
        this.c = j11;
        this.d = l4;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                sn.e0((sn) this.e, this.b, this.c, this.d, (Boolean) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.o2) ((fj) this.e).b).currentAccount;
                boolean z10 = false;
                ai.ha y3 = ai.ha.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.b, this.c, z10, true);
                break;
        }
    }
}
