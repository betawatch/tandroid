// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ob7 extends a81 {
    public final /* synthetic */ oc7 e;

    public ob7(oc7 oc7Var) {
        this.e = oc7Var;
    }

    @Override // a81
    public final boolean b(Object obj) {
        return true;
    }

    @Override // a81
    public final void e(int i, Object obj, jac jacVar) {
        this.e.getMessagesStorage().a.c(new kb7(i, (e) jacVar, (byte) 1));
    }

    @Override // a81
    public final void f(int i, Object obj, long j, z71 z71Var) {
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j;
        this.e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new lb7(z71Var, (byte) 1));
    }

    @Override // a81
    public final void g(int i, Object obj, Object obj2) {
        cf7.Y(i).a.c(new bm3(i, obj2, (byte) 26));
    }

    @Override // a81
    public final void h(int i, long j) {
        this.e.X3.edit().putLong("effects_last_" + i, j).apply();
    }
}
