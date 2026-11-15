package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class mo extends x2 {
    public final /* synthetic */ np e;

    public mo(np npVar) {
        this.e = npVar;
    }

    @Override // org.telegram.messenger.x2
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    @Override // org.telegram.messenger.x2
    public final void e(int i7, Object obj, s10 s10Var) {
        this.e.getMessagesStorage().a.c(new io(i7, (v2) s10Var, 1));
    }

    @Override // org.telegram.messenger.x2
    public final void f(int i7, Object obj, long j3, w2 w2Var) {
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j3;
        this.e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new jo(w2Var, 1));
    }

    @Override // org.telegram.messenger.x2
    public final void g(int i7, Object obj, Object obj2) {
        vr.a0(i7).a.c(new x0(i7, (TLRPC.messages_AvailableEffects) obj2, 6));
    }

    @Override // org.telegram.messenger.x2
    public final void h(int i7, long j3) {
        this.e.f7.edit().putLong("effects_last_" + i7, j3).apply();
    }
}
