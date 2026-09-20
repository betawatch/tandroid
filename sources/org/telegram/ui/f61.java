package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class f61 extends org.telegram.ui.Components.dw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ j71 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(j71 j71Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, int i10, rx0 rx0Var, int i11, int i12) {
        super(context, f6Var, z10, z11, false, true, i10, rx0Var, i11, false);
        this.h0 = j71Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.dw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.dw
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
            org.telegram.ui.Components.dw dwVar = j71Var.c0[j71Var.Q ? 1 : 0];
            j71Var.d0 = dwVar;
            dwVar.setVisibility(0);
            j71Var.d0.x.setDrawable(getContext().getDrawable(j71Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            j71Var.d0.x.setContentDescription(LocaleController.getString(j71Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            j71Var.B(true, false, false);
            j71Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.zv zvVar = this.E;
        int i13 = ((zvVar == null || !this.b0) ? 0 : 1) + 1;
        if (zvVar != null && this.b0 && i10 == 1) {
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
            x61Var.G1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.dw
    public final void i(org.telegram.ui.Components.zv zvVar) {
        ValueAnimator valueAnimator = this.h0.U1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            zvVar.setScaleX(0.0f);
            zvVar.setScaleY(0.0f);
        }
    }
}
