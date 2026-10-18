package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ma(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.u0 u0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        switch (this.a) {
            case 0:
                oa oaVar = (oa) this.b;
                if (i10 != 6 || (u0Var = oaVar.c.a) == null) {
                    return false;
                }
                u0Var.performClick();
                return true;
            case 1:
                sn snVar = (sn) this.b;
                if (i10 == 6) {
                    rh.c cVar = snVar.Cc;
                    if (cVar != null && (u1Var = cVar.n) != null) {
                        snVar.ya(u1Var);
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
                return i10 == 6 && ((n60) this.b).o0();
            case 5:
                xd0 xd0Var = (xd0) this.b;
                if (i10 == 5) {
                    xd0Var.h(null);
                    return true;
                }
                xd0Var.getClass();
                return false;
            case 6:
                fe0 fe0Var = (fe0) this.b;
                if (i10 == 5) {
                    fe0Var.h(null);
                    return true;
                }
                fe0Var.getClass();
                return false;
            case 7:
                te0 te0Var = (te0) this.b;
                if (i10 == 5) {
                    te0Var.h(null);
                    return true;
                }
                te0Var.getClass();
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
                tm0 tm0Var = (tm0) this.b;
                if (i10 == 5) {
                    tm0Var.h(null);
                    return true;
                }
                tm0Var.getClass();
                return false;
            case 10:
                u11 u11Var = (u11) this.b;
                u11Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    u11Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = u11Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                j61 j61Var = (j61) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(j61Var.c0);
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
