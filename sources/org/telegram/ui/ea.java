package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ea(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        switch (this.a) {
            case 0:
                ga gaVar = (ga) this.b;
                if (i9 != 6 || (w0Var = gaVar.c.a) == null) {
                    return false;
                }
                w0Var.performClick();
                return true;
            case 1:
                qn qnVar = (qn) this.b;
                if (i9 == 6) {
                    yg.c cVar = qnVar.yc;
                    if (cVar != null && (t1Var = cVar.n) != null) {
                        qnVar.ua(t1Var);
                        return true;
                    }
                } else {
                    qnVar.getClass();
                }
                return false;
            case 2:
                ho hoVar = (ho) this.b;
                if (i9 != 6 || (w0Var2 = hoVar.a) == null) {
                    return false;
                }
                w0Var2.performClick();
                return true;
            case 3:
                sr srVar = (sr) this.b;
                if (i9 == 5) {
                    srVar.a();
                    return true;
                }
                srVar.getClass();
                return false;
            case 4:
                return i9 == 6 && ((k60) this.b).n0();
            case 5:
                yd0 yd0Var = (yd0) this.b;
                if (i9 == 5) {
                    yd0Var.h(null);
                    return true;
                }
                yd0Var.getClass();
                return false;
            case 6:
                ge0 ge0Var = (ge0) this.b;
                if (i9 == 5) {
                    ge0Var.h(null);
                    return true;
                }
                ge0Var.getClass();
                return false;
            case 7:
                ue0 ue0Var = (ue0) this.b;
                if (i9 == 5) {
                    ue0Var.h(null);
                    return true;
                }
                ue0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i10 = passcodeActivity.A;
                if (i10 == 0) {
                    passcodeActivity.g0();
                    return true;
                }
                if (i10 != 1) {
                    return false;
                }
                passcodeActivity.f0();
                return true;
            case 9:
                sm0 sm0Var = (sm0) this.b;
                if (i9 == 5) {
                    sm0Var.h(null);
                    return true;
                }
                sm0Var.getClass();
                return false;
            case 10:
                k11 k11Var = (k11) this.b;
                k11Var.getClass();
                if (i9 != 5) {
                    if (i9 != 6) {
                        return false;
                    }
                    k11Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = k11Var.a;
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
                AndroidUtilities.hideKeyboard(l61Var.Y);
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                twoStepVerificationActivity.getClass();
                if (i9 != 5 && i9 != 6) {
                    return false;
                }
                twoStepVerificationActivity.s0();
                return true;
        }
    }
}
