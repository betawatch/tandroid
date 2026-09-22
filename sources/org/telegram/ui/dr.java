package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class dr implements mq {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ ur f;

    public dr(ur urVar, int i10, long j3, int i11, boolean z10, boolean[] zArr) {
        this.f = urVar;
        this.a = i10;
        this.b = j3;
        this.c = i11;
        this.d = z10;
        this.e = zArr;
    }

    @Override // org.telegram.ui.mq
    public final void a(TLRPC.User user) {
        ur.c0(this.f, user);
    }

    @Override // org.telegram.ui.mq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ur urVar = this.f;
        ArrayList arrayList = urVar.F;
        long j3 = this.b;
        int i11 = this.a;
        if (i11 != 0) {
            if (i11 == 1 && i10 == 0) {
                urVar.v0(j3);
                return;
            }
            return;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList.size()) {
                break;
            }
            TLObject tLObject = (TLObject) arrayList.get(i12);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                if (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) == j3) {
                    TLRPC.ChannelParticipant tL_channelParticipantAdmin = i10 == 1 ? new TLRPC.TL_channelParticipantAdmin() : new TLRPC.TL_channelParticipant();
                    tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                    tL_channelParticipantAdmin.banned_rights = tL_chatBannedRights;
                    tL_channelParticipantAdmin.inviter_id = urVar.getUserConfig().getClientUserId();
                    if (j3 > 0) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipantAdmin.peer = tL_peerUser;
                        tL_peerUser.user_id = j3;
                    } else {
                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                        tL_channelParticipantAdmin.peer = tL_peerChannel;
                        tL_peerChannel.channel_id = -j3;
                    }
                    tL_channelParticipantAdmin.date = this.c;
                    tL_channelParticipantAdmin.flags |= 4;
                    tL_channelParticipantAdmin.rank = str;
                    arrayList.set(i12, tL_channelParticipantAdmin);
                }
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                TLRPC.ChatParticipant tL_chatParticipantAdmin = i10 == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                tL_chatParticipantAdmin.user_id = chatParticipant.user_id;
                tL_chatParticipantAdmin.date = chatParticipant.date;
                tL_chatParticipantAdmin.inviter_id = chatParticipant.inviter_id;
                int indexOf = urVar.s.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    urVar.s.participants.participants.set(indexOf, tL_chatParticipantAdmin);
                }
                urVar.r0();
            }
            i12++;
        }
        if (i10 != 1 || this.d) {
            return;
        }
        this.e[0] = true;
    }
}
