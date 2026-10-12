package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ir implements qq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yr d;

    public ir(yr yrVar, TLObject tLObject, long j10, boolean z10) {
        this.d = yrVar;
        this.a = tLObject;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.ui.qq
    public final void a(TLRPC.User user) {
        yr.c0(this.d, user);
    }

    @Override // org.telegram.ui.qq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        yr yrVar = this.d;
        rr rrVar = yrVar.m1;
        long j10 = this.b;
        if (rrVar != null && i10 == 1) {
            rrVar.b(j10);
        } else if (rrVar != null) {
            rrVar.c(j10, tLObject);
        }
        if (this.c) {
            yrVar.removeSelfFromStack();
        }
    }
}
