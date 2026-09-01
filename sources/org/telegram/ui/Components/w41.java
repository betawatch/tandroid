package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class w41 extends qz {
    public final /* synthetic */ f51 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w41(f51 f51Var, int i10, v41 v41Var) {
        super(5, i10, v41Var);
        this.Y = f51Var;
    }

    @Override // org.telegram.ui.Components.qz
    public final boolean D1() {
        f51 f51Var = this.Y;
        return f51Var.n.getAdapter() == f51Var.v;
    }

    @Override // f2.j0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // f2.w, f2.j0, f2.w0
    public final int o0(int i10, bf.f fVar, f2.j1 j1Var) {
        int i11;
        View m9;
        f51 f51Var = this.Y;
        if (f51Var.K) {
            return super.o0(i10, fVar, j1Var);
        }
        int i12 = 0;
        if (f51Var.I != null) {
            return 0;
        }
        if (f51Var.J) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                v41 v41Var = f51Var.n;
                View q10 = q(i12);
                v41Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m9 = f51Var.r.m(i11)) != null && m9.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m9.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, fVar, j1Var);
    }

    @Override // f2.w, f2.j0, f2.w0
    public final boolean y0() {
        return false;
    }
}
