package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class da implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ da(Object obj, int i10) {
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
                fa faVar = (fa) this.b;
                if (i10 != 6 || (w0Var = faVar.c.a) == null) {
                    return false;
                }
                w0Var.performClick();
                return true;
            case 1:
                tn tnVar = (tn) this.b;
                if (i10 == 6) {
                    bh.f fVar = tnVar.yc;
                    if (fVar != null && (s1Var = fVar.n) != null) {
                        tnVar.ua(s1Var);
                        return true;
                    }
                } else {
                    tnVar.getClass();
                }
                return false;
            case 2:
                ko koVar = (ko) this.b;
                if (i10 != 6 || (w0Var2 = koVar.a) == null) {
                    return false;
                }
                w0Var2.performClick();
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
                return i10 == 6 && ((m60) this.b).o0();
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
                rm0 rm0Var = (rm0) this.b;
                if (i10 == 5) {
                    rm0Var.h(null);
                    return true;
                }
                rm0Var.getClass();
                return false;
            case 10:
                l11 l11Var = (l11) this.b;
                l11Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    l11Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = l11Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                n61 n61Var = (n61) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(n61Var.Y);
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
