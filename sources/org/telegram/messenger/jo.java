package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class jo extends y2 {
    public final /* synthetic */ mp e;

    public jo(mp mpVar) {
        this.e = mpVar;
    }

    @Override // org.telegram.messenger.y2
    public final void e(int i7, Object obj, q10 q10Var) {
        this.e.getMessagesStorage().a.c(new ho(i7, (w2) q10Var, 0));
    }

    @Override // org.telegram.messenger.y2
    public final void f(int i7, Object obj, long j3, x2 x2Var) {
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j3;
        this.e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new io(x2Var, 0));
    }

    @Override // org.telegram.messenger.y2
    public final void g(int i7, Object obj, Object obj2) {
        tr.a0(i7).a.c(new x0(i7, (TLRPC.TL_help_appConfig) obj2, 5));
    }

    @Override // org.telegram.messenger.y2
    public final /* bridge */ /* synthetic */ boolean j(Object obj) {
        return false;
    }
}
