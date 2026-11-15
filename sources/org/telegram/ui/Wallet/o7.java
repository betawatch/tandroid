package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class o7 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new o7());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        p7 p7Var = (p7) view;
        c8 c8Var = p7Var.y0;
        if (c8Var != null) {
            c8Var.h.remove(p7Var);
        }
        ValueAnimator valueAnimator = p7Var.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        p7Var.z0 = 1.0f;
        p7Var.E.setAlpha(1.0f);
        p7Var.x0 = (TL_wallet.nftItem) b41Var.G;
        p7Var.y0 = (c8) b41Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = p7Var.x0.gift;
        p7Var.k(false, true, 0.0f);
        p7Var.i(savedStarGift, true, false);
        c8 c8Var2 = p7Var.y0;
        if (c8Var2 != null) {
            c8Var2.i(p7Var);
        }
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        p7 p7Var = new p7(i7, context, e6Var);
        p7Var.z0 = 1.0f;
        p7Var.setStateListAnimator(null);
        p7Var.setWillNotDraw(false);
        return p7Var;
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean e(b41 b41Var, b41 b41Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) b41Var.G).address, ((TL_wallet.nftItem) b41Var2.G).address);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean f() {
        return true;
    }
}
