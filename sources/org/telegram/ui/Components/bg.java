package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class bg extends org.telegram.ui.bn {
    public boolean vd;
    public final /* synthetic */ TLRPC.User wd;
    public final /* synthetic */ TLRPC.User xd;
    public final /* synthetic */ long yd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.wd = user;
        this.xd = user2;
        this.yd = j3;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.h2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.vd) {
            return;
        }
        this.vd = true;
        lc.b0(this).I(R.raw.contact_check, org.telegram.messenger.gd.a0(null, null, 2131751728, org.telegram.messenger.o10.q(this.wd)), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.a0(null, null, 2131751729, org.telegram.messenger.o10.q(this.xd)), new bi.y3(this, this.yd, 22))).j();
    }
}
