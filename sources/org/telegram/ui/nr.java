package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class nr implements rr {
    public final /* synthetic */ yr a;

    public nr(yr yrVar) {
        this.a = yrVar;
    }

    @Override // org.telegram.ui.rr
    public final void a(TLRPC.User user) {
        yr.c0(this.a, user);
    }

    @Override // org.telegram.ui.rr
    public final void b(long j10) {
        yr yrVar = this.a;
        ArrayList arrayList = yrVar.F;
        a0.h hVar = yrVar.K;
        TLRPC.User user = yrVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new vp(2, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            sr w02 = yrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = yrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = yrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.l5(8));
            yrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.rr
    public final void c(long j10, TLObject tLObject) {
        yr yrVar = this.a;
        ArrayList arrayList = yrVar.F;
        a0.h hVar = yrVar.K;
        if (tLObject == null || hVar.f(j10) != null) {
            return;
        }
        sr w02 = yrVar.w0();
        arrayList.add(tLObject);
        hVar.k(tLObject, j10);
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.l5(8));
        yrVar.A0(w02);
    }

    @Override // org.telegram.ui.rr
    public final /* synthetic */ void d(long j10) {
    }
}
