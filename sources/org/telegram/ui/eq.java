package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class eq implements jq {
    public final /* synthetic */ qq a;

    public eq(qq qqVar) {
        this.a = qqVar;
    }

    @Override // org.telegram.ui.jq
    public final void c(long j3, TLObject tLObject) {
        qq qqVar = this.a;
        if (qqVar.J.f(j3) == null) {
            kq B0 = qqVar.B0();
            qqVar.E.add(tLObject);
            qqVar.J.k(tLObject, j3);
            qqVar.E0(qqVar.E);
            qqVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.jq
    public final void d(long j3) {
        qq qqVar = this.a;
        if (qqVar.J.f(j3) == null) {
            kq B0 = qqVar.B0();
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
            tL_channelParticipantBanned.date = qqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = org.telegram.messenger.p10.i(qqVar.getAccountInstance().a).n;
            qqVar.r.kicked_count++;
            qqVar.E.add(tL_channelParticipantBanned);
            qqVar.J.k(tL_channelParticipantBanned, j3);
            qqVar.E0(qqVar.E);
            qqVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.jq
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.jq
    public final /* synthetic */ void b(long j3) {
    }
}
