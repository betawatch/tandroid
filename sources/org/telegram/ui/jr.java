package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jr implements nr {
    public final /* synthetic */ ur a;

    public jr(ur urVar) {
        this.a = urVar;
    }

    @Override // org.telegram.ui.nr
    public final void a(TLRPC.User user) {
        ur.c0(this.a, user);
    }

    @Override // org.telegram.ui.nr
    public final void b(long j3) {
        ur urVar = this.a;
        ArrayList arrayList = urVar.F;
        a0.i iVar = urVar.K;
        TLRPC.User user = urVar.getMessagesController().getUser(Long.valueOf(j3));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new uh(18, this, user), 200L);
        }
        if (iVar.f(j3) == null) {
            or w02 = urVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = urVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = urVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            iVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new df(4));
            urVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.nr
    public final void c(long j3, TLObject tLObject) {
        ur urVar = this.a;
        ArrayList arrayList = urVar.F;
        a0.i iVar = urVar.K;
        if (tLObject == null || iVar.f(j3) != null) {
            return;
        }
        or w02 = urVar.w0();
        arrayList.add(tLObject);
        iVar.k(tLObject, j3);
        Collections.sort(arrayList, new df(4));
        urVar.A0(w02);
    }

    @Override // org.telegram.ui.nr
    public final /* synthetic */ void d(long j3) {
    }
}
