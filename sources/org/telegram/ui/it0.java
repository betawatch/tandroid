package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class it0 implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jt0 b;

    public /* synthetic */ it0(jt0 jt0Var, int i7) {
        this.a = i7;
        this.b = jt0Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7;
        int i10;
        switch (this.a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.b.d;
                privacyControlActivity.N = ((Integer) obj).intValue();
                org.telegram.messenger.g0.Y3(privacyControlActivity.l0, privacyControlActivity.c);
                privacyControlActivity.P0();
                break;
            default:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                jt0 jt0Var = this.b;
                PrivacyControlActivity privacyControlActivity2 = jt0Var.d;
                TLRPC.UserFull d2 = privacyControlActivity2.getMessagesController().d2(privacyControlActivity2.getUserConfig().e());
                TL_account.TL_birthday tL_birthday2 = d2 != null ? d2.birthday : null;
                if (d2 != null) {
                    d2.flags2 |= 32;
                    d2.birthday = tL_birthday;
                    privacyControlActivity2.getMessagesStorage().j2(d2, false);
                }
                privacyControlActivity2.getMessagesController().o2();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new mo0(jt0Var, d2, tL_birthday2, 1), 1024);
                i7 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.mp.u1(i7).s4(0L, "BIRTHDAY_SETUP");
                i10 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.ks.f(i10).k(org.telegram.messenger.ks.j5, new Object[0]);
                privacyControlActivity2.Q0(true);
                break;
        }
    }
}
