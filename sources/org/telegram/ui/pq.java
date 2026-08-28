package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pq implements yp {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ jr f;

    public pq(jr jrVar, int i9, long j10, int i10, boolean z10, boolean[] zArr) {
        this.f = jrVar;
        this.a = i9;
        this.b = j10;
        this.c = i10;
        this.d = z10;
        this.e = zArr;
    }

    @Override // org.telegram.ui.yp
    public final void a(TLRPC.User user) {
        jr.b0(this.f, user);
    }

    @Override // org.telegram.ui.yp
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        jr jrVar = this.f;
        ArrayList arrayList = jrVar.B;
        long j10 = this.b;
        int i10 = this.a;
        if (i10 != 0) {
            if (i10 == 1 && i9 == 0) {
                jrVar.u0(j10);
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
                if (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) == j10) {
                    TLRPC.ChannelParticipant tL_channelParticipantAdmin = i9 == 1 ? new TLRPC.TL_channelParticipantAdmin() : new TLRPC.TL_channelParticipant();
                    tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                    tL_channelParticipantAdmin.banned_rights = tL_chatBannedRights;
                    tL_channelParticipantAdmin.inviter_id = jrVar.getUserConfig().getClientUserId();
                    if (j10 > 0) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipantAdmin.peer = tL_peerUser;
                        tL_peerUser.user_id = j10;
                    } else {
                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                        tL_channelParticipantAdmin.peer = tL_peerChannel;
                        tL_peerChannel.channel_id = -j10;
                    }
                    tL_channelParticipantAdmin.date = this.c;
                    tL_channelParticipantAdmin.flags |= 4;
                    tL_channelParticipantAdmin.rank = str;
                    arrayList.set(i11, tL_channelParticipantAdmin);
                }
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                TLRPC.ChatParticipant tL_chatParticipantAdmin = i9 == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                tL_chatParticipantAdmin.user_id = chatParticipant.user_id;
                tL_chatParticipantAdmin.date = chatParticipant.date;
                tL_chatParticipantAdmin.inviter_id = chatParticipant.inviter_id;
                int indexOf = jrVar.s.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    jrVar.s.participants.participants.set(indexOf, tL_chatParticipantAdmin);
                }
                jrVar.q0();
            }
            i11++;
        }
        if (i9 != 1 || this.d) {
            return;
        }
        this.e[0] = true;
    }
}
