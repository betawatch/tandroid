package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class eg extends org.telegram.ui.bn {
    public boolean vd;
    public final /* synthetic */ TLRPC.User wd;
    public final /* synthetic */ TLRPC.User xd;
    public final /* synthetic */ long yd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.wd = user;
        this.xd = user2;
        this.yd = j3;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.vd) {
            return;
        }
        this.vd = true;
        lc.b0(this).I(R.raw.contact_check, org.telegram.messenger.gd.a0(null, null, 2131751727, org.telegram.messenger.o10.q(this.wd)), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.a0(null, null, 2131751728, org.telegram.messenger.o10.q(this.xd)), new bi.c4(this, this.yd, 22))).j();
    }
}
