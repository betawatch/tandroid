package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class l80 implements hp {
    public final /* synthetic */ ww a;
    public final /* synthetic */ int b;

    public l80(ww wwVar, int i7) {
        this.a = wwVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.hp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        org.telegram.messenger.qs.f(this.b).k(org.telegram.messenger.qs.t, new Object[0]);
    }

    @Override // org.telegram.ui.hp
    public final void a(TLRPC.User user) {
    }
}
