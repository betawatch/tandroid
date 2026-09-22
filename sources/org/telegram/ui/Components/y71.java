package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y71 extends h81 {
    public final /* synthetic */ i81 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y71(i81 i81Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, context, e6Var, z10);
        this.t0 = i81Var;
    }

    @Override // org.telegram.ui.Components.h81
    public final void e(float f7, int i10, int i11) {
        float f10 = f7 < 0.0f ? 0.0f : f7 > 1.0f ? 1.0f : f7;
        this.F = i10;
        SparseIntArray sparseIntArray = this.b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            g81 g81Var = this.y;
            if (g81Var != null) {
                a81 a81Var = ((i81) ((ka.c) g81Var).b).L;
            }
            this.L = i11;
            this.M = sparseIntArray.get(i11);
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f10;
        this.v.f1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i11;
            this.G = sparseIntArray.get(i11);
        }
        g81 g81Var2 = this.y;
        if (g81Var2 != null) {
            ((i81) ((ka.c) g81Var2).b).s();
        }
        this.t0.y(f7 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
