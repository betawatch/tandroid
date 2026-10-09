package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class hr implements lr {
    public final /* synthetic */ tr a;

    public hr(tr trVar) {
        this.a = trVar;
    }

    @Override // org.telegram.ui.lr
    public final void a(TLRPC.User user) {
        tr.c0(this.a, user);
    }

    @Override // org.telegram.ui.lr
    public final void b(long j3) {
        tr trVar = this.a;
        ArrayList arrayList = trVar.F;
        a0.i iVar = trVar.K;
        TLRPC.User user = trVar.getMessagesController().getUser(Long.valueOf(j3));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new sg(26, this, user), 200L);
        }
        if (iVar.f(j3) == null) {
            mr w02 = trVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = trVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = trVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            iVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new gf(4));
            trVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.lr
    public final void c(long j3, TLObject tLObject) {
        tr trVar = this.a;
        ArrayList arrayList = trVar.F;
        a0.i iVar = trVar.K;
        if (tLObject == null || iVar.f(j3) != null) {
            return;
        }
        mr w02 = trVar.w0();
        arrayList.add(tLObject);
        iVar.k(tLObject, j3);
        Collections.sort(arrayList, new gf(4));
        trVar.A0(w02);
    }

    @Override // org.telegram.ui.lr
    public final /* synthetic */ void d(long j3) {
    }
}
