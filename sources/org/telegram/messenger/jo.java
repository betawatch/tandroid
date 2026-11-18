package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
