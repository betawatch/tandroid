package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class p01 extends org.telegram.ui.Components.ov {
    public final /* synthetic */ int h0;
    public final /* synthetic */ s11 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(s11 s11Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11, int i7, mz0 mz0Var, int i10, int i11) {
        super(context, h6Var, z10, z11, false, true, i7, mz0Var, i10, false);
        this.i0 = s11Var;
        this.h0 = i11;
    }

    @Override // org.telegram.ui.Components.ov
    public final ColorFilter getEmojiColorFilter() {
        return this.i0.l1;
    }

    @Override // org.telegram.ui.Components.ov
    public final boolean h(int i7) {
        int i10;
        h11 h11Var;
        s11 s11Var = this.i0;
        SparseIntArray sparseIntArray = s11Var.y0;
        if (s11Var.y1) {
            return false;
        }
        int i11 = this.h0;
        if (i11 == 4 && i7 == 0) {
            s11Var.R = !s11Var.R;
            s11Var.e0.setVisibility(8);
            org.telegram.ui.Components.ov ovVar = s11Var.d0[s11Var.R ? 1 : 0];
            s11Var.e0 = ovVar;
            ovVar.setVisibility(0);
            s11Var.e0.y.setDrawable(getContext().getDrawable(s11Var.R ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            s11Var.e0.y.setContentDescription(org.telegram.messenger.hd.N0(s11Var.R ? 2131754755 : 2131751184, null));
            s11Var.B(true, false, false);
            s11Var.s0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.kv kvVar = this.F;
        int i12 = ((kvVar == null || !this.c0) ? 0 : 1) + 1;
        if (kvVar != null && this.c0 && i7 == 1) {
            i10 = s11Var.n;
        } else {
            if ((i11 != 4 || i7 != 0) && i7 > 0) {
                int i13 = i7 - i12;
                if (sparseIntArray.indexOfKey(i13) >= 0) {
                    i10 = sparseIntArray.get(i13);
                }
            }
            i10 = 0;
        }
        s11.a(s11Var, i10, org.telegram.messenger.g0.L((i11 == 6 ? 7 : 0) - 2));
        s11Var.e0.j(i7, true);
        s11Var.i0.K1 = true;
        s11Var.v(null, true, true);
        k01 k01Var = s11Var.g0;
        if (k01Var != null && (h11Var = k01Var.n) != null) {
            h11Var.I1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ov
    public final void i(org.telegram.ui.Components.kv kvVar) {
        ValueAnimator valueAnimator = this.i0.W1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            kvVar.setScaleX(0.0f);
            kvVar.setScaleY(0.0f);
        }
    }
}
