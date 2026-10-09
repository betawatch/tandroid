package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gr implements lr {
    public final /* synthetic */ tr a;

    public gr(tr trVar) {
        this.a = trVar;
    }

    @Override // org.telegram.ui.lr
    public final void c(long j3, TLObject tLObject) {
        tr trVar = this.a;
        if (trVar.K.f(j3) == null) {
            mr w02 = trVar.w0();
            trVar.F.add(tLObject);
            trVar.K.k(tLObject, j3);
            trVar.z0(trVar.F);
            trVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.lr
    public final void d(long j3) {
        tr trVar = this.a;
        if (trVar.K.f(j3) == null) {
            mr w02 = trVar.w0();
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
            tL_channelParticipantBanned.date = trVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = trVar.getAccountInstance().getUserConfig().clientUserId;
            trVar.s.kicked_count++;
            trVar.F.add(tL_channelParticipantBanned);
            trVar.K.k(tL_channelParticipantBanned, j3);
            trVar.z0(trVar.F);
            trVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.lr
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.lr
    public final /* synthetic */ void b(long j3) {
    }
}
