package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class al0 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ PasscodeActivity d;

    public al0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = o1Var.b();
        PasscodeActivity passcodeActivity = this.d;
        i10 = passcodeActivity.fingerprintRow;
        if (b10 == i10) {
            return true;
        }
        i11 = passcodeActivity.autoLockRow;
        if (b10 == i11 || b10 == passcodeActivity.F) {
            return true;
        }
        i12 = passcodeActivity.changePasscodeRow;
        if (b10 == i12) {
            return true;
        }
        i13 = passcodeActivity.disablePasscodeRow;
        return b10 == i13;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.H;
    }

    @Override // f2.q0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        PasscodeActivity passcodeActivity = this.d;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 == i11 || i10 == passcodeActivity.F) {
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
        if (i10 == passcodeActivity.D || i10 == passcodeActivity.G || i10 == passcodeActivity.C) {
            return 2;
        }
        if (i10 == passcodeActivity.E) {
            return 3;
        }
        return i10 == 0 ? 4 : 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = o1Var.f;
        View view = o1Var.a;
        PasscodeActivity passcodeActivity = this.d;
        if (i15 == 0) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            i11 = passcodeActivity.fingerprintRow;
            if (i10 == i11) {
                p8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
                return;
            } else {
                if (i10 == passcodeActivity.F) {
                    p8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
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
                    bl0 bl0Var = (bl0) view;
                    bl0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    bl0Var.a.d();
                    return;
                }
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                j4Var.setHeight(46);
                if (i10 == passcodeActivity.E) {
                    j4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == passcodeActivity.C) {
                x8Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                x8Var.setBackground(null);
                x8Var.getTextView().setGravity(1);
                return;
            } else if (i10 == passcodeActivity.D) {
                x8Var.setText(LocaleController.getString(R.string.AutoLockInfo));
                x8Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                return;
            } else {
                if (i10 == passcodeActivity.G) {
                    x8Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                    x8Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
        i12 = passcodeActivity.changePasscodeRow;
        if (i10 == i12) {
            x9Var.b(LocaleController.getString(R.string.ChangePasscode), true);
            if (SharedConfig.passcodeHash.isEmpty()) {
                int i16 = org.telegram.ui.ActionBar.g6.E6;
                x9Var.setTag(Integer.valueOf(i16));
                x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                return;
            } else {
                int i17 = org.telegram.ui.ActionBar.g6.G6;
                x9Var.setTag(Integer.valueOf(i17));
                x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                return;
            }
        }
        i13 = passcodeActivity.autoLockRow;
        if (i10 == i13) {
            int i18 = SharedConfig.autoLockIn;
            x9Var.c(LocaleController.getString(R.string.AutoLock), i18 == 0 ? LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]) : i18 < 3600 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i18 / 60, new Object[0])) : i18 < 86400 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i18 / 60.0f) / 60.0f), new Object[0])) : LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i18 / 60.0f) / 60.0f) / 24.0f), new Object[0])), false, true);
            int i19 = org.telegram.ui.ActionBar.g6.G6;
            x9Var.setTag(Integer.valueOf(i19));
            x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
            return;
        }
        i14 = passcodeActivity.disablePasscodeRow;
        if (i10 == i14) {
            x9Var.b(LocaleController.getString(R.string.DisablePasscode), false);
            int i20 = org.telegram.ui.ActionBar.g6.q7;
            x9Var.setTag(Integer.valueOf(i20));
            x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View p8Var;
        Context context = this.c;
        if (i10 == 0) {
            p8Var = new org.telegram.ui.Cells.p8(context);
        } else if (i10 == 1) {
            p8Var = new org.telegram.ui.Cells.x9(context);
        } else if (i10 == 3) {
            p8Var = new org.telegram.ui.Cells.j4(context);
        } else if (i10 != 4) {
            p8Var = new org.telegram.ui.Cells.x8(context);
        } else {
            p8Var = new bl0(context);
            p8Var.setTag(-33024);
        }
        return new org.telegram.ui.Components.lk0(p8Var);
    }
}
