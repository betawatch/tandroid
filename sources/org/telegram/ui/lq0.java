package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lq0 extends g.o {
    public final /* synthetic */ rq0 c;

    public lq0(rq0 rq0Var) {
        this.c = rq0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        rq0 rq0Var = this.c;
        if (rq0Var.L.j(i10) == 1 || rq0Var.Y || (rq0Var.J == null && TextUtils.isEmpty(rq0Var.v))) {
            return rq0Var.M.J;
        }
        int i11 = rq0Var.R;
        int i12 = rq0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
