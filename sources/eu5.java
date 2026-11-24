// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class eu5 extends mu1 {
    public boolean vd;
    public final /* synthetic */ boolean wd;
    public final /* synthetic */ long xd;
    public final /* synthetic */ fu5 yd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu5(fu5 fu5Var, Bundle bundle, boolean z, long j) {
        super(bundle);
        this.yd = fu5Var;
        this.wd = z;
        this.xd = j;
        this.vd = false;
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.vd || !this.wd) {
            return;
        }
        this.vd = true;
        na7 messagesController = getMessagesController();
        long j = this.xd;
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
        if (hc2.h(K0)) {
            m21 K = u21.b0(this).K(R.raw.contact_check, k96.M0(2131748879, null), k96.M0(2131748878, null), new de2(this, j, K0, (byte) 25));
            K.r = false;
            K.k(true);
        } else {
            m21 Q = u21.b0(this).Q(R.raw.contact_check, 36, k96.M0(2131748879, null));
            Q.r = false;
            Q.k(true);
        }
    }

    public final void td(long j, TLRPC.Chat chat) {
        if (gl.C1(getParentActivity())) {
            wfb.c(getParentActivity(), this.currentAccount, -j, getUserConfig().f(), null, chat.admin_rights != null, chat.creator, this.yd.J0);
        }
    }
}
