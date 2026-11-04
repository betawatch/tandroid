package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i80 implements fp {
    public final /* synthetic */ uw a;
    public final /* synthetic */ int b;

    public i80(uw uwVar, int i3) {
        this.a = uwVar;
        this.b = i3;
    }

    @Override // org.telegram.ui.fp
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        org.telegram.messenger.hs.f(this.b).k(org.telegram.messenger.hs.t, new Object[0]);
    }

    @Override // org.telegram.ui.fp
    public final void a(TLRPC.User user) {
    }
}
