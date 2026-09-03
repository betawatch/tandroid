package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gh(Object obj, long j10, long j11, Long l10, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = j10;
        this.c = j11;
        this.d = l10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                xn.Y((xn) this.e, this.b, this.c, this.d, (Boolean) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.p2) ((jj) this.e).b).currentAccount;
                mh.t7.y(i10, false).i0(this.b, this.c, this.d.longValue() > 0 && bool.booleanValue(), true);
                break;
        }
    }
}
