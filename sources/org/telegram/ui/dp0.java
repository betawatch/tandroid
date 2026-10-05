package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class dp0 extends org.telegram.ui.Components.g61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new dp0());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.w61 w61Var, org.telegram.ui.Components.e71 e71Var) {
        ep0 ep0Var = (ep0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) h61Var.G;
        xh.j1 j1Var = ep0Var.h;
        xh.f1 f1Var = ep0Var.e;
        ep0Var.a = savedStarGift.gift.id;
        ep0Var.setPadding(0, 0, 0, 0);
        ep0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ep0Var.b = (TL_stars.starGiftAttributeBackdrop) yh.u5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ep0Var.c = (TL_stars.starGiftAttributePattern) yh.u5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        f1Var.d(ep0Var.b);
        f1Var.e(ep0Var.c);
        if (j1Var != null) {
            j1Var.setBackdrop(ep0Var.b);
            String h = org.telegram.messenger.q.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            j1Var.b = h;
            j1Var.a.e(9, h, false);
        }
        ep0Var.b(h61Var.e, false);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ep0(context, d6Var, true);
    }
}
