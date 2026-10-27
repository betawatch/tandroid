package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class br implements fr {
    public final /* synthetic */ mr a;

    public br(mr mrVar) {
        this.a = mrVar;
    }

    @Override // org.telegram.ui.fr
    public final void a(TLRPC.User user) {
        mr.d0(this.a, user);
    }

    @Override // org.telegram.ui.fr
    public final void b(long j10) {
        mr mrVar = this.a;
        ArrayList arrayList = mrVar.E;
        a0.h hVar = mrVar.J;
        TLRPC.User user = mrVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new kp(2, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            gr x02 = mrVar.x0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = mrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = mrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.n4(11));
            mrVar.B0(x02);
        }
    }

    @Override // org.telegram.ui.fr
    public final void c(long j10, TLObject tLObject) {
        mr mrVar = this.a;
        ArrayList arrayList = mrVar.E;
        a0.h hVar = mrVar.J;
        if (tLObject == null || hVar.f(j10) != null) {
            return;
        }
        gr x02 = mrVar.x0();
        arrayList.add(tLObject);
        hVar.k(tLObject, j10);
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.n4(11));
        mrVar.B0(x02);
    }

    @Override // org.telegram.ui.fr
    public final /* synthetic */ void d(long j10) {
    }
}
