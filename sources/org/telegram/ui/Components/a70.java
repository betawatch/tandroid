package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class a70 extends org.telegram.ui.an {
    public boolean rd;
    public final /* synthetic */ boolean sd;
    public final /* synthetic */ long td;
    public final /* synthetic */ b70 ud;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a70(b70 b70Var, Bundle bundle, boolean z9, long j3) {
        super(bundle);
        this.ud = b70Var;
        this.sd = z9;
        this.td = j3;
        this.rd = false;
    }

    public static void Dd(a70 a70Var, long j3, TLRPC.Chat chat) {
        if (org.telegram.messenger.g0.E1(a70Var.getParentActivity())) {
            ey0.c(a70Var.getParentActivity(), a70Var.currentAccount, -j3, a70Var.getUserConfig().f(), null, chat.admin_rights != null, chat.creator, a70Var.ud.I0);
        }
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.rd || !this.sd) {
            return;
        }
        this.rd = true;
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.td;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        if (org.telegram.messenger.t3.h(M0)) {
            cc K = hc.a0(this).K(R.raw.contact_check, org.telegram.messenger.id.M0(2131749072, null), org.telegram.messenger.id.M0(2131749071, null), new bi.d3(this, j3, M0, 23));
            K.r = false;
            K.k(true);
        } else {
            cc Q = hc.a0(this).Q(R.raw.contact_check, 36, org.telegram.messenger.id.M0(2131749072, null));
            Q.r = false;
            Q.k(true);
        }
    }
}
