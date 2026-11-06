package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class lf extends org.telegram.ui.an {
    public boolean rd;
    public final /* synthetic */ TLRPC.User sd;
    public final /* synthetic */ TLRPC.User td;
    public final /* synthetic */ long ud;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.sd = user;
        this.td = user2;
        this.ud = j3;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.rd) {
            return;
        }
        this.rd = true;
        hc.a0(this).I(R.raw.contact_check, org.telegram.messenger.hd.a0(null, null, 2131751740, org.telegram.messenger.t10.p(this.sd)), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131751741, org.telegram.messenger.t10.p(this.td)), new bi.r3(this, this.ud, 21))).j();
    }
}
