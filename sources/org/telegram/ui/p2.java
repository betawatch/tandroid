package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class p2 extends z4.a {
    public final /* synthetic */ r2 c;

    public p2(r2 r2Var) {
        this.c = r2Var;
    }

    @Override // z4.a
    public final void a(z4.h hVar, Object obj) {
        hVar.removeView(((o2) obj).b);
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
        return this.c.e.items.contains(((o2) obj).a) ? -1 : -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z4.a
    public final Object e(z4.h hVar, int i10) {
        y2 y2Var;
        r2 r2Var = this.c;
        i4 i4Var = r2Var.x;
        k4 k4Var = r2Var.y;
        TL_iv.PageBlock pageBlock = r2Var.e.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            e2 e2Var = new e2(r2Var.getContext(), k4Var, i4Var, 1);
            e2Var.a((TL_iv.pageBlockPhoto) pageBlock, i4Var.E.cached_page, false, true);
            y2Var = e2Var;
        } else {
            y2 y2Var2 = new y2(r2Var.getContext(), k4Var, i4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            y2Var2.b(pageblockvideo, (z2) k4Var.y.f(pageblockvideo.video_id), false, true);
            y2Var = y2Var2;
        }
        hVar.addView(y2Var);
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
