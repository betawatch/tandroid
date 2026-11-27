// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class d66 extends zu1 {
    public boolean Jd;
    public final /* synthetic */ TLRPC.User Kd;
    public final /* synthetic */ TLRPC.User[] Ld;
    public final /* synthetic */ long Md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d66(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j) {
        super(bundle);
        this.Kd = user;
        this.Ld = userArr;
        this.Md = j;
    }

    @Override // zu1, org.telegram.ui.ActionBar.e
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Jd) {
            return;
        }
        this.Jd = true;
        d31.b0(this).I(R.raw.contact_check, ob6.a0(null, null, 2131751704, lbc.r(this.Kd)), hl.N2(ob6.a0(null, null, 2131751705, lbc.r(this.Ld[0])), -1, 0, new kt((Object) this, this.Md, (byte) 18), null)).j();
    }
}
