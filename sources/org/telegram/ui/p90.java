package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class p90 extends an {
    public boolean ud;
    public final /* synthetic */ TLRPC.User vd;
    public final /* synthetic */ TLRPC.User[] wd;
    public final /* synthetic */ long xd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.vd = user;
        this.wd = userArr;
        this.xd = j3;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.ud) {
            return;
        }
        this.ud = true;
        org.telegram.ui.Components.cc.a0(this).I(R.raw.contact_check, org.telegram.messenger.hd.a0(null, null, 2131751739, org.telegram.messenger.q10.p(this.vd)), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131751740, org.telegram.messenger.q10.p(this.wd[0])), new di.x2(this, this.xd, 27))).j();
    }
}
