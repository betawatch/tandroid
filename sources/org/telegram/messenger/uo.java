package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class uo extends b3 {
    public final /* synthetic */ vp e;

    public uo(vp vpVar) {
        this.e = vpVar;
    }

    @Override // org.telegram.messenger.b3
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    @Override // org.telegram.messenger.b3
    public final void e(int i10, Object obj, j20 j20Var) {
        this.e.getMessagesStorage().a.c(new qo(i10, (z2) j20Var, 1));
    }

    @Override // org.telegram.messenger.b3
    public final void f(int i10, Object obj, long j10, a3 a3Var) {
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j10;
        this.e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new ro(a3Var, 1));
    }

    @Override // org.telegram.messenger.b3
    public final void g(int i10, Object obj, Object obj2) {
        hs.a0(i10).a.c(new a1(i10, (TLRPC.messages_AvailableEffects) obj2, 6));
    }

    @Override // org.telegram.messenger.b3
    public final void h(int i10, long j10) {
        this.e.f7.edit().putLong("effects_last_" + i10, j10).apply();
    }
}
