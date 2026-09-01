package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n51 extends org.telegram.ui.Components.zv {
    public final /* synthetic */ int d0;
    public final /* synthetic */ r61 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n51(r61 r61Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10, int i10, w01 w01Var, int i11, int i12) {
        super(context, g6Var, z4, z10, false, true, i10, w01Var, i11, false);
        this.e0 = r61Var;
        this.d0 = i12;
    }

    @Override // org.telegram.ui.Components.zv
    public final ColorFilter getEmojiColorFilter() {
        return this.e0.h1;
    }

    @Override // org.telegram.ui.Components.zv
    public final boolean h(int i10) {
        int i11;
        f61 f61Var;
        r61 r61Var = this.e0;
        SparseIntArray sparseIntArray = r61Var.u0;
        if (r61Var.t1) {
            return false;
        }
        int i12 = this.d0;
        if (i12 == 4 && i10 == 0) {
            r61Var.N = !r61Var.N;
            r61Var.a0.setVisibility(8);
            org.telegram.ui.Components.zv zvVar = r61Var.W[r61Var.N ? 1 : 0];
            r61Var.a0 = zvVar;
            zvVar.setVisibility(0);
            r61Var.a0.x.setDrawable(getContext().getDrawable(r61Var.N ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            r61Var.a0.x.setContentDescription(LocaleController.getString(r61Var.N ? R.string.AccDescrStickers : R.string.Emoji));
            r61Var.B(true, false, false);
            r61Var.o0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.vv vvVar = this.B;
        int i13 = ((vvVar == null || !this.V) ? 0 : 1) + 1;
        if (vvVar != null && this.V && i10 == 1) {
            i11 = r61Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        r61.a(r61Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        r61Var.a0.j(i10, true);
        r61Var.e0.I1 = true;
        r61Var.v(null, true, true);
        i51 i51Var = r61Var.c0;
        if (i51Var != null && (f61Var = i51Var.n) != null) {
            f61Var.F1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.zv
    public final void i(org.telegram.ui.Components.vv vvVar) {
        ValueAnimator valueAnimator = this.e0.R1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            vvVar.setScaleX(0.0f);
            vvVar.setScaleY(0.0f);
        }
    }
}
