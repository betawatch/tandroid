package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class bl0 extends org.telegram.ui.Components.im0 {
    public final Context c;
    public final /* synthetic */ PasscodeActivity d;

    public bl0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = b1Var.b();
        PasscodeActivity passcodeActivity = this.d;
        i10 = passcodeActivity.fingerprintRow;
        if (b10 == i10) {
            return true;
        }
        i11 = passcodeActivity.autoLockRow;
        if (b10 == i11 || b10 == passcodeActivity.N) {
            return true;
        }
        i12 = passcodeActivity.changePasscodeRow;
        if (b10 == i12) {
            return true;
        }
        i13 = passcodeActivity.disablePasscodeRow;
        return b10 == i13 || b10 == passcodeActivity.J || b10 == passcodeActivity.K;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.P;
    }

    @Override // s4.g0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        PasscodeActivity passcodeActivity = this.d;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 == i11 || i10 == passcodeActivity.N || i10 == passcodeActivity.K || i10 == passcodeActivity.J) {
            return 0;
        }
        i12 = passcodeActivity.changePasscodeRow;
        if (i10 == i12) {
            return 1;
        }
        i13 = passcodeActivity.autoLockRow;
        if (i10 == i13) {
            return 1;
        }
        i14 = passcodeActivity.disablePasscodeRow;
        if (i10 == i14) {
            return 1;
        }
        if (i10 == passcodeActivity.H || i10 == passcodeActivity.O || i10 == passcodeActivity.G || i10 == passcodeActivity.L) {
            return 2;
        }
        if (i10 == passcodeActivity.M || i10 == passcodeActivity.I) {
            return 3;
        }
        return i10 == 0 ? 4 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e3, code lost:
    
        if (org.telegram.ui.Wallet.m0.w(r0).H() != false) goto L89;
     */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = b1Var.f;
        View view = b1Var.a;
        boolean z10 = true;
        PasscodeActivity passcodeActivity = this.d;
        if (i18 == 0) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            i11 = passcodeActivity.fingerprintRow;
            if (i10 == i11) {
                v8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
                return;
            }
            if (i10 == passcodeActivity.N) {
                v8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
                return;
            }
            if (i10 != passcodeActivity.K) {
                if (i10 == passcodeActivity.J) {
                    String string = LocaleController.getString(R.string.WalletConfirmWithPasscode);
                    i12 = ((org.telegram.ui.ActionBar.n2) passcodeActivity).currentAccount;
                    v8Var.f(string, org.telegram.ui.Wallet.m0.w(i12).I(), false);
                    return;
                }
                return;
            }
            String string2 = LocaleController.getString(R.string.WalletConfirmWithFingerprint);
            i13 = ((org.telegram.ui.ActionBar.n2) passcodeActivity).currentAccount;
            if (org.telegram.ui.Wallet.m0.w(i13).d()) {
                i14 = ((org.telegram.ui.ActionBar.n2) passcodeActivity).currentAccount;
            }
            z10 = false;
            v8Var.f(string2, z10, false);
            return;
        }
        if (i18 == 1) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            i15 = passcodeActivity.changePasscodeRow;
            if (i10 == i15) {
                baVar.b(LocaleController.getString(R.string.ChangePasscode), true);
                if (SharedConfig.passcodeHash.isEmpty()) {
                    int i19 = org.telegram.ui.ActionBar.h6.E6;
                    baVar.setTag(Integer.valueOf(i19));
                    baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
                    return;
                } else {
                    int i20 = org.telegram.ui.ActionBar.h6.G6;
                    baVar.setTag(Integer.valueOf(i20));
                    baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i20, false));
                    return;
                }
            }
            i16 = passcodeActivity.autoLockRow;
            if (i10 == i16) {
                int i21 = SharedConfig.autoLockIn;
                baVar.c(LocaleController.getString(R.string.AutoLock), i21 == 0 ? LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]) : i21 < 3600 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i21 / 60, new Object[0])) : i21 < 86400 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i21 / 60.0f) / 60.0f), new Object[0])) : LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i21 / 60.0f) / 60.0f) / 24.0f), new Object[0])), false, true);
                int i22 = org.telegram.ui.ActionBar.h6.G6;
                baVar.setTag(Integer.valueOf(i22));
                baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i22, false));
                return;
            }
            i17 = passcodeActivity.disablePasscodeRow;
            if (i10 == i17) {
                baVar.b(LocaleController.getString(R.string.DisablePasscode), false);
                int i23 = org.telegram.ui.ActionBar.h6.q7;
                baVar.setTag(Integer.valueOf(i23));
                baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i23, false));
                return;
            }
            return;
        }
        if (i18 != 2) {
            if (i18 != 3) {
                if (i18 != 4) {
                    return;
                }
                cl0 cl0Var = (cl0) view;
                cl0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                cl0Var.a.d();
                return;
            }
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            l4Var.setHeight(46);
            if (i10 == passcodeActivity.M) {
                l4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                return;
            } else {
                if (i10 == passcodeActivity.I) {
                    l4Var.setText(LocaleController.getString(R.string.WalletLock));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
        if (i10 == passcodeActivity.G) {
            d9Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
            d9Var.setBackground(null);
            d9Var.getTextView().setGravity(1);
        } else if (i10 == passcodeActivity.H) {
            d9Var.setText(LocaleController.getString(R.string.AutoLockInfo));
            d9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
        } else if (i10 == passcodeActivity.L) {
            d9Var.setText(LocaleController.getString(R.string.WalletLockInfo));
            d9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
        } else if (i10 == passcodeActivity.O) {
            d9Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
            d9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View v8Var;
        Context context = this.c;
        if (i10 == 0) {
            v8Var = new org.telegram.ui.Cells.v8(context);
        } else if (i10 == 1) {
            v8Var = new org.telegram.ui.Cells.ba(context);
        } else if (i10 == 3) {
            v8Var = new org.telegram.ui.Cells.l4(context);
        } else if (i10 != 4) {
            v8Var = new org.telegram.ui.Cells.d9(context);
        } else {
            v8Var = new cl0(context);
            v8Var.setTag(-33024);
        }
        return new org.telegram.ui.Components.tl0(v8Var);
    }
}
