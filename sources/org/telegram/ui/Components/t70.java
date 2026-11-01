package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class t70 extends org.telegram.ui.un {
    public boolean kd;
    public final /* synthetic */ boolean ld;
    public final /* synthetic */ long md;
    public final /* synthetic */ u70 nd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(u70 u70Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.nd = u70Var;
        this.ld = z10;
        this.md = j10;
        this.kd = false;
    }

    public static void yd(t70 t70Var, long j10, TLRPC.Chat chat) {
        if (org.telegram.messenger.i0.E1(t70Var.getParentActivity())) {
            jz0.c(t70Var.getParentActivity(), t70Var.currentAccount, -j10, t70Var.getUserConfig().f(), null, chat.admin_rights != null, chat.creator, t70Var.nd.I0);
        }
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.kd || !this.ld) {
            return;
        }
        this.kd = true;
        org.telegram.messenger.wp messagesController = getMessagesController();
        long j10 = this.md;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        if (org.telegram.messenger.w3.h(L0)) {
            wb K = cc.a0(this).K(R.raw.contact_check, org.telegram.messenger.dd.L0(2131749081, null), org.telegram.messenger.dd.L0(2131749080, null), new a3.i0(this, j10, L0, 14));
            K.r = false;
            K.k(true);
        } else {
            wb Q = cc.a0(this).Q(R.raw.contact_check, 36, org.telegram.messenger.dd.L0(2131749081, null));
            Q.r = false;
            Q.k(true);
        }
    }
}
