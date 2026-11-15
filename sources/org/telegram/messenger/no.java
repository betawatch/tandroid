package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class no extends x2 {
    public final /* synthetic */ np e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(np npVar) {
        super(3600000);
        this.e = npVar;
    }

    @Override // org.telegram.messenger.x2
    public final void e(int i7, Object obj, s10 s10Var) {
        vr.a0(i7).a.c(new x0(i7, s10Var, 7));
    }

    @Override // org.telegram.messenger.x2
    public final void f(int i7, Object obj, long j3, w2 w2Var) {
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j3;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new d3.b(1), new d(w2Var, 6));
    }

    @Override // org.telegram.messenger.x2
    public final void g(int i7, Object obj, Object obj2) {
        vr.a0(i7).a.c(new x0(i7, (TL_account.TL_webBrowserSettings) obj2, 8));
    }

    @Override // org.telegram.messenger.x2
    public final /* bridge */ /* synthetic */ boolean j(Object obj) {
        return false;
    }
}
