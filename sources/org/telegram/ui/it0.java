package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class it0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jt0 b;

    public /* synthetic */ it0(jt0 jt0Var, int i7) {
        this.a = i7;
        this.b = jt0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7;
        int i10;
        switch (this.a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.b.d;
                privacyControlActivity.M = ((Integer) obj).intValue();
                org.telegram.messenger.g0.a4(privacyControlActivity.k0, privacyControlActivity.c);
                privacyControlActivity.P0();
                break;
            default:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                jt0 jt0Var = this.b;
                PrivacyControlActivity privacyControlActivity2 = jt0Var.d;
                TLRPC.UserFull b22 = privacyControlActivity2.getMessagesController().b2(privacyControlActivity2.getUserConfig().e());
                TL_account.TL_birthday tL_birthday2 = b22 != null ? b22.birthday : null;
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday;
                    privacyControlActivity2.getMessagesStorage().j2(b22, false);
                }
                privacyControlActivity2.getMessagesController().m2();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new lo0(jt0Var, b22, tL_birthday2, 1), 1024);
                i7 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.qp.s1(i7).k4(0L, "BIRTHDAY_SETUP");
                i10 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.qs.f(i10).k(org.telegram.messenger.qs.g5, new Object[0]);
                privacyControlActivity2.Q0(true);
                break;
        }
    }
}
