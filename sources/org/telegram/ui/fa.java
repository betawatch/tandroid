package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                    org.telegram.ui.ActionBar.c5 c5Var = gaVar.c.a;
                    if (c5Var != null) {
                        c5Var.performClick();
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
                    org.telegram.ui.ActionBar.c5 c5Var2 = rnVar.a;
                    if (c5Var2 != null) {
                        c5Var2.performClick();
                        return true;
                    }
                } else {
                    rnVar.getClass();
                }
                return false;
            case 3:
                br brVar = (br) this.b;
                if (i7 == 5) {
                    brVar.a();
                    return true;
                }
                brVar.getClass();
                return false;
            case 4:
                return i7 == 6 && ((z40) this.b).t0();
            case 5:
                ac0 ac0Var = (ac0) this.b;
                if (i7 == 5) {
                    ac0Var.h(null);
                    return true;
                }
                ac0Var.getClass();
                return false;
            case 6:
                hc0 hc0Var = (hc0) this.b;
                if (i7 == 5) {
                    hc0Var.h(null);
                    return true;
                }
                hc0Var.getClass();
                return false;
            case 7:
                wc0 wc0Var = (wc0) this.b;
                if (i7 == 5) {
                    wc0Var.h(null);
                    return true;
                }
                wc0Var.getClass();
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
                ak0 ak0Var = (ak0) this.b;
                if (i7 == 5) {
                    ak0Var.h(null);
                    return true;
                }
                ak0Var.getClass();
                return false;
            case 10:
                zx0 zx0Var = (zx0) this.b;
                zx0Var.getClass();
                if (i7 != 5) {
                    if (i7 != 6) {
                        return false;
                    }
                    zx0Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = zx0Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                d21 d21Var = (d21) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                org.telegram.messenger.g0.v1(d21Var.X1);
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
