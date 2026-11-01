package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class to extends b3 {
    public final /* synthetic */ wp e;

    public to(wp wpVar) {
        this.e = wpVar;
    }

    @Override // org.telegram.messenger.b3
    public final void e(int i10, Object obj, k20 k20Var) {
        this.e.getMessagesStorage().a.c(new ro(i10, (z2) k20Var, 0));
    }

    @Override // org.telegram.messenger.b3
    public final void f(int i10, Object obj, long j10, a3 a3Var) {
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j10;
        this.e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new so(a3Var, 0));
    }

    @Override // org.telegram.messenger.b3
    public final void g(int i10, Object obj, Object obj2) {
        is.a0(i10).a.c(new a1(i10, (TLRPC.TL_help_appConfig) obj2, 5));
    }

    @Override // org.telegram.messenger.b3
    public final /* bridge */ /* synthetic */ boolean j(Object obj) {
        return false;
    }
}
