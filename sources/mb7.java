// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mb7 extends a81 {
    public final /* synthetic */ oc7 e;

    public mb7(oc7 oc7Var) {
        this.e = oc7Var;
    }

    @Override // a81
    public final void e(int i, Object obj, jac jacVar) {
        this.e.getMessagesStorage().a.c(new kb7(i, (e) jacVar, (byte) 0));
    }

    @Override // a81
    public final void f(int i, Object obj, long j, z71 z71Var) {
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j;
        this.e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new lb7(z71Var, (byte) 0));
    }

    @Override // a81
    public final void g(int i, Object obj, Object obj2) {
        cf7.Y(i).a.c(new bm3(i, (TLRPC.TL_help_appConfig) obj2, (byte) 25));
    }

    @Override // a81
    public final boolean j(Object obj) {
        return false;
    }
}
