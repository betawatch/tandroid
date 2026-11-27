// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class nf2 implements md2 {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ bg2 b;

    public nf2(bg2 bg2Var, TLObject tLObject) {
        this.b = bg2Var;
        this.a = tLObject;
    }

    @Override // md2
    public final void a(TLRPC.User user) {
        this.b.w0(user);
    }

    @Override // md2
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
