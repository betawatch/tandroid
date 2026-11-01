package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class dr implements ir {
    public final /* synthetic */ pr a;

    public dr(pr prVar) {
        this.a = prVar;
    }

    @Override // org.telegram.ui.ir
    public final void c(long j10, TLObject tLObject) {
        pr prVar = this.a;
        if (prVar.J.f(j10) == null) {
            jr B0 = prVar.B0();
            prVar.E.add(tLObject);
            prVar.J.k(tLObject, j10);
            prVar.E0(prVar.E);
            prVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.ir
    public final void d(long j10) {
        pr prVar = this.a;
        if (prVar.J.f(j10) == null) {
            jr B0 = prVar.B0();
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
            tL_channelParticipantBanned.date = prVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = org.telegram.messenger.e20.i(prVar.getAccountInstance().a).n;
            prVar.r.kicked_count++;
            prVar.E.add(tL_channelParticipantBanned);
            prVar.J.k(tL_channelParticipantBanned, j10);
            prVar.E0(prVar.E);
            prVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.ir
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.ir
    public final /* synthetic */ void b(long j10) {
    }
}
