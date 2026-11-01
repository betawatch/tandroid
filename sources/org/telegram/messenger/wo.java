package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class wo extends b3 {
    public final /* synthetic */ wp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo(wp wpVar) {
        super(3600000);
        this.e = wpVar;
    }

    @Override // org.telegram.messenger.b3
    public final void e(int i10, Object obj, k20 k20Var) {
        is.a0(i10).a.c(new a1(i10, k20Var, 7));
    }

    @Override // org.telegram.messenger.b3
    public final void f(int i10, Object obj, long j10, a3 a3Var) {
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j10;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new a3.b(1), new d(a3Var, 6));
    }

    @Override // org.telegram.messenger.b3
    public final void g(int i10, Object obj, Object obj2) {
        is.a0(i10).a.c(new a1(i10, (TL_account.TL_webBrowserSettings) obj2, 8));
    }

    @Override // org.telegram.messenger.b3
    public final /* bridge */ /* synthetic */ boolean j(Object obj) {
        return false;
    }
}
