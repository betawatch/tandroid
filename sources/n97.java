// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class n97 extends t61 {
    public final /* synthetic */ na7 e;

    public n97(na7 na7Var) {
        this.e = na7Var;
    }

    @Override // t61
    public final boolean b(Object obj) {
        return true;
    }

    @Override // t61
    public final void e(int i, Object obj, i8c i8cVar) {
        this.e.getMessagesStorage().a.c(new j97(i, (e) i8cVar, (byte) 1));
    }

    @Override // t61
    public final void f(int i, Object obj, long j, s61 s61Var) {
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j;
        this.e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new k97(s61Var, (byte) 1));
    }

    @Override // t61
    public final void g(int i, Object obj, Object obj2) {
        ad7.Y(i).a.c(new sm3(i, obj2, (byte) 24));
    }

    @Override // t61
    public final void h(int i, long j) {
        this.e.X3.edit().putLong("effects_last_" + i, j).apply();
    }
}
