package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class aq implements kp {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ rq f;

    public aq(rq rqVar, int i7, long j3, int i10, boolean z10, boolean[] zArr) {
        this.f = rqVar;
        this.a = i7;
        this.b = j3;
        this.c = i10;
        this.d = z10;
        this.e = zArr;
    }

    @Override // org.telegram.ui.kp
    public final void a(TLRPC.User user) {
        rq.h0(this.f, user);
    }

    @Override // org.telegram.ui.kp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        rq rqVar = this.f;
        ArrayList arrayList = rqVar.F;
        long j3 = this.b;
        int i10 = this.a;
        if (i10 != 0) {
            if (i10 == 1 && i7 == 0) {
                rqVar.A0(j3);
                return;
            }
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                break;
            }
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                if (org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) tLObject).peer) == j3) {
                    TLRPC.ChannelParticipant tL_channelParticipantAdmin = i7 == 1 ? new TLRPC.TL_channelParticipantAdmin() : new TLRPC.TL_channelParticipant();
                    tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                    tL_channelParticipantAdmin.banned_rights = tL_chatBannedRights;
                    tL_channelParticipantAdmin.inviter_id = rqVar.getUserConfig().e();
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
                    arrayList.set(i11, tL_channelParticipantAdmin);
                }
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                TLRPC.ChatParticipant tL_chatParticipantAdmin = i7 == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                tL_chatParticipantAdmin.user_id = chatParticipant.user_id;
                tL_chatParticipantAdmin.date = chatParticipant.date;
                tL_chatParticipantAdmin.inviter_id = chatParticipant.inviter_id;
                int indexOf = rqVar.r.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    rqVar.r.participants.participants.set(indexOf, tL_chatParticipantAdmin);
                }
                rqVar.w0();
            }
            i11++;
        }
        if (i7 != 1 || this.d) {
            return;
        }
        this.e[0] = true;
    }
}
