package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class e1 extends v4.g0 {
    public final /* synthetic */ h1 c;

    public e1(h1 h1Var) {
        this.c = h1Var;
    }

    @Override // v4.g0
    public final int b() {
        TL_iv.pageBlockCollage pageblockcollage = this.c.s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        ArrayList<TL_iv.PageBlock> arrayList = this.c.s.items;
        return arrayList.get((arrayList.size() - i7) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        h1 h1Var = this.c;
        g1 g1Var = h1Var.w;
        ArrayList<TL_iv.PageBlock> arrayList = h1Var.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i7) - 1);
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            a2 a2Var = (a2) view;
            a2Var.R = (org.telegram.messenger.aj) g1Var.b.get(pageBlock);
            a2Var.a((TL_iv.pageBlockPhoto) pageBlock, h1Var.x.E.cached_page, false, true);
        } else {
            v2 v2Var = (v2) view;
            v2Var.T = (org.telegram.messenger.aj) g1Var.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            v2Var.b(pageblockvideo, (w2) h1Var.y.D.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        h1 h1Var = this.c;
        return new org.telegram.ui.Components.xi0(i7 != 0 ? new v2(h1Var.getContext(), h1Var.y, h1Var.x, 2) : new a2(h1Var.getContext(), h1Var.y, h1Var.x, 2));
    }
}
