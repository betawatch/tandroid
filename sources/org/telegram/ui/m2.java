package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m2 extends z4.a {
    public final /* synthetic */ o2 c;

    public m2(o2 o2Var) {
        this.c = o2Var;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView(((l2) obj).b);
    }

    @Override // z4.a
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.c.e;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override // z4.a
    public final int c(Object obj) {
        return this.c.e.items.contains(((l2) obj).a) ? -1 : -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        v2 v2Var;
        o2 o2Var = this.c;
        f4 f4Var = o2Var.y;
        h4 h4Var = o2Var.D;
        TL_iv.PageBlock pageBlock = o2Var.e.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            b2 b2Var = new b2(o2Var.getContext(), h4Var, f4Var, 1);
            b2Var.a((TL_iv.pageBlockPhoto) pageBlock, f4Var.E.cached_page, false, true);
            v2Var = b2Var;
        } else {
            v2 v2Var2 = new v2(o2Var.getContext(), h4Var, f4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            v2Var2.b(pageblockvideo, (w2) h4Var.D.f(pageblockvideo.video_id), false, true);
            v2Var = v2Var2;
        }
        gVar.addView(v2Var);
        l2 l2Var = new l2();
        l2Var.b = v2Var;
        l2Var.a = pageBlock;
        return l2Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return ((l2) obj).b == view;
    }
}
