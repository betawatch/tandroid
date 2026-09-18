package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
