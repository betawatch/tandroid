package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oq extends bq {
    public final /* synthetic */ boolean[] Z0;
    public final /* synthetic */ long a1;
    public final /* synthetic */ jr b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq(jr jrVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i9, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i9, true, false, null);
        this.b1 = jrVar;
        this.Z0 = zArr;
        this.a1 = j12;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.Z0[0]) {
            jr jrVar = this.b1;
            if (org.telegram.ui.Components.oc.a(jrVar)) {
                long j10 = this.a1;
                if (j10 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        org.telegram.ui.Components.oc.C(jrVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    org.telegram.ui.Components.oc.C(jrVar, chat.title).j();
                }
            }
        }
    }
}
