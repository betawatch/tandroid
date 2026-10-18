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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class f7 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new f7());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
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
        g7Var.o0 = (TL_wallet.nftItem) f61Var.G;
        g7Var.p0 = (t7) f61Var.H;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = g7Var.o0.gift;
        g7Var.j(false, true, 0.0f);
        g7Var.h(savedStarGift, true, false);
        t7 t7Var2 = g7Var.p0;
        if (t7Var2 != null) {
            t7Var2.i(g7Var);
        }
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        g7 g7Var = new g7(context, i10, d6Var);
        g7Var.q0 = 1.0f;
        g7Var.setStateListAnimator(null);
        return g7Var;
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
