package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                co.Y((co) this.e, this.b, this.c, this.d, (Boolean) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((nj) this.e).b).currentAccount;
                zh.s5.y(i10, false).i0(this.b, this.c, this.d.longValue() > 0 && bool.booleanValue(), true);
                break;
        }
    }
}
