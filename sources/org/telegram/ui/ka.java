package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        org.telegram.ui.Cells.u1 u1Var;
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
                qn qnVar = (qn) this.b;
                if (i10 == 6) {
                    rh.c cVar = qnVar.Dc;
                    if (cVar != null && (u1Var = cVar.n) != null) {
                        qnVar.ya(u1Var);
                        return true;
                    }
                } else {
                    qnVar.getClass();
                }
                return false;
            case 2:
                io ioVar = (io) this.b;
                if (i10 != 6 || (u0Var2 = ioVar.a) == null) {
                    return false;
                }
                u0Var2.performClick();
                return true;
            case 3:
                qr qrVar = (qr) this.b;
                if (i10 == 5) {
                    qrVar.a();
                    return true;
                }
                qrVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((l60) this.b).o0();
            case 5:
                vd0 vd0Var = (vd0) this.b;
                if (i10 == 5) {
                    vd0Var.h(null);
                    return true;
                }
                vd0Var.getClass();
                return false;
            case 6:
                de0 de0Var = (de0) this.b;
                if (i10 == 5) {
                    de0Var.h(null);
                    return true;
                }
                de0Var.getClass();
                return false;
            case 7:
                re0 re0Var = (re0) this.b;
                if (i10 == 5) {
                    re0Var.h(null);
                    return true;
                }
                re0Var.getClass();
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
                rm0 rm0Var = (rm0) this.b;
                if (i10 == 5) {
                    rm0Var.h(null);
                    return true;
                }
                rm0Var.getClass();
                return false;
            case 10:
                s11 s11Var = (s11) this.b;
                s11Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    s11Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = s11Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                h61 h61Var = (h61) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(h61Var.c0);
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
