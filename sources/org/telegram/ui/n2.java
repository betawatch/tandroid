package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class n2 extends z4.a {
    public final /* synthetic */ p2 c;

    public n2(p2 p2Var) {
        this.c = p2Var;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView(((m2) obj).b);
    }

    @Override // z4.a
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.c.d;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override // z4.a
    public final int c(Object obj) {
        return this.c.d.items.contains(((m2) obj).a) ? -1 : -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        w2 w2Var;
        p2 p2Var = this.c;
        f4 f4Var = p2Var.w;
        h4 h4Var = p2Var.x;
        TL_iv.PageBlock pageBlock = p2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            c2 c2Var = new c2(p2Var.getContext(), h4Var, f4Var, 1);
            c2Var.a((TL_iv.pageBlockPhoto) pageBlock, f4Var.E.cached_page, false, true);
            w2Var = c2Var;
        } else {
            w2 w2Var2 = new w2(p2Var.getContext(), h4Var, f4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            w2Var2.b(pageblockvideo, (x2) h4Var.y.f(pageblockvideo.video_id), false, true);
            w2Var = w2Var2;
        }
        gVar.addView(w2Var);
        m2 m2Var = new m2();
        m2Var.b = w2Var;
        m2Var.a = pageBlock;
        return m2Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return ((m2) obj).b == view;
    }
}
