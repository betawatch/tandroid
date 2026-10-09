package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class hp0 extends org.telegram.ui.Components.o61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.o61.setup(new hp0());
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, org.telegram.ui.Components.p61 p61Var, boolean z10, org.telegram.ui.Components.c71 c71Var, org.telegram.ui.Components.k71 k71Var) {
        ip0 ip0Var = (ip0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) p61Var.G;
        xh.k1 k1Var = ip0Var.h;
        xh.g1 g1Var = ip0Var.e;
        ip0Var.a = savedStarGift.gift.id;
        ip0Var.setPadding(0, 0, 0, 0);
        ip0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ip0Var.b = (TL_stars.starGiftAttributeBackdrop) yh.m5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ip0Var.c = (TL_stars.starGiftAttributePattern) yh.m5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        g1Var.d(ip0Var.b);
        g1Var.e(ip0Var.c);
        if (k1Var != null) {
            k1Var.setBackdrop(ip0Var.b);
            String h = org.telegram.messenger.q.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            k1Var.b = h;
            k1Var.a.f(9, h, false);
        }
        ip0Var.b(p61Var.e, false);
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, org.telegram.ui.Components.qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ip0(context, e6Var, true);
    }
}
