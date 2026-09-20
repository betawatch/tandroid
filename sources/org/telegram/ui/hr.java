package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class hr implements lr {
    public final /* synthetic */ sr a;

    public hr(sr srVar) {
        this.a = srVar;
    }

    @Override // org.telegram.ui.lr
    public final void a(TLRPC.User user) {
        sr.c0(this.a, user);
    }

    @Override // org.telegram.ui.lr
    public final void b(long j3) {
        sr srVar = this.a;
        ArrayList arrayList = srVar.F;
        a0.i iVar = srVar.K;
        TLRPC.User user = srVar.getMessagesController().getUser(Long.valueOf(j3));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new gh(24, this, user), 200L);
        }
        if (iVar.f(j3) == null) {
            mr w02 = srVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = srVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = srVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            iVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new df(4));
            srVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.lr
    public final void c(long j3, TLObject tLObject) {
        sr srVar = this.a;
        ArrayList arrayList = srVar.F;
        a0.i iVar = srVar.K;
        if (tLObject == null || iVar.f(j3) != null) {
            return;
        }
        mr w02 = srVar.w0();
        arrayList.add(tLObject);
        iVar.k(tLObject, j3);
        Collections.sort(arrayList, new df(4));
        srVar.A0(w02);
    }

    @Override // org.telegram.ui.lr
    public final /* synthetic */ void d(long j3) {
    }
}
