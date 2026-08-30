package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                    dh.f fVar = xnVar.zc;
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
                yr yrVar = (yr) this.b;
                if (i10 == 5) {
                    yrVar.a();
                    return true;
                }
                yrVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((y60) this.b).o0();
            case 5:
                he0 he0Var = (he0) this.b;
                if (i10 == 5) {
                    he0Var.h(null);
                    return true;
                }
                he0Var.getClass();
                return false;
            case 6:
                pe0 pe0Var = (pe0) this.b;
                if (i10 == 5) {
                    pe0Var.h(null);
                    return true;
                }
                pe0Var.getClass();
                return false;
            case 7:
                df0 df0Var = (df0) this.b;
                if (i10 == 5) {
                    df0Var.h(null);
                    return true;
                }
                df0Var.getClass();
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
                zm0 zm0Var = (zm0) this.b;
                if (i10 == 5) {
                    zm0Var.h(null);
                    return true;
                }
                zm0Var.getClass();
                return false;
            case 10:
                w11 w11Var = (w11) this.b;
                w11Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    w11Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = w11Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                b71 b71Var = (b71) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(b71Var.Z);
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
