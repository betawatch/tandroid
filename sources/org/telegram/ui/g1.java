package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g1 extends s4.g0 {
    public final /* synthetic */ j1 c;

    public g1(j1 j1Var) {
        this.c = j1Var;
    }

    @Override // s4.g0
    public final int b() {
        TL_iv.pageBlockCollage pageblockcollage = this.c.s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.c.s.items;
        return arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        j1 j1Var = this.c;
        i1 i1Var = j1Var.w;
        ArrayList<TL_iv.PageBlock> arrayList = j1Var.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            b2 b2Var = (b2) view;
            b2Var.R = (org.telegram.messenger.bj) i1Var.b.get(pageBlock);
            b2Var.a((TL_iv.pageBlockPhoto) pageBlock, j1Var.x.E.cached_page, false, true);
        } else {
            v2 v2Var = (v2) view;
            v2Var.T = (org.telegram.messenger.bj) i1Var.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            v2Var.b(pageblockvideo, (w2) j1Var.y.D.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        j1 j1Var = this.c;
        return new org.telegram.ui.Components.ck0(i10 != 0 ? new v2(j1Var.getContext(), j1Var.y, j1Var.x, 2) : new b2(j1Var.getContext(), j1Var.y, j1Var.x, 2));
    }
}
