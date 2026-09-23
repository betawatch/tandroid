package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class er implements jr {
    public final /* synthetic */ qr a;

    public er(qr qrVar) {
        this.a = qrVar;
    }

    @Override // org.telegram.ui.jr
    public final void c(long j3, TLObject tLObject) {
        qr qrVar = this.a;
        if (qrVar.K.f(j3) == null) {
            kr w02 = qrVar.w0();
            qrVar.F.add(tLObject);
            qrVar.K.k(tLObject, j3);
            qrVar.z0(qrVar.F);
            qrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.jr
    public final void d(long j3) {
        qr qrVar = this.a;
        if (qrVar.K.f(j3) == null) {
            kr w02 = qrVar.w0();
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
            tL_channelParticipantBanned.date = qrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = qrVar.getAccountInstance().getUserConfig().clientUserId;
            qrVar.s.kicked_count++;
            qrVar.F.add(tL_channelParticipantBanned);
            qrVar.K.k(tL_channelParticipantBanned, j3);
            qrVar.z0(qrVar.F);
            qrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.jr
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.jr
    public final /* synthetic */ void b(long j3) {
    }
}
