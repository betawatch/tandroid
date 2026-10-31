package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class so extends b3 {
    public final /* synthetic */ vp e;

    public so(vp vpVar) {
        this.e = vpVar;
    }

    @Override // org.telegram.messenger.b3
    public final void e(int i10, Object obj, j20 j20Var) {
        this.e.getMessagesStorage().a.c(new qo(i10, (z2) j20Var, 0));
    }

    @Override // org.telegram.messenger.b3
    public final void f(int i10, Object obj, long j10, a3 a3Var) {
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j10;
        this.e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new ro(a3Var, 0));
    }

    @Override // org.telegram.messenger.b3
    public final void g(int i10, Object obj, Object obj2) {
        hs.a0(i10).a.c(new a1(i10, (TLRPC.TL_help_appConfig) obj2, 5));
    }

    @Override // org.telegram.messenger.b3
    public final /* bridge */ /* synthetic */ boolean j(Object obj) {
        return false;
    }
}
