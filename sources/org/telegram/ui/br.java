package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class br implements nq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ vr b;

    public br(vr vrVar, TLObject tLObject) {
        this.b = vrVar;
        this.a = tLObject;
    }

    @Override // org.telegram.ui.nq
    public final void a(TLRPC.User user) {
        vr.c0(this.b, user);
    }

    @Override // org.telegram.ui.nq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            vr.W(this.b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
