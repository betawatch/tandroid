package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        org.telegram.messenger.ls.f(this.b).k(org.telegram.messenger.ls.t, new Object[0]);
    }

    @Override // org.telegram.ui.kp
    public final void a(TLRPC.User user) {
    }
}
