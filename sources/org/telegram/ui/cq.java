package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class cq implements hq {
    public final /* synthetic */ oq a;

    public cq(oq oqVar) {
        this.a = oqVar;
    }

    @Override // org.telegram.ui.hq
    public final void c(long j3, TLObject tLObject) {
        oq oqVar = this.a;
        if (oqVar.J.f(j3) == null) {
            iq B0 = oqVar.B0();
            oqVar.E.add(tLObject);
            oqVar.J.k(tLObject, j3);
            oqVar.E0(oqVar.E);
            oqVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.hq
    public final void d(long j3) {
        oq oqVar = this.a;
        if (oqVar.J.f(j3) == null) {
            iq B0 = oqVar.B0();
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
            tL_channelParticipantBanned.date = oqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = org.telegram.messenger.p10.i(oqVar.getAccountInstance().a).n;
            oqVar.r.kicked_count++;
            oqVar.E.add(tL_channelParticipantBanned);
            oqVar.J.k(tL_channelParticipantBanned, j3);
            oqVar.E0(oqVar.E);
            oqVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.hq
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.hq
    public final /* synthetic */ void b(long j3) {
    }
}
