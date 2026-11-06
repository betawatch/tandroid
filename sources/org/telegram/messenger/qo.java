package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class qo extends x2 {
    public final /* synthetic */ qp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo(qp qpVar) {
        super(3600000);
        this.e = qpVar;
    }

    @Override // org.telegram.messenger.x2
    public final void e(int i7, Object obj, v10 v10Var) {
        yr.a0(i7).a.c(new x0(i7, v10Var, 7));
    }

    @Override // org.telegram.messenger.x2
    public final void f(int i7, Object obj, long j3, w2 w2Var) {
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j3;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new d3.b(1), new d(w2Var, 6));
    }

    @Override // org.telegram.messenger.x2
    public final void g(int i7, Object obj, Object obj2) {
        yr.a0(i7).a.c(new x0(i7, (TL_account.TL_webBrowserSettings) obj2, 8));
    }

    @Override // org.telegram.messenger.x2
    public final /* bridge */ /* synthetic */ boolean j(Object obj) {
        return false;
    }
}
