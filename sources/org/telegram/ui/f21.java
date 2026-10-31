package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f21 extends org.telegram.ui.Components.mv {
    public final /* synthetic */ int g0;
    public final /* synthetic */ i31 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f21(i31 i31Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11, int i10, t11 t11Var, int i11, int i12) {
        super(context, p6Var, z10, z11, false, true, i10, t11Var, i11, false);
        this.h0 = i31Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.mv
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.mv
    public final boolean h(int i10) {
        int i11;
        x21 x21Var;
        i31 i31Var = this.h0;
        SparseIntArray sparseIntArray = i31Var.x0;
        if (i31Var.x1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            i31Var.Q = !i31Var.Q;
            i31Var.d0.setVisibility(8);
            org.telegram.ui.Components.mv mvVar = i31Var.c0[i31Var.Q ? 1 : 0];
            i31Var.d0 = mvVar;
            mvVar.setVisibility(0);
            i31Var.d0.y.setDrawable(getContext().getDrawable(i31Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            i31Var.d0.y.setContentDescription(org.telegram.messenger.cd.L0(i31Var.Q ? 2131754756 : 2131751197, null));
            i31Var.B(true, false, false);
            i31Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.iv ivVar = this.E;
        int i13 = ((ivVar == null || !this.b0) ? 0 : 1) + 1;
        if (ivVar != null && this.b0 && i10 == 1) {
            i11 = i31Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        i31.a(i31Var, i11, org.telegram.messenger.i0.L((i12 == 6 ? 7 : 0) - 2));
        i31Var.d0.j(i10, true);
        i31Var.h0.J1 = true;
        i31Var.v(null, true, true);
        a21 a21Var = i31Var.f0;
        if (a21Var != null && (x21Var = a21Var.n) != null) {
            x21Var.I1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.mv
    public final void i(org.telegram.ui.Components.iv ivVar) {
        ValueAnimator valueAnimator = this.h0.V1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            ivVar.setScaleX(0.0f);
            ivVar.setScaleY(0.0f);
        }
    }
}
