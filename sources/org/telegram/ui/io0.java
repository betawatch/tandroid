package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class io0 extends org.telegram.ui.Components.v41 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.v41.setup(new io0());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        jo0 jo0Var = (jo0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) w41Var.G;
        ih.z1 z1Var = jo0Var.h;
        ih.v1 v1Var = jo0Var.e;
        jo0Var.a = savedStarGift.gift.id;
        jo0Var.setPadding(0, 0, 0, 0);
        jo0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        jo0Var.b = (TL_stars.starGiftAttributeBackdrop) jh.s7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        jo0Var.c = (TL_stars.starGiftAttributePattern) jh.s7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        v1Var.d(jo0Var.b);
        v1Var.e(jo0Var.c);
        if (z1Var != null) {
            z1Var.setBackdrop(jo0Var.b);
            String m10 = j7.l1.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            z1Var.b = m10;
            z1Var.a.e(9, m10, false);
        }
        jo0Var.b(w41Var.e, false);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new jo0(context, c6Var, true);
    }
}
