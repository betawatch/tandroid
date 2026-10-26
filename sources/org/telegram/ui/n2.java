package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class n2 extends a5.a {
    public final /* synthetic */ p2 c;

    public n2(p2 p2Var) {
        this.c = p2Var;
    }

    @Override // a5.a
    public final void a(a5.m mVar, Object obj) {
        mVar.removeView(((m2) obj).b);
    }

    @Override // a5.a
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.c.e;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override // a5.a
    public final int c(Object obj) {
        return this.c.e.items.contains(((m2) obj).a) ? -1 : -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a5.a
    public final Object e(a5.m mVar, int i10) {
        w2 w2Var;
        p2 p2Var = this.c;
        h4 h4Var = p2Var.x;
        j4 j4Var = p2Var.y;
        TL_iv.PageBlock pageBlock = p2Var.e.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            c2 c2Var = new c2(p2Var.getContext(), j4Var, h4Var, 1);
            c2Var.a((TL_iv.pageBlockPhoto) pageBlock, h4Var.E.cached_page, false, true);
            w2Var = c2Var;
        } else {
            w2 w2Var2 = new w2(p2Var.getContext(), j4Var, h4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            w2Var2.b(pageblockvideo, (x2) j4Var.y.f(pageblockvideo.video_id), false, true);
            w2Var = w2Var2;
        }
        mVar.addView(w2Var);
        m2 m2Var = new m2();
        m2Var.b = w2Var;
        m2Var.a = pageBlock;
        return m2Var;
    }

    @Override // a5.a
    public final boolean f(View view, Object obj) {
        return ((m2) obj).b == view;
    }
}
