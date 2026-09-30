package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ap0 extends org.telegram.ui.Components.w51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.w51.setup(new ap0());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        bp0 bp0Var = (bp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) x51Var.G;
        xh.k1 k1Var = bp0Var.h;
        xh.f1 f1Var = bp0Var.e;
        bp0Var.a = savedStarGift.gift.id;
        bp0Var.setPadding(0, 0, 0, 0);
        bp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        bp0Var.b = (TL_stars.starGiftAttributeBackdrop) yh.t5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        bp0Var.c = (TL_stars.starGiftAttributePattern) yh.t5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        f1Var.d(bp0Var.b);
        f1Var.e(bp0Var.c);
        if (k1Var != null) {
            k1Var.setBackdrop(bp0Var.b);
            String h = org.telegram.messenger.f0.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            k1Var.b = h;
            k1Var.a.e(9, h, false);
        }
        bp0Var.b(x51Var.e, false);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new bp0(context, d6Var, true);
    }
}
