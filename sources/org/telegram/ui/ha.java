package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ha(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.a) {
            case 0:
                ia iaVar = (ia) this.b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.l5 l5Var = iaVar.c.a;
                    if (l5Var != null) {
                        l5Var.performClick();
                        return true;
                    }
                } else {
                    iaVar.getClass();
                }
                return false;
            case 1:
                un unVar = (un) this.b;
                if (i10 == 6) {
                    ih.d dVar = unVar.Yc;
                    if (dVar != null && (q1Var = dVar.n) != null) {
                        unVar.Ja(q1Var);
                        return true;
                    }
                } else {
                    unVar.getClass();
                }
                return false;
            case 2:
                oo ooVar = (oo) this.b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.l5 l5Var2 = ooVar.a;
                    if (l5Var2 != null) {
                        l5Var2.performClick();
                        return true;
                    }
                } else {
                    ooVar.getClass();
                }
                return false;
            case 3:
                zr zrVar = (zr) this.b;
                if (i10 == 5) {
                    zrVar.a();
                    return true;
                }
                zrVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((v50) this.b).s0();
            case 5:
                ed0 ed0Var = (ed0) this.b;
                if (i10 == 5) {
                    ed0Var.h(null);
                    return true;
                }
                ed0Var.getClass();
                return false;
            case 6:
                ld0 ld0Var = (ld0) this.b;
                if (i10 == 5) {
                    ld0Var.h(null);
                    return true;
                }
                ld0Var.getClass();
                return false;
            case 7:
                zd0 zd0Var = (zd0) this.b;
                if (i10 == 5) {
                    zd0Var.h(null);
                    return true;
                }
                zd0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i11 = passcodeActivity.E;
                if (i11 == 0) {
                    passcodeActivity.u0();
                    return true;
                }
                if (i11 != 1) {
                    return false;
                }
                passcodeActivity.t0();
                return true;
            case 9:
                hl0 hl0Var = (hl0) this.b;
                if (i10 == 5) {
                    hl0Var.h(null);
                    return true;
                }
                hl0Var.getClass();
                return false;
            case 10:
                jz0 jz0Var = (jz0) this.b;
                jz0Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    jz0Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = jz0Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                s31 s31Var = (s31) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                org.telegram.messenger.i0.v1(s31Var.U1);
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.x0();
                return true;
        }
    }
}
