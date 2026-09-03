package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fr implements kr {
    public final /* synthetic */ rr a;

    public fr(rr rrVar) {
        this.a = rrVar;
    }

    @Override // org.telegram.ui.kr
    public final void c(long j10, TLObject tLObject) {
        rr rrVar = this.a;
        if (rrVar.H.f(j10) == null) {
            lr w02 = rrVar.w0();
            rrVar.C.add(tLObject);
            rrVar.H.k(tLObject, j10);
            rrVar.z0(rrVar.C);
            rrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.kr
    public final void d(long j10) {
        rr rrVar = this.a;
        if (rrVar.H.f(j10) == null) {
            lr w02 = rrVar.w0();
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
            tL_channelParticipantBanned.date = rrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = rrVar.getAccountInstance().getUserConfig().clientUserId;
            rrVar.s.kicked_count++;
            rrVar.C.add(tL_channelParticipantBanned);
            rrVar.H.k(tL_channelParticipantBanned, j10);
            rrVar.z0(rrVar.C);
            rrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.kr
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.kr
    public final /* synthetic */ void b(long j10) {
    }
}
