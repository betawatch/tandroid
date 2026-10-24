package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class lg0 extends org.telegram.ui.ActionBar.o2 {
    public kg0 a;
    public org.telegram.ui.Components.mm0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int v;

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(lg0 lg0Var, org.telegram.ui.ActionBar.c2 c2Var) {
        long j10;
        c2Var.dismiss();
        if (MessagesController.getInstance(lg0Var.currentAccount).config.walletAvailable.get()) {
            org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(lg0Var.currentAccount);
            if (w9.u() > 0) {
                TL_wallet.WalletState walletState = w9.e;
                if (!(!(walletState instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState).backup_enabled) && !w9.e()) {
                    j10 = w9.u();
                    for (org.telegram.ui.Wallet.h0 h0Var : w9.H) {
                        if (!h0Var.e && !h0Var.d) {
                            long j11 = h0Var.c;
                            if (j11 > 0) {
                                j10 += j11;
                            }
                        }
                    }
                }
            }
            j10 = 0;
            while (r9.hasNext()) {
            }
        } else {
            j10 = 0;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lg0Var.getParentActivity());
        String string = LocaleController.getString(R.string.LogOut);
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
        c2Var2.R = string;
        c2Var2.T = AndroidUtilities.replaceTags(j10 > 0 ? LocaleController.formatString(R.string.AreYouSureLogoutGrams, org.telegram.ui.Wallet.l0.r(j10, false)) : LocaleController.getString(R.string.AreYouSureLogout));
        alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new jg0(lg0Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void W(lg0 lg0Var, int i10) {
        Integer num = null;
        if (i10 == lg0Var.c) {
            int i11 = 0;
            for (int i12 = 3; i12 >= 0; i12--) {
                if (!UserConfig.getInstance(i12).isClientActivated()) {
                    i11++;
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                }
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                i11--;
            }
            if (i11 > 0 && num != null) {
                lg0Var.presentFragment(new ig0(num.intValue()));
                return;
            } else {
                if (UserConfig.hasPremiumOnAccounts()) {
                    return;
                }
                lg0Var.showDialog(new sg.j0(7, lg0Var.currentAccount, lg0Var.getParentActivity(), lg0Var, null));
                return;
            }
        }
        if (i10 == lg0Var.d) {
            lg0Var.presentFragment(PasscodeActivity.e0());
            return;
        }
        if (i10 == lg0Var.e) {
            lg0Var.presentFragment(new c7());
            return;
        }
        if (i10 == lg0Var.f) {
            lg0Var.presentFragment(new g(3));
            return;
        }
        if (i10 == lg0Var.h) {
            lg0Var.showDialog(org.telegram.ui.Components.f5.U(lg0Var, null));
            return;
        }
        if (i10 != lg0Var.r || lg0Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(lg0Var.getParentActivity(), 3, null);
        c2Var.r(500L);
        int i13 = lg0Var.currentAccount;
        f80 f80Var = new f80(28, lg0Var, c2Var);
        if (MessagesController.getInstance(i13).config.walletAvailable.get()) {
            AndroidUtilities.runOnUIThread(new wg1(i13, f80Var, 2));
        } else {
            f80Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 9));
        this.a = new kg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.b = mm0Var;
        mm0Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new s4.b0(1, false));
        frameLayout2.addView(this.b, w7.z5.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new jg0(this));
        this.b.t1();
        this.actionBar.setAdaptiveBackground(this.b);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.v = 1;
        if (UserConfig.getActivatedAccountsCount() < 4) {
            int i10 = this.v;
            this.v = i10 + 1;
            this.c = i10;
        } else {
            this.c = -1;
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
            int i11 = this.v;
            this.v = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.v;
        this.e = i12;
        this.f = i12 + 1;
        this.h = i12 + 2;
        this.n = i12 + 3;
        this.r = i12 + 4;
        this.v = i12 + 6;
        this.s = i12 + 5;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        kg0 kg0Var = this.a;
        if (kg0Var != null) {
            kg0Var.l();
        }
    }
}
