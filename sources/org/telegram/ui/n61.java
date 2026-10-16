package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class n61 extends org.telegram.ui.Components.ow {
    public final /* synthetic */ int g0;
    public final /* synthetic */ r71 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(r71 r71Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, int i10, i11 i11Var, int i11, int i12) {
        super(context, c6Var, z10, z11, false, true, i10, i11Var, i11, false);
        this.h0 = r71Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.ow
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.ow
    public final boolean h(int i10) {
        int i11;
        f71 f71Var;
        r71 r71Var = this.h0;
        SparseIntArray sparseIntArray = r71Var.x0;
        if (r71Var.w1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            r71Var.Q = !r71Var.Q;
            r71Var.d0.setVisibility(8);
            org.telegram.ui.Components.ow owVar = r71Var.c0[r71Var.Q ? 1 : 0];
            r71Var.d0 = owVar;
            owVar.setVisibility(0);
            r71Var.d0.x.setDrawable(getContext().getDrawable(r71Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            r71Var.d0.x.setContentDescription(LocaleController.getString(r71Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            r71Var.B(true, false, false);
            r71Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.kw kwVar = this.E;
        int i13 = ((kwVar == null || !this.b0) ? 0 : 1) + 1;
        if (kwVar != null && this.b0 && i10 == 1) {
            i11 = r71Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        r71.a(r71Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        r71Var.d0.j(i10, true);
        r71Var.h0.J1 = true;
        r71Var.v(null, true, true);
        i61 i61Var = r71Var.f0;
        if (i61Var != null && (f71Var = i61Var.n) != null) {
            f71Var.G1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ow
    public final void i(org.telegram.ui.Components.kw kwVar) {
        ValueAnimator valueAnimator = this.h0.U1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            kwVar.setScaleX(0.0f);
            kwVar.setScaleY(0.0f);
        }
    }
}
