package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class pl0 extends org.telegram.ui.Components.w31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.w31.h(new pl0());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.q41 q41Var) {
        ql0 ql0Var = (ql0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) x31Var.G;
        zh.z0 z0Var = ql0Var.h;
        zh.v0 v0Var = ql0Var.e;
        ql0Var.a = savedStarGift.gift.id;
        ql0Var.setPadding(0, 0, 0, 0);
        ql0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ql0Var.b = (TL_stars.starGiftAttributeBackdrop) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ql0Var.c = (TL_stars.starGiftAttributePattern) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        v0Var.d(ql0Var.b);
        v0Var.e(ql0Var.c);
        if (z0Var != null) {
            z0Var.setBackdrop(ql0Var.b);
            String m10 = jg.g.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            z0Var.b = m10;
            z0Var.a.f(9, m10, false);
        }
        ql0Var.b(x31Var.e, false);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new ql0(context, f6Var, true);
    }
}
