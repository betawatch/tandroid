package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f1 extends u4.h0 {
    public final /* synthetic */ i1 c;

    public f1(i1 i1Var) {
        this.c = i1Var;
    }

    @Override // u4.h0
    public final int b() {
        TL_iv.pageBlockCollage pageblockcollage = this.c.s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        ArrayList<TL_iv.PageBlock> arrayList = this.c.s.items;
        return arrayList.get((arrayList.size() - i3) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        i1 i1Var = this.c;
        h1 h1Var = i1Var.w;
        ArrayList<TL_iv.PageBlock> arrayList = i1Var.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i3) - 1);
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            b2 b2Var = (b2) view;
            b2Var.S = (org.telegram.messenger.ri) h1Var.b.get(pageBlock);
            b2Var.a((TL_iv.pageBlockPhoto) pageBlock, i1Var.x.F.cached_page, false, true);
        } else {
            w2 w2Var = (w2) view;
            w2Var.U = (org.telegram.messenger.ri) h1Var.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            w2Var.b(pageblockvideo, (x2) i1Var.y.E.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        i1 i1Var = this.c;
        return new org.telegram.ui.Components.bj0(i3 != 0 ? new w2(i1Var.getContext(), i1Var.y, i1Var.x, 2) : new b2(i1Var.getContext(), i1Var.y, i1Var.x, 2));
    }
}
