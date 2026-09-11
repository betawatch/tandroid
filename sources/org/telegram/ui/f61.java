package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class f61 extends org.telegram.ui.Components.bw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ j71 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(j71 j71Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, int i10, rx0 rx0Var, int i11, int i12) {
        super(context, f6Var, z10, z11, false, true, i10, rx0Var, i11, false);
        this.h0 = j71Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.bw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.bw
    public final boolean h(int i10) {
        int i11;
        x61 x61Var;
        j71 j71Var = this.h0;
        SparseIntArray sparseIntArray = j71Var.x0;
        if (j71Var.w1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            j71Var.Q = !j71Var.Q;
            j71Var.d0.setVisibility(8);
            org.telegram.ui.Components.bw bwVar = j71Var.c0[j71Var.Q ? 1 : 0];
            j71Var.d0 = bwVar;
            bwVar.setVisibility(0);
            j71Var.d0.x.setDrawable(getContext().getDrawable(j71Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            j71Var.d0.x.setContentDescription(LocaleController.getString(j71Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            j71Var.B(true, false, false);
            j71Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.xv xvVar = this.E;
        int i13 = ((xvVar == null || !this.b0) ? 0 : 1) + 1;
        if (xvVar != null && this.b0 && i10 == 1) {
            i11 = j71Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        j71.a(j71Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        j71Var.d0.j(i10, true);
        j71Var.h0.L1 = true;
        j71Var.v(null, true, true);
        a61 a61Var = j71Var.f0;
        if (a61Var != null && (x61Var = a61Var.n) != null) {
            x61Var.E1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.bw
    public final void i(org.telegram.ui.Components.xv xvVar) {
        ValueAnimator valueAnimator = this.h0.U1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            xvVar.setScaleX(0.0f);
            xvVar.setScaleY(0.0f);
        }
    }
}
