package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class aq implements jp {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qq d;

    public aq(qq qqVar, TLObject tLObject, long j3, boolean z10) {
        this.d = qqVar;
        this.a = tLObject;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.ui.jp
    public final void a(TLRPC.User user) {
        qq.h0(this.d, user);
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
        qq qqVar = this.d;
        jq jqVar = qqVar.m1;
        long j3 = this.b;
        if (jqVar != null && i7 == 1) {
            jqVar.b(j3);
        } else if (jqVar != null) {
            jqVar.c(j3, tLObject);
        }
        if (this.c) {
            qqVar.removeSelfFromStack();
        }
    }
}
