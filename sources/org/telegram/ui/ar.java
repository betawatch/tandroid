package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ar implements iq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ rr d;

    public ar(rr rrVar, TLObject tLObject, long j10, boolean z4) {
        this.d = rrVar;
        this.a = tLObject;
        this.b = j10;
        this.c = z4;
    }

    @Override // org.telegram.ui.iq
    public final void a(TLRPC.User user) {
        rr.c0(this.d, user);
    }

    @Override // org.telegram.ui.iq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        rr rrVar = this.d;
        kr krVar = rrVar.j1;
        long j10 = this.b;
        if (krVar != null && i10 == 1) {
            krVar.b(j10);
        } else if (krVar != null) {
            krVar.c(j10, tLObject);
        }
        if (this.c) {
            rrVar.removeSelfFromStack();
        }
    }
}
