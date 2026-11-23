package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class d8 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new d8());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        e8 e8Var = (e8) view;
        r8 r8Var = e8Var.y0;
        if (r8Var != null) {
            r8Var.h.remove(e8Var);
        }
        ValueAnimator valueAnimator = e8Var.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        e8Var.z0 = 1.0f;
        e8Var.E.setAlpha(1.0f);
        e8Var.x0 = (TL_wallet.nftItem) o41Var.H;
        e8Var.y0 = (r8) o41Var.I;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = e8Var.x0.gift;
        e8Var.k(false, true, 0.0f);
        e8Var.i(savedStarGift, true, false);
        r8 r8Var2 = e8Var.y0;
        if (r8Var2 != null) {
            r8Var2.i(e8Var);
        }
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        e8 e8Var = new e8(i7, context, h6Var);
        e8Var.z0 = 1.0f;
        e8Var.setStateListAnimator(null);
        e8Var.setWillNotDraw(false);
        return e8Var;
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(o41 o41Var, o41 o41Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) o41Var.H).address, ((TL_wallet.nftItem) o41Var2.H).address);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean f() {
        return true;
    }
}
