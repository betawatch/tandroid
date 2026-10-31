package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p90 implements fq {
    public final /* synthetic */ ay a;
    public final /* synthetic */ int b;

    public p90(ay ayVar, int i10) {
        this.a = ayVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.fq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        org.telegram.messenger.zs.f(this.b).k(org.telegram.messenger.zs.t, new Object[0]);
    }

    @Override // org.telegram.ui.fq
    public final void a(TLRPC.User user) {
    }
}
