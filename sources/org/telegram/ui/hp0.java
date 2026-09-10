package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hp0 extends org.telegram.ui.Components.u51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.u51.setup(new hp0());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        ip0 ip0Var = (ip0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) v51Var.G;
        wh.i1 i1Var = ip0Var.h;
        wh.e1 e1Var = ip0Var.e;
        ip0Var.a = savedStarGift.gift.id;
        ip0Var.setPadding(0, 0, 0, 0);
        ip0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ip0Var.b = (TL_stars.starGiftAttributeBackdrop) xh.v5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ip0Var.c = (TL_stars.starGiftAttributePattern) xh.v5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e1Var.d(ip0Var.b);
        e1Var.e(ip0Var.c);
        if (i1Var != null) {
            i1Var.setBackdrop(ip0Var.b);
            String l4 = hc.b.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            i1Var.b = l4;
            i1Var.a.e(9, l4, false);
        }
        ip0Var.b(v51Var.e, false);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new ip0(context, f6Var, true);
    }
}
