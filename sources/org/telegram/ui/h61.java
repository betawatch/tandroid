package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h61 extends org.telegram.ui.Components.gw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ l71 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h61(l71 l71Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, int i10, ey0 ey0Var, int i11, int i12) {
        super(context, f6Var, z10, z11, false, true, i10, ey0Var, i11, false);
        this.h0 = l71Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.gw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.gw
    public final boolean h(int i10) {
        int i11;
        z61 z61Var;
        l71 l71Var = this.h0;
        SparseIntArray sparseIntArray = l71Var.x0;
        if (l71Var.w1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            l71Var.Q = !l71Var.Q;
            l71Var.d0.setVisibility(8);
            org.telegram.ui.Components.gw gwVar = l71Var.c0[l71Var.Q ? 1 : 0];
            l71Var.d0 = gwVar;
            gwVar.setVisibility(0);
            l71Var.d0.x.setDrawable(getContext().getDrawable(l71Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            l71Var.d0.x.setContentDescription(LocaleController.getString(l71Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            l71Var.B(true, false, false);
            l71Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.cw cwVar = this.E;
        int i13 = ((cwVar == null || !this.b0) ? 0 : 1) + 1;
        if (cwVar != null && this.b0 && i10 == 1) {
            i11 = l71Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        l71.a(l71Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        l71Var.d0.j(i10, true);
        l71Var.h0.L1 = true;
        l71Var.v(null, true, true);
        c61 c61Var = l71Var.f0;
        if (c61Var != null && (z61Var = c61Var.n) != null) {
            z61Var.E1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.gw
    public final void i(org.telegram.ui.Components.cw cwVar) {
        ValueAnimator valueAnimator = this.h0.U1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            cwVar.setScaleX(0.0f);
            cwVar.setScaleY(0.0f);
        }
    }
}
