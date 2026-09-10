package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kr implements pr {
    public final /* synthetic */ wr a;

    public kr(wr wrVar) {
        this.a = wrVar;
    }

    @Override // org.telegram.ui.pr
    public final void c(long j3, TLObject tLObject) {
        wr wrVar = this.a;
        if (wrVar.K.f(j3) == null) {
            qr w02 = wrVar.w0();
            wrVar.F.add(tLObject);
            wrVar.K.k(tLObject, j3);
            wrVar.z0(wrVar.F);
            wrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.pr
    public final void d(long j3) {
        wr wrVar = this.a;
        if (wrVar.K.f(j3) == null) {
            qr w02 = wrVar.w0();
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
            tL_channelParticipantBanned.date = wrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = wrVar.getAccountInstance().getUserConfig().clientUserId;
            wrVar.s.kicked_count++;
            wrVar.F.add(tL_channelParticipantBanned);
            wrVar.K.k(tL_channelParticipantBanned, j3);
            wrVar.z0(wrVar.F);
            wrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.pr
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.pr
    public final /* synthetic */ void b(long j3) {
    }
}
