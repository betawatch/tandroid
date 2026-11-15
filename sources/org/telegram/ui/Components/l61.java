package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l61 extends v61 {
    public final /* synthetic */ w61 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l61(w61 w61Var, Context context, boolean z10, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, context, e6Var, z10);
        this.u0 = w61Var;
    }

    @Override // org.telegram.ui.Components.v61
    public final void e(float f10, int i7, int i10) {
        float f11 = f10 < 0.0f ? 0.0f : f10 > 1.0f ? 1.0f : f10;
        this.G = i7;
        SparseIntArray sparseIntArray = this.c0;
        this.H = sparseIntArray.get(i7);
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
        c(i7);
        if (f11 >= 1.0f) {
            this.M = -1;
            this.N = -1;
            this.G = i10;
            this.H = sparseIntArray.get(i10);
        }
        u61 u61Var = this.E;
        if (u61Var != null) {
            ((w61) ((cf) u61Var).a).p();
        }
        this.u0.w(f10 <= 0.5f ? i7 : i10, i7 < i10);
    }
}
