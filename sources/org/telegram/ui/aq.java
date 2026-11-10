package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class aq implements jp {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ rq d;

    public aq(rq rqVar, TLObject tLObject, long j3, boolean z9) {
        this.d = rqVar;
        this.a = tLObject;
        this.b = j3;
        this.c = z9;
    }

    @Override // org.telegram.ui.jp
    public final void a(TLRPC.User user) {
        rq.h0(this.d, user);
    }

    @Override // org.telegram.ui.jp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        rq rqVar = this.d;
        kq kqVar = rqVar.l1;
        long j3 = this.b;
        if (kqVar != null && i7 == 1) {
            kqVar.b(j3);
        } else if (kqVar != null) {
            kqVar.c(j3, tLObject);
        }
        if (this.c) {
            rqVar.removeSelfFromStack();
        }
    }
}
