package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                cn cnVar = (cn) this.b;
                if (i7 == 6) {
                    sh.c cVar = cnVar.id;
                    if (cVar != null && (q1Var = cVar.n) != null) {
                        cnVar.Va(q1Var);
                        return true;
                    }
                } else {
                    cnVar.getClass();
                }
                return false;
            case 2:
                rn rnVar = (rn) this.b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.b5 b5Var2 = rnVar.a;
                    if (b5Var2 != null) {
                        b5Var2.performClick();
                        return true;
                    }
                } else {
                    rnVar.getClass();
                }
                return false;
            case 3:
                ar arVar = (ar) this.b;
                if (i7 == 5) {
                    arVar.a();
                    return true;
                }
                arVar.getClass();
                return false;
            case 4:
                return i7 == 6 && ((y40) this.b).t0();
            case 5:
                zb0 zb0Var = (zb0) this.b;
                if (i7 == 5) {
                    zb0Var.h(null);
                    return true;
                }
                zb0Var.getClass();
                return false;
            case 6:
                gc0 gc0Var = (gc0) this.b;
                if (i7 == 5) {
                    gc0Var.h(null);
                    return true;
                }
                gc0Var.getClass();
                return false;
            case 7:
                uc0 uc0Var = (uc0) this.b;
                if (i7 == 5) {
                    uc0Var.h(null);
                    return true;
                }
                uc0Var.getClass();
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
                zj0 zj0Var = (zj0) this.b;
                if (i7 == 5) {
                    zj0Var.h(null);
                    return true;
                }
                zj0Var.getClass();
                return false;
            case 10:
                yx0 yx0Var = (yx0) this.b;
                yx0Var.getClass();
                if (i7 != 5) {
                    if (i7 != 6) {
                        return false;
                    }
                    yx0Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = yx0Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                c21 c21Var = (c21) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                org.telegram.messenger.g0.v1(c21Var.U1);
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
