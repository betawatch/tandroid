package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n2 extends b5.a {
    public final /* synthetic */ p2 c;

    public n2(p2 p2Var) {
        this.c = p2Var;
    }

    @Override // b5.a
    public final void a(b5.l lVar, Object obj) {
        lVar.removeView(((m2) obj).b);
    }

    @Override // b5.a
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.c.e;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override // b5.a
    public final int c(Object obj) {
        return this.c.e.items.contains(((m2) obj).a) ? -1 : -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b5.a
    public final Object e(b5.l lVar, int i3) {
        w2 w2Var;
        p2 p2Var = this.c;
        g4 g4Var = p2Var.y;
        i4 i4Var = p2Var.E;
        TL_iv.PageBlock pageBlock = p2Var.e.items.get(i3);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            b2 b2Var = new b2(p2Var.getContext(), i4Var, g4Var, 1);
            b2Var.a((TL_iv.pageBlockPhoto) pageBlock, g4Var.F.cached_page, false, true);
            w2Var = b2Var;
        } else {
            w2 w2Var2 = new w2(p2Var.getContext(), i4Var, g4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            w2Var2.b(pageblockvideo, (x2) i4Var.E.f(pageblockvideo.video_id), false, true);
            w2Var = w2Var2;
        }
        lVar.addView(w2Var);
        m2 m2Var = new m2();
        m2Var.b = w2Var;
        m2Var.a = pageBlock;
        return m2Var;
    }

    @Override // b5.a
    public final boolean f(View view, Object obj) {
        return ((m2) obj).b == view;
    }
}
