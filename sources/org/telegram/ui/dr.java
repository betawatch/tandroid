package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
            jr A0 = prVar.A0();
            prVar.E.add(tLObject);
            prVar.J.k(tLObject, j10);
            prVar.D0(prVar.E);
            prVar.E0(A0);
        }
    }

    @Override // org.telegram.ui.ir
    public final void d(long j10) {
        pr prVar = this.a;
        if (prVar.J.f(j10) == null) {
            jr A0 = prVar.A0();
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
            tL_channelParticipantBanned.kicked_by = org.telegram.messenger.d20.i(prVar.getAccountInstance().a).n;
            prVar.r.kicked_count++;
            prVar.E.add(tL_channelParticipantBanned);
            prVar.J.k(tL_channelParticipantBanned, j10);
            prVar.D0(prVar.E);
            prVar.E0(A0);
        }
    }

    @Override // org.telegram.ui.ir
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.ir
    public final /* synthetic */ void b(long j10) {
    }
}
