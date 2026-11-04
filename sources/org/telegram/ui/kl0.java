package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kl0 extends org.telegram.ui.Components.q31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.q31.h(new kl0());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        ll0 ll0Var = (ll0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) r31Var.G;
        ai.r2 r2Var = ll0Var.h;
        ai.m2 m2Var = ll0Var.e;
        ll0Var.a = savedStarGift.gift.id;
        ll0Var.setPadding(0, 0, 0, 0);
        ll0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ll0Var.b = (TL_stars.starGiftAttributeBackdrop) ci.e9.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ll0Var.c = (TL_stars.starGiftAttributePattern) ci.e9.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        m2Var.d(ll0Var.b);
        m2Var.e(ll0Var.c);
        if (r2Var != null) {
            r2Var.setBackdrop(ll0Var.b);
            String l10 = k2.p1.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            r2Var.b = l10;
            r2Var.a.f(9, l10, false);
        }
        ll0Var.b(r31Var.e, false);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ll0(context, e6Var, true);
    }
}
