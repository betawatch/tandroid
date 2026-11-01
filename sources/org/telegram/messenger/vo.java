package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class vo extends b3 {
    public final /* synthetic */ wp e;

    public vo(wp wpVar) {
        this.e = wpVar;
    }

    @Override // org.telegram.messenger.b3
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    @Override // org.telegram.messenger.b3
    public final void e(int i10, Object obj, k20 k20Var) {
        this.e.getMessagesStorage().a.c(new ro(i10, (z2) k20Var, 1));
    }

    @Override // org.telegram.messenger.b3
    public final void f(int i10, Object obj, long j10, a3 a3Var) {
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j10;
        this.e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new so(a3Var, 1));
    }

    @Override // org.telegram.messenger.b3
    public final void g(int i10, Object obj, Object obj2) {
        is.a0(i10).a.c(new a1(i10, (TLRPC.messages_AvailableEffects) obj2, 6));
    }

    @Override // org.telegram.messenger.b3
    public final void h(int i10, long j10) {
        this.e.f7.edit().putLong("effects_last_" + i10, j10).apply();
    }
}
