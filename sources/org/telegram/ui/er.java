package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
    public final void b(long j10) {
        pr prVar = this.a;
        ArrayList arrayList = prVar.C;
        a0.h hVar = prVar.H;
        TLRPC.User user = prVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new hp(6, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            jr w02 = prVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = prVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = prVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new nh.e4(15));
            prVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.ir
    public final void c(long j10, TLObject tLObject) {
        pr prVar = this.a;
        ArrayList arrayList = prVar.C;
        a0.h hVar = prVar.H;
        if (tLObject == null || hVar.f(j10) != null) {
            return;
        }
        jr w02 = prVar.w0();
        arrayList.add(tLObject);
        hVar.k(tLObject, j10);
        Collections.sort(arrayList, new nh.e4(15));
        prVar.A0(w02);
    }

    @Override // org.telegram.ui.ir
    public final /* synthetic */ void d(long j10) {
    }
}
