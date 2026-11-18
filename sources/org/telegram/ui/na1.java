package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class na1 extends org.telegram.ui.Components.bk0 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public na1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 0;
    }

    @Override // v4.i0
    public final int b() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (twoStepVerificationActivity.H || twoStepVerificationActivity.J == null) {
            return 0;
        }
        return twoStepVerificationActivity.U;
    }

    @Override // v4.i0
    public final int d(int i7) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        return (i7 == twoStepVerificationActivity.Q || i7 == twoStepVerificationActivity.T) ? 1 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        int i12 = f1Var.f;
        View view = f1Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == twoStepVerificationActivity.Q) {
                z8Var.setText(org.telegram.messenger.gd.M0(2131745353, null));
                return;
            } else {
                if (i7 == twoStepVerificationActivity.T) {
                    z8Var.setText(org.telegram.messenger.gd.M0(2131751131, null));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
        int i13 = org.telegram.ui.ActionBar.n6.G6;
        w9Var.setTag(Integer.valueOf(i13));
        org.telegram.ui.ActionBar.u6.U(w9Var.getTextView(), i13, null);
        i10 = twoStepVerificationActivity.changePasswordRow;
        if (i7 == i10) {
            w9Var.b(org.telegram.messenger.gd.M0(2131752530, null), true);
            return;
        }
        if (i7 == twoStepVerificationActivity.P) {
            w9Var.b(org.telegram.messenger.gd.M0(2131745354, null), true);
            return;
        }
        i11 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i7 == i11) {
            w9Var.b(org.telegram.messenger.gd.M0(2131743705, null), true);
        } else if (i7 == twoStepVerificationActivity.S) {
            w9Var.b(org.telegram.messenger.gd.M0(2131752520, null), false);
        } else if (i7 == twoStepVerificationActivity.R) {
            w9Var.b(org.telegram.messenger.gd.M0(2131745320, null), false);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View w9Var;
        Context context = this.c;
        if (i7 != 0) {
            w9Var = new org.telegram.ui.Cells.z8(context);
        } else {
            w9Var = new org.telegram.ui.Cells.w9(context);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, w9Var, null);
        }
        return new org.telegram.ui.Components.kj0(w9Var);
    }
}
