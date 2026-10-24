package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class b91 extends k91 {
    public final /* synthetic */ l91 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b91(l91 l91Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, context, g6Var, z10);
        this.t0 = l91Var;
    }

    @Override // org.telegram.ui.Components.k91
    public final void e(float f7, int i10, int i11) {
        float f10 = f7 < 0.0f ? 0.0f : f7 > 1.0f ? 1.0f : f7;
        this.F = i10;
        SparseIntArray sparseIntArray = this.b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            j91 j91Var = this.y;
            if (j91Var != null) {
                d91 d91Var = ((l91) ((l2.f) j91Var).b).L;
            }
            this.L = i11;
            this.M = sparseIntArray.get(i11);
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f10;
        this.v.g1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i11;
            this.G = sparseIntArray.get(i11);
        }
        j91 j91Var2 = this.y;
        if (j91Var2 != null) {
            ((l91) ((l2.f) j91Var2).b).s();
        }
        this.t0.y(f7 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
