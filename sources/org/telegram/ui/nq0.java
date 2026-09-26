package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class nq0 extends g.p {
    public final /* synthetic */ tq0 c;

    public nq0(tq0 tq0Var) {
        this.c = tq0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        tq0 tq0Var = this.c;
        if (tq0Var.L.j(i10) == 1 || tq0Var.Y || (tq0Var.J == null && TextUtils.isEmpty(tq0Var.v))) {
            return tq0Var.M.J;
        }
        int i11 = tq0Var.R;
        int i12 = tq0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
