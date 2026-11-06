package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class o7 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new o7());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        p7 p7Var = (p7) view;
        c8 c8Var = p7Var.x0;
        if (c8Var != null) {
            c8Var.h.remove(p7Var);
        }
        ValueAnimator valueAnimator = p7Var.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        p7Var.y0 = 1.0f;
        p7Var.D.setAlpha(1.0f);
        p7Var.w0 = (TL_wallet.nftItem) x31Var.G;
        p7Var.x0 = (c8) x31Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = p7Var.w0.gift;
        p7Var.k(false, true, 0.0f);
        p7Var.i(savedStarGift, true, false);
        c8 c8Var2 = p7Var.x0;
        if (c8Var2 != null) {
            c8Var2.i(p7Var);
        }
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        p7 p7Var = new p7(i7, context, f6Var);
        p7Var.y0 = 1.0f;
        p7Var.setStateListAnimator(null);
        p7Var.setWillNotDraw(false);
        return p7Var;
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
