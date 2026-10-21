package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class q2 extends z4.a {
    public final /* synthetic */ s2 c;

    public q2(s2 s2Var) {
        this.c = s2Var;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView(((p2) obj).b);
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
        return this.c.d.items.contains(((p2) obj).a) ? -1 : -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        z2 z2Var;
        s2 s2Var = this.c;
        j4 j4Var = s2Var.w;
        l4 l4Var = s2Var.x;
        TL_iv.PageBlock pageBlock = s2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            f2 f2Var = new f2(s2Var.getContext(), l4Var, j4Var, 1);
            f2Var.a((TL_iv.pageBlockPhoto) pageBlock, j4Var.E.cached_page, false, true);
            z2Var = f2Var;
        } else {
            z2 z2Var2 = new z2(s2Var.getContext(), l4Var, j4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            z2Var2.b(pageblockvideo, (a3) l4Var.y.f(pageblockvideo.video_id), false, true);
            z2Var = z2Var2;
        }
        gVar.addView(z2Var);
        p2 p2Var = new p2();
        p2Var.b = z2Var;
        p2Var.a = pageBlock;
        return p2Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return ((p2) obj).b == view;
    }
}
