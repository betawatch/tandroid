package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class po extends x2 {
    public final /* synthetic */ qp e;

    public po(qp qpVar) {
        this.e = qpVar;
    }

    @Override // org.telegram.messenger.x2
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    @Override // org.telegram.messenger.x2
    public final void e(int i7, Object obj, v10 v10Var) {
        this.e.getMessagesStorage().a.c(new lo(i7, (v2) v10Var, 1));
    }

    @Override // org.telegram.messenger.x2
    public final void f(int i7, Object obj, long j3, w2 w2Var) {
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j3;
        this.e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new mo(w2Var, 1));
    }

    @Override // org.telegram.messenger.x2
    public final void g(int i7, Object obj, Object obj2) {
        yr.a0(i7).a.c(new x0(i7, (TLRPC.messages_AvailableEffects) obj2, 6));
    }

    @Override // org.telegram.messenger.x2
    public final void h(int i7, long j3) {
        this.e.e7.edit().putLong("effects_last_" + i7, j3).apply();
    }
}
