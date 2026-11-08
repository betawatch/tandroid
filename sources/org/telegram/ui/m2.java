package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class m2 extends c5.a {
    public final /* synthetic */ o2 c;

    public m2(o2 o2Var) {
        this.c = o2Var;
    }

    @Override // c5.a
    public final void a(c5.k kVar, Object obj) {
        kVar.removeView(((l2) obj).b);
    }

    @Override // c5.a
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.c.e;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override // c5.a
    public final int c(Object obj) {
        return this.c.e.items.contains(((l2) obj).a) ? -1 : -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c5.a
    public final Object e(c5.k kVar, int i7) {
        v2 v2Var;
        o2 o2Var = this.c;
        e4 e4Var = o2Var.y;
        g4 g4Var = o2Var.D;
        TL_iv.PageBlock pageBlock = o2Var.e.items.get(i7);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            a2 a2Var = new a2(o2Var.getContext(), g4Var, e4Var, 1);
            a2Var.a((TL_iv.pageBlockPhoto) pageBlock, e4Var.E.cached_page, false, true);
            v2Var = a2Var;
        } else {
            v2 v2Var2 = new v2(o2Var.getContext(), g4Var, e4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            v2Var2.b(pageblockvideo, (w2) g4Var.D.f(pageblockvideo.video_id), false, true);
            v2Var = v2Var2;
        }
        kVar.addView(v2Var);
        l2 l2Var = new l2();
        l2Var.b = v2Var;
        l2Var.a = pageBlock;
        return l2Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return ((l2) obj).b == view;
    }
}
