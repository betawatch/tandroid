package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class br implements hq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ qr b;

    public br(qr qrVar, TLObject tLObject) {
        this.b = qrVar;
        this.a = tLObject;
    }

    @Override // org.telegram.ui.hq
    public final void a(TLRPC.User user) {
        qr.c0(this.b, user);
    }

    @Override // org.telegram.ui.hq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qr.W(this.b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
