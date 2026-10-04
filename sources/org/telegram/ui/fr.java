package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class fr implements kr {
    public final /* synthetic */ rr a;

    public fr(rr rrVar) {
        this.a = rrVar;
    }

    @Override // org.telegram.ui.kr
    public final void c(long j3, TLObject tLObject) {
        rr rrVar = this.a;
        if (rrVar.K.f(j3) == null) {
            lr w02 = rrVar.w0();
            rrVar.F.add(tLObject);
            rrVar.K.k(tLObject, j3);
            rrVar.z0(rrVar.F);
            rrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.kr
    public final void d(long j3) {
        rr rrVar = this.a;
        if (rrVar.K.f(j3) == null) {
            lr w02 = rrVar.w0();
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
            tL_channelParticipantBanned.date = rrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = rrVar.getAccountInstance().getUserConfig().clientUserId;
            rrVar.s.kicked_count++;
            rrVar.F.add(tL_channelParticipantBanned);
            rrVar.K.k(tL_channelParticipantBanned, j3);
            rrVar.z0(rrVar.F);
            rrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.kr
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.kr
    public final /* synthetic */ void b(long j3) {
    }
}
