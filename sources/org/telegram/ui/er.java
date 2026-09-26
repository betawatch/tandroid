package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class er implements ir {
    public final /* synthetic */ pr a;

    public er(pr prVar) {
        this.a = prVar;
    }

    @Override // org.telegram.ui.ir
    public final void a(TLRPC.User user) {
        pr.c0(this.a, user);
    }

    @Override // org.telegram.ui.ir
    public final void b(long j3) {
        pr prVar = this.a;
        ArrayList arrayList = prVar.F;
        a0.i iVar = prVar.K;
        TLRPC.User user = prVar.getMessagesController().getUser(Long.valueOf(j3));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new fh(23, this, user), 200L);
        }
        if (iVar.f(j3) == null) {
            jr w02 = prVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = prVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = prVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            iVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new cf(4));
            prVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.ir
    public final void c(long j3, TLObject tLObject) {
        pr prVar = this.a;
        ArrayList arrayList = prVar.F;
        a0.i iVar = prVar.K;
        if (tLObject == null || iVar.f(j3) != null) {
            return;
        }
        jr w02 = prVar.w0();
        arrayList.add(tLObject);
        iVar.k(tLObject, j3);
        Collections.sort(arrayList, new cf(4));
        prVar.A0(w02);
    }

    @Override // org.telegram.ui.ir
    public final /* synthetic */ void d(long j3) {
    }
}
