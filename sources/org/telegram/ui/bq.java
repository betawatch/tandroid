package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bq implements fq {
    public final /* synthetic */ nq a;

    public bq(nq nqVar) {
        this.a = nqVar;
    }

    @Override // org.telegram.ui.fq
    public final void a(TLRPC.User user) {
        nq.h0(this.a, user);
    }

    @Override // org.telegram.ui.fq
    public final void b(long j10) {
        nq nqVar = this.a;
        ArrayList arrayList = nqVar.F;
        a0.h hVar = nqVar.K;
        TLRPC.User a22 = nqVar.getMessagesController().a2(Long.valueOf(j10));
        if (a22 != null) {
            org.telegram.messenger.g0.i3(new lo(4, this, a22), 200L);
        }
        if (hVar.f(j10) == null) {
            gq B0 = nqVar.B0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = a22.id;
            tL_channelParticipantAdmin.date = nqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = org.telegram.messenger.h10.i(nqVar.getAccountInstance().a).n;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, a22.id);
            Collections.sort(arrayList, new org.telegram.messenger.tq(24));
            nqVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.fq
    public final void c(long j10, TLObject tLObject) {
        nq nqVar = this.a;
        ArrayList arrayList = nqVar.F;
        a0.h hVar = nqVar.K;
        if (tLObject == null || hVar.f(j10) != null) {
            return;
        }
        gq B0 = nqVar.B0();
        arrayList.add(tLObject);
        hVar.k(tLObject, j10);
        Collections.sort(arrayList, new org.telegram.messenger.tq(24));
        nqVar.F0(B0);
    }

    @Override // org.telegram.ui.fq
    public final /* synthetic */ void d(long j10) {
    }
}
