package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class g1 extends s4.h0 {
    public final /* synthetic */ j1 c;

    public g1(j1 j1Var) {
        this.c = j1Var;
    }

    @Override // s4.h0
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.c.s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.c.s.items;
        return arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        j1 j1Var = this.c;
        i1 i1Var = j1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = j1Var.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            c2 c2Var = (c2) view;
            c2Var.R = (MessageObject.GroupedMessagePosition) i1Var.b.get(pageBlock);
            c2Var.a((TL_iv.pageBlockPhoto) pageBlock, j1Var.w.E.cached_page, false, true);
        } else {
            w2 w2Var = (w2) view;
            w2Var.T = (MessageObject.GroupedMessagePosition) i1Var.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            w2Var.b(pageblockvideo, (x2) j1Var.x.y.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        j1 j1Var = this.c;
        return new org.telegram.ui.Components.gl0(i10 != 0 ? new w2(j1Var.getContext(), j1Var.x, j1Var.w, 2) : new c2(j1Var.getContext(), j1Var.x, j1Var.w, 2));
    }
}
