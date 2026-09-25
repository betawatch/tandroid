package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class lg1 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public lg1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (twoStepVerificationActivity.G || twoStepVerificationActivity.I == null) {
            return 0;
        }
        return twoStepVerificationActivity.T;
    }

    @Override // s4.h0
    public final int j(int i10) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        return (i10 == twoStepVerificationActivity.P || i10 == twoStepVerificationActivity.S) ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13 = c1Var.f;
        View view = c1Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i13 != 0) {
            if (i13 != 1) {
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == twoStepVerificationActivity.P) {
                e9Var.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                return;
            } else {
                if (i10 == twoStepVerificationActivity.S) {
                    e9Var.setText(LocaleController.getString(R.string.EnabledPasswordText));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        eaVar.setTag(Integer.valueOf(i14));
        eaVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        i11 = twoStepVerificationActivity.changePasswordRow;
        if (i10 == i11) {
            eaVar.b(LocaleController.getString(R.string.ChangePassword), true);
            return;
        }
        if (i10 == twoStepVerificationActivity.O) {
            eaVar.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
            return;
        }
        i12 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i10 == i12) {
            eaVar.b(LocaleController.getString(R.string.TurnPasswordOff), true);
        } else if (i10 == twoStepVerificationActivity.R) {
            eaVar.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
        } else if (i10 == twoStepVerificationActivity.Q) {
            eaVar.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View eaVar;
        Context context = this.c;
        if (i10 != 0) {
            eaVar = new org.telegram.ui.Cells.e9(context);
        } else {
            eaVar = new org.telegram.ui.Cells.ea(context);
            eaVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
        }
        return new org.telegram.ui.Components.gl0(eaVar);
    }
}
