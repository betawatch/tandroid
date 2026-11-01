package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ha(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.a) {
            case 0:
                ia iaVar = (ia) this.b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.l5 l5Var = iaVar.c.a;
                    if (l5Var != null) {
                        l5Var.performClick();
                        return true;
                    }
                } else {
                    iaVar.getClass();
                }
                return false;
            case 1:
                un unVar = (un) this.b;
                if (i10 == 6) {
                    ih.d dVar = unVar.Zc;
                    if (dVar != null && (q1Var = dVar.n) != null) {
                        unVar.Oa(q1Var);
                        return true;
                    }
                } else {
                    unVar.getClass();
                }
                return false;
            case 2:
                oo ooVar = (oo) this.b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.l5 l5Var2 = ooVar.a;
                    if (l5Var2 != null) {
                        l5Var2.performClick();
                        return true;
                    }
                } else {
                    ooVar.getClass();
                }
                return false;
            case 3:
                zr zrVar = (zr) this.b;
                if (i10 == 5) {
                    zrVar.a();
                    return true;
                }
                zrVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((u50) this.b).t0();
            case 5:
                dd0 dd0Var = (dd0) this.b;
                if (i10 == 5) {
                    dd0Var.h(null);
                    return true;
                }
                dd0Var.getClass();
                return false;
            case 6:
                kd0 kd0Var = (kd0) this.b;
                if (i10 == 5) {
                    kd0Var.h(null);
                    return true;
                }
                kd0Var.getClass();
                return false;
            case 7:
                yd0 yd0Var = (yd0) this.b;
                if (i10 == 5) {
                    yd0Var.h(null);
                    return true;
                }
                yd0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i11 = passcodeActivity.E;
                if (i11 == 0) {
                    passcodeActivity.v0();
                    return true;
                }
                if (i11 != 1) {
                    return false;
                }
                passcodeActivity.u0();
                return true;
            case 9:
                fl0 fl0Var = (fl0) this.b;
                if (i10 == 5) {
                    fl0Var.h(null);
                    return true;
                }
                fl0Var.getClass();
                return false;
            case 10:
                iz0 iz0Var = (iz0) this.b;
                iz0Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    iz0Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = iz0Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                q31 q31Var = (q31) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                org.telegram.messenger.i0.v1(q31Var.U1);
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.y0();
                return true;
        }
    }
}
