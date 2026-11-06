package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class n01 extends org.telegram.ui.Components.av {
    public final /* synthetic */ int g0;
    public final /* synthetic */ q11 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n01(q11 q11Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10, int i7, by0 by0Var, int i10, int i11) {
        super(context, f6Var, z9, z10, false, true, i7, by0Var, i10, false);
        this.h0 = q11Var;
        this.g0 = i11;
    }

    @Override // org.telegram.ui.Components.av
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.av
    public final boolean h(int i7) {
        int i10;
        f11 f11Var;
        q11 q11Var = this.h0;
        SparseIntArray sparseIntArray = q11Var.x0;
        if (q11Var.x1) {
            return false;
        }
        int i11 = this.g0;
        if (i11 == 4 && i7 == 0) {
            q11Var.Q = !q11Var.Q;
            q11Var.d0.setVisibility(8);
            org.telegram.ui.Components.av avVar = q11Var.c0[q11Var.Q ? 1 : 0];
            q11Var.d0 = avVar;
            avVar.setVisibility(0);
            q11Var.d0.y.setDrawable(getContext().getDrawable(q11Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            q11Var.d0.y.setContentDescription(org.telegram.messenger.hd.M0(q11Var.Q ? 2131754756 : 2131751197, null));
            q11Var.B(true, false, false);
            q11Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.wu wuVar = this.E;
        int i12 = ((wuVar == null || !this.b0) ? 0 : 1) + 1;
        if (wuVar != null && this.b0 && i7 == 1) {
            i10 = q11Var.n;
        } else {
            if ((i11 != 4 || i7 != 0) && i7 > 0) {
                int i13 = i7 - i12;
                if (sparseIntArray.indexOfKey(i13) >= 0) {
                    i10 = sparseIntArray.get(i13);
                }
            }
            i10 = 0;
        }
        q11.a(q11Var, i10, org.telegram.messenger.g0.L((i11 == 6 ? 7 : 0) - 2));
        q11Var.d0.j(i7, true);
        q11Var.h0.J1 = true;
        q11Var.v(null, true, true);
        i01 i01Var = q11Var.f0;
        if (i01Var != null && (f11Var = i01Var.n) != null) {
            f11Var.I1(null);
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
