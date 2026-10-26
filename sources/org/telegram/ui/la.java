package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                un unVar = (un) this.b;
                if (i10 == 6) {
                    sh.c cVar = unVar.Zc;
                    if (cVar != null && (s1Var = cVar.n) != null) {
                        unVar.Da(s1Var);
                        return true;
                    }
                } else {
                    unVar.getClass();
                }
                return false;
            case 2:
                mo moVar = (mo) this.b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.u5 u5Var2 = moVar.a;
                    if (u5Var2 != null) {
                        u5Var2.performClick();
                        return true;
                    }
                } else {
                    moVar.getClass();
                }
                return false;
            case 3:
                vr vrVar = (vr) this.b;
                if (i10 == 5) {
                    vrVar.a();
                    return true;
                }
                vrVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((r60) this.b).p0();
            case 5:
                yd0 yd0Var = (yd0) this.b;
                if (i10 == 5) {
                    yd0Var.h(null);
                    return true;
                }
                yd0Var.getClass();
                return false;
            case 6:
                ge0 ge0Var = (ge0) this.b;
                if (i10 == 5) {
                    ge0Var.h(null);
                    return true;
                }
                ge0Var.getClass();
                return false;
            case 7:
                ve0 ve0Var = (ve0) this.b;
                if (i10 == 5) {
                    ve0Var.h(null);
                    return true;
                }
                ve0Var.getClass();
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
                en0 en0Var = (en0) this.b;
                if (i10 == 5) {
                    en0Var.h(null);
                    return true;
                }
                en0Var.getClass();
                return false;
            case 10:
                b21 b21Var = (b21) this.b;
                b21Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    b21Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = b21Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                m61 m61Var = (m61) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(m61Var.c0);
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
