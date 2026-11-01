package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class t7 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new t7());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        u7 u7Var = (u7) view;
        h8 h8Var = u7Var.x0;
        if (h8Var != null) {
            h8Var.h.remove(u7Var);
        }
        ValueAnimator valueAnimator = u7Var.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        u7Var.y0 = 1.0f;
        u7Var.D.setAlpha(1.0f);
        u7Var.w0 = (TL_wallet.nftItem) b51Var.G;
        u7Var.x0 = (h8) b51Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = u7Var.w0.gift;
        u7Var.k(false, true, 0.0f);
        u7Var.i(savedStarGift, true, false);
        h8 h8Var2 = u7Var.x0;
        if (h8Var2 != null) {
            h8Var2.i(u7Var);
        }
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        u7 u7Var = new u7(i10, context, p6Var);
        u7Var.y0 = 1.0f;
        u7Var.setStateListAnimator(null);
        u7Var.setWillNotDraw(false);
        return u7Var;
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean e(b51 b51Var, b51 b51Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) b51Var.G).address, ((TL_wallet.nftItem) b51Var2.G).address);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean f() {
        return true;
    }
}
