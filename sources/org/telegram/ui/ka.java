package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        org.telegram.ui.ActionBar.u0 u0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        switch (this.a) {
            case 0:
                ma maVar = (ma) this.b;
                if (i10 != 6 || (u0Var = maVar.c.a) == null) {
                    return false;
                }
                u0Var.performClick();
                return true;
            case 1:
                sn snVar = (sn) this.b;
                if (i10 == 6) {
                    rh.c cVar = snVar.Qc;
                    if (cVar != null && (t1Var = cVar.n) != null) {
                        snVar.ya(t1Var);
                        return true;
                    }
                } else {
                    snVar.getClass();
                }
                return false;
            case 2:
                ko koVar = (ko) this.b;
                if (i10 != 6 || (u0Var2 = koVar.a) == null) {
                    return false;
                }
                u0Var2.performClick();
                return true;
            case 3:
                sr srVar = (sr) this.b;
                if (i10 == 5) {
                    srVar.a();
                    return true;
                }
                srVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((p60) this.b).o0();
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
                ye0 ye0Var = (ye0) this.b;
                if (i10 == 5) {
                    ye0Var.h(null);
                    return true;
                }
                ye0Var.getClass();
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
                wm0 wm0Var = (wm0) this.b;
                if (i10 == 5) {
                    wm0Var.h(null);
                    return true;
                }
                wm0Var.getClass();
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
                l61 l61Var = (l61) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(l61Var.c0);
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
