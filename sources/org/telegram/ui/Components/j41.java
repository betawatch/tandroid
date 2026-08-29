package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j41 extends jz {
    public final /* synthetic */ s41 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j41(s41 s41Var, int i10, i41 i41Var) {
        super(5, i10, i41Var);
        this.Y = s41Var;
    }

    @Override // org.telegram.ui.Components.jz
    public final boolean D1() {
        s41 s41Var = this.Y;
        return s41Var.n.getAdapter() == s41Var.v;
    }

    @Override // f2.j0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // f2.w, f2.j0, f2.w0
    public final int o0(int i10, f2.d1 d1Var, f2.k1 k1Var) {
        int i11;
        View m10;
        s41 s41Var = this.Y;
        if (s41Var.J) {
            return super.o0(i10, d1Var, k1Var);
        }
        int i12 = 0;
        if (s41Var.H != null) {
            return 0;
        }
        if (s41Var.I) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                i41 i41Var = s41Var.n;
                View q6 = q(i12);
                i41Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = s41Var.r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m10.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, d1Var, k1Var);
    }

    @Override // f2.w, f2.j0, f2.w0
    public final boolean y0() {
        return false;
    }
}
