package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cq0 extends f2.v {
    public final /* synthetic */ hq0 c;

    public cq0(hq0 hq0Var) {
        this.c = hq0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        hq0 hq0Var = this.c;
        if (hq0Var.I.j(i10) == 1 || hq0Var.V || (hq0Var.G == null && TextUtils.isEmpty(hq0Var.v))) {
            return hq0Var.J.J;
        }
        int i11 = hq0Var.O;
        int i12 = hq0Var.d0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
