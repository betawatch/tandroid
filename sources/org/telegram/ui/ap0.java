package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ap0 extends org.telegram.ui.Components.u51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.u51.setup(new ap0());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        bp0 bp0Var = (bp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) v51Var.G;
        xh.k1 k1Var = bp0Var.h;
        xh.f1 f1Var = bp0Var.e;
        bp0Var.a = savedStarGift.gift.id;
        bp0Var.setPadding(0, 0, 0, 0);
        bp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        bp0Var.b = (TL_stars.starGiftAttributeBackdrop) yh.s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        bp0Var.c = (TL_stars.starGiftAttributePattern) yh.s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        f1Var.d(bp0Var.b);
        f1Var.e(bp0Var.c);
        if (k1Var != null) {
            k1Var.setBackdrop(bp0Var.b);
            String h = org.telegram.messenger.f0.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            k1Var.b = h;
            k1Var.a.e(9, h, false);
        }
        bp0Var.b(v51Var.e, false);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, org.telegram.ui.Components.wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new bp0(context, d6Var, true);
    }
}
