package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ga1 implements iq {
    public final /* synthetic */ TLRPC.TL_chatChannelParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean[] c;

    public ga1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z4, boolean[] zArr) {
        this.a = tL_chatChannelParticipant;
        this.b = z4;
        this.c = zArr;
    }

    @Override // org.telegram.ui.iq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
        } else {
            TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
            channelParticipant2.admin_rights = tL_chatAdminRights;
            channelParticipant2.rank = str;
            if (this.b) {
                this.c[0] = true;
            }
        }
    }

    @Override // org.telegram.ui.iq
    public final void a(TLRPC.User user) {
    }
}
