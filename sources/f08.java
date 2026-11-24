// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class f08 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new f08());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        g08 g08Var = (g08) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) c4cVar.H;
        ov4 ov4Var = g08Var.h;
        kv4 kv4Var = g08Var.e;
        g08Var.a = savedStarGift.gift.id;
        g08Var.setPadding(0, 0, 0, 0);
        g08Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        g08Var.b = (TL_stars.starGiftAttributeBackdrop) gta.i(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        g08Var.c = (TL_stars.starGiftAttributePattern) gta.i(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        kv4Var.d(g08Var.b);
        kv4Var.e(g08Var.c);
        if (ov4Var != null) {
            ov4Var.setBackdrop(g08Var.b);
            String concat = "#".concat(k96.E(savedStarGift.gift.num, ','));
            ov4Var.b = concat;
            ov4Var.a.g(9, concat, false);
        }
        g08Var.b(c4cVar.e, false);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new g08(wjbVar, context, true);
    }
}
