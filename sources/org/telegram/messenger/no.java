package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class no extends x2 {
    public final /* synthetic */ qp e;

    public no(qp qpVar) {
        this.e = qpVar;
    }

    @Override // org.telegram.messenger.x2
    public final void e(int i7, Object obj, v10 v10Var) {
        this.e.getMessagesStorage().a.c(new lo(i7, (v2) v10Var, 0));
    }

    @Override // org.telegram.messenger.x2
    public final void f(int i7, Object obj, long j3, w2 w2Var) {
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j3;
        this.e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new mo(w2Var, 0));
    }

    @Override // org.telegram.messenger.x2
    public final void g(int i7, Object obj, Object obj2) {
        yr.a0(i7).a.c(new x0(i7, (TLRPC.TL_help_appConfig) obj2, 5));
    }

    @Override // org.telegram.messenger.x2
    public final /* bridge */ /* synthetic */ boolean j(Object obj) {
        return false;
    }
}
