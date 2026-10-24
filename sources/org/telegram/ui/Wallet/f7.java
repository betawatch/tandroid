package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class f7 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new f7());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        g7 g7Var = (g7) view;
        t7 t7Var = g7Var.x0;
        if (t7Var != null) {
            t7Var.h.remove(g7Var);
        }
        ValueAnimator valueAnimator = g7Var.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        g7Var.y0 = 1.0f;
        g7Var.y.setAlpha(1.0f);
        g7Var.w0 = (TL_wallet.nftItem) m61Var.G;
        g7Var.x0 = (t7) m61Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = g7Var.w0.gift;
        g7Var.k(false, true, 0.0f);
        g7Var.i(savedStarGift, true, false);
        t7 t7Var2 = g7Var.x0;
        if (t7Var2 != null) {
            t7Var2.i(g7Var);
        }
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        g7 g7Var = new g7(context, i10, g6Var);
        g7Var.y0 = 1.0f;
        g7Var.setStateListAnimator(null);
        g7Var.setWillNotDraw(false);
        return g7Var;
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) m61Var.G).address, ((TL_wallet.nftItem) m61Var2.G).address);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isClickable() {
        return true;
    }
}
