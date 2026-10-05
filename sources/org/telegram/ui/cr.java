package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class cr implements jq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ rr b;

    public cr(rr rrVar, TLObject tLObject) {
        this.b = rrVar;
        this.a = tLObject;
    }

    @Override // org.telegram.ui.jq
    public final void a(TLRPC.User user) {
        rr.c0(this.b, user);
    }

    @Override // org.telegram.ui.jq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rr.U(this.b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
