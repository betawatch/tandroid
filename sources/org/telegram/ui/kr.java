package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class kr implements or {
    public final /* synthetic */ vr a;

    public kr(vr vrVar) {
        this.a = vrVar;
    }

    @Override // org.telegram.ui.or
    public final void a(TLRPC.User user) {
        vr.c0(this.a, user);
    }

    @Override // org.telegram.ui.or
    public final void b(long j3) {
        vr vrVar = this.a;
        ArrayList arrayList = vrVar.F;
        a0.i iVar = vrVar.K;
        TLRPC.User user = vrVar.getMessagesController().getUser(Long.valueOf(j3));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new fh(24, this, user), 200L);
        }
        if (iVar.f(j3) == null) {
            pr w02 = vrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = vrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = vrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            iVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new f6(6));
            vrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.or
    public final void c(long j3, TLObject tLObject) {
        vr vrVar = this.a;
        ArrayList arrayList = vrVar.F;
        a0.i iVar = vrVar.K;
        if (tLObject == null || iVar.f(j3) != null) {
            return;
        }
        pr w02 = vrVar.w0();
        arrayList.add(tLObject);
        iVar.k(tLObject, j3);
        Collections.sort(arrayList, new f6(6));
        vrVar.A0(w02);
    }

    @Override // org.telegram.ui.or
    public final /* synthetic */ void d(long j3) {
    }
}
