package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class m7 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new m7());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        n7 n7Var = (n7) view;
        a8 a8Var = n7Var.x0;
        if (a8Var != null) {
            a8Var.h.remove(n7Var);
        }
        ValueAnimator valueAnimator = n7Var.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        n7Var.y0 = 1.0f;
        n7Var.D.setAlpha(1.0f);
        n7Var.w0 = (TL_wallet.nftItem) y31Var.G;
        n7Var.x0 = (a8) y31Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = n7Var.w0.gift;
        n7Var.k(false, true, 0.0f);
        n7Var.i(savedStarGift, true, false);
        a8 a8Var2 = n7Var.x0;
        if (a8Var2 != null) {
            a8Var2.i(n7Var);
        }
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        n7 n7Var = new n7(i7, context, g6Var);
        n7Var.y0 = 1.0f;
        n7Var.setStateListAnimator(null);
        n7Var.setWillNotDraw(false);
        return n7Var;
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean e(y31 y31Var, y31 y31Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) y31Var.G).address, ((TL_wallet.nftItem) y31Var2.G).address);
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean f() {
        return true;
    }
}
