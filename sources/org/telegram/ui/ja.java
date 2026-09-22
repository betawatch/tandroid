package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ja implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ja(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        switch (this.a) {
            case 0:
                la laVar = (la) this.b;
                if (i10 != 6 || (v0Var = laVar.c.a) == null) {
                    return false;
                }
                v0Var.performClick();
                return true;
            case 1:
                zn znVar = (zn) this.b;
                if (i10 == 6) {
                    qh.c cVar = znVar.Bc;
                    if (cVar != null && (u1Var = cVar.n) != null) {
                        znVar.ua(u1Var);
                        return true;
                    }
                } else {
                    znVar.getClass();
                }
                return false;
            case 2:
                uo uoVar = (uo) this.b;
                if (i10 != 6 || (v0Var2 = uoVar.a) == null) {
                    return false;
                }
                v0Var2.performClick();
                return true;
            case 3:
                ds dsVar = (ds) this.b;
                if (i10 == 5) {
                    dsVar.a();
                    return true;
                }
                dsVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((e70) this.b).o0();
            case 5:
                re0 re0Var = (re0) this.b;
                if (i10 == 5) {
                    re0Var.h(null);
                    return true;
                }
                re0Var.getClass();
                return false;
            case 6:
                ze0 ze0Var = (ze0) this.b;
                if (i10 == 5) {
                    ze0Var.h(null);
                    return true;
                }
                ze0Var.getClass();
                return false;
            case 7:
                nf0 nf0Var = (nf0) this.b;
                if (i10 == 5) {
                    nf0Var.h(null);
                    return true;
                }
                nf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i11 = passcodeActivity.E;
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
                ln0 ln0Var = (ln0) this.b;
                if (i10 == 5) {
                    ln0Var.h(null);
                    return true;
                }
                ln0Var.getClass();
                return false;
            case 10:
                o21 o21Var = (o21) this.b;
                o21Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    o21Var.finishFragment();
                    return true;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = o21Var.a;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[intValue].requestFocus();
                return true;
            case 11:
                t71 t71Var = (t71) this.b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(t71Var.c0);
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
