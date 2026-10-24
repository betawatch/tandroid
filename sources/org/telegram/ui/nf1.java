package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class nf1 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public nf1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
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
        org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        caVar.setTag(Integer.valueOf(i14));
        org.telegram.ui.ActionBar.r6.W(caVar.getTextView(), i14, null);
        i11 = twoStepVerificationActivity.changePasswordRow;
        if (i10 == i11) {
            caVar.b(LocaleController.getString(R.string.ChangePassword), true);
            return;
        }
        if (i10 == twoStepVerificationActivity.O) {
            caVar.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
            return;
        }
        i12 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i10 == i12) {
            caVar.b(LocaleController.getString(R.string.TurnPasswordOff), true);
        } else if (i10 == twoStepVerificationActivity.R) {
            caVar.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
        } else if (i10 == twoStepVerificationActivity.Q) {
            caVar.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View caVar;
        Context context = this.c;
        if (i10 != 0) {
            caVar = new org.telegram.ui.Cells.e9(context);
        } else {
            caVar = new org.telegram.ui.Cells.ca(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, caVar, null);
        }
        return new org.telegram.ui.Components.wl0(caVar);
    }
}
