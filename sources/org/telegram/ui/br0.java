package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class br0 extends g.o {
    public final /* synthetic */ hr0 c;

    public br0(hr0 hr0Var) {
        this.c = hr0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        hr0 hr0Var = this.c;
        if (hr0Var.L.j(i10) == 1 || hr0Var.Y || (hr0Var.J == null && TextUtils.isEmpty(hr0Var.v))) {
            return hr0Var.M.J;
        }
        int i11 = hr0Var.R;
        int i12 = hr0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
