package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class er implements mq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ur d;

    public er(ur urVar, TLObject tLObject, long j3, boolean z10) {
        this.d = urVar;
        this.a = tLObject;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.ui.mq
    public final void a(TLRPC.User user) {
        ur.c0(this.d, user);
    }

    @Override // org.telegram.ui.mq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        ur urVar = this.d;
        nr nrVar = urVar.m1;
        long j3 = this.b;
        if (nrVar != null && i10 == 1) {
            nrVar.b(j3);
        } else if (nrVar != null) {
            nrVar.c(j3, tLObject);
        }
        if (this.c) {
            urVar.removeSelfFromStack();
        }
    }
}
