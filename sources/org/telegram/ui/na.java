package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class na implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ na(Object obj, int i10) {
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
                pa paVar = (pa) this.b;
                if (i10 != 6 || (u0Var = paVar.c.a) == null) {
                    return false;
                }
                u0Var.performClick();
                return true;
            case 1:
                fo foVar = (fo) this.b;
                if (i10 == 6) {
                    rh.c cVar = foVar.Cc;
                    if (cVar != null && (u1Var = cVar.n) != null) {
                        foVar.ya(u1Var);
                        return true;
                    }
                } else {
                    foVar.getClass();
                }
                return false;
            case 2:
                zo zoVar = (zo) this.b;
                if (i10 != 6 || (u0Var2 = zoVar.a) == null) {
                    return false;
                }
                u0Var2.performClick();
                return true;
            case 3:
                hs hsVar = (hs) this.b;
                if (i10 == 5) {
                    hsVar.a();
                    return true;
                }
                hsVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((j70) this.b).o0();
            case 5:
                te0 te0Var = (te0) this.b;
                if (i10 == 5) {
                    te0Var.h(null);
                    return true;
                }
                te0Var.getClass();
                return false;
            case 6:
                bf0 bf0Var = (bf0) this.b;
                if (i10 == 5) {
                    bf0Var.h(null);
                    return true;
                }
                bf0Var.getClass();
                return false;
            case 7:
                pf0 pf0Var = (pf0) this.b;
                if (i10 == 5) {
                    pf0Var.h(null);
                    return true;
                }
                pf0Var.getClass();
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
                on0 on0Var = (on0) this.b;
                if (i10 == 5) {
                    on0Var.h(null);
                    return true;
                }
                on0Var.getClass();
                return false;
            case 10:
                v21 v21Var = (v21) this.b;
                v21Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    v21Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = v21Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                b81 b81Var = (b81) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(b81Var.c0);
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
