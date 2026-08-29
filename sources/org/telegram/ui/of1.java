package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class of1 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public of1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 0;
    }

    @Override // f2.p0
    public final int h() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (twoStepVerificationActivity.C || twoStepVerificationActivity.E == null) {
            return 0;
        }
        return twoStepVerificationActivity.P;
    }

    @Override // f2.p0
    public final int j(int i10) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        return (i10 == twoStepVerificationActivity.L || i10 == twoStepVerificationActivity.O) ? 1 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        int i13 = n1Var.f;
        View view = n1Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i13 != 0) {
            if (i13 != 1) {
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i10 == twoStepVerificationActivity.L) {
                y8Var.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                return;
            } else {
                if (i10 == twoStepVerificationActivity.O) {
                    y8Var.setText(LocaleController.getString(R.string.EnabledPasswordText));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        y9Var.setTag(Integer.valueOf(i14));
        y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        i11 = twoStepVerificationActivity.changePasswordRow;
        if (i10 == i11) {
            y9Var.b(LocaleController.getString(R.string.ChangePassword), true);
            return;
        }
        if (i10 == twoStepVerificationActivity.K) {
            y9Var.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
            return;
        }
        i12 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i10 == i12) {
            y9Var.b(LocaleController.getString(R.string.TurnPasswordOff), true);
        } else if (i10 == twoStepVerificationActivity.N) {
            y9Var.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
        } else if (i10 == twoStepVerificationActivity.M) {
            y9Var.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View y9Var;
        Context context = this.c;
        if (i10 != 0) {
            y9Var = new org.telegram.ui.Cells.y8(context);
        } else {
            y9Var = new org.telegram.ui.Cells.y9(context);
            y9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        }
        return new org.telegram.ui.Components.vk0(y9Var);
    }
}
