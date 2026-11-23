package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n70 extends org.telegram.ui.bn {
    public boolean vd;
    public final /* synthetic */ boolean wd;
    public final /* synthetic */ long xd;
    public final /* synthetic */ o70 yd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n70(o70 o70Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.yd = o70Var;
        this.wd = z10;
        this.xd = j3;
        this.vd = false;
    }

    public static void Hd(n70 n70Var, long j3, TLRPC.Chat chat) {
        if (org.telegram.messenger.g0.E1(n70Var.getParentActivity())) {
            oy0.c(n70Var.getParentActivity(), n70Var.currentAccount, -j3, n70Var.getUserConfig().f(), null, chat.admin_rights != null, chat.creator, n70Var.yd.J0);
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
            fc K = kc.b0(this).K(R.raw.contact_check, org.telegram.messenger.gd.N0(2131748878, null), org.telegram.messenger.gd.N0(2131748877, null), new bi.s2(this, j3, O0, 24));
            K.r = false;
            K.k(true);
        } else {
            fc Q = kc.b0(this).Q(R.raw.contact_check, 36, org.telegram.messenger.gd.N0(2131748878, null));
            Q.r = false;
            Q.k(true);
        }
    }
}
