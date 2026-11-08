package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fa(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.a) {
            case 0:
                ga gaVar = (ga) this.b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.b5 b5Var = gaVar.c.a;
                    if (b5Var != null) {
                        b5Var.performClick();
                        return true;
                    }
                } else {
                    gaVar.getClass();
                }
                return false;
            case 1:
                an anVar = (an) this.b;
                if (i7 == 6) {
                    sh.b bVar = anVar.gd;
                    if (bVar != null && (q1Var = bVar.n) != null) {
                        anVar.Ta(q1Var);
                        return true;
                    }
                } else {
                    anVar.getClass();
                }
                return false;
            case 2:
                pn pnVar = (pn) this.b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.b5 b5Var2 = pnVar.a;
                    if (b5Var2 != null) {
                        b5Var2.performClick();
                        return true;
                    }
                } else {
                    pnVar.getClass();
                }
                return false;
            case 3:
                yq yqVar = (yq) this.b;
                if (i7 == 5) {
                    yqVar.a();
                    return true;
                }
                yqVar.getClass();
                return false;
            case 4:
                return i7 == 6 && ((w40) this.b).t0();
            case 5:
                xb0 xb0Var = (xb0) this.b;
                if (i7 == 5) {
                    xb0Var.h(null);
                    return true;
                }
                xb0Var.getClass();
                return false;
            case 6:
                ec0 ec0Var = (ec0) this.b;
                if (i7 == 5) {
                    ec0Var.h(null);
                    return true;
                }
                ec0Var.getClass();
                return false;
            case 7:
                sc0 sc0Var = (sc0) this.b;
                if (i7 == 5) {
                    sc0Var.h(null);
                    return true;
                }
                sc0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i10 = passcodeActivity.E;
                if (i10 == 0) {
                    passcodeActivity.v0();
                    return true;
                }
                if (i10 != 1) {
                    return false;
                }
                passcodeActivity.u0();
                return true;
            case 9:
                xj0 xj0Var = (xj0) this.b;
                if (i7 == 5) {
                    xj0Var.h(null);
                    return true;
                }
                xj0Var.getClass();
                return false;
            case 10:
                ux0 ux0Var = (ux0) this.b;
                ux0Var.getClass();
                if (i7 != 5) {
                    if (i7 != 6) {
                        return false;
                    }
                    ux0Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = ux0Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                a21 a21Var = (a21) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                org.telegram.messenger.g0.v1(a21Var.U1);
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                twoStepVerificationActivity.getClass();
                if (i7 != 5 && i7 != 6) {
                    return false;
                }
                twoStepVerificationActivity.y0();
                return true;
        }
    }
}
