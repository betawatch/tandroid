package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class jp0 extends org.telegram.ui.Components.w51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.w51.setup(new jp0());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        kp0 kp0Var = (kp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) x51Var.G;
        xh.k1 k1Var = kp0Var.h;
        xh.f1 f1Var = kp0Var.e;
        kp0Var.a = savedStarGift.gift.id;
        kp0Var.setPadding(0, 0, 0, 0);
        kp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        kp0Var.b = (TL_stars.starGiftAttributeBackdrop) yh.t5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        kp0Var.c = (TL_stars.starGiftAttributePattern) yh.t5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        f1Var.d(kp0Var.b);
        f1Var.e(kp0Var.c);
        if (k1Var != null) {
            k1Var.setBackdrop(kp0Var.b);
            String i10 = org.telegram.messenger.q.i(savedStarGift.gift.num, ',', new StringBuilder("#"));
            k1Var.b = i10;
            k1Var.a.e(9, i10, false);
        }
        kp0Var.b(x51Var.e, false);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, org.telegram.ui.Components.wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new kp0(context, e6Var, true);
    }
}
