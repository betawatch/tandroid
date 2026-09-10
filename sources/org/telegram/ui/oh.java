package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ oh(Object obj, long j3, long j10, Long l4, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = j3;
        this.c = j10;
        this.d = l4;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                eo.Y((eo) this.e, this.b, this.c, this.d, (Boolean) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.p2) ((pj) this.e).b).currentAccount;
                xh.v5.y(i10, false).i0(this.b, this.c, this.d.longValue() > 0 && bool.booleanValue(), true);
                break;
        }
    }
}
