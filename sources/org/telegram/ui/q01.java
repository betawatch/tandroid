package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q01 extends org.telegram.ui.Components.av {
    public final /* synthetic */ int g0;
    public final /* synthetic */ t11 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q01(t11 t11Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10, int i7, rw0 rw0Var, int i10, int i11) {
        super(context, h6Var, z9, z10, false, true, i7, rw0Var, i10, false);
        this.h0 = t11Var;
        this.g0 = i11;
    }

    @Override // org.telegram.ui.Components.av
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.av
    public final boolean h(int i7) {
        int i10;
        i11 i11Var;
        t11 t11Var = this.h0;
        SparseIntArray sparseIntArray = t11Var.x0;
        if (t11Var.x1) {
            return false;
        }
        int i11 = this.g0;
        if (i11 == 4 && i7 == 0) {
            t11Var.Q = !t11Var.Q;
            t11Var.d0.setVisibility(8);
            org.telegram.ui.Components.av avVar = t11Var.c0[t11Var.Q ? 1 : 0];
            t11Var.d0 = avVar;
            avVar.setVisibility(0);
            t11Var.d0.y.setDrawable(getContext().getDrawable(t11Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            t11Var.d0.y.setContentDescription(org.telegram.messenger.id.M0(t11Var.Q ? 2131754756 : 2131751196, null));
            t11Var.B(true, false, false);
            t11Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.wu wuVar = this.E;
        int i12 = ((wuVar == null || !this.b0) ? 0 : 1) + 1;
        if (wuVar != null && this.b0 && i7 == 1) {
            i10 = t11Var.n;
        } else {
            if ((i11 != 4 || i7 != 0) && i7 > 0) {
                int i13 = i7 - i12;
                if (sparseIntArray.indexOfKey(i13) >= 0) {
                    i10 = sparseIntArray.get(i13);
                }
            }
            i10 = 0;
        }
        t11.a(t11Var, i10, org.telegram.messenger.g0.L((i11 == 6 ? 7 : 0) - 2));
        t11Var.d0.j(i7, true);
        t11Var.h0.J1 = true;
        t11Var.v(null, true, true);
        l01 l01Var = t11Var.f0;
        if (l01Var != null && (i11Var = l01Var.n) != null) {
            i11Var.I1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.av
    public final void i(org.telegram.ui.Components.wu wuVar) {
        ValueAnimator valueAnimator = this.h0.V1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            wuVar.setScaleX(0.0f);
            wuVar.setScaleY(0.0f);
        }
    }
}
