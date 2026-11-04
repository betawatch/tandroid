package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jf extends org.telegram.ui.wm {
    public boolean sd;
    public final /* synthetic */ TLRPC.User td;
    public final /* synthetic */ TLRPC.User ud;
    public final /* synthetic */ long vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.td = user;
        this.ud = user2;
        this.vd = j10;
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.sd) {
            return;
        }
        this.sd = true;
        fc.a0(this).I(R.raw.contact_check, org.telegram.messenger.bd.a0(null, null, 2131751740, org.telegram.messenger.l10.p(this.td)), org.telegram.messenger.g0.U2(org.telegram.messenger.bd.a0(null, null, 2131751741, org.telegram.messenger.l10.p(this.ud)), new ci.e3(this, this.vd, 21))).j();
    }
}
