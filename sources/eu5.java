// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class eu5 extends mu1 {
    public boolean wd;
    public final /* synthetic */ boolean xd;
    public final /* synthetic */ long yd;
    public final /* synthetic */ fu5 zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu5(fu5 fu5Var, Bundle bundle, boolean z, long j) {
        super(bundle);
        this.zd = fu5Var;
        this.xd = z;
        this.yd = j;
        this.wd = false;
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.wd || !this.xd) {
            return;
        }
        this.wd = true;
        na7 messagesController = getMessagesController();
        long j = this.yd;
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

    public final void vd(long j, TLRPC.Chat chat) {
        if (gl.C1(getParentActivity())) {
            wfb.c(getParentActivity(), this.currentAccount, -j, getUserConfig().f(), null, chat.admin_rights != null, chat.creator, this.zd.J0);
        }
    }
}
