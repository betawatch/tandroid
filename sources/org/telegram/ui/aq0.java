package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class aq0 extends f2.v {
    public final /* synthetic */ fq0 c;

    public aq0(fq0 fq0Var) {
        this.c = fq0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        fq0 fq0Var = this.c;
        if (fq0Var.I.j(i10) == 1 || fq0Var.V || (fq0Var.G == null && TextUtils.isEmpty(fq0Var.v))) {
            return fq0Var.J.J;
        }
        int i11 = fq0Var.O;
        int i12 = fq0Var.d0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
