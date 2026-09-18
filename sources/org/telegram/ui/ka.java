package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        switch (this.a) {
            case 0:
                ma maVar = (ma) this.b;
                if (i10 != 6 || (w0Var = maVar.c.a) == null) {
                    return false;
                }
                w0Var.performClick();
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
                if (i10 != 6 || (w0Var2 = woVar.a) == null) {
                    return false;
                }
                w0Var2.performClick();
                return true;
            case 3:
                fs fsVar = (fs) this.b;
                if (i10 == 5) {
                    fsVar.a();
                    return true;
                }
                fsVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((g70) this.b).o0();
            case 5:
                re0 re0Var = (re0) this.b;
                if (i10 == 5) {
                    re0Var.h(null);
                    return true;
                }
                re0Var.getClass();
                return false;
            case 6:
                ze0 ze0Var = (ze0) this.b;
                if (i10 == 5) {
                    ze0Var.h(null);
                    return true;
                }
                ze0Var.getClass();
                return false;
            case 7:
                nf0 nf0Var = (nf0) this.b;
                if (i10 == 5) {
                    nf0Var.h(null);
                    return true;
                }
                nf0Var.getClass();
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
                mn0 mn0Var = (mn0) this.b;
                if (i10 == 5) {
                    mn0Var.h(null);
                    return true;
                }
                mn0Var.getClass();
                return false;
            case 10:
                q21 q21Var = (q21) this.b;
                q21Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    q21Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = q21Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                s71 s71Var = (s71) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(s71Var.c0);
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
