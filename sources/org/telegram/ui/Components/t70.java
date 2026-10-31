package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t70 extends org.telegram.ui.un {
    public boolean jd;
    public final /* synthetic */ boolean kd;
    public final /* synthetic */ long ld;
    public final /* synthetic */ u70 md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(u70 u70Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.md = u70Var;
        this.kd = z10;
        this.ld = j10;
        this.jd = false;
    }

    public static void td(t70 t70Var, long j10, TLRPC.Chat chat) {
        if (org.telegram.messenger.i0.E1(t70Var.getParentActivity())) {
            iz0.c(t70Var.getParentActivity(), t70Var.currentAccount, -j10, t70Var.getUserConfig().f(), null, chat.admin_rights != null, chat.creator, t70Var.md.I0);
        }
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.jd || !this.kd) {
            return;
        }
        this.jd = true;
        org.telegram.messenger.vp messagesController = getMessagesController();
        long j10 = this.ld;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        if (org.telegram.messenger.w3.h(L0)) {
            wb K = cc.a0(this).K(R.raw.contact_check, org.telegram.messenger.cd.L0(2131749081, null), org.telegram.messenger.cd.L0(2131749080, null), new a3.i0(this, j10, L0, 14));
            K.r = false;
            K.k(true);
        } else {
            wb Q = cc.a0(this).Q(R.raw.contact_check, 36, org.telegram.messenger.cd.L0(2131749081, null));
            Q.r = false;
            Q.k(true);
        }
    }
}
