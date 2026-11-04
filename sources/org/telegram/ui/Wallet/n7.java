package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n7 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new n7());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        o7 o7Var = (o7) view;
        b8 b8Var = o7Var.y0;
        if (b8Var != null) {
            b8Var.h.remove(o7Var);
        }
        ValueAnimator valueAnimator = o7Var.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        o7Var.z0 = 1.0f;
        o7Var.E.setAlpha(1.0f);
        o7Var.x0 = (TL_wallet.nftItem) r31Var.G;
        o7Var.y0 = (b8) r31Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = o7Var.x0.gift;
        o7Var.k(false, true, 0.0f);
        o7Var.i(savedStarGift, true, false);
        b8 b8Var2 = o7Var.y0;
        if (b8Var2 != null) {
            b8Var2.i(o7Var);
        }
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        o7 o7Var = new o7(i3, context, e6Var);
        o7Var.z0 = 1.0f;
        o7Var.setStateListAnimator(null);
        o7Var.setWillNotDraw(false);
        return o7Var;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) r31Var.G).address, ((TL_wallet.nftItem) r31Var2.G).address);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return true;
    }
}
