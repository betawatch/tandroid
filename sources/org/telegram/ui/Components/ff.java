package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ff extends org.telegram.ui.un {
    public boolean jd;
    public final /* synthetic */ TLRPC.User kd;
    public final /* synthetic */ TLRPC.User ld;
    public final /* synthetic */ long md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.kd = user;
        this.ld = user2;
        this.md = j10;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.jd) {
            return;
        }
        this.jd = true;
        cc.a0(this).I(R.raw.contact_check, org.telegram.messenger.cd.a0(null, null, 2131751740, org.telegram.messenger.h20.p(this.kd)), org.telegram.messenger.i0.T2(org.telegram.messenger.cd.a0(null, null, 2131751741, org.telegram.messenger.h20.p(this.ld)), new bi.e(this, this.md, 10))).j();
    }
}
