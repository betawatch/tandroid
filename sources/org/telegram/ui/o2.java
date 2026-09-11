package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class o2 extends z4.a {
    public final /* synthetic */ q2 c;

    public o2(q2 q2Var) {
        this.c = q2Var;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView(((n2) obj).b);
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
        return this.c.d.items.contains(((n2) obj).a) ? -1 : -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        x2 x2Var;
        q2 q2Var = this.c;
        g4 g4Var = q2Var.w;
        i4 i4Var = q2Var.x;
        TL_iv.PageBlock pageBlock = q2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            d2 d2Var = new d2(q2Var.getContext(), i4Var, g4Var, 1);
            d2Var.a((TL_iv.pageBlockPhoto) pageBlock, g4Var.E.cached_page, false, true);
            x2Var = d2Var;
        } else {
            x2 x2Var2 = new x2(q2Var.getContext(), i4Var, g4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            x2Var2.b(pageblockvideo, (y2) i4Var.y.f(pageblockvideo.video_id), false, true);
            x2Var = x2Var2;
        }
        gVar.addView(x2Var);
        n2 n2Var = new n2();
        n2Var.b = x2Var;
        n2Var.a = pageBlock;
        return n2Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return ((n2) obj).b == view;
    }
}
