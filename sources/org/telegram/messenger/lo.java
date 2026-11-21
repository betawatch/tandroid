package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class lo extends y2 {
    public final /* synthetic */ mp e;

    public lo(mp mpVar) {
        this.e = mpVar;
    }

    @Override // org.telegram.messenger.y2
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    @Override // org.telegram.messenger.y2
    public final void e(int i7, Object obj, q10 q10Var) {
        this.e.getMessagesStorage().a.c(new ho(i7, (w2) q10Var, 1));
    }

    @Override // org.telegram.messenger.y2
    public final void f(int i7, Object obj, long j3, x2 x2Var) {
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j3;
        this.e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new io(x2Var, 1));
    }

    @Override // org.telegram.messenger.y2
    public final void g(int i7, Object obj, Object obj2) {
        tr.a0(i7).a.c(new x0(i7, (TLRPC.messages_AvailableEffects) obj2, 6));
    }

    @Override // org.telegram.messenger.y2
    public final void h(int i7, long j3) {
        this.e.h7.edit().putLong("effects_last_" + i7, j3).apply();
    }
}
