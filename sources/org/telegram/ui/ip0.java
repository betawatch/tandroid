package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ip0 extends org.telegram.ui.Components.g51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new ip0());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        jp0 jp0Var = (jp0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) h51Var.G;
        yh.i1 i1Var = jp0Var.h;
        yh.e1 e1Var = jp0Var.e;
        jp0Var.a = savedStarGift.gift.id;
        jp0Var.setPadding(0, 0, 0, 0);
        jp0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        jp0Var.b = (TL_stars.starGiftAttributeBackdrop) zh.s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        jp0Var.c = (TL_stars.starGiftAttributePattern) zh.s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e1Var.d(jp0Var.b);
        e1Var.e(jp0Var.c);
        if (i1Var != null) {
            i1Var.setBackdrop(jp0Var.b);
            String k10 = i2.g.k(savedStarGift.gift.num, ',', new StringBuilder("#"));
            i1Var.b = k10;
            i1Var.a.e(9, k10, false);
        }
        jp0Var.b(h51Var.e, false);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new jp0(context, f6Var, true);
    }
}
