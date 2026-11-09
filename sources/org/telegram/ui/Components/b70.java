package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b70 extends org.telegram.ui.cn {
    public boolean td;
    public final /* synthetic */ boolean ud;
    public final /* synthetic */ long vd;
    public final /* synthetic */ c70 wd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b70(c70 c70Var, Bundle bundle, boolean z9, long j3) {
        super(bundle);
        this.wd = c70Var;
        this.ud = z9;
        this.vd = j3;
        this.td = false;
    }

    public static void Gd(b70 b70Var, long j3, TLRPC.Chat chat) {
        if (org.telegram.messenger.g0.E1(b70Var.getParentActivity())) {
            fy0.c(b70Var.getParentActivity(), b70Var.currentAccount, -j3, b70Var.getUserConfig().f(), null, chat.admin_rights != null, chat.creator, b70Var.wd.I0);
        }
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.td || !this.ud) {
            return;
        }
        this.td = true;
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.vd;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        if (org.telegram.messenger.t3.h(M0)) {
            cc K = hc.a0(this).K(R.raw.contact_check, org.telegram.messenger.id.M0(2131749071, null), org.telegram.messenger.id.M0(2131749070, null), new bi.d3(this, j3, M0, 23));
            K.r = false;
            K.k(true);
        } else {
            cc Q = hc.a0(this).Q(R.raw.contact_check, 36, org.telegram.messenger.id.M0(2131749071, null));
            Q.r = false;
            Q.k(true);
        }
    }
}
