package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gr implements oq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wr d;

    public gr(wr wrVar, TLObject tLObject, long j3, boolean z10) {
        this.d = wrVar;
        this.a = tLObject;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.ui.oq
    public final void a(TLRPC.User user) {
        wr.c0(this.d, user);
    }

    @Override // org.telegram.ui.oq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        wr wrVar = this.d;
        pr prVar = wrVar.m1;
        long j3 = this.b;
        if (prVar != null && i10 == 1) {
            prVar.b(j3);
        } else if (prVar != null) {
            prVar.c(j3, tLObject);
        }
        if (this.c) {
            wrVar.removeSelfFromStack();
        }
    }
}
