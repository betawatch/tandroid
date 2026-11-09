package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class lf extends org.telegram.ui.cn {
    public boolean td;
    public final /* synthetic */ TLRPC.User ud;
    public final /* synthetic */ TLRPC.User vd;
    public final /* synthetic */ long wd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.ud = user;
        this.vd = user2;
        this.wd = j3;
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.td) {
            return;
        }
        this.td = true;
        hc.a0(this).I(R.raw.contact_check, org.telegram.messenger.id.a0(null, null, 2131751739, org.telegram.messenger.t10.p(this.ud)), org.telegram.messenger.g0.U2(org.telegram.messenger.id.a0(null, null, 2131751740, org.telegram.messenger.t10.p(this.vd)), new bi.r3(this, this.wd, 21))).j();
    }
}
