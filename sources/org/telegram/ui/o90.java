package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o90 implements fq {
    public final /* synthetic */ zx a;
    public final /* synthetic */ int b;

    public o90(zx zxVar, int i10) {
        this.a = zxVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.fq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        org.telegram.messenger.at.f(this.b).k(org.telegram.messenger.at.t, new Object[0]);
    }

    @Override // org.telegram.ui.fq
    public final void a(TLRPC.User user) {
    }
}
