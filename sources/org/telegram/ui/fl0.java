package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fl0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ PasscodeActivity d;

    public fl0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
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
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            i11 = passcodeActivity.fingerprintRow;
            if (i10 == i11) {
                s8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
                return;
            } else {
                if (i10 == passcodeActivity.G) {
                    s8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
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
                    gl0 gl0Var = (gl0) view;
                    gl0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    gl0Var.a.d();
                    return;
                }
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                m4Var.setHeight(46);
                if (i10 == passcodeActivity.F) {
                    m4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 == passcodeActivity.D) {
                a9Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                a9Var.setBackground(null);
                a9Var.getTextView().setGravity(1);
                return;
            } else if (i10 == passcodeActivity.E) {
                a9Var.setText(LocaleController.getString(R.string.AutoLockInfo));
                a9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                return;
            } else {
                if (i10 == passcodeActivity.H) {
                    a9Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                    a9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
        i12 = passcodeActivity.changePasscodeRow;
        if (i10 == i12) {
            aaVar.b(LocaleController.getString(R.string.ChangePasscode), true);
            if (SharedConfig.passcodeHash.isEmpty()) {
                int i16 = org.telegram.ui.ActionBar.j6.E6;
                aaVar.setTag(Integer.valueOf(i16));
                aaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                return;
            } else {
                int i17 = org.telegram.ui.ActionBar.j6.G6;
                aaVar.setTag(Integer.valueOf(i17));
                aaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                return;
            }
        }
        i13 = passcodeActivity.autoLockRow;
        if (i10 == i13) {
            int i18 = SharedConfig.autoLockIn;
            aaVar.c(LocaleController.getString(R.string.AutoLock), i18 == 0 ? LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]) : i18 < 3600 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i18 / 60, new Object[0])) : i18 < 86400 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i18 / 60.0f) / 60.0f), new Object[0])) : LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i18 / 60.0f) / 60.0f) / 24.0f), new Object[0])), false, true);
            int i19 = org.telegram.ui.ActionBar.j6.G6;
            aaVar.setTag(Integer.valueOf(i19));
            aaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
            return;
        }
        i14 = passcodeActivity.disablePasscodeRow;
        if (i10 == i14) {
            aaVar.b(LocaleController.getString(R.string.DisablePasscode), false);
            int i20 = org.telegram.ui.ActionBar.j6.q7;
            aaVar.setTag(Integer.valueOf(i20));
            aaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View s8Var;
        Context context = this.c;
        if (i10 == 0) {
            s8Var = new org.telegram.ui.Cells.s8(context);
        } else if (i10 == 1) {
            s8Var = new org.telegram.ui.Cells.aa(context);
        } else if (i10 == 3) {
            s8Var = new org.telegram.ui.Cells.m4(context);
        } else if (i10 != 4) {
            s8Var = new org.telegram.ui.Cells.a9(context);
        } else {
            s8Var = new gl0(context);
            s8Var.setTag(-33024);
        }
        return new org.telegram.ui.Components.el0(s8Var);
    }
}
