package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class l80 implements jp {
    public final /* synthetic */ yw a;
    public final /* synthetic */ int b;

    public l80(yw ywVar, int i7) {
        this.a = ywVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.jp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        org.telegram.messenger.ns.f(this.b).k(org.telegram.messenger.ns.t, new Object[0]);
    }

    @Override // org.telegram.ui.jp
    public final void a(TLRPC.User user) {
    }
}
