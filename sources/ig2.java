// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ig2 implements he2 {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ wg2 b;

    public ig2(wg2 wg2Var, TLObject tLObject) {
        this.b = wg2Var;
        this.a = tLObject;
    }

    @Override // he2
    public final void a(TLRPC.User user) {
        this.b.w0(user);
    }

    @Override // he2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            this.b.E0(channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
