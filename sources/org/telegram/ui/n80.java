package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class n80 implements kp {
    public final /* synthetic */ cx a;
    public final /* synthetic */ int b;

    public n80(cx cxVar, int i7) {
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
