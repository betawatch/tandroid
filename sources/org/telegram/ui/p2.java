package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p2 extends z4.a {
    public final /* synthetic */ r2 c;

    public p2(r2 r2Var) {
        this.c = r2Var;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView(((o2) obj).b);
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
        return this.c.d.items.contains(((o2) obj).a) ? -1 : -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        y2 y2Var;
        r2 r2Var = this.c;
        h4 h4Var = r2Var.w;
        j4 j4Var = r2Var.x;
        TL_iv.PageBlock pageBlock = r2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            e2 e2Var = new e2(r2Var.getContext(), j4Var, h4Var, 1);
            e2Var.a((TL_iv.pageBlockPhoto) pageBlock, h4Var.E.cached_page, false, true);
            y2Var = e2Var;
        } else {
            y2 y2Var2 = new y2(r2Var.getContext(), j4Var, h4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            y2Var2.b(pageblockvideo, (z2) j4Var.y.f(pageblockvideo.video_id), false, true);
            y2Var = y2Var2;
        }
        gVar.addView(y2Var);
        o2 o2Var = new o2();
        o2Var.b = y2Var;
        o2Var.a = pageBlock;
        return o2Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return ((o2) obj).b == view;
    }
}
