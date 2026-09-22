package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class hp0 extends org.telegram.ui.Components.h51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new hp0());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        ip0 ip0Var = (ip0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) i51Var.G;
        xh.j1 j1Var = ip0Var.h;
        xh.e1 e1Var = ip0Var.e;
        ip0Var.a = savedStarGift.gift.id;
        ip0Var.setPadding(0, 0, 0, 0);
        ip0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ip0Var.b = (TL_stars.starGiftAttributeBackdrop) yh.u5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ip0Var.c = (TL_stars.starGiftAttributePattern) yh.u5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e1Var.d(ip0Var.b);
        e1Var.e(ip0Var.c);
        if (j1Var != null) {
            j1Var.setBackdrop(ip0Var.b);
            String k10 = hg.c.k(savedStarGift.gift.num, ',', new StringBuilder("#"));
            j1Var.b = k10;
            j1Var.a.e(9, k10, false);
        }
        ip0Var.b(i51Var.e, false);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ip0(context, e6Var, true);
    }
}
