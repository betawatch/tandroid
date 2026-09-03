package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a81 extends k81 {
    public final /* synthetic */ l81 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a81(l81 l81Var, Context context, boolean z4, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, context, f6Var, z4);
        this.q0 = l81Var;
    }

    @Override // org.telegram.ui.Components.k81
    public final void e(float f10, int i10, int i11) {
        float f11 = f10 < 0.0f ? 0.0f : f10 > 1.0f ? 1.0f : f10;
        this.C = i10;
        SparseIntArray sparseIntArray = this.V;
        this.D = sparseIntArray.get(i10);
        if (f11 > 0.0f) {
            j81 j81Var = this.y;
            if (j81Var != null) {
                c81 c81Var = ((l81) ((tp0) j81Var).b).I;
            }
            this.I = i11;
            this.J = sparseIntArray.get(i11);
        } else {
            this.I = -1;
            this.J = -1;
        }
        this.H = f11;
        this.v.e1();
        invalidate();
        c(i10);
        if (f11 >= 1.0f) {
            this.I = -1;
            this.J = -1;
            this.C = i11;
            this.D = sparseIntArray.get(i11);
        }
        j81 j81Var2 = this.y;
        if (j81Var2 != null) {
            ((l81) ((tp0) j81Var2).b).s();
        }
        this.q0.y(f10 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
