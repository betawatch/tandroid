package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class dr implements ir {
    public final /* synthetic */ pr a;

    public dr(pr prVar) {
        this.a = prVar;
    }

    @Override // org.telegram.ui.ir
    public final void c(long j3, TLObject tLObject) {
        pr prVar = this.a;
        if (prVar.K.f(j3) == null) {
            jr w02 = prVar.w0();
            prVar.F.add(tLObject);
            prVar.K.k(tLObject, j3);
            prVar.z0(prVar.F);
            prVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.ir
    public final void d(long j3) {
        pr prVar = this.a;
        if (prVar.K.f(j3) == null) {
            jr w02 = prVar.w0();
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
            tL_channelParticipantBanned.date = prVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = prVar.getAccountInstance().getUserConfig().clientUserId;
            prVar.s.kicked_count++;
            prVar.F.add(tL_channelParticipantBanned);
            prVar.K.k(tL_channelParticipantBanned, j3);
            prVar.z0(prVar.F);
            prVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.ir
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.ir
    public final /* synthetic */ void b(long j3) {
    }
}
