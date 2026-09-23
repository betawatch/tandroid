package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fr implements jr {
    public final /* synthetic */ qr a;

    public fr(qr qrVar) {
        this.a = qrVar;
    }

    @Override // org.telegram.ui.jr
    public final void a(TLRPC.User user) {
        qr.c0(this.a, user);
    }

    @Override // org.telegram.ui.jr
    public final void b(long j3) {
        qr qrVar = this.a;
        ArrayList arrayList = qrVar.F;
        a0.i iVar = qrVar.K;
        TLRPC.User user = qrVar.getMessagesController().getUser(Long.valueOf(j3));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new rh(18, this, user), 200L);
        }
        if (iVar.f(j3) == null) {
            kr w02 = qrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = qrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = qrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            iVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new df(4));
            qrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.jr
    public final void c(long j3, TLObject tLObject) {
        qr qrVar = this.a;
        ArrayList arrayList = qrVar.F;
        a0.i iVar = qrVar.K;
        if (tLObject == null || iVar.f(j3) != null) {
            return;
        }
        kr w02 = qrVar.w0();
        arrayList.add(tLObject);
        iVar.k(tLObject, j3);
        Collections.sort(arrayList, new df(4));
        qrVar.A0(w02);
    }

    @Override // org.telegram.ui.jr
    public final /* synthetic */ void d(long j3) {
    }
}
