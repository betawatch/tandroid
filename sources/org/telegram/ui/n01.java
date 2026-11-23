package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n01 extends org.telegram.ui.Components.lv {
    public final /* synthetic */ int h0;
    public final /* synthetic */ q11 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n01(q11 q11Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11, int i7, iy0 iy0Var, int i10, int i11) {
        super(context, i6Var, z10, z11, false, true, i7, iy0Var, i10, false);
        this.i0 = q11Var;
        this.h0 = i11;
    }

    @Override // org.telegram.ui.Components.lv
    public final ColorFilter getEmojiColorFilter() {
        return this.i0.l1;
    }

    @Override // org.telegram.ui.Components.lv
    public final boolean h(int i7) {
        int i10;
        f11 f11Var;
        q11 q11Var = this.i0;
        SparseIntArray sparseIntArray = q11Var.y0;
        if (q11Var.y1) {
            return false;
        }
        int i11 = this.h0;
        if (i11 == 4 && i7 == 0) {
            q11Var.R = !q11Var.R;
            q11Var.e0.setVisibility(8);
            org.telegram.ui.Components.lv lvVar = q11Var.d0[q11Var.R ? 1 : 0];
            q11Var.e0 = lvVar;
            lvVar.setVisibility(0);
            q11Var.e0.y.setDrawable(getContext().getDrawable(q11Var.R ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            q11Var.e0.y.setContentDescription(org.telegram.messenger.gd.N0(q11Var.R ? 2131754755 : 2131751184, null));
            q11Var.B(true, false, false);
            q11Var.s0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.hv hvVar = this.F;
        int i12 = ((hvVar == null || !this.c0) ? 0 : 1) + 1;
        if (hvVar != null && this.c0 && i7 == 1) {
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
        q11Var.e0.j(i7, true);
        q11Var.i0.K1 = true;
        q11Var.v(null, true, true);
        i01 i01Var = q11Var.g0;
        if (i01Var != null && (f11Var = i01Var.n) != null) {
            f11Var.I1(null);
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
