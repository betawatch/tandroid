package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class aq implements hp {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ oq b;

    public aq(oq oqVar, TLObject tLObject) {
        this.b = oqVar;
        this.a = tLObject;
    }

    @Override // org.telegram.ui.hp
    public final void a(TLRPC.User user) {
        oq.h0(this.b, user);
    }

    @Override // org.telegram.ui.hp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            oq.b0(this.b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
