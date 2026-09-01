package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class c81 extends l81 {
    public final /* synthetic */ m81 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c81(m81 m81Var, Context context, boolean z4, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, context, g6Var, z4);
        this.q0 = m81Var;
    }

    @Override // org.telegram.ui.Components.l81
    public final void e(float f10, int i10, int i11) {
        float f11 = f10 < 0.0f ? 0.0f : f10 > 1.0f ? 1.0f : f10;
        this.C = i10;
        SparseIntArray sparseIntArray = this.V;
        this.D = sparseIntArray.get(i10);
        if (f11 > 0.0f) {
            k81 k81Var = this.y;
            if (k81Var != null) {
                e81 e81Var = ((m81) ((oh.h4) k81Var).b).I;
            }
            this.I = i11;
            this.J = sparseIntArray.get(i11);
        } else {
            this.I = -1;
            this.J = -1;
        }
        this.H = f11;
        this.v.f1();
        invalidate();
        c(i10);
        if (f11 >= 1.0f) {
            this.I = -1;
            this.J = -1;
            this.C = i11;
            this.D = sparseIntArray.get(i11);
        }
        k81 k81Var2 = this.y;
        if (k81Var2 != null) {
            ((m81) ((oh.h4) k81Var2).b).s();
        }
        this.q0.y(f10 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
