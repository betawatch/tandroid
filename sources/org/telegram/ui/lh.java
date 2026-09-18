package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lh(Object obj, long j3, long j10, Long l4, int i10) {
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
                zn.a0((zn) this.e, this.b, this.c, this.d, (Boolean) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((mj) this.e).b).currentAccount;
                yh.t5.y(i10, false).i0(this.b, this.c, this.d.longValue() > 0 && bool.booleanValue(), true);
                break;
        }
    }
}
