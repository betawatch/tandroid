package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class if1 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public if1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 0;
    }

    @Override // s4.g0
    public final int h() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (twoStepVerificationActivity.G || twoStepVerificationActivity.I == null) {
            return 0;
        }
        return twoStepVerificationActivity.T;
    }

    @Override // s4.g0
    public final int j(int i10) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        return (i10 == twoStepVerificationActivity.P || i10 == twoStepVerificationActivity.S) ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        int i13 = b1Var.f;
        View view = b1Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i13 != 0) {
            if (i13 != 1) {
                return;
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i10 == twoStepVerificationActivity.P) {
                d9Var.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                return;
            } else {
                if (i10 == twoStepVerificationActivity.S) {
                    d9Var.setText(LocaleController.getString(R.string.EnabledPasswordText));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        baVar.setTag(Integer.valueOf(i14));
        baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        i11 = twoStepVerificationActivity.changePasswordRow;
        if (i10 == i11) {
            baVar.b(LocaleController.getString(R.string.ChangePassword), true);
            return;
        }
        if (i10 == twoStepVerificationActivity.O) {
            baVar.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
            return;
        }
        i12 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i10 == i12) {
            baVar.b(LocaleController.getString(R.string.TurnPasswordOff), true);
        } else if (i10 == twoStepVerificationActivity.R) {
            baVar.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
        } else if (i10 == twoStepVerificationActivity.Q) {
            baVar.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View baVar;
        Context context = this.c;
        if (i10 != 0) {
            baVar = new org.telegram.ui.Cells.d9(context);
        } else {
            baVar = new org.telegram.ui.Cells.ba(context);
            baVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
        }
        return new org.telegram.ui.Components.sl0(baVar);
    }
}
