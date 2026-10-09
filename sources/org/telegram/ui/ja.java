package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ja implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ja(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        switch (this.a) {
            case 0:
                la laVar = (la) this.b;
                if (i10 != 6 || (v0Var = laVar.c.a) == null) {
                    return false;
                }
                v0Var.performClick();
                return true;
            case 1:
                zn znVar = (zn) this.b;
                if (i10 == 6) {
                    qh.c cVar = znVar.Cc;
                    if (cVar != null && (u1Var = cVar.n) != null) {
                        znVar.ya(u1Var);
                        return true;
                    }
                } else {
                    znVar.getClass();
                }
                return false;
            case 2:
                uo uoVar = (uo) this.b;
                if (i10 != 6 || (v0Var2 = uoVar.a) == null) {
                    return false;
                }
                v0Var2.performClick();
                return true;
            case 3:
                cs csVar = (cs) this.b;
                if (i10 == 5) {
                    csVar.a();
                    return true;
                }
                csVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((c70) this.b).o0();
            case 5:
                oe0 oe0Var = (oe0) this.b;
                if (i10 == 5) {
                    oe0Var.h(null);
                    return true;
                }
                oe0Var.getClass();
                return false;
            case 6:
                we0 we0Var = (we0) this.b;
                if (i10 == 5) {
                    we0Var.h(null);
                    return true;
                }
                we0Var.getClass();
                return false;
            case 7:
                kf0 kf0Var = (kf0) this.b;
                if (i10 == 5) {
                    kf0Var.h(null);
                    return true;
                }
                kf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i11 = passcodeActivity.E;
                if (i11 == 0) {
                    passcodeActivity.k0();
                    return true;
                }
                if (i11 != 1) {
                    return false;
                }
                passcodeActivity.j0();
                return true;
            case 9:
                jn0 jn0Var = (jn0) this.b;
                if (i10 == 5) {
                    jn0Var.h(null);
                    return true;
                }
                jn0Var.getClass();
                return false;
            case 10:
                n21 n21Var = (n21) this.b;
                n21Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    n21Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = n21Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                u71 u71Var = (u71) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(u71Var.c0);
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
