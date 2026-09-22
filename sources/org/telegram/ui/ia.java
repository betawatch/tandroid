package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        switch (this.a) {
            case 0:
                ka kaVar = (ka) this.b;
                if (i10 != 6 || (v0Var = kaVar.c.a) == null) {
                    return false;
                }
                v0Var.performClick();
                return true;
            case 1:
                bo boVar = (bo) this.b;
                if (i10 == 6) {
                    qh.c cVar = boVar.Bc;
                    if (cVar != null && (t1Var = cVar.n) != null) {
                        boVar.ua(t1Var);
                        return true;
                    }
                } else {
                    boVar.getClass();
                }
                return false;
            case 2:
                wo woVar = (wo) this.b;
                if (i10 != 6 || (v0Var2 = woVar.a) == null) {
                    return false;
                }
                v0Var2.performClick();
                return true;
            case 3:
                ds dsVar = (ds) this.b;
                if (i10 == 5) {
                    dsVar.a();
                    return true;
                }
                dsVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((e70) this.b).o0();
            case 5:
                pe0 pe0Var = (pe0) this.b;
                if (i10 == 5) {
                    pe0Var.h(null);
                    return true;
                }
                pe0Var.getClass();
                return false;
            case 6:
                xe0 xe0Var = (xe0) this.b;
                if (i10 == 5) {
                    xe0Var.h(null);
                    return true;
                }
                xe0Var.getClass();
                return false;
            case 7:
                lf0 lf0Var = (lf0) this.b;
                if (i10 == 5) {
                    lf0Var.h(null);
                    return true;
                }
                lf0Var.getClass();
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
                kn0 kn0Var = (kn0) this.b;
                if (i10 == 5) {
                    kn0Var.h(null);
                    return true;
                }
                kn0Var.getClass();
                return false;
            case 10:
                p21 p21Var = (p21) this.b;
                p21Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    p21Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = p21Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                r71 r71Var = (r71) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(r71Var.c0);
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
