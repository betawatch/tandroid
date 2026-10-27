package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nq0 extends g.o {
    public final /* synthetic */ tq0 c;

    public nq0(tq0 tq0Var) {
        this.c = tq0Var;
    }

    @Override // g.o
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
