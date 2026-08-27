package gh;

import hh.m7;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.b70;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v3 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.v0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ y3 c;

    public v3(y3 y3Var, org.telegram.ui.ActionBar.v0 v0Var, long j10) {
        this.c = y3Var;
        this.a = v0Var;
        this.b = j10;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.f1 f1Var2;
        y3 y3Var = this.c;
        m7 m7Var = y3Var.U;
        if (i10 != 1) {
            if (i10 == -1) {
                y3Var.dismiss();
                return;
            }
            return;
        }
        b70 b70Var = y3Var.Y;
        if (b70Var != null) {
            b70Var.u();
        }
        org.telegram.ui.ActionBar.c3 c3Var = y3Var.container;
        c6Var = ((org.telegram.ui.ActionBar.e3) y3Var).resourcesProvider;
        b70 F = b70.F(c3Var, c6Var, this.a);
        y3Var.Y = F;
        i11 = ((org.telegram.ui.ActionBar.e3) y3Var).currentAccount;
        long clientUserId = UserConfig.getInstance(i11).getClientUserId();
        long j10 = this.b;
        if (j10 == clientUserId) {
            canUserDoAction = true;
        } else if (j10 >= 0) {
            canUserDoAction = false;
        } else {
            i12 = ((org.telegram.ui.ActionBar.e3) y3Var).currentAccount;
            canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j10)), 5);
        }
        org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, F.e, F.d, false, false);
        F.d(f1Var3);
        F.k();
        org.telegram.ui.ActionBar.f1 h = F.h();
        h.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
        org.telegram.ui.ActionBar.f1 h10 = F.h();
        h10.setText(LocaleController.getString(R.string.Gift2FilterLimited));
        org.telegram.ui.ActionBar.f1 h11 = F.h();
        h11.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
        org.telegram.ui.ActionBar.f1 h12 = F.h();
        h12.setText(LocaleController.getString(R.string.Gift2FilterUnique));
        if (canUserDoAction) {
            F.k();
            org.telegram.ui.ActionBar.f1 h13 = F.h();
            h13.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
            org.telegram.ui.ActionBar.f1 h14 = F.h();
            h14.setText(LocaleController.getString(R.string.Gift2FilterHidden));
            f1Var = h13;
            f1Var2 = h14;
        } else {
            f1Var = null;
            f1Var2 = null;
        }
        u3 u3Var = new u3(this, f1Var3, h, h10, h11, h12, canUserDoAction, f1Var, f1Var2);
        u3Var.run();
        f1Var3.setOnClickListener(new ag.q0(10, this, u3Var));
        d4.j(h, m7Var, u3Var, 1);
        d4.j(h10, m7Var, u3Var, 2);
        d4.j(h11, m7Var, u3Var, 4);
        d4.j(h12, m7Var, u3Var, 8);
        if (canUserDoAction) {
            d4.j(f1Var, m7Var, u3Var, 256);
            d4.j(f1Var2, m7Var, u3Var, 512);
        }
        F.Y = true;
        F.J = false;
        F.s = 0;
        F.Z();
    }
}
