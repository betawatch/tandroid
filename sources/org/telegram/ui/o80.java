package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o80 implements kp {
    public final /* synthetic */ cx a;
    public final /* synthetic */ int b;

    public o80(cx cxVar, int i7) {
        this.a = cxVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.kp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        org.telegram.messenger.ks.f(this.b).k(org.telegram.messenger.ks.t, new Object[0]);
    }

    @Override // org.telegram.ui.kp
    public final void a(TLRPC.User user) {
    }
}
