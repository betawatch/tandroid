// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mxa implements wc2 {
    public final /* synthetic */ TLRPC.TL_chatChannelParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean[] c;

    public mxa(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z, boolean[] zArr) {
        this.a = tL_chatChannelParticipant;
        this.b = z;
        this.c = zArr;
    }

    @Override // wc2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.a;
        if (i == 0) {
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

    @Override // wc2
    public final void a(TLRPC.User user) {
    }
}
