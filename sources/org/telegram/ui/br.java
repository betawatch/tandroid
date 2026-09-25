package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class br implements hq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ pr b;

    public br(pr prVar, TLObject tLObject) {
        this.b = prVar;
        this.a = tLObject;
    }

    @Override // org.telegram.ui.hq
    public final void a(TLRPC.User user) {
        pr.c0(this.b, user);
    }

    @Override // org.telegram.ui.hq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            pr.W(this.b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
