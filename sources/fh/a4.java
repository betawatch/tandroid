package fh;

import gh.n7;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a4 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.w0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ d4 c;

    public a4(d4 d4Var, org.telegram.ui.ActionBar.w0 w0Var, long j10) {
        this.c = d4Var;
        this.a = w0Var;
        this.b = j10;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        int i10;
        int i11;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        d4 d4Var = this.c;
        n7 n7Var = d4Var.U;
        if (i9 != 1) {
            if (i9 == -1) {
                d4Var.dismiss();
                return;
            }
            return;
        }
        x60 x60Var = d4Var.Y;
        if (x60Var != null) {
            x60Var.u();
        }
        org.telegram.ui.ActionBar.d3 d3Var = d4Var.container;
        b6Var = ((org.telegram.ui.ActionBar.f3) d4Var).resourcesProvider;
        x60 F = x60.F(d3Var, b6Var, this.a);
        d4Var.Y = F;
        i10 = ((org.telegram.ui.ActionBar.f3) d4Var).currentAccount;
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        long j10 = this.b;
        if (j10 == clientUserId) {
            canUserDoAction = true;
        } else if (j10 >= 0) {
            canUserDoAction = false;
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) d4Var).currentAccount;
            canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j10)), 5);
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, F.e, F.d, false, false);
        F.d(g1Var3);
        F.k();
        org.telegram.ui.ActionBar.g1 h = F.h();
        h.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
        org.telegram.ui.ActionBar.g1 h10 = F.h();
        h10.setText(LocaleController.getString(R.string.Gift2FilterLimited));
        org.telegram.ui.ActionBar.g1 h11 = F.h();
        h11.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
        org.telegram.ui.ActionBar.g1 h12 = F.h();
        h12.setText(LocaleController.getString(R.string.Gift2FilterUnique));
        if (canUserDoAction) {
            F.k();
            org.telegram.ui.ActionBar.g1 h13 = F.h();
            h13.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
            org.telegram.ui.ActionBar.g1 h14 = F.h();
            h14.setText(LocaleController.getString(R.string.Gift2FilterHidden));
            g1Var = h13;
            g1Var2 = h14;
        } else {
            g1Var = null;
            g1Var2 = null;
        }
        z3 z3Var = new z3(this, g1Var3, h, h10, h11, h12, canUserDoAction, g1Var, g1Var2);
        z3Var.run();
        g1Var3.setOnClickListener(new bg.u1(9, this, z3Var));
        j4.j(h, n7Var, z3Var, 1);
        j4.j(h10, n7Var, z3Var, 2);
        j4.j(h11, n7Var, z3Var, 4);
        j4.j(h12, n7Var, z3Var, 8);
        if (canUserDoAction) {
            j4.j(g1Var, n7Var, z3Var, 256);
            j4.j(g1Var2, n7Var, z3Var, 512);
        }
        F.Y = true;
        F.J = false;
        F.s = 0;
        F.Z();
    }
}
