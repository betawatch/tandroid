package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class fo extends x2 {
    public final /* synthetic */ hp e;

    public fo(hp hpVar) {
        this.e = hpVar;
    }

    @Override // org.telegram.messenger.x2
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    @Override // org.telegram.messenger.x2
    public final void e(int i3, Object obj, n10 n10Var) {
        this.e.getMessagesStorage().a.c(new ao(i3, (v2) n10Var, 1));
    }

    @Override // org.telegram.messenger.x2
    public final void f(int i3, Object obj, long j10, w2 w2Var) {
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j10;
        this.e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new bo(w2Var, 1));
    }

    @Override // org.telegram.messenger.x2
    public final void g(int i3, Object obj, Object obj2) {
        qr.a0(i3).a.c(new x0(i3, (TLRPC.messages_AvailableEffects) obj2, 6));
    }

    @Override // org.telegram.messenger.x2
    public final void h(int i3, long j10) {
        this.e.e7.edit().putLong("effects_last_" + i3, j10).apply();
    }
}
