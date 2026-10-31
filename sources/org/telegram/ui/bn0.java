package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bn0 extends org.telegram.ui.Components.z41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.z41.h(new bn0());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        cn0 cn0Var = (cn0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) a51Var.G;
        ph.d1 d1Var = cn0Var.h;
        ph.z0 z0Var = cn0Var.e;
        cn0Var.a = savedStarGift.gift.id;
        cn0Var.setPadding(0, 0, 0, 0);
        cn0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        cn0Var.b = (TL_stars.starGiftAttributeBackdrop) rh.e6.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        cn0Var.c = (TL_stars.starGiftAttributePattern) rh.e6.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        z0Var.d(cn0Var.b);
        z0Var.e(cn0Var.c);
        if (d1Var != null) {
            d1Var.setBackdrop(cn0Var.b);
            String k10 = i0.a.k(savedStarGift.gift.num, ',', new StringBuilder("#"));
            d1Var.b = k10;
            d1Var.a.f(9, k10, false);
        }
        cn0Var.b(a51Var.e, false);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new cn0(context, p6Var, true);
    }
}
