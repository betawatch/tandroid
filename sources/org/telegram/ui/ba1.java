package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ba1 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public ba1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 0;
    }

    @Override // u4.h0
    public final int b() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (twoStepVerificationActivity.H || twoStepVerificationActivity.J == null) {
            return 0;
        }
        return twoStepVerificationActivity.U;
    }

    @Override // u4.h0
    public final int d(int i3) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        return (i3 == twoStepVerificationActivity.Q || i3 == twoStepVerificationActivity.T) ? 1 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11;
        int i12 = d1Var.f;
        View view = d1Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i3 == twoStepVerificationActivity.Q) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131745558, null));
                return;
            } else {
                if (i3 == twoStepVerificationActivity.T) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131751143, null));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        v9Var.setTag(Integer.valueOf(i13));
        org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), i13, null);
        i10 = twoStepVerificationActivity.changePasswordRow;
        if (i3 == i10) {
            v9Var.b(org.telegram.messenger.bd.M0(2131752541, null), true);
            return;
        }
        if (i3 == twoStepVerificationActivity.P) {
            v9Var.b(org.telegram.messenger.bd.M0(2131745559, null), true);
            return;
        }
        i11 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i3 == i11) {
            v9Var.b(org.telegram.messenger.bd.M0(2131743952, null), true);
        } else if (i3 == twoStepVerificationActivity.S) {
            v9Var.b(org.telegram.messenger.bd.M0(2131752531, null), false);
        } else if (i3 == twoStepVerificationActivity.R) {
            v9Var.b(org.telegram.messenger.bd.M0(2131745525, null), false);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View v9Var;
        Context context = this.c;
        if (i3 != 0) {
            v9Var = new org.telegram.ui.Cells.y8(context);
        } else {
            v9Var = new org.telegram.ui.Cells.v9(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, v9Var, null);
        }
        return new org.telegram.ui.Components.bj0(v9Var);
    }
}
