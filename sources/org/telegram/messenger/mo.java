package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class mo extends y2 {
    public final /* synthetic */ mp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(mp mpVar) {
        super(3600000);
        this.e = mpVar;
    }

    @Override // org.telegram.messenger.y2
    public final void e(int i7, Object obj, q10 q10Var) {
        tr.a0(i7).a.c(new x0(i7, q10Var, 7));
    }

    @Override // org.telegram.messenger.y2
    public final void f(int i7, Object obj, long j3, x2 x2Var) {
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j3;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new d3.b(1), new d(x2Var, 6));
    }

    @Override // org.telegram.messenger.y2
    public final void g(int i7, Object obj, Object obj2) {
        tr.a0(i7).a.c(new x0(i7, (TL_account.TL_webBrowserSettings) obj2, 8));
    }

    @Override // org.telegram.messenger.y2
    public final /* bridge */ /* synthetic */ boolean j(Object obj) {
        return false;
    }
}
