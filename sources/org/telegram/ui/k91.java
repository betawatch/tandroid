package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k91 implements yp {
    public final /* synthetic */ TLRPC.TL_chatChannelParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean[] c;

    public k91(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.a = tL_chatChannelParticipant;
        this.b = z10;
        this.c = zArr;
    }

    @Override // org.telegram.ui.yp
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.a;
        if (i9 == 0) {
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

    @Override // org.telegram.ui.yp
    public final void a(TLRPC.User user) {
    }
}
