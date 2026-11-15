package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k01 extends org.telegram.ui.Components.gv {
    public final /* synthetic */ int h0;
    public final /* synthetic */ n11 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k01(n11 n11Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, int i7, fy0 fy0Var, int i10, int i11) {
        super(context, e6Var, z10, z11, false, true, i7, fy0Var, i10, false);
        this.i0 = n11Var;
        this.h0 = i11;
    }

    @Override // org.telegram.ui.Components.gv
    public final ColorFilter getEmojiColorFilter() {
        return this.i0.l1;
    }

    @Override // org.telegram.ui.Components.gv
    public final boolean h(int i7) {
        int i10;
        c11 c11Var;
        n11 n11Var = this.i0;
        SparseIntArray sparseIntArray = n11Var.y0;
        if (n11Var.y1) {
            return false;
        }
        int i11 = this.h0;
        if (i11 == 4 && i7 == 0) {
            n11Var.R = !n11Var.R;
            n11Var.e0.setVisibility(8);
            org.telegram.ui.Components.gv gvVar = n11Var.d0[n11Var.R ? 1 : 0];
            n11Var.e0 = gvVar;
            gvVar.setVisibility(0);
            n11Var.e0.y.setDrawable(getContext().getDrawable(n11Var.R ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            n11Var.e0.y.setContentDescription(org.telegram.messenger.hd.M0(n11Var.R ? 2131754756 : 2131751196, null));
            n11Var.B(true, false, false);
            n11Var.s0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.cv cvVar = this.F;
        int i12 = ((cvVar == null || !this.c0) ? 0 : 1) + 1;
        if (cvVar != null && this.c0 && i7 == 1) {
            i10 = n11Var.n;
        } else {
            if ((i11 != 4 || i7 != 0) && i7 > 0) {
                int i13 = i7 - i12;
                if (sparseIntArray.indexOfKey(i13) >= 0) {
                    i10 = sparseIntArray.get(i13);
                }
            }
            i10 = 0;
        }
        n11.a(n11Var, i10, org.telegram.messenger.g0.L((i11 == 6 ? 7 : 0) - 2));
        n11Var.e0.j(i7, true);
        n11Var.i0.K1 = true;
        n11Var.v(null, true, true);
        f01 f01Var = n11Var.g0;
        if (f01Var != null && (c11Var = f01Var.n) != null) {
            c11Var.I1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.gv
    public final void i(org.telegram.ui.Components.cv cvVar) {
        ValueAnimator valueAnimator = this.i0.W1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            cvVar.setScaleX(0.0f);
            cvVar.setScaleY(0.0f);
        }
    }
}
