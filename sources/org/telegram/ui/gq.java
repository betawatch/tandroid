package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class gq implements kq {
    public final /* synthetic */ rq a;

    public gq(rq rqVar) {
        this.a = rqVar;
    }

    @Override // org.telegram.ui.kq
    public final void a(TLRPC.User user) {
        rq.h0(this.a, user);
    }

    @Override // org.telegram.ui.kq
    public final void b(long j3) {
        rq rqVar = this.a;
        ArrayList arrayList = rqVar.E;
        a0.h hVar = rqVar.J;
        TLRPC.User a22 = rqVar.getMessagesController().a2(Long.valueOf(j3));
        if (a22 != null) {
            org.telegram.messenger.g0.i3(new fq(0, this, a22), 200L);
        }
        if (hVar.f(j3) == null) {
            lq B0 = rqVar.B0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = a22.id;
            tL_channelParticipantAdmin.date = rqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = org.telegram.messenger.p10.i(rqVar.getAccountInstance().a).n;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, a22.id);
            Collections.sort(arrayList, new pe(4));
            rqVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.kq
    public final void c(long j3, TLObject tLObject) {
        rq rqVar = this.a;
        ArrayList arrayList = rqVar.E;
        a0.h hVar = rqVar.J;
        if (tLObject == null || hVar.f(j3) != null) {
            return;
        }
        lq B0 = rqVar.B0();
        arrayList.add(tLObject);
        hVar.k(tLObject, j3);
        Collections.sort(arrayList, new pe(4));
        rqVar.F0(B0);
    }

    @Override // org.telegram.ui.kq
    public final /* synthetic */ void d(long j3) {
    }
}
