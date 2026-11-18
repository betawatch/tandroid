package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class o01 extends org.telegram.ui.Components.lv {
    public final /* synthetic */ int h0;
    public final /* synthetic */ r11 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o01(r11 r11Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11, int i7, tr0 tr0Var, int i10, int i11) {
        super(context, i6Var, z10, z11, false, true, i7, tr0Var, i10, false);
        this.i0 = r11Var;
        this.h0 = i11;
    }

    @Override // org.telegram.ui.Components.lv
    public final ColorFilter getEmojiColorFilter() {
        return this.i0.l1;
    }

    @Override // org.telegram.ui.Components.lv
    public final boolean h(int i7) {
        int i10;
        g11 g11Var;
        r11 r11Var = this.i0;
        SparseIntArray sparseIntArray = r11Var.y0;
        if (r11Var.y1) {
            return false;
        }
        int i11 = this.h0;
        if (i11 == 4 && i7 == 0) {
            r11Var.R = !r11Var.R;
            r11Var.e0.setVisibility(8);
            org.telegram.ui.Components.lv lvVar = r11Var.d0[r11Var.R ? 1 : 0];
            r11Var.e0 = lvVar;
            lvVar.setVisibility(0);
            r11Var.e0.y.setDrawable(getContext().getDrawable(r11Var.R ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            r11Var.e0.y.setContentDescription(org.telegram.messenger.gd.M0(r11Var.R ? 2131754756 : 2131751185, null));
            r11Var.B(true, false, false);
            r11Var.s0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.hv hvVar = this.F;
        int i12 = ((hvVar == null || !this.c0) ? 0 : 1) + 1;
        if (hvVar != null && this.c0 && i7 == 1) {
            i10 = r11Var.n;
        } else {
            if ((i11 != 4 || i7 != 0) && i7 > 0) {
                int i13 = i7 - i12;
                if (sparseIntArray.indexOfKey(i13) >= 0) {
                    i10 = sparseIntArray.get(i13);
                }
            }
            i10 = 0;
        }
        r11.a(r11Var, i10, org.telegram.messenger.g0.L((i11 == 6 ? 7 : 0) - 2));
        r11Var.e0.j(i7, true);
        r11Var.i0.K1 = true;
        r11Var.v(null, true, true);
        j01 j01Var = r11Var.g0;
        if (j01Var != null && (g11Var = j01Var.n) != null) {
            g11Var.I1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.lv
    public final void i(org.telegram.ui.Components.hv hvVar) {
        ValueAnimator valueAnimator = this.i0.W1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            hvVar.setScaleX(0.0f);
            hvVar.setScaleY(0.0f);
        }
    }
}
