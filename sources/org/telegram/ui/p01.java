package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class p01 extends org.telegram.ui.Components.bv {
    public final /* synthetic */ int g0;
    public final /* synthetic */ s11 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(s11 s11Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9, boolean z10, int i7, ax0 ax0Var, int i10, int i11) {
        super(context, g6Var, z9, z10, false, true, i7, ax0Var, i10, false);
        this.h0 = s11Var;
        this.g0 = i11;
    }

    @Override // org.telegram.ui.Components.bv
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.bv
    public final boolean h(int i7) {
        int i10;
        h11 h11Var;
        s11 s11Var = this.h0;
        SparseIntArray sparseIntArray = s11Var.x0;
        if (s11Var.x1) {
            return false;
        }
        int i11 = this.g0;
        if (i11 == 4 && i7 == 0) {
            s11Var.Q = !s11Var.Q;
            s11Var.d0.setVisibility(8);
            org.telegram.ui.Components.bv bvVar = s11Var.c0[s11Var.Q ? 1 : 0];
            s11Var.d0 = bvVar;
            bvVar.setVisibility(0);
            s11Var.d0.y.setDrawable(getContext().getDrawable(s11Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            s11Var.d0.y.setContentDescription(org.telegram.messenger.id.M0(s11Var.Q ? 2131754756 : 2131751196, null));
            s11Var.B(true, false, false);
            s11Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.xu xuVar = this.E;
        int i12 = ((xuVar == null || !this.b0) ? 0 : 1) + 1;
        if (xuVar != null && this.b0 && i7 == 1) {
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
        s11Var.d0.j(i7, true);
        s11Var.h0.J1 = true;
        s11Var.v(null, true, true);
        k01 k01Var = s11Var.f0;
        if (k01Var != null && (h11Var = k01Var.n) != null) {
            h11Var.I1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.bv
    public final void i(org.telegram.ui.Components.xu xuVar) {
        ValueAnimator valueAnimator = this.h0.V1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            xuVar.setScaleX(0.0f);
            xuVar.setScaleY(0.0f);
        }
    }
}
