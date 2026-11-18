package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class o70 extends org.telegram.ui.bn {
    public boolean vd;
    public final /* synthetic */ boolean wd;
    public final /* synthetic */ long xd;
    public final /* synthetic */ p70 yd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(p70 p70Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.yd = p70Var;
        this.wd = z10;
        this.xd = j3;
        this.vd = false;
    }

    public static void Hd(o70 o70Var, long j3, TLRPC.Chat chat) {
        if (org.telegram.messenger.g0.E1(o70Var.getParentActivity())) {
            ny0.c(o70Var.getParentActivity(), o70Var.currentAccount, -j3, o70Var.getUserConfig().f(), null, chat.admin_rights != null, chat.creator, o70Var.yd.J0);
        }
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.h2
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
            gc K = lc.b0(this).K(R.raw.contact_check, org.telegram.messenger.gd.M0(2131748879, null), org.telegram.messenger.gd.M0(2131748878, null), new bi.m2(this, j3, O0, 24));
            K.r = false;
            K.k(true);
        } else {
            gc Q = lc.b0(this).Q(R.raw.contact_check, 36, org.telegram.messenger.gd.M0(2131748879, null));
            Q.r = false;
            Q.k(true);
        }
    }
}
