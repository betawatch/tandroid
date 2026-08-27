package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ko0 extends org.telegram.ui.Components.m41 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.m41.setup(new ko0());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        lo0 lo0Var = (lo0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) n41Var.G;
        gh.c2 c2Var = lo0Var.h;
        gh.y1 y1Var = lo0Var.e;
        lo0Var.a = savedStarGift.gift.id;
        lo0Var.setPadding(0, 0, 0, 0);
        lo0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        lo0Var.b = (TL_stars.starGiftAttributeBackdrop) hh.u7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        lo0Var.c = (TL_stars.starGiftAttributePattern) hh.u7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        y1Var.d(lo0Var.b);
        y1Var.e(lo0Var.c);
        if (c2Var != null) {
            c2Var.setBackdrop(lo0Var.b);
            String m10 = i0.a.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            c2Var.b = m10;
            c2Var.a.e(9, m10, false);
        }
        lo0Var.b(n41Var.e, false);
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new lo0(context, c6Var, true);
    }
}
