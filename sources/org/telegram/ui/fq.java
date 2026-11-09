package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class fq implements jq {
    public final /* synthetic */ qq a;

    public fq(qq qqVar) {
        this.a = qqVar;
    }

    @Override // org.telegram.ui.jq
    public final void a(TLRPC.User user) {
        qq.h0(this.a, user);
    }

    @Override // org.telegram.ui.jq
    public final void b(long j3) {
        qq qqVar = this.a;
        ArrayList arrayList = qqVar.E;
        a0.h hVar = qqVar.J;
        TLRPC.User a22 = qqVar.getMessagesController().a2(Long.valueOf(j3));
        if (a22 != null) {
            org.telegram.messenger.g0.i3(new rf(29, this, a22), 200L);
        }
        if (hVar.f(j3) == null) {
            kq B0 = qqVar.B0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = a22.id;
            tL_channelParticipantAdmin.date = qqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = org.telegram.messenger.p10.i(qqVar.getAccountInstance().a).n;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, a22.id);
            Collections.sort(arrayList, new oe(4));
            qqVar.F0(B0);
        }
    }

    @Override // org.telegram.ui.jq
    public final void c(long j3, TLObject tLObject) {
        qq qqVar = this.a;
        ArrayList arrayList = qqVar.E;
        a0.h hVar = qqVar.J;
        if (tLObject == null || hVar.f(j3) != null) {
            return;
        }
        kq B0 = qqVar.B0();
        arrayList.add(tLObject);
        hVar.k(tLObject, j3);
        Collections.sort(arrayList, new oe(4));
        qqVar.F0(B0);
    }

    @Override // org.telegram.ui.jq
    public final /* synthetic */ void d(long j3) {
    }
}
