package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class dq0 extends g.o {
    public final /* synthetic */ jq0 c;

    public dq0(jq0 jq0Var) {
        this.c = jq0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        jq0 jq0Var = this.c;
        if (jq0Var.L.j(i10) == 1 || jq0Var.Y || (jq0Var.J == null && TextUtils.isEmpty(jq0Var.v))) {
            return jq0Var.M.J;
        }
        int i11 = jq0Var.R;
        int i12 = jq0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
