package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class d70 extends org.telegram.ui.an {
    public boolean ud;
    public final /* synthetic */ boolean vd;
    public final /* synthetic */ long wd;
    public final /* synthetic */ e70 xd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d70(e70 e70Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.xd = e70Var;
        this.vd = z10;
        this.wd = j3;
        this.ud = false;
    }

    public static void Hd(d70 d70Var, long j3, TLRPC.Chat chat) {
        if (org.telegram.messenger.g0.E1(d70Var.getParentActivity())) {
            gy0.c(d70Var.getParentActivity(), d70Var.currentAccount, -j3, d70Var.getUserConfig().f(), null, chat.admin_rights != null, chat.creator, d70Var.xd.J0);
        }
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.ud || !this.vd) {
            return;
        }
        this.ud = true;
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = this.wd;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        if (org.telegram.messenger.t3.h(M0)) {
            xb K = cc.a0(this).K(R.raw.contact_check, org.telegram.messenger.hd.M0(2131749071, null), org.telegram.messenger.hd.M0(2131749070, null), new bi.m1(this, j3, M0, 24));
            K.r = false;
            K.k(true);
        } else {
            xb Q = cc.a0(this).Q(R.raw.contact_check, 36, org.telegram.messenger.hd.M0(2131749071, null));
            Q.r = false;
            Q.k(true);
        }
    }
}
