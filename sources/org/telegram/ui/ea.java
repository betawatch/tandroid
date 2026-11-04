package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ea(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.a) {
            case 0:
                fa faVar = (fa) this.b;
                if (i3 == 6) {
                    org.telegram.ui.ActionBar.b5 b5Var = faVar.c.a;
                    if (b5Var != null) {
                        b5Var.performClick();
                        return true;
                    }
                } else {
                    faVar.getClass();
                }
                return false;
            case 1:
                wm wmVar = (wm) this.b;
                if (i3 == 6) {
                    th.b bVar = wmVar.hd;
                    if (bVar != null && (q1Var = bVar.n) != null) {
                        wmVar.Ta(q1Var);
                        return true;
                    }
                } else {
                    wmVar.getClass();
                }
                return false;
            case 2:
                ln lnVar = (ln) this.b;
                if (i3 == 6) {
                    org.telegram.ui.ActionBar.b5 b5Var2 = lnVar.a;
                    if (b5Var2 != null) {
                        b5Var2.performClick();
                        return true;
                    }
                } else {
                    lnVar.getClass();
                }
                return false;
            case 3:
                xq xqVar = (xq) this.b;
                if (i3 == 5) {
                    xqVar.a();
                    return true;
                }
                xqVar.getClass();
                return false;
            case 4:
                return i3 == 6 && ((r40) this.b).t0();
            case 5:
                vb0 vb0Var = (vb0) this.b;
                if (i3 == 5) {
                    vb0Var.h(null);
                    return true;
                }
                vb0Var.getClass();
                return false;
            case 6:
                cc0 cc0Var = (cc0) this.b;
                if (i3 == 5) {
                    cc0Var.h(null);
                    return true;
                }
                cc0Var.getClass();
                return false;
            case 7:
                qc0 qc0Var = (qc0) this.b;
                if (i3 == 5) {
                    qc0Var.h(null);
                    return true;
                }
                qc0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i10 = passcodeActivity.F;
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
                uj0 uj0Var = (uj0) this.b;
                if (i3 == 5) {
                    uj0Var.h(null);
                    return true;
                }
                uj0Var.getClass();
                return false;
            case 10:
                mx0 mx0Var = (mx0) this.b;
                mx0Var.getClass();
                if (i3 != 5) {
                    if (i3 != 6) {
                        return false;
                    }
                    mx0Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = mx0Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                q11 q11Var = (q11) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                org.telegram.messenger.g0.v1(q11Var.V1);
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                twoStepVerificationActivity.getClass();
                if (i3 != 5 && i3 != 6) {
                    return false;
                }
                twoStepVerificationActivity.y0();
                return true;
        }
    }
}
