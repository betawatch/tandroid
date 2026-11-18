package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fa(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.a) {
            case 0:
                ga gaVar = (ga) this.b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.d5 d5Var = gaVar.c.a;
                    if (d5Var != null) {
                        d5Var.performClick();
                        return true;
                    }
                } else {
                    gaVar.getClass();
                }
                return false;
            case 1:
                bn bnVar = (bn) this.b;
                if (i7 == 6) {
                    sh.c cVar = bnVar.kd;
                    if (cVar != null && (q1Var = cVar.n) != null) {
                        bnVar.Wa(q1Var);
                        return true;
                    }
                } else {
                    bnVar.getClass();
                }
                return false;
            case 2:
                rn rnVar = (rn) this.b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.d5 d5Var2 = rnVar.a;
                    if (d5Var2 != null) {
                        d5Var2.performClick();
                        return true;
                    }
                } else {
                    rnVar.getClass();
                }
                return false;
            case 3:
                br brVar = (br) this.b;
                if (i7 == 5) {
                    brVar.a();
                    return true;
                }
                brVar.getClass();
                return false;
            case 4:
                return i7 == 6 && ((z40) this.b).t0();
            case 5:
                wb0 wb0Var = (wb0) this.b;
                if (i7 == 5) {
                    wb0Var.h(null);
                    return true;
                }
                wb0Var.getClass();
                return false;
            case 6:
                dc0 dc0Var = (dc0) this.b;
                if (i7 == 5) {
                    dc0Var.h(null);
                    return true;
                }
                dc0Var.getClass();
                return false;
            case 7:
                rc0 rc0Var = (rc0) this.b;
                if (i7 == 5) {
                    rc0Var.h(null);
                    return true;
                }
                rc0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i10 = passcodeActivity.F;
                if (i10 == 0) {
                    passcodeActivity.v0();
                    return true;
                }
                if (i10 != 1) {
                    return false;
                }
                passcodeActivity.u0();
                return true;
            case 9:
                dk0 dk0Var = (dk0) this.b;
                if (i7 == 5) {
                    dk0Var.h(null);
                    return true;
                }
                dk0Var.getClass();
                return false;
            case 10:
                yx0 yx0Var = (yx0) this.b;
                yx0Var.getClass();
                if (i7 != 5) {
                    if (i7 != 6) {
                        return false;
                    }
                    yx0Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = yx0Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                b21 b21Var = (b21) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                org.telegram.messenger.g0.v1(b21Var.Y1);
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                twoStepVerificationActivity.getClass();
                if (i7 != 5 && i7 != 6) {
                    return false;
                }
                twoStepVerificationActivity.y0();
                return true;
        }
    }
}
