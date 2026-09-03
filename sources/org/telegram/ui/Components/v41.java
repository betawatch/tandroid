package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class v41 extends oz {
    public final /* synthetic */ e51 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(e51 e51Var, int i10, u41 u41Var) {
        super(5, i10, u41Var);
        this.Y = e51Var;
    }

    @Override // org.telegram.ui.Components.oz
    public final boolean D1() {
        e51 e51Var = this.Y;
        return e51Var.n.getAdapter() == e51Var.v;
    }

    @Override // f2.i0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // f2.w, f2.i0, f2.v0
    public final int o0(int i10, af.h hVar, f2.i1 i1Var) {
        int i11;
        View m9;
        e51 e51Var = this.Y;
        if (e51Var.K) {
            return super.o0(i10, hVar, i1Var);
        }
        int i12 = 0;
        if (e51Var.I != null) {
            return 0;
        }
        if (e51Var.J) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                u41 u41Var = e51Var.n;
                View q10 = q(i12);
                u41Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m9 = e51Var.r.m(i11)) != null && m9.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m9.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, hVar, i1Var);
    }

    @Override // f2.w, f2.i0, f2.v0
    public final boolean y0() {
        return false;
    }
}
