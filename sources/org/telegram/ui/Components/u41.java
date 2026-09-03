package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class u41 extends qz {
    public final /* synthetic */ d51 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(d51 d51Var, int i10, t41 t41Var) {
        super(5, i10, t41Var);
        this.Y = d51Var;
    }

    @Override // org.telegram.ui.Components.qz
    public final boolean D1() {
        d51 d51Var = this.Y;
        return d51Var.n.getAdapter() == d51Var.v;
    }

    @Override // f2.j0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // f2.w, f2.j0, f2.w0
    public final int o0(int i10, bf.f fVar, f2.j1 j1Var) {
        int i11;
        View m9;
        d51 d51Var = this.Y;
        if (d51Var.K) {
            return super.o0(i10, fVar, j1Var);
        }
        int i12 = 0;
        if (d51Var.I != null) {
            return 0;
        }
        if (d51Var.J) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                t41 t41Var = d51Var.n;
                View q10 = q(i12);
                t41Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m9 = d51Var.r.m(i11)) != null && m9.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
