package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l51 extends org.telegram.ui.Components.xv {
    public final /* synthetic */ int d0;
    public final /* synthetic */ q61 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l51(q61 q61Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10, int i10, l01 l01Var, int i11, int i12) {
        super(context, f6Var, z4, z10, false, true, i10, l01Var, i11, false);
        this.e0 = q61Var;
        this.d0 = i12;
    }

    @Override // org.telegram.ui.Components.xv
    public final ColorFilter getEmojiColorFilter() {
        return this.e0.h1;
    }

    @Override // org.telegram.ui.Components.xv
    public final boolean h(int i10) {
        int i11;
        d61 d61Var;
        q61 q61Var = this.e0;
        SparseIntArray sparseIntArray = q61Var.u0;
        if (q61Var.t1) {
            return false;
        }
        int i12 = this.d0;
        if (i12 == 4 && i10 == 0) {
            q61Var.N = !q61Var.N;
            q61Var.a0.setVisibility(8);
            org.telegram.ui.Components.xv xvVar = q61Var.W[q61Var.N ? 1 : 0];
            q61Var.a0 = xvVar;
            xvVar.setVisibility(0);
            q61Var.a0.x.setDrawable(getContext().getDrawable(q61Var.N ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            q61Var.a0.x.setContentDescription(LocaleController.getString(q61Var.N ? R.string.AccDescrStickers : R.string.Emoji));
            q61Var.B(true, false, false);
            q61Var.o0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.tv tvVar = this.B;
        int i13 = ((tvVar == null || !this.V) ? 0 : 1) + 1;
        if (tvVar != null && this.V && i10 == 1) {
            i11 = q61Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        q61.a(q61Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        q61Var.a0.j(i10, true);
        q61Var.e0.I1 = true;
        q61Var.v(null, true, true);
        g51 g51Var = q61Var.c0;
        if (g51Var != null && (d61Var = g51Var.n) != null) {
            d61Var.F1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.xv
    public final void i(org.telegram.ui.Components.tv tvVar) {
        ValueAnimator valueAnimator = this.e0.R1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            tvVar.setScaleX(0.0f);
            tvVar.setScaleY(0.0f);
        }
    }
}
