package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class eq implements kq {
    public final /* synthetic */ rq a;

    public eq(rq rqVar) {
        this.a = rqVar;
    }

    @Override // org.telegram.ui.kq
    public final void c(long j3, TLObject tLObject) {
        rq rqVar = this.a;
        if (rqVar.J.f(j3) == null) {
            lq B0 = rqVar.B0();
            rqVar.E.add(tLObject);
            rqVar.J.k(tLObject, j3);
            rqVar.E0(rqVar.E);
            rqVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.kq
    public final void d(long j3) {
        rq rqVar = this.a;
        if (rqVar.J.f(j3) == null) {
            lq B0 = rqVar.B0();
            TLRPC.TL_channelParticipantBanned tL_channelParticipantBanned = new TLRPC.TL_channelParticipantBanned();
            if (j3 > 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantBanned.peer = tL_peerUser;
                tL_peerUser.user_id = j3;
            } else {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_channelParticipantBanned.peer = tL_peerChannel;
                tL_peerChannel.channel_id = -j3;
            }
            tL_channelParticipantBanned.date = rqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = org.telegram.messenger.p10.i(rqVar.getAccountInstance().a).n;
            rqVar.r.kicked_count++;
            rqVar.E.add(tL_channelParticipantBanned);
            rqVar.J.k(tL_channelParticipantBanned, j3);
            rqVar.E0(rqVar.E);
            rqVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.kq
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.kq
    public final /* synthetic */ void b(long j3) {
    }
}
