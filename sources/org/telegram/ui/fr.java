package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
    public final void b(long j10) {
        qr qrVar = this.a;
        ArrayList arrayList = qrVar.C;
        a0.h hVar = qrVar.H;
        TLRPC.User user = qrVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new mp(4, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            kr w02 = qrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = qrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = qrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new oh.k0(15));
            qrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.jr
    public final void c(long j10, TLObject tLObject) {
        qr qrVar = this.a;
        ArrayList arrayList = qrVar.C;
        a0.h hVar = qrVar.H;
        if (tLObject == null || hVar.f(j10) != null) {
            return;
        }
        kr w02 = qrVar.w0();
        arrayList.add(tLObject);
        hVar.k(tLObject, j10);
        Collections.sort(arrayList, new oh.k0(15));
        qrVar.A0(w02);
    }

    @Override // org.telegram.ui.jr
    public final /* synthetic */ void d(long j10) {
    }
}
