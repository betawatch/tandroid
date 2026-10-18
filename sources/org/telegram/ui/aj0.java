package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class aj0 extends ei.d {
    public final /* synthetic */ cj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj0(cj0 cj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, true);
        this.h0 = cj0Var;
    }

    @Override // ei.d
    public final float a(float f7, float f10) {
        cj0 cj0Var = this.h0;
        boolean z10 = cj0Var.n0 == 0.0f;
        cj0Var.n0 = f7;
        if (z10) {
            cj0Var.o0 = new org.telegram.ui.Components.mb0(cj0Var, 1);
            cj0Var.T(false);
        }
        return f7;
    }
}
