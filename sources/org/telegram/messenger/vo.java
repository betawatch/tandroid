package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class vo extends b3 {
    public final /* synthetic */ vp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(vp vpVar) {
        super(3600000);
        this.e = vpVar;
    }

    @Override // org.telegram.messenger.b3
    public final void e(int i10, Object obj, j20 j20Var) {
        hs.a0(i10).a.c(new a1(i10, j20Var, 7));
    }

    @Override // org.telegram.messenger.b3
    public final void f(int i10, Object obj, long j10, a3 a3Var) {
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j10;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new a3.b(1), new d(a3Var, 6));
    }

    @Override // org.telegram.messenger.b3
    public final void g(int i10, Object obj, Object obj2) {
        hs.a0(i10).a.c(new a1(i10, (TL_account.TL_webBrowserSettings) obj2, 8));
    }

    @Override // org.telegram.messenger.b3
    public final /* bridge */ /* synthetic */ boolean j(Object obj) {
        return false;
    }
}
