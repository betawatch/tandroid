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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class n7 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new n7());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        o7 o7Var = (o7) view;
        b8 b8Var = o7Var.x0;
        if (b8Var != null) {
            b8Var.h.remove(o7Var);
        }
        ValueAnimator valueAnimator = o7Var.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        o7Var.y0 = 1.0f;
        o7Var.D.setAlpha(1.0f);
        o7Var.w0 = (TL_wallet.nftItem) x31Var.G;
        o7Var.x0 = (b8) x31Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = o7Var.w0.gift;
        o7Var.k(false, true, 0.0f);
        o7Var.i(savedStarGift, true, false);
        b8 b8Var2 = o7Var.x0;
        if (b8Var2 != null) {
            b8Var2.i(o7Var);
        }
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        o7 o7Var = new o7(i7, context, f6Var);
        o7Var.y0 = 1.0f;
        o7Var.setStateListAnimator(null);
        o7Var.setWillNotDraw(false);
        return o7Var;
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
