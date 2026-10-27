package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ar implements fr {
    public final /* synthetic */ mr a;

    public ar(mr mrVar) {
        this.a = mrVar;
    }

    @Override // org.telegram.ui.fr
    public final void c(long j10, TLObject tLObject) {
        mr mrVar = this.a;
        if (mrVar.J.f(j10) == null) {
            gr x02 = mrVar.x0();
            mrVar.E.add(tLObject);
            mrVar.J.k(tLObject, j10);
            mrVar.A0(mrVar.E);
            mrVar.B0(x02);
        }
    }

    @Override // org.telegram.ui.fr
    public final void d(long j10) {
        mr mrVar = this.a;
        if (mrVar.J.f(j10) == null) {
            gr x02 = mrVar.x0();
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
            tL_channelParticipantBanned.date = mrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = mrVar.getAccountInstance().getUserConfig().clientUserId;
            mrVar.r.kicked_count++;
            mrVar.E.add(tL_channelParticipantBanned);
            mrVar.J.k(tL_channelParticipantBanned, j10);
            mrVar.A0(mrVar.E);
            mrVar.B0(x02);
        }
    }

    @Override // org.telegram.ui.fr
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.fr
    public final /* synthetic */ void b(long j10) {
    }
}
