package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o71 extends y71 {
    public final /* synthetic */ z71 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o71(z71 z71Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, context, c6Var, z10);
        this.p0 = z71Var;
    }

    @Override // org.telegram.ui.Components.y71
    public final void e(float f9, int i10, int i11) {
        float f10 = f9 < 0.0f ? 0.0f : f9 > 1.0f ? 1.0f : f9;
        this.B = i10;
        SparseIntArray sparseIntArray = this.U;
        this.C = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            x71 x71Var = this.y;
            if (x71Var != null) {
                q71 q71Var = ((z71) ((n) x71Var).b).H;
            }
            this.H = i11;
            this.I = sparseIntArray.get(i11);
        } else {
            this.H = -1;
            this.I = -1;
        }
        this.G = f10;
        this.v.f1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.H = -1;
            this.I = -1;
            this.B = i11;
            this.C = sparseIntArray.get(i11);
        }
        x71 x71Var2 = this.y;
        if (x71Var2 != null) {
            ((z71) ((n) x71Var2).b).s();
        }
        this.p0.y(f9 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
