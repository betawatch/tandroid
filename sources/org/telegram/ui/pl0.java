package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class pl0 extends org.telegram.ui.Components.q31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.q31.h(new pl0());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z9, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.k41 k41Var) {
        ql0 ql0Var = (ql0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) r31Var.G;
        zh.a1 a1Var = ql0Var.h;
        zh.w0 w0Var = ql0Var.e;
        ql0Var.a = savedStarGift.gift.id;
        ql0Var.setPadding(0, 0, 0, 0);
        ql0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ql0Var.b = (TL_stars.starGiftAttributeBackdrop) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ql0Var.c = (TL_stars.starGiftAttributePattern) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        w0Var.d(ql0Var.b);
        w0Var.e(ql0Var.c);
        if (a1Var != null) {
            a1Var.setBackdrop(ql0Var.b);
            String m10 = jg.g.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            a1Var.b = m10;
            a1Var.a.f(9, m10, false);
        }
        ql0Var.b(r31Var.e, false);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new ql0(context, f6Var, true);
    }
}
