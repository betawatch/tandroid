package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class fr implements nq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ vr d;

    public fr(vr vrVar, TLObject tLObject, long j3, boolean z10) {
        this.d = vrVar;
        this.a = tLObject;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.ui.nq
    public final void a(TLRPC.User user) {
        vr.c0(this.d, user);
    }

    @Override // org.telegram.ui.nq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        vr vrVar = this.d;
        or orVar = vrVar.m1;
        long j3 = this.b;
        if (orVar != null && i10 == 1) {
            orVar.b(j3);
        } else if (orVar != null) {
            orVar.c(j3, tLObject);
        }
        if (this.c) {
            vrVar.removeSelfFromStack();
        }
    }
}
