package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class gr implements lr {
    public final /* synthetic */ sr a;

    public gr(sr srVar) {
        this.a = srVar;
    }

    @Override // org.telegram.ui.lr
    public final void c(long j3, TLObject tLObject) {
        sr srVar = this.a;
        if (srVar.K.f(j3) == null) {
            mr w02 = srVar.w0();
            srVar.F.add(tLObject);
            srVar.K.k(tLObject, j3);
            srVar.z0(srVar.F);
            srVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.lr
    public final void d(long j3) {
        sr srVar = this.a;
        if (srVar.K.f(j3) == null) {
            mr w02 = srVar.w0();
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
            tL_channelParticipantBanned.date = srVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = srVar.getAccountInstance().getUserConfig().clientUserId;
            srVar.s.kicked_count++;
            srVar.F.add(tL_channelParticipantBanned);
            srVar.K.k(tL_channelParticipantBanned, j3);
            srVar.z0(srVar.F);
            srVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.lr
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.lr
    public final /* synthetic */ void b(long j3) {
    }
}
