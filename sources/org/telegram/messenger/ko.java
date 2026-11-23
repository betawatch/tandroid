package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class ko extends y2 {
    public final /* synthetic */ np e;

    public ko(np npVar) {
        this.e = npVar;
    }

    @Override // org.telegram.messenger.y2
    public final void e(int i7, Object obj, r10 r10Var) {
        this.e.getMessagesStorage().a.c(new io(i7, (w2) r10Var, 0));
    }

    @Override // org.telegram.messenger.y2
    public final void f(int i7, Object obj, long j3, x2 x2Var) {
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j3;
        this.e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new jo(x2Var, 0));
    }

    @Override // org.telegram.messenger.y2
    public final void g(int i7, Object obj, Object obj2) {
        ur.a0(i7).a.c(new x0(i7, (TLRPC.TL_help_appConfig) obj2, 5));
    }

    @Override // org.telegram.messenger.y2
    public final /* bridge */ /* synthetic */ boolean j(Object obj) {
        return false;
    }
}
