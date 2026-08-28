package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class al0 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ PasscodeActivity d;

    public al0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        int b10 = q1Var.b();
        PasscodeActivity passcodeActivity = this.d;
        i9 = passcodeActivity.fingerprintRow;
        if (b10 == i9) {
            return true;
        }
        i10 = passcodeActivity.autoLockRow;
        if (b10 == i10 || b10 == passcodeActivity.F) {
            return true;
        }
        i11 = passcodeActivity.changePasscodeRow;
        if (b10 == i11) {
            return true;
        }
        i12 = passcodeActivity.disablePasscodeRow;
        return b10 == i12;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.H;
    }

    @Override // f2.r0
    public final int j(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        PasscodeActivity passcodeActivity = this.d;
        i10 = passcodeActivity.fingerprintRow;
        if (i9 == i10 || i9 == passcodeActivity.F) {
            return 0;
        }
        i11 = passcodeActivity.changePasscodeRow;
        if (i9 == i11) {
            return 1;
        }
        i12 = passcodeActivity.autoLockRow;
        if (i9 == i12) {
            return 1;
        }
        i13 = passcodeActivity.disablePasscodeRow;
        if (i9 == i13) {
            return 1;
        }
        if (i9 == passcodeActivity.D || i9 == passcodeActivity.G || i9 == passcodeActivity.C) {
            return 2;
        }
        if (i9 == passcodeActivity.E) {
            return 3;
        }
        return i9 == 0 ? 4 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = q1Var.f;
        View view = q1Var.a;
        PasscodeActivity passcodeActivity = this.d;
        if (i14 == 0) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            i10 = passcodeActivity.fingerprintRow;
            if (i9 == i10) {
                t8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
                return;
            } else {
                if (i9 == passcodeActivity.F) {
                    t8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
                    return;
                }
                return;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    if (i14 != 4) {
                        return;
                    }
                    bl0 bl0Var = (bl0) view;
                    bl0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    bl0Var.a.d();
                    return;
                }
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                m4Var.setHeight(46);
                if (i9 == passcodeActivity.E) {
                    m4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i9 == passcodeActivity.C) {
                b9Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                b9Var.setBackground(null);
                b9Var.getTextView().setGravity(1);
                return;
            } else if (i9 == passcodeActivity.D) {
                b9Var.setText(LocaleController.getString(R.string.AutoLockInfo));
                b9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                return;
            } else {
                if (i9 == passcodeActivity.G) {
                    b9Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                    b9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
        i11 = passcodeActivity.changePasscodeRow;
        if (i9 == i11) {
            baVar.b(LocaleController.getString(R.string.ChangePasscode), true);
            if (SharedConfig.passcodeHash.isEmpty()) {
                int i15 = org.telegram.ui.ActionBar.f6.E6;
                baVar.setTag(Integer.valueOf(i15));
                baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                return;
            } else {
                int i16 = org.telegram.ui.ActionBar.f6.G6;
                baVar.setTag(Integer.valueOf(i16));
                baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                return;
            }
        }
        i12 = passcodeActivity.autoLockRow;
        if (i9 == i12) {
            int i17 = SharedConfig.autoLockIn;
            baVar.c(LocaleController.getString(R.string.AutoLock), i17 == 0 ? LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]) : i17 < 3600 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i17 / 60, new Object[0])) : i17 < 86400 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i17 / 60.0f) / 60.0f), new Object[0])) : LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i17 / 60.0f) / 60.0f) / 24.0f), new Object[0])), false, true);
            int i18 = org.telegram.ui.ActionBar.f6.G6;
            baVar.setTag(Integer.valueOf(i18));
            baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i18, false));
            return;
        }
        i13 = passcodeActivity.disablePasscodeRow;
        if (i9 == i13) {
            baVar.b(LocaleController.getString(R.string.DisablePasscode), false);
            int i19 = org.telegram.ui.ActionBar.f6.q7;
            baVar.setTag(Integer.valueOf(i19));
            baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i19, false));
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View t8Var;
        Context context = this.c;
        if (i9 == 0) {
            t8Var = new org.telegram.ui.Cells.t8(context);
        } else if (i9 == 1) {
            t8Var = new org.telegram.ui.Cells.ba(context);
        } else if (i9 == 3) {
            t8Var = new org.telegram.ui.Cells.m4(context);
        } else if (i9 != 4) {
            t8Var = new org.telegram.ui.Cells.b9(context);
        } else {
            t8Var = new bl0(context);
            t8Var.setTag(-33024);
        }
        return new org.telegram.ui.Components.ik0(t8Var);
    }
}
