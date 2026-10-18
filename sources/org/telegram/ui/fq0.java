package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class fq0 extends g.o {
    public final /* synthetic */ lq0 c;

    public fq0(lq0 lq0Var) {
        this.c = lq0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        lq0 lq0Var = this.c;
        if (lq0Var.L.j(i10) == 1 || lq0Var.Y || (lq0Var.J == null && TextUtils.isEmpty(lq0Var.v))) {
            return lq0Var.M.J;
        }
        int i11 = lq0Var.R;
        int i12 = lq0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
