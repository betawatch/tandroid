// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class kf2 implements md2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ bg2 f;

    public kf2(bg2 bg2Var, int i, long j, int i2, boolean z, boolean[] zArr) {
        this.f = bg2Var;
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = z;
        this.e = zArr;
    }

    @Override // md2
    public final void a(TLRPC.User user) {
        this.f.w0(user);
    }

    @Override // md2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        bg2 bg2Var = this.f;
        ArrayList arrayList = bg2Var.F;
        long j = this.b;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == 1 && i == 0) {
                bg2Var.z0(j);
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                break;
            }
            TLObject tLObject = (TLObject) arrayList.get(i3);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                if (r47.B1(((TLRPC.ChannelParticipant) tLObject).peer) == j) {
                    TLRPC.ChannelParticipant tL_channelParticipantAdmin = i == 1 ? new TLRPC.TL_channelParticipantAdmin() : new TLRPC.TL_channelParticipant();
                    tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                    tL_channelParticipantAdmin.banned_rights = tL_chatBannedRights;
                    tL_channelParticipantAdmin.inviter_id = bg2Var.getUserConfig().e();
                    if (j > 0) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipantAdmin.peer = tL_peerUser;
                        tL_peerUser.user_id = j;
                    } else {
                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                        tL_channelParticipantAdmin.peer = tL_peerChannel;
                        tL_peerChannel.channel_id = -j;
                    }
                    tL_channelParticipantAdmin.date = this.c;
                    tL_channelParticipantAdmin.flags |= 4;
                    tL_channelParticipantAdmin.rank = str;
                    arrayList.set(i3, tL_channelParticipantAdmin);
                }
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                TLRPC.ChatParticipant tL_chatParticipantAdmin = i == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                tL_chatParticipantAdmin.user_id = chatParticipant.user_id;
                tL_chatParticipantAdmin.date = chatParticipant.date;
                tL_chatParticipantAdmin.inviter_id = chatParticipant.inviter_id;
                int indexOf = bg2Var.r.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    bg2Var.r.participants.participants.set(indexOf, tL_chatParticipantAdmin);
                }
                bg2Var.t0();
            }
            i3++;
        }
        if (i != 1 || this.d) {
            return;
        }
        this.e[0] = true;
    }
}
