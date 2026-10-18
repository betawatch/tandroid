package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class l7 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new l7());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        m7 m7Var = (m7) view;
        z7 z7Var = m7Var.p0;
        if (z7Var != null) {
            z7Var.h.remove(m7Var);
        }
        ValueAnimator valueAnimator = m7Var.s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        m7Var.q0 = 1.0f;
        m7Var.y.setAlpha(1.0f);
        m7Var.o0 = (TL_wallet.nftItem) f61Var.G;
        m7Var.p0 = (z7) f61Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = m7Var.o0.gift;
        m7Var.j(false, true, 0.0f);
        m7Var.h(savedStarGift, true, false);
        z7 z7Var2 = m7Var.p0;
        if (z7Var2 != null) {
            z7Var2.i(m7Var);
        }
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        m7 m7Var = new m7(context, i10, d6Var);
        m7Var.q0 = 1.0f;
        m7Var.setStateListAnimator(null);
        return m7Var;
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) f61Var.G).address, ((TL_wallet.nftItem) f61Var2.G).address);
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean isClickable() {
        return true;
    }
}
