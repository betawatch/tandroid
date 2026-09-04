package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class jr implements or {
    public final /* synthetic */ vr a;

    public jr(vr vrVar) {
        this.a = vrVar;
    }

    @Override // org.telegram.ui.or
    public final void c(long j3, TLObject tLObject) {
        vr vrVar = this.a;
        if (vrVar.K.f(j3) == null) {
            pr w02 = vrVar.w0();
            vrVar.F.add(tLObject);
            vrVar.K.k(tLObject, j3);
            vrVar.z0(vrVar.F);
            vrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.or
    public final void d(long j3) {
        vr vrVar = this.a;
        if (vrVar.K.f(j3) == null) {
            pr w02 = vrVar.w0();
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
            tL_channelParticipantBanned.date = vrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = vrVar.getAccountInstance().getUserConfig().clientUserId;
            vrVar.s.kicked_count++;
            vrVar.F.add(tL_channelParticipantBanned);
            vrVar.K.k(tL_channelParticipantBanned, j3);
            vrVar.z0(vrVar.F);
            vrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.or
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.or
    public final /* synthetic */ void b(long j3) {
    }
}
