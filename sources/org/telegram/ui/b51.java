package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b51 extends org.telegram.ui.Components.kw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ f61 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b51(f61 f61Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11, int i10, by0 by0Var, int i11, int i12) {
        super(context, u6Var, z10, z11, false, true, i10, by0Var, i11, false);
        this.h0 = f61Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.kw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.kw
    public final boolean h(int i10) {
        int i11;
        t51 t51Var;
        f61 f61Var = this.h0;
        SparseIntArray sparseIntArray = f61Var.x0;
        if (f61Var.x1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            f61Var.Q = !f61Var.Q;
            f61Var.d0.setVisibility(8);
            org.telegram.ui.Components.kw kwVar = f61Var.c0[f61Var.Q ? 1 : 0];
            f61Var.d0 = kwVar;
            kwVar.setVisibility(0);
            f61Var.d0.x.setDrawable(getContext().getDrawable(f61Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            f61Var.d0.x.setContentDescription(LocaleController.getString(f61Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            f61Var.B(true, false, false);
            f61Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.gw gwVar = this.E;
        int i13 = ((gwVar == null || !this.b0) ? 0 : 1) + 1;
        if (gwVar != null && this.b0 && i10 == 1) {
            i11 = f61Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        f61.a(f61Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        f61Var.d0.j(i10, true);
        f61Var.h0.J1 = true;
        f61Var.v(null, true, true);
        w41 w41Var = f61Var.f0;
        if (w41Var != null && (t51Var = w41Var.n) != null) {
            t51Var.L1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.kw
    public final void i(org.telegram.ui.Components.gw gwVar) {
        ValueAnimator valueAnimator = this.h0.V1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            gwVar.setScaleX(0.0f);
            gwVar.setScaleY(0.0f);
        }
    }
}
