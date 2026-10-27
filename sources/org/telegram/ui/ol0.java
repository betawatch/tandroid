package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ol0 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final /* synthetic */ PasscodeActivity d;

    public ol0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = e1Var.b();
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

    @Override // s4.h0
    public final int h() {
        return this.d.P;
    }

    @Override // s4.h0
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
    
        if (org.telegram.ui.Wallet.l0.x(r0).J() != false) goto L89;
     */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = e1Var.f;
        View view = e1Var.a;
        boolean z10 = true;
        PasscodeActivity passcodeActivity = this.d;
        if (i18 == 0) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            i11 = passcodeActivity.fingerprintRow;
            if (i10 == i11) {
                a9Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
                return;
            }
            if (i10 == passcodeActivity.N) {
                a9Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
                return;
            }
            if (i10 != passcodeActivity.K) {
                if (i10 == passcodeActivity.J) {
                    String string = LocaleController.getString(R.string.WalletConfirmWithPasscode);
                    i12 = ((org.telegram.ui.ActionBar.r2) passcodeActivity).currentAccount;
                    a9Var.f(string, org.telegram.ui.Wallet.l0.x(i12).K(), false);
                    return;
                }
                return;
            }
            String string2 = LocaleController.getString(R.string.WalletConfirmWithFingerprint);
            i13 = ((org.telegram.ui.ActionBar.r2) passcodeActivity).currentAccount;
            if (org.telegram.ui.Wallet.l0.x(i13).e()) {
                i14 = ((org.telegram.ui.ActionBar.r2) passcodeActivity).currentAccount;
            }
            z10 = false;
            a9Var.f(string2, z10, false);
            return;
        }
        if (i18 == 1) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            i15 = passcodeActivity.changePasscodeRow;
            if (i10 == i15) {
                gaVar.b(LocaleController.getString(R.string.ChangePasscode), true);
                if (SharedConfig.passcodeHash.isEmpty()) {
                    int i19 = org.telegram.ui.ActionBar.y6.E6;
                    gaVar.setTag(Integer.valueOf(i19));
                    org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), i19, null);
                    return;
                } else {
                    int i20 = org.telegram.ui.ActionBar.y6.G6;
                    gaVar.setTag(Integer.valueOf(i20));
                    org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), i20, null);
                    return;
                }
            }
            i16 = passcodeActivity.autoLockRow;
            if (i10 == i16) {
                int i21 = SharedConfig.autoLockIn;
                gaVar.c(LocaleController.getString(R.string.AutoLock), i21 == 0 ? LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]) : i21 < 3600 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i21 / 60, new Object[0])) : i21 < 86400 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i21 / 60.0f) / 60.0f), new Object[0])) : LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i21 / 60.0f) / 60.0f) / 24.0f), new Object[0])), false, true);
                int i22 = org.telegram.ui.ActionBar.y6.G6;
                gaVar.setTag(Integer.valueOf(i22));
                org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), i22, null);
                return;
            }
            i17 = passcodeActivity.disablePasscodeRow;
            if (i10 == i17) {
                gaVar.b(LocaleController.getString(R.string.DisablePasscode), false);
                int i23 = org.telegram.ui.ActionBar.y6.q7;
                gaVar.setTag(Integer.valueOf(i23));
                org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), i23, null);
                return;
            }
            return;
        }
        if (i18 != 2) {
            if (i18 != 3) {
                if (i18 != 4) {
                    return;
                }
                pl0 pl0Var = (pl0) view;
                pl0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                pl0Var.a.d();
                return;
            }
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            q4Var.setHeight(46);
            if (i10 == passcodeActivity.M) {
                q4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                return;
            } else {
                if (i10 == passcodeActivity.I) {
                    q4Var.setText(LocaleController.getString(R.string.WalletLock));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
        if (i10 == passcodeActivity.G) {
            i9Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
            i9Var.setBackground(null);
            i9Var.getTextView().setGravity(1);
        } else if (i10 == passcodeActivity.H) {
            i9Var.setText(LocaleController.getString(R.string.AutoLockInfo));
            i9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
        } else if (i10 == passcodeActivity.L) {
            i9Var.setText(LocaleController.getString(R.string.WalletLockInfo));
            i9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
        } else if (i10 == passcodeActivity.O) {
            i9Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
            i9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View a9Var;
        Context context = this.c;
        if (i10 == 0) {
            a9Var = new org.telegram.ui.Cells.a9(context);
        } else if (i10 == 1) {
            a9Var = new org.telegram.ui.Cells.ga(context);
        } else if (i10 == 3) {
            a9Var = new org.telegram.ui.Cells.q4(context);
        } else if (i10 != 4) {
            a9Var = new org.telegram.ui.Cells.i9(context);
        } else {
            a9Var = new pl0(context);
            a9Var.setTag(-33024);
        }
        return new org.telegram.ui.Components.wl0(a9Var);
    }
}
