// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class iw5 extends zu1 {
    public boolean Jd;
    public final /* synthetic */ boolean Kd;
    public final /* synthetic */ long Ld;
    public final /* synthetic */ jw5 Md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw5(jw5 jw5Var, Bundle bundle, boolean z, long j) {
        super(bundle);
        this.Md = jw5Var;
        this.Kd = z;
        this.Ld = j;
        this.Jd = false;
    }

    public final void Hd(long j, TLRPC.Chat chat) {
        if (hl.C1(getParentActivity())) {
            sjb.c(getParentActivity(), this.currentAccount, -j, getUserConfig().f(), null, chat.admin_rights != null, chat.creator, this.Md.J0);
        }
    }

    @Override // zu1, org.telegram.ui.ActionBar.e
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Jd || !this.Kd) {
            return;
        }
        this.Jd = true;
        uc7 messagesController = getMessagesController();
        long j = this.Ld;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
        if (xc2.h(M0)) {
            v21 K = d31.b0(this).K(R.raw.contact_check, ob6.M0(2131748825, null), ob6.M0(2131748824, null), new ue2(this, j, M0, (byte) 25));
            K.s = false;
            K.k(true);
        } else {
            v21 Q = d31.b0(this).Q(R.raw.contact_check, 36, ob6.M0(2131748825, null));
            Q.s = false;
            Q.k(true);
        }
    }
}
