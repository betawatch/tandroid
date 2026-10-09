package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g61 extends org.telegram.ui.Components.sw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ k71 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g61(k71 k71Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, int i10, n31 n31Var, int i11, int i12) {
        super(context, e6Var, z10, z11, false, true, i10, n31Var, i11, false);
        this.h0 = k71Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.sw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.sw
    public final boolean h(int i10) {
        int i11;
        y61 y61Var;
        k71 k71Var = this.h0;
        SparseIntArray sparseIntArray = k71Var.x0;
        if (k71Var.w1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            k71Var.Q = !k71Var.Q;
            k71Var.d0.setVisibility(8);
            org.telegram.ui.Components.sw swVar = k71Var.c0[k71Var.Q ? 1 : 0];
            k71Var.d0 = swVar;
            swVar.setVisibility(0);
            k71Var.d0.x.setDrawable(getContext().getDrawable(k71Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            k71Var.d0.x.setContentDescription(LocaleController.getString(k71Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            k71Var.B(true, false, false);
            k71Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.ow owVar = this.E;
        int i13 = ((owVar == null || !this.b0) ? 0 : 1) + 1;
        if (owVar != null && this.b0 && i10 == 1) {
            i11 = k71Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        k71.a(k71Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        k71Var.d0.j(i10, true);
        k71Var.h0.J1 = true;
        k71Var.v(null, true, true);
        b61 b61Var = k71Var.f0;
        if (b61Var != null && (y61Var = b61Var.n) != null) {
            y61Var.G1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.sw
    public final void i(org.telegram.ui.Components.ow owVar) {
        ValueAnimator valueAnimator = this.h0.U1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            owVar.setScaleX(0.0f);
            owVar.setScaleY(0.0f);
        }
    }
}
