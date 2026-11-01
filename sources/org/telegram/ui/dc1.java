package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class dc1 extends org.telegram.ui.Components.tk0 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public dc1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.g0
    public final int b() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (twoStepVerificationActivity.G || twoStepVerificationActivity.I == null) {
            return 0;
        }
        return twoStepVerificationActivity.T;
    }

    @Override // s4.g0
    public final int d(int i10) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        return (i10 == twoStepVerificationActivity.P || i10 == twoStepVerificationActivity.S) ? 1 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13 = c1Var.f;
        View view = c1Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i13 != 0) {
            if (i13 != 1) {
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 == twoStepVerificationActivity.P) {
                b9Var.setText(org.telegram.messenger.dd.L0(2131745565, null));
                return;
            } else {
                if (i10 == twoStepVerificationActivity.S) {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131751143, null));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
        int i14 = org.telegram.ui.ActionBar.t6.G6;
        x9Var.setTag(Integer.valueOf(i14));
        org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), i14, null);
        i11 = twoStepVerificationActivity.changePasswordRow;
        if (i10 == i11) {
            x9Var.b(org.telegram.messenger.dd.L0(2131752541, null), true);
            return;
        }
        if (i10 == twoStepVerificationActivity.O) {
            x9Var.b(org.telegram.messenger.dd.L0(2131745566, null), true);
            return;
        }
        i12 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i10 == i12) {
            x9Var.b(org.telegram.messenger.dd.L0(2131743967, null), true);
        } else if (i10 == twoStepVerificationActivity.R) {
            x9Var.b(org.telegram.messenger.dd.L0(2131752531, null), false);
        } else if (i10 == twoStepVerificationActivity.Q) {
            x9Var.b(org.telegram.messenger.dd.L0(2131745532, null), false);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View x9Var;
        Context context = this.c;
        if (i10 != 0) {
            x9Var = new org.telegram.ui.Cells.b9(context);
        } else {
            x9Var = new org.telegram.ui.Cells.x9(context);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, x9Var, null);
        }
        return new org.telegram.ui.Components.dk0(x9Var);
    }
}
