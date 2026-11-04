package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class aq implements fq {
    public final /* synthetic */ nq a;

    public aq(nq nqVar) {
        this.a = nqVar;
    }

    @Override // org.telegram.ui.fq
    public final void c(long j10, TLObject tLObject) {
        nq nqVar = this.a;
        if (nqVar.K.f(j10) == null) {
            gq B0 = nqVar.B0();
            nqVar.F.add(tLObject);
            nqVar.K.k(tLObject, j10);
            nqVar.E0(nqVar.F);
            nqVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.fq
    public final void d(long j10) {
        nq nqVar = this.a;
        if (nqVar.K.f(j10) == null) {
            gq B0 = nqVar.B0();
            TLRPC.TL_channelParticipantBanned tL_channelParticipantBanned = new TLRPC.TL_channelParticipantBanned();
            if (j10 > 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantBanned.peer = tL_peerUser;
                tL_peerUser.user_id = j10;
            } else {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_channelParticipantBanned.peer = tL_peerChannel;
                tL_peerChannel.channel_id = -j10;
            }
            tL_channelParticipantBanned.date = nqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = org.telegram.messenger.h10.i(nqVar.getAccountInstance().a).n;
            nqVar.r.kicked_count++;
            nqVar.F.add(tL_channelParticipantBanned);
            nqVar.K.k(tL_channelParticipantBanned, j10);
            nqVar.E0(nqVar.F);
            nqVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.fq
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.fq
    public final /* synthetic */ void b(long j10) {
    }
}
