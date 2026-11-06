package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class dq implements hq {
    public final /* synthetic */ oq a;

    public dq(oq oqVar) {
        this.a = oqVar;
    }

    @Override // org.telegram.ui.hq
    public final void a(TLRPC.User user) {
        oq.h0(this.a, user);
    }

    @Override // org.telegram.ui.hq
    public final void b(long j3) {
        oq oqVar = this.a;
        ArrayList arrayList = oqVar.E;
        a0.h hVar = oqVar.J;
        TLRPC.User a22 = oqVar.getMessagesController().a2(Long.valueOf(j3));
        if (a22 != null) {
            org.telegram.messenger.g0.i3(new qf(29, this, a22), 200L);
        }
        if (hVar.f(j3) == null) {
            iq B0 = oqVar.B0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = a22.id;
            tL_channelParticipantAdmin.date = oqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = org.telegram.messenger.p10.i(oqVar.getAccountInstance().a).n;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, a22.id);
            Collections.sort(arrayList, new oe(4));
            oqVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.hq
    public final void c(long j3, TLObject tLObject) {
        oq oqVar = this.a;
        ArrayList arrayList = oqVar.E;
        a0.h hVar = oqVar.J;
        if (tLObject == null || hVar.f(j3) != null) {
            return;
        }
        iq B0 = oqVar.B0();
        arrayList.add(tLObject);
        hVar.k(tLObject, j3);
        Collections.sort(arrayList, new oe(4));
        oqVar.F0(B0);
    }

    @Override // org.telegram.ui.hq
    public final /* synthetic */ void d(long j3) {
    }
}
