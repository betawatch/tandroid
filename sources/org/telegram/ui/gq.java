package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        ArrayList arrayList = rqVar.F;
        a0.h hVar = rqVar.K;
        TLRPC.User c22 = rqVar.getMessagesController().c2(Long.valueOf(j3));
        if (c22 != null) {
            org.telegram.messenger.g0.h3(new ah(18, this, c22), 200L);
        }
        if (hVar.f(j3) == null) {
            lq B0 = rqVar.B0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = c22.id;
            tL_channelParticipantAdmin.date = rqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = org.telegram.messenger.i10.i(rqVar.getAccountInstance().a).n;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, c22.id);
            Collections.sort(arrayList, new pe(3));
            rqVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.kq
    public final void c(long j3, TLObject tLObject) {
        rq rqVar = this.a;
        ArrayList arrayList = rqVar.F;
        a0.h hVar = rqVar.K;
        if (tLObject == null || hVar.f(j3) != null) {
            return;
        }
        lq B0 = rqVar.B0();
        arrayList.add(tLObject);
        hVar.k(tLObject, j3);
        Collections.sort(arrayList, new pe(3));
        rqVar.F0(B0);
    }

    @Override // org.telegram.ui.kq
    public final /* synthetic */ void d(long j3) {
    }
}
