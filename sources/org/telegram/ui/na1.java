package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class na1 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public na1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
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
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i7 == twoStepVerificationActivity.Q) {
                a9Var.setText(org.telegram.messenger.gd.N0(2131745352, null));
                return;
            } else {
                if (i7 == twoStepVerificationActivity.T) {
                    a9Var.setText(org.telegram.messenger.gd.N0(2131751130, null));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
        int i13 = org.telegram.ui.ActionBar.m6.G6;
        x9Var.setTag(Integer.valueOf(i13));
        org.telegram.ui.ActionBar.t6.U(x9Var.getTextView(), i13, null);
        i10 = twoStepVerificationActivity.changePasswordRow;
        if (i7 == i10) {
            x9Var.b(org.telegram.messenger.gd.N0(2131752529, null), true);
            return;
        }
        if (i7 == twoStepVerificationActivity.P) {
            x9Var.b(org.telegram.messenger.gd.N0(2131745353, null), true);
            return;
        }
        i11 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i7 == i11) {
            x9Var.b(org.telegram.messenger.gd.N0(2131743699, null), true);
        } else if (i7 == twoStepVerificationActivity.S) {
            x9Var.b(org.telegram.messenger.gd.N0(2131752519, null), false);
        } else if (i7 == twoStepVerificationActivity.R) {
            x9Var.b(org.telegram.messenger.gd.N0(2131745319, null), false);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View x9Var;
        Context context = this.c;
        if (i7 != 0) {
            x9Var = new org.telegram.ui.Cells.a9(context);
        } else {
            x9Var = new org.telegram.ui.Cells.x9(context);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, x9Var, null);
        }
        return new org.telegram.ui.Components.mj0(x9Var);
    }
}
