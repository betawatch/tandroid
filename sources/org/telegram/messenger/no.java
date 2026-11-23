package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class no extends y2 {
    public final /* synthetic */ np e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(np npVar) {
        super(3600000);
        this.e = npVar;
    }

    @Override // org.telegram.messenger.y2
    public final void e(int i7, Object obj, r10 r10Var) {
        ur.a0(i7).a.c(new x0(i7, r10Var, 7));
    }

    @Override // org.telegram.messenger.y2
    public final void f(int i7, Object obj, long j3, x2 x2Var) {
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j3;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new d3.b(1), new d(x2Var, 6));
    }

    @Override // org.telegram.messenger.y2
    public final void g(int i7, Object obj, Object obj2) {
        ur.a0(i7).a.c(new x0(i7, (TL_account.TL_webBrowserSettings) obj2, 8));
    }

    @Override // org.telegram.messenger.y2
    public final /* bridge */ /* synthetic */ boolean j(Object obj) {
        return false;
    }
}
