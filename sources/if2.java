// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class if2 implements md2 {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ bg2 b;

    public if2(bg2 bg2Var, TLObject tLObject) {
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
