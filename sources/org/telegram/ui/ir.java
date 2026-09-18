package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ir implements nr {
    public final /* synthetic */ ur a;

    public ir(ur urVar) {
        this.a = urVar;
    }

    @Override // org.telegram.ui.nr
    public final void c(long j3, TLObject tLObject) {
        ur urVar = this.a;
        if (urVar.K.f(j3) == null) {
            or w02 = urVar.w0();
            urVar.F.add(tLObject);
            urVar.K.k(tLObject, j3);
            urVar.z0(urVar.F);
            urVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.nr
    public final void d(long j3) {
        ur urVar = this.a;
        if (urVar.K.f(j3) == null) {
            or w02 = urVar.w0();
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
            tL_channelParticipantBanned.date = urVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = urVar.getAccountInstance().getUserConfig().clientUserId;
            urVar.s.kicked_count++;
            urVar.F.add(tL_channelParticipantBanned);
            urVar.K.k(tL_channelParticipantBanned, j3);
            urVar.z0(urVar.F);
            urVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.nr
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.nr
    public final /* synthetic */ void b(long j3) {
    }
}
