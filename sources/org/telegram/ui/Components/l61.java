package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l61 extends v61 {
    public final /* synthetic */ w61 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l61(w61 w61Var, Context context, boolean z9, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, context, g6Var, z9);
        this.t0 = w61Var;
    }

    @Override // org.telegram.ui.Components.v61
    public final void e(float f10, int i7, int i10) {
        float f11 = f10 < 0.0f ? 0.0f : f10 > 1.0f ? 1.0f : f10;
        this.F = i7;
        SparseIntArray sparseIntArray = this.b0;
        this.G = sparseIntArray.get(i7);
        if (f11 > 0.0f) {
            this.L = i10;
            this.M = sparseIntArray.get(i10);
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f11;
        this.w.g1();
        invalidate();
        c(i7);
        if (f11 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i10;
            this.G = sparseIntArray.get(i10);
        }
        u61 u61Var = this.D;
        if (u61Var != null) {
            ((w61) ((n) u61Var).a).s();
        }
        this.t0.z(f10 <= 0.5f ? i7 : i10, i7 < i10);
    }
}
