package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o80 implements jp {
    public final /* synthetic */ zw a;
    public final /* synthetic */ int b;

    public o80(zw zwVar, int i7) {
        this.a = zwVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.jp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        org.telegram.messenger.qs.f(this.b).k(org.telegram.messenger.qs.t, new Object[0]);
    }

    @Override // org.telegram.ui.jp
    public final void a(TLRPC.User user) {
    }
}
