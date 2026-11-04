package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w60 extends org.telegram.ui.wm {
    public boolean sd;
    public final /* synthetic */ boolean td;
    public final /* synthetic */ long ud;
    public final /* synthetic */ x60 vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(x60 x60Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.vd = x60Var;
        this.td = z10;
        this.ud = j10;
        this.sd = false;
    }

    public static void Dd(w60 w60Var, long j10, TLRPC.Chat chat) {
        if (org.telegram.messenger.g0.E1(w60Var.getParentActivity())) {
            dy0.c(w60Var.getParentActivity(), w60Var.currentAccount, -j10, w60Var.getUserConfig().f(), null, chat.admin_rights != null, chat.creator, w60Var.vd.J0);
        }
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.sd || !this.td) {
            return;
        }
        this.sd = true;
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = this.ud;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        if (org.telegram.messenger.t3.h(M0)) {
            ac K = fc.a0(this).K(R.raw.contact_check, org.telegram.messenger.bd.M0(2131749079, null), org.telegram.messenger.bd.M0(2131749078, null), new ai.r1(this, j10, M0, 24));
            K.r = false;
            K.k(true);
        } else {
            ac Q = fc.a0(this).Q(R.raw.contact_check, 36, org.telegram.messenger.bd.M0(2131749079, null));
            Q.r = false;
            Q.k(true);
        }
    }
}
