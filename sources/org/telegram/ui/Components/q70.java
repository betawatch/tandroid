package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class q70 extends org.telegram.ui.bn {
    public boolean vd;
    public final /* synthetic */ boolean wd;
    public final /* synthetic */ long xd;
    public final /* synthetic */ r70 yd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(r70 r70Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.yd = r70Var;
        this.wd = z10;
        this.xd = j3;
        this.vd = false;
    }

    public static void Hd(q70 q70Var, long j3, TLRPC.Chat chat) {
        if (org.telegram.messenger.g0.E1(q70Var.getParentActivity())) {
            py0.c(q70Var.getParentActivity(), q70Var.currentAccount, -j3, q70Var.getUserConfig().f(), null, chat.admin_rights != null, chat.creator, q70Var.yd.J0);
        }
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.vd || !this.wd) {
            return;
        }
        this.vd = true;
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.xd;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        if (org.telegram.messenger.v3.h(O0)) {
            gc K = lc.b0(this).K(R.raw.contact_check, org.telegram.messenger.gd.N0(2131748878, null), org.telegram.messenger.gd.N0(2131748877, null), new bi.q2(this, j3, O0, 24));
            K.r = false;
            K.k(true);
        } else {
            gc Q = lc.b0(this).Q(R.raw.contact_check, 36, org.telegram.messenger.gd.N0(2131748878, null));
            Q.r = false;
            Q.k(true);
        }
    }
}
