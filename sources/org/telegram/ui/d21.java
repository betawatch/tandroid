package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class d21 extends org.telegram.ui.Components.mv {
    public final /* synthetic */ int g0;
    public final /* synthetic */ g31 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d21(g31 g31Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11, int i10, y01 y01Var, int i11, int i12) {
        super(context, p6Var, z10, z11, false, true, i10, y01Var, i11, false);
        this.h0 = g31Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.mv
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.mv
    public final boolean h(int i10) {
        int i11;
        v21 v21Var;
        g31 g31Var = this.h0;
        SparseIntArray sparseIntArray = g31Var.x0;
        if (g31Var.x1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            g31Var.Q = !g31Var.Q;
            g31Var.d0.setVisibility(8);
            org.telegram.ui.Components.mv mvVar = g31Var.c0[g31Var.Q ? 1 : 0];
            g31Var.d0 = mvVar;
            mvVar.setVisibility(0);
            g31Var.d0.y.setDrawable(getContext().getDrawable(g31Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            g31Var.d0.y.setContentDescription(org.telegram.messenger.dd.L0(g31Var.Q ? 2131754756 : 2131751197, null));
            g31Var.B(true, false, false);
            g31Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.iv ivVar = this.E;
        int i13 = ((ivVar == null || !this.b0) ? 0 : 1) + 1;
        if (ivVar != null && this.b0 && i10 == 1) {
            i11 = g31Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        g31.a(g31Var, i11, org.telegram.messenger.i0.L((i12 == 6 ? 7 : 0) - 2));
        g31Var.d0.j(i10, true);
        g31Var.h0.J1 = true;
        g31Var.v(null, true, true);
        y11 y11Var = g31Var.f0;
        if (y11Var != null && (v21Var = y11Var.n) != null) {
            v21Var.I1(null);
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
