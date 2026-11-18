package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class d8 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new d8());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
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
        e8Var.x0 = (TL_wallet.nftItem) l41Var.H;
        e8Var.y0 = (r8) l41Var.I;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = e8Var.x0.gift;
        e8Var.k(false, true, 0.0f);
        e8Var.i(savedStarGift, true, false);
        r8 r8Var2 = e8Var.y0;
        if (r8Var2 != null) {
            r8Var2.i(e8Var);
        }
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        e8 e8Var = new e8(i7, context, i6Var);
        e8Var.z0 = 1.0f;
        e8Var.setStateListAnimator(null);
        e8Var.setWillNotDraw(false);
        return e8Var;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean e(l41 l41Var, l41 l41Var2) {
        return TextUtils.equals(((TL_wallet.nftItem) l41Var.H).address, ((TL_wallet.nftItem) l41Var2.H).address);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean f() {
        return true;
    }
}
