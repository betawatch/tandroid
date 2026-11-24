// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class iu0 extends mu1 {
    public boolean vd;
    public final /* synthetic */ TLRPC.User wd;
    public final /* synthetic */ long xd;
    public final /* synthetic */ hv0 yd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu0(hv0 hv0Var, Bundle bundle, TLRPC.User user, long j) {
        super(bundle);
        this.yd = hv0Var;
        this.wd = user;
        this.xd = j;
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.vd) {
            return;
        }
        this.vd = true;
        u21.b0(this).I(R.raw.contact_check, k96.a0(null, null, 2131751727, l7c.q(this.wd)), gl.O2(k96.a0(null, null, 2131751728, l7c.q(this.yd.V)), -1, 0, new et(this, this.xd, (byte) 3), null)).j();
    }
}
