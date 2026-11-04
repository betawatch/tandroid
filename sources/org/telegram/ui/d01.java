package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d01 extends org.telegram.ui.Components.zu {
    public final /* synthetic */ int h0;
    public final /* synthetic */ g11 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d01(g11 g11Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, int i3, qv0 qv0Var, int i10, int i11) {
        super(context, e6Var, z10, z11, false, true, i3, qv0Var, i10, false);
        this.i0 = g11Var;
        this.h0 = i11;
    }

    @Override // org.telegram.ui.Components.zu
    public final ColorFilter getEmojiColorFilter() {
        return this.i0.l1;
    }

    @Override // org.telegram.ui.Components.zu
    public final boolean h(int i3) {
        int i10;
        v01 v01Var;
        g11 g11Var = this.i0;
        SparseIntArray sparseIntArray = g11Var.y0;
        if (g11Var.y1) {
            return false;
        }
        int i11 = this.h0;
        if (i11 == 4 && i3 == 0) {
            g11Var.R = !g11Var.R;
            g11Var.e0.setVisibility(8);
            org.telegram.ui.Components.zu zuVar = g11Var.d0[g11Var.R ? 1 : 0];
            g11Var.e0 = zuVar;
            zuVar.setVisibility(0);
            g11Var.e0.y.setDrawable(getContext().getDrawable(g11Var.R ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            g11Var.e0.y.setContentDescription(org.telegram.messenger.bd.M0(g11Var.R ? 2131754756 : 2131751197, null));
            g11Var.B(true, false, false);
            g11Var.s0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.vu vuVar = this.F;
        int i12 = ((vuVar == null || !this.c0) ? 0 : 1) + 1;
        if (vuVar != null && this.c0 && i3 == 1) {
            i10 = g11Var.n;
        } else {
            if ((i11 != 4 || i3 != 0) && i3 > 0) {
                int i13 = i3 - i12;
                if (sparseIntArray.indexOfKey(i13) >= 0) {
                    i10 = sparseIntArray.get(i13);
                }
            }
            i10 = 0;
        }
        g11.a(g11Var, i10, org.telegram.messenger.g0.L((i11 == 6 ? 7 : 0) - 2));
        g11Var.e0.j(i3, true);
        g11Var.i0.K1 = true;
        g11Var.v(null, true, true);
        yz0 yz0Var = g11Var.g0;
        if (yz0Var != null && (v01Var = yz0Var.n) != null) {
            v01Var.I1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.zu
    public final void i(org.telegram.ui.Components.vu vuVar) {
        ValueAnimator valueAnimator = this.i0.W1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            vuVar.setScaleX(0.0f);
            vuVar.setScaleY(0.0f);
        }
    }
}
