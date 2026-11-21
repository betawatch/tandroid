package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class fq implements kq {
    public final /* synthetic */ rq a;

    public fq(rq rqVar) {
        this.a = rqVar;
    }

    @Override // org.telegram.ui.kq
    public final void c(long j3, TLObject tLObject) {
        rq rqVar = this.a;
        if (rqVar.K.f(j3) == null) {
            lq B0 = rqVar.B0();
            rqVar.F.add(tLObject);
            rqVar.K.k(tLObject, j3);
            rqVar.E0(rqVar.F);
            rqVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.kq
    public final void d(long j3) {
        rq rqVar = this.a;
        if (rqVar.K.f(j3) == null) {
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
            tL_channelParticipantBanned.kicked_by = org.telegram.messenger.j10.i(rqVar.getAccountInstance().a).n;
            rqVar.r.kicked_count++;
            rqVar.F.add(tL_channelParticipantBanned);
            rqVar.K.k(tL_channelParticipantBanned, j3);
            rqVar.E0(rqVar.F);
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
