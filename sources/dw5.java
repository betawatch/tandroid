// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dw5 extends yv1 {
    public boolean Gd;
    public final /* synthetic */ boolean Hd;
    public final /* synthetic */ long Id;
    public final /* synthetic */ ew5 Jd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw5(ew5 ew5Var, Bundle bundle, boolean z, long j) {
        super(bundle);
        this.Jd = ew5Var;
        this.Hd = z;
        this.Id = j;
        this.Gd = false;
    }

    public final void Hd(long j, TLRPC.Chat chat) {
        if (gm.C1(getParentActivity())) {
            xhb.c(getParentActivity(), this.currentAccount, -j, getUserConfig().f(), null, chat.admin_rights != null, chat.creator, this.Jd.J0);
        }
    }

    @Override // yv1, org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Gd || !this.Hd) {
            return;
        }
        this.Gd = true;
        oc7 messagesController = getMessagesController();
        long j = this.Id;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j));
        if (sd2.h(L0)) {
            u31 K = c41.b0(this).K(R.raw.contact_check, jb6.M0(2131748828, null), jb6.M0(2131748827, null), new of2(this, j, L0, (byte) 25));
            K.s = false;
            K.k(true);
        } else {
            u31 Q = c41.b0(this).Q(R.raw.contact_check, 36, jb6.M0(2131748828, null));
            Q.s = false;
            Q.k(true);
        }
    }
}
