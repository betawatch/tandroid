package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lr implements pr {
    public final /* synthetic */ wr a;

    public lr(wr wrVar) {
        this.a = wrVar;
    }

    @Override // org.telegram.ui.pr
    public final void a(TLRPC.User user) {
        wr.c0(this.a, user);
    }

    @Override // org.telegram.ui.pr
    public final void b(long j3) {
        wr wrVar = this.a;
        ArrayList arrayList = wrVar.F;
        a0.i iVar = wrVar.K;
        TLRPC.User user = wrVar.getMessagesController().getUser(Long.valueOf(j3));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new qh(21, this, user), 200L);
        }
        if (iVar.f(j3) == null) {
            qr w02 = wrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = wrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = wrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            iVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new a4.e(27));
            wrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.pr
    public final void c(long j3, TLObject tLObject) {
        wr wrVar = this.a;
        ArrayList arrayList = wrVar.F;
        a0.i iVar = wrVar.K;
        if (tLObject == null || iVar.f(j3) != null) {
            return;
        }
        qr w02 = wrVar.w0();
        arrayList.add(tLObject);
        iVar.k(tLObject, j3);
        Collections.sort(arrayList, new a4.e(27));
        wrVar.A0(w02);
    }

    @Override // org.telegram.ui.pr
    public final /* synthetic */ void d(long j3) {
    }
}
