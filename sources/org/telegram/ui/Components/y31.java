package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y31 extends az {
    public final /* synthetic */ h41 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y31(h41 h41Var, int i9, x31 x31Var) {
        super(5, i9, x31Var);
        this.Y = h41Var;
    }

    @Override // org.telegram.ui.Components.az
    public final boolean D1() {
        h41 h41Var = this.Y;
        return h41Var.n.getAdapter() == h41Var.v;
    }

    @Override // f2.m0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // f2.y, f2.m0, f2.z0
    public final int o0(int i9, f2.g1 g1Var, f2.n1 n1Var) {
        int i10;
        View m10;
        h41 h41Var = this.Y;
        if (h41Var.J) {
            return super.o0(i9, g1Var, n1Var);
        }
        int i11 = 0;
        if (h41Var.H != null) {
            return 0;
        }
        if (h41Var.I) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                x31 x31Var = h41Var.n;
                View q10 = q(i11);
                x31Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = h41Var.r.m(i10)) != null && m10.getTop() - i9 > AndroidUtilities.dp(58.0f)) {
                i9 = m10.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i9, g1Var, n1Var);
    }

    @Override // f2.y, f2.m0, f2.z0
    public final boolean y0() {
        return false;
    }
}
