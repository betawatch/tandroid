package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ka1 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public ka1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 0;
    }

    @Override // v4.g0
    public final int b() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (twoStepVerificationActivity.G || twoStepVerificationActivity.I == null) {
            return 0;
        }
        return twoStepVerificationActivity.T;
    }

    @Override // v4.g0
    public final int d(int i7) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        return (i7 == twoStepVerificationActivity.P || i7 == twoStepVerificationActivity.S) ? 1 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        int i12 = d1Var.f;
        View view = d1Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == twoStepVerificationActivity.P) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131745549, null));
                return;
            } else {
                if (i7 == twoStepVerificationActivity.S) {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131751143, null));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        w9Var.setTag(Integer.valueOf(i13));
        org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), i13, null);
        i10 = twoStepVerificationActivity.changePasswordRow;
        if (i7 == i10) {
            w9Var.b(org.telegram.messenger.hd.M0(2131752541, null), true);
            return;
        }
        if (i7 == twoStepVerificationActivity.O) {
            w9Var.b(org.telegram.messenger.hd.M0(2131745550, null), true);
            return;
        }
        i11 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i7 == i11) {
            w9Var.b(org.telegram.messenger.hd.M0(2131743943, null), true);
        } else if (i7 == twoStepVerificationActivity.R) {
            w9Var.b(org.telegram.messenger.hd.M0(2131752531, null), false);
        } else if (i7 == twoStepVerificationActivity.Q) {
            w9Var.b(org.telegram.messenger.hd.M0(2131745516, null), false);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View w9Var;
        Context context = this.c;
        if (i7 != 0) {
            w9Var = new org.telegram.ui.Cells.z8(context);
        } else {
            w9Var = new org.telegram.ui.Cells.w9(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, w9Var, null);
        }
        return new org.telegram.ui.Components.xi0(w9Var);
    }
}
