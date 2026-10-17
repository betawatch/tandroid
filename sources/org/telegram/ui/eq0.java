package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class eq0 extends g.o {
    public final /* synthetic */ kq0 c;

    public eq0(kq0 kq0Var) {
        this.c = kq0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        kq0 kq0Var = this.c;
        if (kq0Var.L.j(i10) == 1 || kq0Var.Y || (kq0Var.J == null && TextUtils.isEmpty(kq0Var.v))) {
            return kq0Var.M.J;
        }
        int i11 = kq0Var.R;
        int i12 = kq0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
