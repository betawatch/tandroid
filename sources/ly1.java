// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class ly1 extends zu1 {
    public boolean Jd;
    public final /* synthetic */ TLRPC.User Kd;
    public final /* synthetic */ TLRPC.User Ld;
    public final /* synthetic */ long Md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly1(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j) {
        super(bundle);
        this.Kd = user;
        this.Ld = user2;
        this.Md = j;
    }

    @Override // zu1, org.telegram.ui.ActionBar.e
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Jd) {
            return;
        }
        this.Jd = true;
        d31.b0(this).I(R.raw.contact_check, ob6.a0(null, null, 2131751704, lbc.r(this.Kd)), hl.N2(ob6.a0(null, null, 2131751705, lbc.r(this.Ld)), -1, 0, new kt(this, this.Md, (byte) 6), null)).j();
    }
}
