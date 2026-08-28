package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ch(Object obj, long j10, long j11, Long l10, int i9) {
        this.a = i9;
        this.e = obj;
        this.b = j10;
        this.c = j11;
        this.d = l10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9;
        switch (this.a) {
            case 0:
                qn.X((qn) this.e, this.b, this.c, this.d, (Boolean) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                i9 = ((org.telegram.ui.ActionBar.o2) ((bj) this.e).b).currentAccount;
                gh.v7.y(i9, false).i0(this.b, this.c, this.d.longValue() > 0 && bool.booleanValue(), true);
                break;
        }
    }
}
