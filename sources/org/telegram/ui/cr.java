package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class cr extends pq {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ long e1;
    public final /* synthetic */ ur f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr(ur urVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f1 = urVar;
        this.d1 = zArr;
        this.e1 = j11;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            ur urVar = this.f1;
            if (org.telegram.ui.Components.vc.a(urVar)) {
                long j3 = this.e1;
                if (j3 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
                    if (user != null) {
                        org.telegram.ui.Components.vc.C(urVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                if (chat != null) {
                    org.telegram.ui.Components.vc.C(urVar, chat.title).j();
                }
            }
        }
    }
}
