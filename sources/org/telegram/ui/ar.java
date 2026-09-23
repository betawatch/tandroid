package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ar implements iq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qr d;

    public ar(qr qrVar, TLObject tLObject, long j3, boolean z10) {
        this.d = qrVar;
        this.a = tLObject;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.ui.iq
    public final void a(TLRPC.User user) {
        qr.c0(this.d, user);
    }

    @Override // org.telegram.ui.iq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        qr qrVar = this.d;
        jr jrVar = qrVar.m1;
        long j3 = this.b;
        if (jrVar != null && i10 == 1) {
            jrVar.b(j3);
        } else if (jrVar != null) {
            jrVar.c(j3, tLObject);
        }
        if (this.c) {
            qrVar.removeSelfFromStack();
        }
    }
}
