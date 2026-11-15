package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt0 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ht0 b;

    public /* synthetic */ gt0(ht0 ht0Var, int i7) {
        this.a = i7;
        this.b = ht0Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7;
        int i10;
        switch (this.a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.b.d;
                privacyControlActivity.N = ((Integer) obj).intValue();
                org.telegram.messenger.g0.Z3(privacyControlActivity.l0, privacyControlActivity.c);
                privacyControlActivity.P0();
                break;
            default:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                ht0 ht0Var = this.b;
                PrivacyControlActivity privacyControlActivity2 = ht0Var.d;
                TLRPC.UserFull b22 = privacyControlActivity2.getMessagesController().b2(privacyControlActivity2.getUserConfig().e());
                TL_account.TL_birthday tL_birthday2 = b22 != null ? b22.birthday : null;
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday;
                    privacyControlActivity2.getMessagesStorage().j2(b22, false);
                }
                privacyControlActivity2.getMessagesController().m2();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new jo0(ht0Var, b22, tL_birthday2, 1), 1024);
                i7 = ((org.telegram.ui.ActionBar.e2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.np.s1(i7).k4(0L, "BIRTHDAY_SETUP");
                i10 = ((org.telegram.ui.ActionBar.e2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.ns.f(i10).k(org.telegram.messenger.ns.g5, new Object[0]);
                privacyControlActivity2.Q0(true);
                break;
        }
    }
}
