package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ig0 extends org.telegram.ui.ActionBar.n2 {
    public hg0 a;
    public org.telegram.ui.Components.im0 b;
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
    public static void V(ig0 ig0Var, org.telegram.ui.ActionBar.b2 b2Var) {
        long j10;
        b2Var.dismiss();
        if (MessagesController.getInstance(ig0Var.currentAccount).config.walletAvailable.get()) {
            org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(ig0Var.currentAccount);
            if (w9.u() > 0) {
                TL_wallet.WalletState walletState = w9.e;
                if (!(!(walletState instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState).backup_enabled) && !w9.e()) {
                    j10 = w9.u();
                    for (org.telegram.ui.Wallet.i0 i0Var : w9.H) {
                        if (!i0Var.e && !i0Var.d) {
                            long j11 = i0Var.c;
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
        String string = LocaleController.getString(R.string.LogOut);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
        b2Var2.R = string;
        b2Var2.T = AndroidUtilities.replaceTags(j10 > 0 ? LocaleController.formatString(R.string.AreYouSureLogoutGrams, org.telegram.ui.Wallet.m0.r(j10, false)) : LocaleController.getString(R.string.AreYouSureLogout));
        alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new gg0(ig0Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void W(ig0 ig0Var, int i10) {
        Integer num = null;
        if (i10 == ig0Var.c) {
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
                ig0Var.presentFragment(new fg0(num.intValue()));
                return;
            } else {
                if (UserConfig.hasPremiumOnAccounts()) {
                    return;
                }
                ig0Var.showDialog(new sg.j0(7, ig0Var.currentAccount, ig0Var.getParentActivity(), ig0Var, null));
                return;
            }
        }
        if (i10 == ig0Var.d) {
            ig0Var.presentFragment(PasscodeActivity.e0());
            return;
        }
        if (i10 == ig0Var.e) {
            ig0Var.presentFragment(new c7());
            return;
        }
        if (i10 == ig0Var.f) {
            ig0Var.presentFragment(new h(3));
            return;
        }
        if (i10 == ig0Var.h) {
            ig0Var.showDialog(org.telegram.ui.Components.f5.T(ig0Var, null));
            return;
        }
        if (i10 != ig0Var.r || ig0Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ig0Var.getParentActivity(), 3, null);
        b2Var.q(500L);
        int i13 = ig0Var.currentAccount;
        b80 b80Var = new b80(28, ig0Var, b2Var);
        if (MessagesController.getInstance(i13).config.walletAvailable.get()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.j(i13, b80Var, 1));
        } else {
            b80Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q60(this, 9));
        this.a = new hg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.b = im0Var;
        im0Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new s4.b0(1, false));
        frameLayout2.addView(this.b, w7.z5.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new gg0(this));
        this.b.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.c9.class}, null, null, null, org.telegram.ui.ActionBar.h6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        int i10 = org.telegram.ui.ActionBar.h6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.m6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        hg0 hg0Var = this.a;
        if (hg0Var != null) {
            hg0Var.l();
        }
    }
}
