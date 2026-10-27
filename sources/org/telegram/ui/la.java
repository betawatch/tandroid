package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class la implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ la(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.a) {
            case 0:
                na naVar = (na) this.b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.u5 u5Var = naVar.c.a;
                    if (u5Var != null) {
                        u5Var.performClick();
                        return true;
                    }
                } else {
                    naVar.getClass();
                }
                return false;
            case 1:
                wn wnVar = (wn) this.b;
                if (i10 == 6) {
                    sh.c cVar = wnVar.dd;
                    if (cVar != null && (s1Var = cVar.n) != null) {
                        wnVar.Ga(s1Var);
                        return true;
                    }
                } else {
                    wnVar.getClass();
                }
                return false;
            case 2:
                oo ooVar = (oo) this.b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.u5 u5Var2 = ooVar.a;
                    if (u5Var2 != null) {
                        u5Var2.performClick();
                        return true;
                    }
                } else {
                    ooVar.getClass();
                }
                return false;
            case 3:
                xr xrVar = (xr) this.b;
                if (i10 == 5) {
                    xrVar.a();
                    return true;
                }
                xrVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((t60) this.b).p0();
            case 5:
                ae0 ae0Var = (ae0) this.b;
                if (i10 == 5) {
                    ae0Var.h(null);
                    return true;
                }
                ae0Var.getClass();
                return false;
            case 6:
                ie0 ie0Var = (ie0) this.b;
                if (i10 == 5) {
                    ie0Var.h(null);
                    return true;
                }
                ie0Var.getClass();
                return false;
            case 7:
                xe0 xe0Var = (xe0) this.b;
                if (i10 == 5) {
                    xe0Var.h(null);
                    return true;
                }
                xe0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i11 = passcodeActivity.E;
                if (i11 == 0) {
                    passcodeActivity.r0();
                    return true;
                }
                if (i11 != 1) {
                    return false;
                }
                passcodeActivity.q0();
                return true;
            case 9:
                gn0 gn0Var = (gn0) this.b;
                if (i10 == 5) {
                    gn0Var.h(null);
                    return true;
                }
                gn0Var.getClass();
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
                p61 p61Var = (p61) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(p61Var.c0);
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.u0();
                return true;
        }
    }
}
