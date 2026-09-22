package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class d61 extends org.telegram.ui.Components.cw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ h71 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(h71 h71Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, int i10, iy0 iy0Var, int i11, int i12) {
        super(context, e6Var, z10, z11, false, true, i10, iy0Var, i11, false);
        this.h0 = h71Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.cw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.cw
    public final boolean h(int i10) {
        int i11;
        v61 v61Var;
        h71 h71Var = this.h0;
        SparseIntArray sparseIntArray = h71Var.x0;
        if (h71Var.w1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            h71Var.Q = !h71Var.Q;
            h71Var.d0.setVisibility(8);
            org.telegram.ui.Components.cw cwVar = h71Var.c0[h71Var.Q ? 1 : 0];
            h71Var.d0 = cwVar;
            cwVar.setVisibility(0);
            h71Var.d0.x.setDrawable(getContext().getDrawable(h71Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            h71Var.d0.x.setContentDescription(LocaleController.getString(h71Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            h71Var.B(true, false, false);
            h71Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.yv yvVar = this.E;
        int i13 = ((yvVar == null || !this.b0) ? 0 : 1) + 1;
        if (yvVar != null && this.b0 && i10 == 1) {
            i11 = h71Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        h71.a(h71Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        h71Var.d0.j(i10, true);
        h71Var.h0.L1 = true;
        h71Var.v(null, true, true);
        y51 y51Var = h71Var.f0;
        if (y51Var != null && (v61Var = y51Var.n) != null) {
            v61Var.F1(null);
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
