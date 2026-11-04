package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class co extends x2 {
    public final /* synthetic */ hp e;

    public co(hp hpVar) {
        this.e = hpVar;
    }

    @Override // org.telegram.messenger.x2
    public final void e(int i3, Object obj, n10 n10Var) {
        this.e.getMessagesStorage().a.c(new ao(i3, (v2) n10Var, 0));
    }

    @Override // org.telegram.messenger.x2
    public final void f(int i3, Object obj, long j10, w2 w2Var) {
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j10;
        this.e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new bo(w2Var, 0));
    }

    @Override // org.telegram.messenger.x2
    public final void g(int i3, Object obj, Object obj2) {
        qr.a0(i3).a.c(new x0(i3, (TLRPC.TL_help_appConfig) obj2, 5));
    }

    @Override // org.telegram.messenger.x2
    public final /* bridge */ /* synthetic */ boolean j(Object obj) {
        return false;
    }
}
