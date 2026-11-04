package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d61 extends m61 {
    public final /* synthetic */ n61 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(n61 n61Var, Context context, boolean z10, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var, z10);
        this.u0 = n61Var;
    }

    @Override // org.telegram.ui.Components.m61
    public final void e(float f10, int i3, int i10) {
        float f11 = f10 < 0.0f ? 0.0f : f10 > 1.0f ? 1.0f : f10;
        this.G = i3;
        SparseIntArray sparseIntArray = this.c0;
        this.H = sparseIntArray.get(i3);
        if (f11 > 0.0f) {
            this.M = i10;
            this.N = sparseIntArray.get(i10);
        } else {
            this.M = -1;
            this.N = -1;
        }
        this.L = f11;
        this.w.g1();
        invalidate();
        c(i3);
        if (f11 >= 1.0f) {
            this.M = -1;
            this.N = -1;
            this.G = i10;
            this.H = sparseIntArray.get(i10);
        }
        l61 l61Var = this.E;
        if (l61Var != null) {
            ((n61) ((y00) l61Var).a).q();
        }
        this.u0.y(f10 <= 0.5f ? i3 : i10, i3 < i10);
    }
}
