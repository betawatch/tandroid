package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ja1 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public ja1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 0;
    }

    @Override // v4.h0
    public final int b() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (twoStepVerificationActivity.H || twoStepVerificationActivity.J == null) {
            return 0;
        }
        return twoStepVerificationActivity.U;
    }

    @Override // v4.h0
    public final int d(int i7) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        return (i7 == twoStepVerificationActivity.Q || i7 == twoStepVerificationActivity.T) ? 1 : 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        int i11;
        int i12 = e1Var.f;
        View view = e1Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i7 == twoStepVerificationActivity.Q) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131745548, null));
                return;
            } else {
                if (i7 == twoStepVerificationActivity.T) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131751142, null));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        v9Var.setTag(Integer.valueOf(i13));
        org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), i13, null);
        i10 = twoStepVerificationActivity.changePasswordRow;
        if (i7 == i10) {
            v9Var.b(org.telegram.messenger.hd.M0(2131752541, null), true);
            return;
        }
        if (i7 == twoStepVerificationActivity.P) {
            v9Var.b(org.telegram.messenger.hd.M0(2131745549, null), true);
            return;
        }
        i11 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i7 == i11) {
            v9Var.b(org.telegram.messenger.hd.M0(2131743942, null), true);
        } else if (i7 == twoStepVerificationActivity.S) {
            v9Var.b(org.telegram.messenger.hd.M0(2131752531, null), false);
        } else if (i7 == twoStepVerificationActivity.R) {
            v9Var.b(org.telegram.messenger.hd.M0(2131745515, null), false);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View v9Var;
        Context context = this.c;
        if (i7 != 0) {
            v9Var = new org.telegram.ui.Cells.y8(context);
        } else {
            v9Var = new org.telegram.ui.Cells.v9(context);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, v9Var, null);
        }
        return new org.telegram.ui.Components.cj0(v9Var);
    }
}
