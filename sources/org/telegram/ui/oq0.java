package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class oq0 extends g.p {
    public final /* synthetic */ uq0 c;

    public oq0(uq0 uq0Var) {
        this.c = uq0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        uq0 uq0Var = this.c;
        if (uq0Var.L.j(i10) == 1 || uq0Var.Y || (uq0Var.J == null && TextUtils.isEmpty(uq0Var.v))) {
            return uq0Var.M.J;
        }
        int i11 = uq0Var.R;
        int i12 = uq0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
