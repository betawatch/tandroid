package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hg1 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public hg1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 0;
    }

    @Override // f2.o0
    public final int h() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (twoStepVerificationActivity.D || twoStepVerificationActivity.F == null) {
            return 0;
        }
        return twoStepVerificationActivity.Q;
    }

    @Override // f2.o0
    public final int j(int i10) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        return (i10 == twoStepVerificationActivity.M || i10 == twoStepVerificationActivity.P) ? 1 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        int i13 = l1Var.f;
        View view = l1Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i13 != 0) {
            if (i13 != 1) {
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i10 == twoStepVerificationActivity.M) {
                z8Var.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                return;
            } else {
                if (i10 == twoStepVerificationActivity.P) {
                    z8Var.setText(LocaleController.getString(R.string.EnabledPasswordText));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        z9Var.setTag(Integer.valueOf(i14));
        z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        i11 = twoStepVerificationActivity.changePasswordRow;
        if (i10 == i11) {
            z9Var.b(LocaleController.getString(R.string.ChangePassword), true);
            return;
        }
        if (i10 == twoStepVerificationActivity.L) {
            z9Var.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
            return;
        }
        i12 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i10 == i12) {
            z9Var.b(LocaleController.getString(R.string.TurnPasswordOff), true);
        } else if (i10 == twoStepVerificationActivity.O) {
            z9Var.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
        } else if (i10 == twoStepVerificationActivity.N) {
            z9Var.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View z9Var;
        Context context = this.c;
        if (i10 != 0) {
            z9Var = new org.telegram.ui.Cells.z8(context);
        } else {
            z9Var = new org.telegram.ui.Cells.z9(context);
            z9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        }
        return new org.telegram.ui.Components.dl0(z9Var);
    }
}
