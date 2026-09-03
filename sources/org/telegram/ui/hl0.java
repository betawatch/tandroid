package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hl0 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ PasscodeActivity d;

    public hl0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = l1Var.b();
        PasscodeActivity passcodeActivity = this.d;
        i10 = passcodeActivity.fingerprintRow;
        if (b10 == i10) {
            return true;
        }
        i11 = passcodeActivity.autoLockRow;
        if (b10 == i11 || b10 == passcodeActivity.G) {
            return true;
        }
        i12 = passcodeActivity.changePasscodeRow;
        if (b10 == i12) {
            return true;
        }
        i13 = passcodeActivity.disablePasscodeRow;
        return b10 == i13;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.I;
    }

    @Override // f2.o0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        PasscodeActivity passcodeActivity = this.d;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 == i11 || i10 == passcodeActivity.G) {
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
        if (i10 == passcodeActivity.E || i10 == passcodeActivity.H || i10 == passcodeActivity.D) {
            return 2;
        }
        if (i10 == passcodeActivity.F) {
            return 3;
        }
        return i10 == 0 ? 4 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = l1Var.f;
        View view = l1Var.a;
        PasscodeActivity passcodeActivity = this.d;
        if (i15 == 0) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            i11 = passcodeActivity.fingerprintRow;
            if (i10 == i11) {
                r8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
                return;
            } else {
                if (i10 == passcodeActivity.G) {
                    r8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
                    return;
                }
                return;
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 3) {
                    if (i15 != 4) {
                        return;
                    }
                    il0 il0Var = (il0) view;
                    il0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    il0Var.a.d();
                    return;
                }
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                l4Var.setHeight(46);
                if (i10 == passcodeActivity.F) {
                    l4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i10 == passcodeActivity.D) {
                z8Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                z8Var.setBackground(null);
                z8Var.getTextView().setGravity(1);
                return;
            } else if (i10 == passcodeActivity.E) {
                z8Var.setText(LocaleController.getString(R.string.AutoLockInfo));
                z8Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                return;
            } else {
                if (i10 == passcodeActivity.H) {
                    z8Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                    z8Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
        i12 = passcodeActivity.changePasscodeRow;
        if (i10 == i12) {
            z9Var.b(LocaleController.getString(R.string.ChangePasscode), true);
            if (SharedConfig.passcodeHash.isEmpty()) {
                int i16 = org.telegram.ui.ActionBar.j6.E6;
                z9Var.setTag(Integer.valueOf(i16));
                z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                return;
            } else {
                int i17 = org.telegram.ui.ActionBar.j6.G6;
                z9Var.setTag(Integer.valueOf(i17));
                z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                return;
            }
        }
        i13 = passcodeActivity.autoLockRow;
        if (i10 == i13) {
            int i18 = SharedConfig.autoLockIn;
            z9Var.c(LocaleController.getString(R.string.AutoLock), i18 == 0 ? LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]) : i18 < 3600 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i18 / 60, new Object[0])) : i18 < 86400 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i18 / 60.0f) / 60.0f), new Object[0])) : LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i18 / 60.0f) / 60.0f) / 24.0f), new Object[0])), false, true);
            int i19 = org.telegram.ui.ActionBar.j6.G6;
            z9Var.setTag(Integer.valueOf(i19));
            z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
            return;
        }
        i14 = passcodeActivity.disablePasscodeRow;
        if (i10 == i14) {
            z9Var.b(LocaleController.getString(R.string.DisablePasscode), false);
            int i20 = org.telegram.ui.ActionBar.j6.q7;
            z9Var.setTag(Integer.valueOf(i20));
            z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View r8Var;
        Context context = this.c;
        if (i10 == 0) {
            r8Var = new org.telegram.ui.Cells.r8(context);
        } else if (i10 == 1) {
            r8Var = new org.telegram.ui.Cells.z9(context);
        } else if (i10 == 3) {
            r8Var = new org.telegram.ui.Cells.l4(context);
        } else if (i10 != 4) {
            r8Var = new org.telegram.ui.Cells.z8(context);
        } else {
            r8Var = new il0(context);
            r8Var.setTag(-33024);
        }
        return new org.telegram.ui.Components.dl0(r8Var);
    }
}
