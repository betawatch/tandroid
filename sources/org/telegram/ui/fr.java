package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class fr implements mq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ ur b;

    public fr(ur urVar, TLObject tLObject) {
        this.b = urVar;
        this.a = tLObject;
    }

    @Override // org.telegram.ui.mq
    public final void a(TLRPC.User user) {
        ur.c0(this.b, user);
    }

    @Override // org.telegram.ui.mq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            ur.W(this.b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
