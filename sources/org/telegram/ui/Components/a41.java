package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a41 extends cz {
    public final /* synthetic */ j41 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a41(j41 j41Var, int i10, z31 z31Var) {
        super(5, i10, z31Var);
        this.Y = j41Var;
    }

    @Override // org.telegram.ui.Components.cz
    public final boolean D1() {
        j41 j41Var = this.Y;
        return j41Var.n.getAdapter() == j41Var.v;
    }

    @Override // f2.k0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // f2.x, f2.k0, f2.x0
    public final int o0(int i10, f2.e1 e1Var, f2.l1 l1Var) {
        int i11;
        View m10;
        j41 j41Var = this.Y;
        if (j41Var.J) {
            return super.o0(i10, e1Var, l1Var);
        }
        int i12 = 0;
        if (j41Var.H != null) {
            return 0;
        }
        if (j41Var.I) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                z31 z31Var = j41Var.n;
                View q6 = q(i12);
                z31Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = j41Var.r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m10.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, e1Var, l1Var);
    }

    @Override // f2.x, f2.k0, f2.x0
    public final boolean y0() {
        return false;
    }
}
