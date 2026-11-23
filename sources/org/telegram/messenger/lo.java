package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    public final void e(int i7, Object obj, p10 p10Var) {
        this.e.getMessagesStorage().a.c(new ho(i7, (w2) p10Var, 1));
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
