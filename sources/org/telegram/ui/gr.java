package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class gr implements kr {
    public final /* synthetic */ rr a;

    public gr(rr rrVar) {
        this.a = rrVar;
    }

    @Override // org.telegram.ui.kr
    public final void a(TLRPC.User user) {
        rr.c0(this.a, user);
    }

    @Override // org.telegram.ui.kr
    public final void b(long j3) {
        rr rrVar = this.a;
        ArrayList arrayList = rrVar.F;
        a0.i iVar = rrVar.K;
        TLRPC.User user = rrVar.getMessagesController().getUser(Long.valueOf(j3));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new oh(22, this, user), 200L);
        }
        if (iVar.f(j3) == null) {
            lr w02 = rrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = rrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = rrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            iVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new ff(4));
            rrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.kr
    public final void c(long j3, TLObject tLObject) {
        rr rrVar = this.a;
        ArrayList arrayList = rrVar.F;
        a0.i iVar = rrVar.K;
        if (tLObject == null || iVar.f(j3) != null) {
            return;
        }
        lr w02 = rrVar.w0();
        arrayList.add(tLObject);
        iVar.k(tLObject, j3);
        Collections.sort(arrayList, new ff(4));
        rrVar.A0(w02);
    }

    @Override // org.telegram.ui.kr
    public final /* synthetic */ void d(long j3) {
    }
}
