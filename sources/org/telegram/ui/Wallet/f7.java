package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class f7 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new f7());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        g7 g7Var = (g7) view;
        t7 t7Var = g7Var.p0;
        if (t7Var != null) {
            t7Var.h.remove(g7Var);
        }
        ValueAnimator valueAnimator = g7Var.s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        g7Var.q0 = 1.0f;
        g7Var.y.setAlpha(1.0f);
        g7Var.o0 = (TL_wallet.nftItem) h61Var.G;
        g7Var.p0 = (t7) h61Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = g7Var.o0.gift;
        g7Var.j(false, true, 0.0f);
        g7Var.h(savedStarGift, true, false);
        t7 t7Var2 = g7Var.p0;
        if (t7Var2 != null) {
            t7Var2.i(g7Var);
        }
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        g7 g7Var = new g7(context, i10, d6Var);
        g7Var.q0 = 1.0f;
        g7Var.setStateListAnimator(null);
        g7Var.setWillNotDraw(false);
        return g7Var;
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) h61Var.G).address, ((TL_wallet.nftItem) h61Var2.G).address);
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean isClickable() {
        return true;
    }
}
