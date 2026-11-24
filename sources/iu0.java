// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class iu0 extends mu1 {
    public boolean wd;
    public final /* synthetic */ TLRPC.User xd;
    public final /* synthetic */ long yd;
    public final /* synthetic */ hv0 zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu0(hv0 hv0Var, Bundle bundle, TLRPC.User user, long j) {
        super(bundle);
        this.zd = hv0Var;
        this.xd = user;
        this.yd = j;
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.wd) {
            return;
        }
        this.wd = true;
        u21.b0(this).I(R.raw.contact_check, k96.a0(null, null, 2131751727, l7c.r(this.xd)), gl.N2(k96.a0(null, null, 2131751728, l7c.r(this.zd.V)), -1, 0, new et(this, this.yd, (byte) 3), null)).j();
    }
}
