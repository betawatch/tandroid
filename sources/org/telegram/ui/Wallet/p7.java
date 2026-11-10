package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class p7 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new p7());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        q7 q7Var = (q7) view;
        d8 d8Var = q7Var.x0;
        if (d8Var != null) {
            d8Var.h.remove(q7Var);
        }
        ValueAnimator valueAnimator = q7Var.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        q7Var.y0 = 1.0f;
        q7Var.D.setAlpha(1.0f);
        q7Var.w0 = (TL_wallet.nftItem) x31Var.G;
        q7Var.x0 = (d8) x31Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = q7Var.w0.gift;
        q7Var.k(false, true, 0.0f);
        q7Var.i(savedStarGift, true, false);
        d8 d8Var2 = q7Var.x0;
        if (d8Var2 != null) {
            d8Var2.i(q7Var);
        }
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        q7 q7Var = new q7(i7, context, h6Var);
        q7Var.y0 = 1.0f;
        q7Var.setStateListAnimator(null);
        q7Var.setWillNotDraw(false);
        return q7Var;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(x31 x31Var, x31 x31Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) x31Var.G).address, ((TL_wallet.nftItem) x31Var2.G).address);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean f() {
        return true;
    }
}
