package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jo0 extends org.telegram.ui.Components.k41 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.k41.setup(new jo0());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        ko0 ko0Var = (ko0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) l41Var.G;
        fh.g2 g2Var = ko0Var.h;
        fh.b2 b2Var = ko0Var.e;
        ko0Var.a = savedStarGift.gift.id;
        ko0Var.setPadding(0, 0, 0, 0);
        ko0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ko0Var.b = (TL_stars.starGiftAttributeBackdrop) gh.v7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ko0Var.c = (TL_stars.starGiftAttributePattern) gh.v7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        b2Var.d(ko0Var.b);
        b2Var.e(ko0Var.c);
        if (g2Var != null) {
            g2Var.setBackdrop(ko0Var.b);
            String n10 = j3.r0.n(savedStarGift.gift.num, ',', new StringBuilder("#"));
            g2Var.b = n10;
            g2Var.a.e(9, n10, false);
        }
        ko0Var.b(l41Var.e, false);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new ko0(context, b6Var, true);
    }
}
