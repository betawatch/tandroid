package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ka implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ka(Object obj, int i10) {
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
                ma maVar = (ma) this.b;
                if (i10 != 6 || (v0Var = maVar.c.a) == null) {
                    return false;
                }
                v0Var.performClick();
                return true;
            case 1:
                yn ynVar = (yn) this.b;
                if (i10 == 6) {
                    qh.c cVar = ynVar.zc;
                    if (cVar != null && (u1Var = cVar.n) != null) {
                        ynVar.ta(u1Var);
                        return true;
                    }
                } else {
                    ynVar.getClass();
                }
                return false;
            case 2:
                to toVar = (to) this.b;
                if (i10 != 6 || (v0Var2 = toVar.a) == null) {
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
                return i10 == 6 && ((d70) this.b).o0();
            case 5:
                ne0 ne0Var = (ne0) this.b;
                if (i10 == 5) {
                    ne0Var.h(null);
                    return true;
                }
                ne0Var.getClass();
                return false;
            case 6:
                ve0 ve0Var = (ve0) this.b;
                if (i10 == 5) {
                    ve0Var.h(null);
                    return true;
                }
                ve0Var.getClass();
                return false;
            case 7:
                jf0 jf0Var = (jf0) this.b;
                if (i10 == 5) {
                    jf0Var.h(null);
                    return true;
                }
                jf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i11 = passcodeActivity.E;
                if (i11 == 0) {
                    passcodeActivity.n0();
                    return true;
                }
                if (i11 != 1) {
                    return false;
                }
                passcodeActivity.m0();
                return true;
            case 9:
                gn0 gn0Var = (gn0) this.b;
                if (i10 == 5) {
                    gn0Var.h(null);
                    return true;
                }
                gn0Var.getClass();
                return false;
            case 10:
                h21 h21Var = (h21) this.b;
                h21Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    h21Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = h21Var.a;
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
