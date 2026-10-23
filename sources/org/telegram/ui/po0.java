package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class po0 extends org.telegram.ui.Components.g61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new po0());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        qo0 qo0Var = (qo0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) h61Var.G;
        yh.h1 h1Var = qo0Var.h;
        yh.d1 d1Var = qo0Var.e;
        qo0Var.a = savedStarGift.gift.id;
        qo0Var.setPadding(0, 0, 0, 0);
        qo0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        qo0Var.b = (TL_stars.starGiftAttributeBackdrop) ai.ga.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        qo0Var.c = (TL_stars.starGiftAttributePattern) ai.ga.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        d1Var.d(qo0Var.b);
        d1Var.e(qo0Var.c);
        if (h1Var != null) {
            h1Var.setBackdrop(qo0Var.b);
            String h = org.telegram.messenger.g0.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            h1Var.b = h;
            h1Var.a.f(9, h, false);
        }
        qo0Var.b(h61Var.e, false);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, org.telegram.ui.Components.jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new qo0(context, d6Var, true);
    }
}
