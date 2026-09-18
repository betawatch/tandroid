package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class c61 extends org.telegram.ui.Components.cw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ g71 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c61(g71 g71Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, int i10, cy0 cy0Var, int i11, int i12) {
        super(context, e6Var, z10, z11, false, true, i10, cy0Var, i11, false);
        this.h0 = g71Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.cw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.cw
    public final boolean h(int i10) {
        int i11;
        u61 u61Var;
        g71 g71Var = this.h0;
        SparseIntArray sparseIntArray = g71Var.x0;
        if (g71Var.w1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            g71Var.Q = !g71Var.Q;
            g71Var.d0.setVisibility(8);
            org.telegram.ui.Components.cw cwVar = g71Var.c0[g71Var.Q ? 1 : 0];
            g71Var.d0 = cwVar;
            cwVar.setVisibility(0);
            g71Var.d0.x.setDrawable(getContext().getDrawable(g71Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            g71Var.d0.x.setContentDescription(LocaleController.getString(g71Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            g71Var.B(true, false, false);
            g71Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.yv yvVar = this.E;
        int i13 = ((yvVar == null || !this.b0) ? 0 : 1) + 1;
        if (yvVar != null && this.b0 && i10 == 1) {
            i11 = g71Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        g71.a(g71Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        g71Var.d0.j(i10, true);
        g71Var.h0.L1 = true;
        g71Var.v(null, true, true);
        x51 x51Var = g71Var.f0;
        if (x51Var != null && (u61Var = x51Var.n) != null) {
            u61Var.G1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.cw
    public final void i(org.telegram.ui.Components.yv yvVar) {
        ValueAnimator valueAnimator = this.h0.U1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            yvVar.setScaleX(0.0f);
            yvVar.setScaleY(0.0f);
        }
    }
}
