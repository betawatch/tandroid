package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ho extends x2 {
    public final /* synthetic */ hp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(hp hpVar) {
        super(3600000);
        this.e = hpVar;
    }

    @Override // org.telegram.messenger.x2
    public final void e(int i3, Object obj, n10 n10Var) {
        qr.a0(i3).a.c(new x0(i3, n10Var, 7));
    }

    @Override // org.telegram.messenger.x2
    public final void f(int i3, Object obj, long j10, w2 w2Var) {
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j10;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new c3.b(1), new d(w2Var, 6));
    }

    @Override // org.telegram.messenger.x2
    public final void g(int i3, Object obj, Object obj2) {
        qr.a0(i3).a.c(new x0(i3, (TL_account.TL_webBrowserSettings) obj2, 8));
    }

    @Override // org.telegram.messenger.x2
    public final /* bridge */ /* synthetic */ boolean j(Object obj) {
        return false;
    }
}
