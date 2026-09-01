package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        switch (this.a) {
            case 0:
                ja jaVar = (ja) this.b;
                if (i10 != 6 || (w0Var = jaVar.c.a) == null) {
                    return false;
                }
                w0Var.performClick();
                return true;
            case 1:
                xn xnVar = (xn) this.b;
                if (i10 == 6) {
                    eh.f fVar = xnVar.zc;
                    if (fVar != null && (t1Var = fVar.n) != null) {
                        xnVar.ua(t1Var);
                        return true;
                    }
                } else {
                    xnVar.getClass();
                }
                return false;
            case 2:
                po poVar = (po) this.b;
                if (i10 != 6 || (w0Var2 = poVar.a) == null) {
                    return false;
                }
                w0Var2.performClick();
                return true;
            case 3:
                zr zrVar = (zr) this.b;
                if (i10 == 5) {
                    zrVar.a();
                    return true;
                }
                zrVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((z60) this.b).o0();
            case 5:
                ie0 ie0Var = (ie0) this.b;
                if (i10 == 5) {
                    ie0Var.h(null);
                    return true;
                }
                ie0Var.getClass();
                return false;
            case 6:
                qe0 qe0Var = (qe0) this.b;
                if (i10 == 5) {
                    qe0Var.h(null);
                    return true;
                }
                qe0Var.getClass();
                return false;
            case 7:
                ef0 ef0Var = (ef0) this.b;
                if (i10 == 5) {
                    ef0Var.h(null);
                    return true;
                }
                ef0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i11 = passcodeActivity.B;
                if (i11 == 0) {
                    passcodeActivity.h0();
                    return true;
                }
                if (i11 != 1) {
                    return false;
                }
                passcodeActivity.g0();
                return true;
            case 9:
                bn0 bn0Var = (bn0) this.b;
                if (i10 == 5) {
                    bn0Var.h(null);
                    return true;
                }
                bn0Var.getClass();
                return false;
            case 10:
                z11 z11Var = (z11) this.b;
                z11Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    z11Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = z11Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                c71 c71Var = (c71) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(c71Var.Z);
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
