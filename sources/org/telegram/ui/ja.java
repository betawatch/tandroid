package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        switch (this.a) {
            case 0:
                la laVar = (la) this.b;
                if (i10 != 6 || (w0Var = laVar.c.a) == null) {
                    return false;
                }
                w0Var.performClick();
                return true;
            case 1:
                zn znVar = (zn) this.b;
                if (i10 == 6) {
                    dh.f fVar = znVar.zc;
                    if (fVar != null && (s1Var = fVar.n) != null) {
                        znVar.ua(s1Var);
                        return true;
                    }
                } else {
                    znVar.getClass();
                }
                return false;
            case 2:
                ro roVar = (ro) this.b;
                if (i10 != 6 || (w0Var2 = roVar.a) == null) {
                    return false;
                }
                w0Var2.performClick();
                return true;
            case 3:
                as asVar = (as) this.b;
                if (i10 == 5) {
                    asVar.a();
                    return true;
                }
                asVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((a70) this.b).o0();
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
                d21 d21Var = (d21) this.b;
                d21Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    d21Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = d21Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                i71 i71Var = (i71) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(i71Var.Z);
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
