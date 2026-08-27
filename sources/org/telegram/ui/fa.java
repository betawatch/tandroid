package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        switch (this.a) {
            case 0:
                ha haVar = (ha) this.b;
                if (i10 != 6 || (v0Var = haVar.c.a) == null) {
                    return false;
                }
                v0Var.performClick();
                return true;
            case 1:
                rn rnVar = (rn) this.b;
                if (i10 == 6) {
                    zg.c cVar = rnVar.yc;
                    if (cVar != null && (s1Var = cVar.n) != null) {
                        rnVar.ua(s1Var);
                        return true;
                    }
                } else {
                    rnVar.getClass();
                }
                return false;
            case 2:
                jo joVar = (jo) this.b;
                if (i10 != 6 || (v0Var2 = joVar.a) == null) {
                    return false;
                }
                v0Var2.performClick();
                return true;
            case 3:
                ur urVar = (ur) this.b;
                if (i10 == 5) {
                    urVar.a();
                    return true;
                }
                urVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((o60) this.b).o0();
            case 5:
                be0 be0Var = (be0) this.b;
                if (i10 == 5) {
                    be0Var.h(null);
                    return true;
                }
                be0Var.getClass();
                return false;
            case 6:
                je0 je0Var = (je0) this.b;
                if (i10 == 5) {
                    je0Var.h(null);
                    return true;
                }
                je0Var.getClass();
                return false;
            case 7:
                xe0 xe0Var = (xe0) this.b;
                if (i10 == 5) {
                    xe0Var.h(null);
                    return true;
                }
                xe0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i11 = passcodeActivity.A;
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
                tm0 tm0Var = (tm0) this.b;
                if (i10 == 5) {
                    tm0Var.h(null);
                    return true;
                }
                tm0Var.getClass();
                return false;
            case 10:
                j11 j11Var = (j11) this.b;
                j11Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    j11Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = j11Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                k61 k61Var = (k61) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(k61Var.Y);
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
