package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class jp0 extends org.telegram.ui.Components.i51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new jp0());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z10, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.f61 f61Var) {
        kp0 kp0Var = (kp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) j51Var.G;
        xh.j1 j1Var = kp0Var.h;
        xh.e1 e1Var = kp0Var.e;
        kp0Var.a = savedStarGift.gift.id;
        kp0Var.setPadding(0, 0, 0, 0);
        kp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        kp0Var.b = (TL_stars.starGiftAttributeBackdrop) yh.v5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        kp0Var.c = (TL_stars.starGiftAttributePattern) yh.v5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e1Var.d(kp0Var.b);
        e1Var.e(kp0Var.c);
        if (j1Var != null) {
            j1Var.setBackdrop(kp0Var.b);
            String k10 = hg.k0.k(savedStarGift.gift.num, ',', new StringBuilder("#"));
            j1Var.b = k10;
            j1Var.a.e(9, k10, false);
        }
        kp0Var.b(j51Var.e, false);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new kp0(context, f6Var, true);
    }
}
