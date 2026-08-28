package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mf1 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public mf1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 0;
    }

    @Override // f2.r0
    public final int h() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (twoStepVerificationActivity.C || twoStepVerificationActivity.E == null) {
            return 0;
        }
        return twoStepVerificationActivity.P;
    }

    @Override // f2.r0
    public final int j(int i9) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        return (i9 == twoStepVerificationActivity.L || i9 == twoStepVerificationActivity.O) ? 1 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12 = q1Var.f;
        View view = q1Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i9 == twoStepVerificationActivity.L) {
                b9Var.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                return;
            } else {
                if (i9 == twoStepVerificationActivity.O) {
                    b9Var.setText(LocaleController.getString(R.string.EnabledPasswordText));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        baVar.setTag(Integer.valueOf(i13));
        baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        i10 = twoStepVerificationActivity.changePasswordRow;
        if (i9 == i10) {
            baVar.b(LocaleController.getString(R.string.ChangePassword), true);
            return;
        }
        if (i9 == twoStepVerificationActivity.K) {
            baVar.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
            return;
        }
        i11 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i9 == i11) {
            baVar.b(LocaleController.getString(R.string.TurnPasswordOff), true);
        } else if (i9 == twoStepVerificationActivity.N) {
            baVar.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
        } else if (i9 == twoStepVerificationActivity.M) {
            baVar.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View baVar;
        Context context = this.c;
        if (i9 != 0) {
            baVar = new org.telegram.ui.Cells.b9(context);
        } else {
            baVar = new org.telegram.ui.Cells.ba(context);
            baVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        }
        return new org.telegram.ui.Components.ik0(baVar);
    }
}
