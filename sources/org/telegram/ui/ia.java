package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ia(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.u0 u0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        switch (this.a) {
            case 0:
                ka kaVar = (ka) this.b;
                if (i10 != 6 || (u0Var = kaVar.c.a) == null) {
                    return false;
                }
                u0Var.performClick();
                return true;
            case 1:
                wn wnVar = (wn) this.b;
                if (i10 == 6) {
                    qh.c cVar = wnVar.Bc;
                    if (cVar != null && (u1Var = cVar.n) != null) {
                        wnVar.ua(u1Var);
                        return true;
                    }
                } else {
                    wnVar.getClass();
                }
                return false;
            case 2:
                ro roVar = (ro) this.b;
                if (i10 != 6 || (u0Var2 = roVar.a) == null) {
                    return false;
                }
                u0Var2.performClick();
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
                return i10 == 6 && ((z60) this.b).o0();
            case 5:
                je0 je0Var = (je0) this.b;
                if (i10 == 5) {
                    je0Var.h(null);
                    return true;
                }
                je0Var.getClass();
                return false;
            case 6:
                re0 re0Var = (re0) this.b;
                if (i10 == 5) {
                    re0Var.h(null);
                    return true;
                }
                re0Var.getClass();
                return false;
            case 7:
                ff0 ff0Var = (ff0) this.b;
                if (i10 == 5) {
                    ff0Var.h(null);
                    return true;
                }
                ff0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i11 = passcodeActivity.E;
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
                cn0 cn0Var = (cn0) this.b;
                if (i10 == 5) {
                    cn0Var.h(null);
                    return true;
                }
                cn0Var.getClass();
                return false;
            case 10:
                f21 f21Var = (f21) this.b;
                f21Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    f21Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = f21Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                k71 k71Var = (k71) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(k71Var.c0);
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
