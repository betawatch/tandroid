package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l90 extends wm {
    public boolean sd;
    public final /* synthetic */ TLRPC.User td;
    public final /* synthetic */ TLRPC.User[] ud;
    public final /* synthetic */ long vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.td = user;
        this.ud = userArr;
        this.vd = j10;
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.sd) {
            return;
        }
        this.sd = true;
        org.telegram.ui.Components.fc.a0(this).I(R.raw.contact_check, org.telegram.messenger.bd.a0(null, null, 2131751740, org.telegram.messenger.l10.p(this.td)), org.telegram.messenger.g0.U2(org.telegram.messenger.bd.a0(null, null, 2131751741, org.telegram.messenger.l10.p(this.ud[0])), new ci.e3(this, this.vd, 27))).j();
    }
}
