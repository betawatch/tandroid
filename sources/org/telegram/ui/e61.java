package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class e61 extends org.telegram.ui.Components.cw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ i71 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e61(i71 i71Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, int i10, ky0 ky0Var, int i11, int i12) {
        super(context, f6Var, z10, z11, false, true, i10, ky0Var, i11, false);
        this.h0 = i71Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.cw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.cw
    public final boolean h(int i10) {
        int i11;
        w61 w61Var;
        i71 i71Var = this.h0;
        SparseIntArray sparseIntArray = i71Var.x0;
        if (i71Var.w1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            i71Var.Q = !i71Var.Q;
            i71Var.d0.setVisibility(8);
            org.telegram.ui.Components.cw cwVar = i71Var.c0[i71Var.Q ? 1 : 0];
            i71Var.d0 = cwVar;
            cwVar.setVisibility(0);
            i71Var.d0.x.setDrawable(getContext().getDrawable(i71Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            i71Var.d0.x.setContentDescription(LocaleController.getString(i71Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            i71Var.B(true, false, false);
            i71Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.yv yvVar = this.E;
        int i13 = ((yvVar == null || !this.b0) ? 0 : 1) + 1;
        if (yvVar != null && this.b0 && i10 == 1) {
            i11 = i71Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        i71.a(i71Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        i71Var.d0.j(i10, true);
        i71Var.h0.L1 = true;
        i71Var.v(null, true, true);
        z51 z51Var = i71Var.f0;
        if (z51Var != null && (w61Var = z51Var.n) != null) {
            w61Var.G1(null);
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
